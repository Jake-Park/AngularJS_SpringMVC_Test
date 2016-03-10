package com.integrationwizards.controller;

import java.util.UUID;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;

import com.integrationwizards.common.PingCheck;
import com.integrationwizards.model.HResultStatusUpdates;
import com.integrationwizards.service.StatusUpdatesService;
import com.integrationwizards.util.LogManager;
import com.integrationwizards.util.LogUtil;
import com.integrationwizards.util.StringUtil;

import au.com.retriever.test.barking.ResultExportStatusUpdates;

@Controller
public class StatusUpdatesController {
	@Autowired
	private StatusUpdatesService statusUpdatesService;
	private final String category = "statusUpdates";
	
	@Scheduled(fixedDelayString = "${statusUpdates.statusUpdates.delaytime}")
	public void statusUpdates() throws Exception {
		LogUtil lu = null;
		String uuid = "";
		
		try {
			if(PingCheck.isAccessToRetriever()) {
				uuid = UUID.randomUUID().toString();
				lu = LogManager.getInstance().createLogObj(category, uuid);
				
				lu.info("Start StatusUpdates");
				ResultExportStatusUpdates result = statusUpdatesService.sendStatusUpdates();
				
				lu.info("Receiving data from statusUpdates");
				lu.info(String.valueOf(StringUtil.objToMap(result)));
				
				HResultStatusUpdates hResult = statusUpdatesService.insertResultStatusUpdates(result);
			}
		}
		catch(Exception e) {
			lu.error("Errored in statusUpdates" + ExceptionUtils.getStackTrace(e));
			lu.updateStates("", "ERR", null, "Errored in statusUpdates");
		}
		finally {
			LogManager.getInstance().closeLogObj(uuid);
		}
	}
}
