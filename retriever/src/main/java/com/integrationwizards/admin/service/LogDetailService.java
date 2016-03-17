package com.integrationwizards.admin.service;

import java.util.List;

import com.integrationwizards.admin.model.PageVO;
import com.integrationwizards.model.LogDetail;

public interface LogDetailService {
	public List<LogDetail> selectLogDetailList(PageVO pageVO, String gLogId) throws Exception;
	public int getLogDetailListCnt(PageVO pageVO, String gLogId) throws Exception;
}
