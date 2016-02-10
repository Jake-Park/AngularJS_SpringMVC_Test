package com.integrationwizards.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;

import com.integrationwizards.common.Header;
import com.integrationwizards.common.LogManager;
import com.integrationwizards.common.LogUtil;
import com.integrationwizards.model.HResultStatusUpdates;
import com.integrationwizards.service.StatusUpdatesService;

import au.com.retriever.test.barking.ResultExportStatusUpdates;

@Controller
public class StatusUpdatesController {
	@Autowired
	private StatusUpdatesService statusUpdatesService;
	@Autowired
	private Header header;	
	private final String category = "statusUpdates";
	
	//@Scheduled(fixedDelay = 50000)
	public void statusUpdates() throws Exception {
		LogUtil lu = null;
		
		try {
			lu = LogManager.getInstance().getLogObj(category);
			lu.writeLog("Start StatusUpdates");
			ResultExportStatusUpdates result = statusUpdatesService.sendStatusUpdates(header.getRetrieverBarking());
			
			lu.writeLog("Receiving data from statusUpdates");
			lu.writeLog(LogUtil.objToMap(result));
			
			HResultStatusUpdates hResult = statusUpdatesService.insertResultStatusUpdates(result);
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
