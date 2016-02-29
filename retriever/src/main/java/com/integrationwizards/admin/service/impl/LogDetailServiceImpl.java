package com.integrationwizards.admin.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.integrationwizards.admin.dao.LogDetailDao;
import com.integrationwizards.admin.model.PageVO;
import com.integrationwizards.admin.service.LogDetailService;
import com.integrationwizards.model.LogDetail;

@Service
public class LogDetailServiceImpl implements LogDetailService {
	private LogDetailDao logDetailDao;
	
	public void setLogDetailDao(LogDetailDao logDetailDao) {
		this.logDetailDao = logDetailDao;
	}	

	@Transactional
	public List<LogDetail> selectLogDetailList(PageVO pageVO) throws Exception {
		return logDetailDao.selectLogDetailList(pageVO);
	}

	@Transactional
	public int getLogDetailListCnt(PageVO pageVO) throws Exception {
		return logDetailDao.getLogDetailListCnt(pageVO);
	}

}
