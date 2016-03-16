package com.integrationwizards.admin.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.integrationwizards.admin.dao.RetryDao;
import com.integrationwizards.admin.model.PageVO;
import com.integrationwizards.admin.service.RetryService;
import com.integrationwizards.controller.CreateJobController;
import com.integrationwizards.controller.ExportJobsController;
import com.integrationwizards.model.HEJob;
import com.integrationwizards.model.HJob;
import com.integrationwizards.model.HResult;
import com.integrationwizards.model.HSmartLink;
import com.integrationwizards.model.LogMaster;
import com.integrationwizards.service.CreateJobService;
import com.integrationwizards.util.LogManager;
import com.integrationwizards.util.LogUtil;

import au.com.retriever.test.barking.Result;

@Service
public class RetryServiceImpl implements RetryService {
	@Autowired
	private ApplicationContext appContext;
	@Autowired
	private RetryDao retryDao;

	@Transactional
	public List<LogMaster> selectRetryList(PageVO pageVO) throws Exception {
		return retryDao.selectRetryList(pageVO);
	}
	
	@Transactional
	public int getRetryListCnt(PageVO pageVO) throws Exception {
		return retryDao.getRetryListCnt(pageVO);
	}
	
	@Transactional
	public boolean retryJob(Map<String, String> param) throws Exception {
		LogUtil lu = null;
		
		try {
			String subProcess = param.get("subProcess");
			
			if(subProcess.equals("M3E")) { // Export Job
				lu = LogManager.getInstance().getLogObj("exportJobs", param.get("logId"));
				lu.info("Start retry ExportJob : " + param.get("logId"));
				
				ExportJobsController exportJobController = appContext.getBean(ExportJobsController.class);
				HEJob hEJob = retryDao.getHEJob(param);
				
				exportJobController.updateExportJobsToM3(hEJob);
				// Update Log Master 
			    lu.updateStates(hEJob.getJobId(), "FIN", "", "");
			}
			else { // Create Job
				lu = LogManager.getInstance().getLogObj("createJob", param.get("logId"));
				lu.info("Start retry CreateJob : " + param.get("logId"));
				
				CreateJobController createJobController = appContext.getBean(CreateJobController.class);
				CreateJobService createJobService = appContext.getBean(CreateJobService.class);
				HSmartLink sl = retryDao.getSmartLink(param);
				
				if(subProcess.equals("M3_CJ")) { // To M3
					lu.info("Send Retry createJob to M3");
			    	Map<String, String> map = new HashMap<String, String>();
			    	map.put("MWNO", sl.getMWNO());
			    	map.put("PRNO", sl.getPRNO());
			    	map.put("WHLO", sl.getWHLO());
			    	map.put("USID", sl.getUSID());
			    	map.put("Company", sl.getCONO());
			    	map.put("logId", sl.getLogId());
			    	
					createJobController.createJobFromM3(map);
					createJobService.updateSmartLink(sl, "True");
				}
				else { // To Retriever
					HJob hJob = retryDao.getHJob(param);				
					
					lu.info("Send Retry createJob to Retriever");
					// retry sending createJob 
					Result result = createJobService.reSendCreateJob(hJob);
					
				    lu.debug("Start inserting the result of Retry createJob");	
				    HResult hResult = createJobService.insertResult(result, hJob);
				    	
				    hJob = createJobService.updateCreatJob(hJob, hResult);
				    lu.info("Finish updating the result of Retry createJob");
				}
			}
		}
		catch(Exception e) {
			if(lu != null) {
				lu.error("Errored in retryJob : " + ExceptionUtils.getStackTrace(e));
				lu.updateStates(param.get("MWNO"), "ERR", param.get("subProcess"), "Errored in retryJob");
			}
			throw e;
		}
		finally {
			LogManager.getInstance().closeLogObj(param.get("logId"));
		}
		
		return true;
	}

	@Transactional
	public boolean finishJob(Map<String, String> param) throws Exception {
		return retryDao.finishJob(param);
	}
}
