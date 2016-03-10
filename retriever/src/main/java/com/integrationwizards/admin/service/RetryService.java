package com.integrationwizards.admin.service;

import java.util.List;
import java.util.Map;

import com.integrationwizards.admin.model.PageVO;
import com.integrationwizards.model.LogMaster;

public interface RetryService {
	public List<LogMaster> selectRetryList(PageVO pageVO) throws Exception;
	public int getRetryListCnt(PageVO pageVO) throws Exception;
	public boolean retryJob(Map<String, String> param) throws Exception;
	public boolean finishJob(Map<String, String> param) throws Exception;
}
