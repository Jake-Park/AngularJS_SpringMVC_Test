package com.integrationwizards.admin.dao;

import java.util.List;

import com.integrationwizards.admin.model.PageVO;
import com.integrationwizards.model.LogDetail;

public interface LogDetailDao {
	public List<LogDetail> selectLogDetailList(PageVO pageVO) throws Exception;
	public int getLogDetailListCnt(PageVO pageVO) throws Exception;
}
