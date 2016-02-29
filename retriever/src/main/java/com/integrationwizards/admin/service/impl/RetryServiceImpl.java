package com.integrationwizards.admin.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.integrationwizards.admin.dao.RetryDao;
import com.integrationwizards.admin.model.PageVO;
import com.integrationwizards.admin.service.RetryService;
import com.integrationwizards.controller.CreateJobController;
import com.integrationwizards.model.HJob;
import com.integrationwizards.model.HResult;
import com.integrationwizards.model.HSmartLink;
import com.integrationwizards.model.LogMaster;
import com.integrationwizards.service.CreateJobService;
import com.integrationwizards.util.CodeUtil;
import com.integrationwizards.util.ConstantUtil;
import com.integrationwizards.util.LogManager;
import com.integrationwizards.util.LogUtil;
import com.integrationwizards.util.StringUtil;

import au.com.retriever.test.barking.Result;

@Service
public class RetryServiceImpl implements RetryService {
	@Autowired
	private ApplicationContext appContext;
	private RetryDao retryDao;
	
	public void setRetryDao(RetryDao retryDao) {
		this.retryDao = retryDao;
	}	

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
		LogUtil lu = LogManager.getInstance().getLogObj(param.get("logId"));    	
    	lu.info("Start retryJob : " + param);
    	
		String subProcess = param.get("subProcess");
		if(subProcess.equals(CodeUtil.getInstance().getCodeValue(ConstantUtil.SUB_PROCESS, "M3E"))) { // Export Job
			
		}
		else { // Create Job
			CreateJobController createJobController = appContext.getBean(CreateJobController.class);
			CreateJobService createJobService = appContext.getBean(CreateJobService.class);
			HSmartLink sl = retryDao.getSmartLink(param);
			
			if(subProcess.equals(CodeUtil.getInstance().getCodeValue(ConstantUtil.SUB_PROCESS, "M3C"))) { // To M3
		    	Map<String, String> map = new HashMap<String, String>();
		    	map.put("MWNO", sl.getMWNO());
		    	map.put("PRNO", sl.getPRNO());
		    	map.put("WHLO", sl.getWHLO());
		    	map.put("USID", sl.getUSID());
		    	map.put("Company", sl.getCONO());
		    	map.put("logId", sl.getLogId());
		    	
		    	lu.info("Start createJob from Retry");		
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
		
		return true;
	}

}
