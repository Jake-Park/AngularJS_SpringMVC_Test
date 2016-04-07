package com.integrationwizards.admin.service;

import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

import com.integrationwizards.admin.model.Document;

public interface FileUploadService {
	public Map<String, String> upload(MultipartFile file) throws Exception;
	public Document getDocument(String id) throws Exception;
}
