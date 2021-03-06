package com.integrationwizards.admin.service.impl;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.integrationwizards.admin.dao.DocumentDao;
import com.integrationwizards.admin.document.DocumentHandler;
import com.integrationwizards.admin.model.Document;
import com.integrationwizards.admin.model.UserInfo;
import com.integrationwizards.admin.service.DocumentService;
import com.integrationwizards.model.Order;
import com.paypal.api.payments.Payment;

@Service
public class DocumentServiceImpl implements DocumentService {
	@Autowired
	DocumentHandler documentHandler;
	@Autowired
	DocumentDao documentDao;
	
	/**
	 * Upload file data into database using temporary file
	 */
	@Override
	@Transactional
	public Map<String, String> upload(MultipartFile file) throws Exception {
        byte[] uploadBytes = file.getBytes();
        String name = file.getOriginalFilename();
        
        // Create the file on server
        File uploadFile = File.createTempFile(name.split("\\.")[0], "." + name.split("\\.")[1]);

        try (BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(uploadFile))) {        
	        stream.write(uploadBytes);
        }
        catch(Exception e) {
        	e.printStackTrace();
        }
        finally {
        	uploadFile.deleteOnExit();
        }
        
        Map<String, Object> downloadMap = documentHandler.startGeneration(uploadFile.getAbsolutePath());
        
        Document document = new Document();
        document.setUploadFileName(name);
        document.setUploadFileData(uploadBytes);
        document.setDownloadFileName(String.valueOf(downloadMap.get("downloadFileName")));
        document.setDownloadFileData((byte[])downloadMap.get("downloadFileData"));
        
        // save
        documentDao.save(document);
        
        Map<String, String> retMap = new HashMap<>();
        retMap.put("id", document.getId());
        retMap.put("downloadFileName", document.getDownloadFileName());
        
        return retMap;
	}
	
	/**
	 * Call Dao method to get document obj
	 */
	@Transactional
	public Document getDocument(String id) throws Exception {
		return documentDao.getDocument(id);
	}
	
	@Transactional
	public void insertOrder(Payment payment, String orderId) throws Exception {
		Order order = new Order();
		order.setOrderId(orderId);
		order.setPaymentId(payment.getId());
		documentDao.insertOrder(order);
	}
	
	@Transactional
	public Order getOrderByOrderId(String orderId) throws Exception {
		return documentDao.getOrderByOrderId(orderId);
	}
	
	@Transactional
	public boolean updatePoints(UserInfo userInfo) throws Exception {
		// Subtract Points
		int points = userInfo.getPoints();
		userInfo.setPoints((points - 50));
		return documentDao.updatePoints(userInfo);
	}

}
