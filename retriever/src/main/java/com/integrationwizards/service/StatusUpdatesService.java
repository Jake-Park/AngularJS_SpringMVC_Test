package com.integrationwizards.service;

import com.integrationwizards.model.HResultStatusUpdates;

import au.com.retriever.test.barking.ResultExportStatusUpdates;
import au.com.retriever.test.barking.RetrieverBarking;

public interface StatusUpdatesService {
	public ResultExportStatusUpdates sendStatusUpdates() throws Exception;
	public HResultStatusUpdates insertResultStatusUpdates(ResultExportStatusUpdates result) throws Exception;
}
