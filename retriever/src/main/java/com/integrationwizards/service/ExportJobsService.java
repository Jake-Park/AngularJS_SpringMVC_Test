package com.integrationwizards.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestParam;

import com.integrationwizards.common.ParamName;
import com.integrationwizards.model.HEJob;
import com.integrationwizards.model.HResultExportJobs;

import au.com.retriever.test.barking.ResultExportJobs;
import au.com.tmha.mos057mi.upd.UpdResponseCollection;
import au.com.tmha.mos070mi.updoperation.UpdOperationResponseCollection;

public interface ExportJobsService {
	public ResultExportJobs sendExportJobs() throws Exception;
	public HResultExportJobs insertResultExportJobs(ResultExportJobs result, @ParamName("logId") String logId) throws Exception;
	public UpdOperationResponseCollection sendMOS070MIUpdOperation(HEJob hEJob) throws Exception;
	public UpdResponseCollection sendMOS057MIUpd(HEJob hEJob) throws Exception;
	public List<HEJob> selectExportJobs(String count) throws Exception;
	public void updateLogId(HEJob hEJob) throws Exception;
}
