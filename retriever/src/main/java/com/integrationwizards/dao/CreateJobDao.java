package com.integrationwizards.dao;

import com.integrationwizards.model.HJob;
import com.integrationwizards.model.HResult;
import com.integrationwizards.model.MessagesIndex;

public interface CreateJobDao {
	public void insertCreateJob(HJob hJob) throws Exception ;
	public void insertResult(HResult hResult) throws Exception ;
	public void updateCreatJob(HJob hJob) throws Exception;
}
