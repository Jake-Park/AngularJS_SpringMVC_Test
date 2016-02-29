package com.integrationwizards.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;

import com.integrationwizards.model.HResultStatusUpdates;
import com.integrationwizards.service.StatusUpdatesService;
import com.integrationwizards.util.CodeUtil;
import com.integrationwizards.util.ConstantUtil;
import com.integrationwizards.util.HeaderFactory;
import com.integrationwizards.util.LogManager;
import com.integrationwizards.util.LogUtil;
import com.integrationwizards.util.StringUtil;

import au.com.retriever.test.barking.ResultExportStatusUpdates;

@Controller
public class StatusUpdatesController {
	@Autowired
	private StatusUpdatesService statusUpdatesService;
	private final String category = "statusUpdates";
	
	//@Scheduled(fixedDelay = 50000)
	public void statusUpdates() throws Exception {
		LogUtil lu = null;
		String uuid = "";
		
		try {
			uuid = UUID.randomUUID().toString();
			lu = LogManager.getInstance().createLogObj(category, uuid);
			
			lu.info("Start StatusUpdates");
			ResultExportStatusUpdates result = statusUpdatesService.sendStatusUpdates();
			
			lu.info("Receiving data from statusUpdates");
			lu.info(String.valueOf(StringUtil.objToMap(result)));
			
			HResultStatusUpdates hResult = statusUpdatesService.insertResultStatusUpdates(result);
		}
		catch(Exception e) {
			lu.error("Errored in statusUpdates" + e);
			lu.updateStates("", CodeUtil.getInstance().getCodeValue(ConstantUtil.PROCESS_STATUS, "ERR"), null, 
					"Errored in statusUpdates");
		}
		finally {
			LogManager.getInstance().closeLogObj(uuid);
		}
	}
}
