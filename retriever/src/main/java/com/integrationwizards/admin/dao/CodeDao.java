package com.integrationwizards.admin.dao;

import java.util.List;

import com.integrationwizards.admin.model.CodeInfo;

public interface CodeDao {
	public List<CodeInfo> selectAllCode() throws Exception;
}
