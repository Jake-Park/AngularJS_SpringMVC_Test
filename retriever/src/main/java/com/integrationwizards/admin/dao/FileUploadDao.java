package com.integrationwizards.admin.dao;

import com.integrationwizards.admin.model.Document;

public interface FileUploadDao {
	public void save(Document upDoc) throws Exception;
	public Document getDocument(String id) throws Exception;
}
