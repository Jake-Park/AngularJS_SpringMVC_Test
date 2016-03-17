package com.integrationwizards.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.integrationwizards.admin.dao.LogDetailDao;
import com.integrationwizards.admin.model.PageVO;
import com.integrationwizards.admin.service.LogDetailService;
import com.integrationwizards.model.LogDetail;

@Service
public class LogDetailServiceImpl implements LogDetailService {
	@Autowired
	private LogDetailDao logDetailDao;
	
	@Transactional
	public List<LogDetail> selectLogDetailList(PageVO pageVO, String gLogId) throws Exception {
		return logDetailDao.selectLogDetailList(pageVO, gLogId);
	}

	@Transactional
	public int getLogDetailListCnt(PageVO pageVO, String gLogId) throws Exception {
		return logDetailDao.getLogDetailListCnt(pageVO, gLogId);
	}

}
