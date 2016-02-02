package com.integrationwizards.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;

import com.integrationwizards.common.Header;
import com.integrationwizards.model.HResultStatusUpdates;
import com.integrationwizards.service.StatusUpdatesService;

import au.com.retriever.test.barking.ResultExportStatusUpdates;

@Controller
public class StatusUpdatesController {
	@Autowired
	private StatusUpdatesService statusUpdatesService;
	@Autowired
	private Header header;
	
	@Scheduled(fixedDelay = 50000)
	public void statusUpdates() throws Exception {
		ResultExportStatusUpdates result = statusUpdatesService.sendStatusUpdates(header.getRetrieverBarking());
		HResultStatusUpdates hResult = statusUpdatesService.insertResultStatusUpdates(result);
		
	}
}
