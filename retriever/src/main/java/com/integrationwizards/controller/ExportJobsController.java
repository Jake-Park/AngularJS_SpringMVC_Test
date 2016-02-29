package com.integrationwizards.controller;

import java.util.Set;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.integrationwizards.model.HEJob;
import com.integrationwizards.model.HResultExportJobs;
import com.integrationwizards.service.ExportJobsService;
import com.integrationwizards.util.CodeUtil;
import com.integrationwizards.util.ConstantUtil;
import com.integrationwizards.util.HeaderFactory;
import com.integrationwizards.util.LogManager;
import com.integrationwizards.util.LogUtil;
import com.integrationwizards.util.StringUtil;

import au.com.retriever.test.barking.ResultExportJobs;

@Controller
public class ExportJobsController {
	@Autowired
	private ExportJobsService exportJobsService;
	private final String category = "exportJobs";
	
	//@Scheduled(fixedDelay = 50000)
	public void exportJobs() throws Exception {
		LogUtil lu = null;
		String uuid = "";
		
		try {
			uuid = UUID.randomUUID().toString();
			lu = LogManager.getInstance().createLogObj(category, uuid);
			
			lu.info("Start ExportJobs");
			ResultExportJobs result = exportJobsService.sendExportJobs();
			
			lu.info("Receiving data from exportJobs");
			lu.info(String.valueOf(StringUtil.objToMap(result)));
			
			HResultExportJobs hResult = exportJobsService.insertResultExportJobs(result);
			
			Set<HEJob> eJobList = hResult.geteJob();
			
			if(eJobList != null && eJobList.size() > 0) {
				for(HEJob hEJob : eJobList) {
					updateExportJobsToM3(hEJob, uuid);
				}
			}
		}
		catch(Exception e) {
			lu.error("Errored in exportJobs" + e);
			lu.updateStates("", CodeUtil.getInstance().getCodeValue(ConstantUtil.PROCESS_STATUS, "ERR"),
					null,
					"Errored in exportJobs");
		}
		finally {
			LogManager.getInstance().closeLogObj(uuid);
		}
	}
	
	public void updateExportJobsToM3(HEJob hEJob, String logId) {
		LogUtil lu = null;
		
		try {
			lu = LogManager.getInstance().getLogObj(logId);    	
			lu.info("Start updateExportJobsToM3 : " + hEJob.getJobId());
		}
		catch(Exception e) {
			lu.error("Errored in exportJobs" + e);
			lu.updateStates(hEJob.getJobId(), CodeUtil.getInstance().getCodeValue(ConstantUtil.PROCESS_STATUS, "ERR"),
					CodeUtil.getInstance().getCodeValue(ConstantUtil.SUB_PROCESS, "M3E"),
					"Errored in exportJobs");
		}
	}
}
