package com.integrationwizards.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;

import com.integrationwizards.common.Header;
import com.integrationwizards.common.LogManager;
import com.integrationwizards.common.LogUtil;
import com.integrationwizards.model.HResultExportJobs;
import com.integrationwizards.service.ExportJobsService;

import au.com.retriever.test.barking.ResultExportJobs;

@Controller
public class ExportJobsController {
	@Autowired
	private ExportJobsService exportJobsService;
	@Autowired
	private Header header;
	private final String category = "exportJobs";
	
	//@Scheduled(fixedDelay = 50000)
	public void exportJobs() throws Exception {
		LogUtil lu = null;
		
		try {
			lu = LogManager.getInstance().getLogObj(category);
			
			lu.writeLog("Start ExportJobs");
			ResultExportJobs result = exportJobsService.sendExportJobs(header.getRetrieverBarking());
			
			lu.writeLog("Receiving data from exportJobs");
			lu.writeLog(LogUtil.objToMap(result));
			
			HResultExportJobs hResult = exportJobsService.insertResultExportJobs(result);
			lu.closeFile();
		}
		catch(Exception e) {
			lu.writeLog(e.getMessage());
		}
		finally {
			lu.closeFile();
			LogManager.getInstance().closeLogObj(category);
		}
	}	
}
