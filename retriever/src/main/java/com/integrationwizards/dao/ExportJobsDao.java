package com.integrationwizards.dao;

import java.util.Map;

import com.integrationwizards.model.HEJob;
import com.integrationwizards.model.HJob;
import com.integrationwizards.model.HResultExportJobs;

public interface ExportJobsDao {
	public void insertResultExportJobs(HResultExportJobs hResult) throws Exception ;
	public HJob selectJob(HEJob hEJob) throws Exception ;
}
