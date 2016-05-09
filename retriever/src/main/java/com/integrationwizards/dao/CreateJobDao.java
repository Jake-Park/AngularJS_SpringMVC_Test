package com.integrationwizards.dao;

import java.util.List;

import com.integrationwizards.model.HJob;
import com.integrationwizards.model.HResult;
import com.integrationwizards.model.HSmartLink;

public interface CreateJobDao {
	public void insertCreateJob(HJob hJob) throws Exception ;
	public void insertResult(HResult hResult) throws Exception ;
	public void updateCreatJob(HJob hJob) throws Exception;
	public List<HJob> selectCreateJob(String counts) throws Exception;
	public HSmartLink insertSmartLink(HSmartLink hSmartLink) throws Exception;
	public void updateSmartLink(HSmartLink hSmartLink) throws Exception;
	public List<HSmartLink> selectSmartLink(String counts) throws Exception;
}
