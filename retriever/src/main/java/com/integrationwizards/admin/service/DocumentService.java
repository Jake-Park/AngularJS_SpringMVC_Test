package com.integrationwizards.admin.service;

import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

import com.integrationwizards.admin.model.Document;
import com.integrationwizards.admin.model.UserInfo;
import com.integrationwizards.model.Order;
import com.paypal.api.payments.Payment;

public interface DocumentService {
	public Map<String, String> upload(MultipartFile file) throws Exception;
	public Document getDocument(String id) throws Exception;
	public void insertOrder(Payment payment, String orderId) throws Exception;
	public Order getOrderByOrderId(String orderId) throws Exception;
	public boolean updatePoints(UserInfo userInfo) throws Exception;
}
