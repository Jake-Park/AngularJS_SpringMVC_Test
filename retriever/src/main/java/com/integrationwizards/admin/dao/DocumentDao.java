package com.integrationwizards.admin.dao;

import com.integrationwizards.admin.model.Document;
import com.integrationwizards.admin.model.UserInfo;
import com.integrationwizards.model.Order;

public interface DocumentDao {
	public void save(Document upDoc) throws Exception;
	public Document getDocument(String id) throws Exception;
	public void insertOrder(Order order) throws Exception;
	public Order getOrderByOrderId(String orderId) throws Exception;
	public boolean updatePoints(UserInfo userInfo) throws Exception;
}
