package com.integrationwizards.dao;

import java.util.List;

import com.integrationwizards.model.HEJob;
import com.integrationwizards.model.HJob;
import com.integrationwizards.model.HResultExportJobs;

public interface ExportJobsDao {
	public void insertResultExportJobs(HResultExportJobs hResult) throws Exception ;
	public HJob selectJob(HEJob hEJob) throws Exception ;
	public List<HEJob> selectExportJobs(String maxCount) throws Exception;
	public void updateLogId(HEJob hEJob) throws Exception;
}
