package com.integrationwizards.dao;

import com.integrationwizards.model.HJob;
import com.integrationwizards.model.HResult;

public interface CreateJobDao {
	public void insertCreateJob(HJob hJob);
	public void insertResult(HResult hResult);
}
