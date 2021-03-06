package com.integrationwizards.controller;

import java.util.List;
import java.util.Set;
import java.util.UUID;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;

import com.integrationwizards.common.PingCheck;
import com.integrationwizards.model.HEJob;
import com.integrationwizards.model.HENewAsset;
import com.integrationwizards.model.HETime;
import com.integrationwizards.model.HResultExportJobs;
import com.integrationwizards.service.ExportJobsService;
import com.integrationwizards.util.LogManager;
import com.integrationwizards.util.LogUtil;
import com.integrationwizards.util.StringUtil;

import au.com.retriever.test.barking.ResultExportJobs;
import au.com.tmha.mos057mi.upd.UpdResponseCollection;
import au.com.tmha.mos070mi.updoperation.UpdOperationResponseCollection;

@Controller
public class ExportJobsController {
	@Autowired
	private ExportJobsService exportJobsService;
	private final String category = "exportJobs";
	@Value("${exportJobs.reExportJobs.counts}") 
	private String ejCount;
	
	/**
	 * 	
	 * @throws Exception
	 */
	//@Scheduled(fixedDelayString = "${exportJobs.exportJobs.delaytime}")
	public void exportJobs() throws Exception {
		LogUtil lu = null;
		String uuid = "";
		String jobId = "";
		String subProcess = "";
		
		try {
			if(PingCheck.isAccessToRetriever()) {
				uuid = UUID.randomUUID().toString();
				lu = LogManager.getInstance().createLogObj(category, uuid);
				
				lu.info("Start ExportJobs");
				ResultExportJobs result = exportJobsService.sendExportJobs();
				
				lu.info("Receiving data from exportJobs");
				lu.info(String.valueOf(StringUtil.objToMap(result)));
				
				HResultExportJobs hResult = exportJobsService.insertResultExportJobs(result, uuid);
				
				Set<HEJob> eJobList = hResult.geteJob();
				
				if(eJobList != null && eJobList.size() > 0) {	    		
					for(HEJob hEJob : eJobList) {
						jobId = hEJob.getJobId();
						subProcess = "M3E";
						
						// Destroy previous log Object
						LogManager.getInstance().closeLogObj(uuid);
						// Create new log id
						uuid = UUID.randomUUID().toString();
						lu = LogManager.getInstance().createLogObj(category, uuid);
						// Update current Log Id to the exported job
						hEJob.setLogId(uuid);
						lu.info("Start sending a request to M3 : " + uuid);
						exportJobsService.updateLogId(hEJob);
						
						lu.updateStates(hEJob.getJobId(), "STA", "M3E", "");
						
						updateExportJobsToM3(hEJob);
						
						// Update Log Master
					    lu.updateStates(hEJob.getJobId(), "FIN", "", "");
					    LogManager.getInstance().closeLogObj(uuid);
					}
				}
			}
		}
		catch(Exception e) {			
			lu.error("Errored in exportJobs : " + ExceptionUtils.getStackTrace(e));
			lu.updateStates(jobId, "ERR", subProcess, "Errored in exportJobs");
		}
		finally {
			LogManager.getInstance().closeLogObj(uuid);
		}
	}
	
	/**
	 * Update exportJobs data from Retriever to M3
	 * @param hEJob
	 * @throws Exception
	 */
	public void updateExportJobsToM3(HEJob hEJob) throws Exception {
		LogUtil lu = null;
		
		try {
			lu = LogManager.getInstance().getLogObj(hEJob.getLogId());
			lu.info("Start updateExportJobsToM3 : " + hEJob.getJobId());
			lu.debug(String.valueOf(StringUtil.objToMap(hEJob)));
			
			//Send MOS070MI:UpdOperation
			UpdOperationResponseCollection updOperationResponseCollection = exportJobsService.sendMOS070MIUpdOperation(hEJob);
			//Send MOS057MI:Upd
			UpdResponseCollection updResponseCollection = exportJobsService.sendMOS057MIUpd(hEJob);
		}
		catch(Exception e) {			
			lu.error("Errored in updateExportJobsToM3 : " + ExceptionUtils.getStackTrace(e));
			lu.error(String.valueOf(StringUtil.objToMap(hEJob)));
			throw e;
		}
	}
	
	@Scheduled(fixedDelayString = "${exportJobs.reExportJobs.delaytime}")
	public void reExportJobs() throws Exception {
		LogUtil lu = null;
		String jobId = "";	// For error log
		
		try {
			
			if(PingCheck.isAccessToM3()) {
				List<HEJob> hEJobList = exportJobsService.selectExportJobs(ejCount);
				for(HEJob hEJob : hEJobList) {				
					System.out.println("---eJob--" + hEJob);
					jobId = hEJob.getJobId();
					
					// Re create log Object
					lu = LogManager.getInstance().getLogObj(category, hEJob.getLogId());
					
					lu.info("Send Re exportJobs to M3");
					updateExportJobsToM3(hEJob);
					
					// Update Log Master 
				    lu.updateStates(hEJob.getJobId(), "FIN", "", "");
				    LogManager.getInstance().closeLogObj(hEJob.getLogId());
				    lu.info("Finish updating the result of Re createJob");
				}
			}
    	}
		catch(Exception e) {	
			e.printStackTrace();
			if(lu != null) {
				lu.error("Errored in reExportJobs : " + ExceptionUtils.getStackTrace(e));
				lu.updateStates(jobId, "ERR", "M3E", "Errored in reExportJobs");
			}
		}
	}	
}
