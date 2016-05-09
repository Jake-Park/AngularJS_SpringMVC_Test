package com.integrationwizards.admin.dao;

import java.util.List;
import java.util.Map;

import com.integrationwizards.admin.model.PageVO;
import com.integrationwizards.model.HEJob;
import com.integrationwizards.model.HJob;
import com.integrationwizards.model.HSmartLink;
import com.integrationwizards.model.LogMaster;

public interface RetryDao {
	public List<LogMaster> selectRetryList(PageVO pageVO) throws Exception;
	public int getRetryListCnt(PageVO pageVO) throws Exception;
	public HSmartLink getSmartLink(Map<String, String> param) throws Exception;
	public HJob getHJob(Map<String, String> param) throws Exception;
	public HEJob getHEJob(Map<String, String> param) throws Exception;
	public boolean finishJob(Map<String, String> param) throws Exception;
}
