package com.integrationwizards.service;

import com.integrationwizards.model.HResultExportJobs;

import au.com.retriever.test.barking.ResultExportJobs;
import au.com.retriever.test.barking.RetrieverBarking;

public interface ExportJobsService {
	public ResultExportJobs sendExportJobs(RetrieverBarking changeStudentDetailsImplPort) throws Exception;
	public HResultExportJobs insertResultExportJobs(ResultExportJobs result) throws Exception;
}
