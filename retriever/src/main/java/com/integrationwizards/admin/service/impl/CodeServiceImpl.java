package com.integrationwizards.admin.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.integrationwizards.admin.dao.CodeDao;
import com.integrationwizards.admin.model.CodeInfo;
import com.integrationwizards.admin.service.CodeService;

@Service
public class CodeServiceImpl implements CodeService {
	private CodeDao codeDao;
	
	public void setCodeDao(CodeDao codeDao) {
		this.codeDao = codeDao;
	}
	
	@Transactional
	public List<CodeInfo> selectAllCode() throws Exception {
		return codeDao.selectAllCode();
	}

}
