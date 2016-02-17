package com.integrationwizards.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;

import com.integrationwizards.common.Header;
import com.integrationwizards.common.LogManager;
import com.integrationwizards.common.LogUtil;
import com.integrationwizards.common.StringUtil;
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
			
			lu.info("Start ExportJobs");
			ResultExportJobs result = exportJobsService.sendExportJobs(header.getRetrieverBarking());
			
			lu.info("Receiving data from exportJobs");
			lu.info(StringUtil.objToMap(result));
			
			HResultExportJobs hResult = exportJobsService.insertResultExportJobs(result);
		}
		catch(Exception e) {
			lu.severe(e.getMessage());
			LogManager.getInstance().closeFile(category);
		}
		LogManager.getInstance().removeFile(category);
		
	}	
}
