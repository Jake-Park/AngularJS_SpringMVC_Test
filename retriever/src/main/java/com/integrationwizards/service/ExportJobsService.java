package com.integrationwizards.service;

import java.util.Map;

import com.integrationwizards.model.HEJob;
import com.integrationwizards.model.HResultExportJobs;

import au.com.retriever.test.barking.ResultExportJobs;
import au.com.retriever.test.barking.RetrieverBarking;
import au.com.tmha.mos070mi.MOS070MI;
import au.com.tmha.mos070mi.updoperation.UpdOperationResponseCollection;

public interface ExportJobsService {
	public ResultExportJobs sendExportJobs() throws Exception;
	public HResultExportJobs insertResultExportJobs(ResultExportJobs result) throws Exception;
	public UpdOperationResponseCollection sendMOS070MIUpdOperation(HEJob hEJob) throws Exception;
}
