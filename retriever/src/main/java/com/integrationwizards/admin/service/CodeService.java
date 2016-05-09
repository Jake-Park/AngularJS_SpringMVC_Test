package com.integrationwizards.admin.service;

import java.util.List;

import com.integrationwizards.admin.model.CodeInfo;

public interface CodeService {
	public List<CodeInfo> selectAllCode() throws Exception;
}
