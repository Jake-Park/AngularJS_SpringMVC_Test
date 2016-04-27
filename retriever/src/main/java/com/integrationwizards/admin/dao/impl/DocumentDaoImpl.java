package com.integrationwizards.admin.dao.impl;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.integrationwizards.admin.dao.DocumentDao;
import com.integrationwizards.admin.model.Document;
import com.integrationwizards.admin.model.UserInfo;
import com.integrationwizards.model.Order;

@Repository
public class DocumentDaoImpl implements DocumentDao {
	@Autowired
	@Qualifier("hibernate4AnnotatedSessionFactory")
	private SessionFactory sessionFactory;
	
	/**
	 * Save document
	 */
	@Override
	public void save(Document document) throws Exception {
		Session session = this.sessionFactory.getCurrentSession();
		session.save(document);
	}
	
	/**
	 * Get document object by id	
	 */
	@Override
	public Document getDocument(String id) throws Exception {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from Document where id = :id");
		query.setString("id", id);
		return (Document)query.uniqueResult();
	}

	public void insertOrder(Order order) throws Exception {
		Session session = sessionFactory.getCurrentSession();
		session.save(order);
	}
	
	@Transactional
	public Order getOrderByOrderId(String orderId) throws Exception {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from Order where orderId = :orderId");
		query.setString("orderId", orderId);
		return (Order)query.uniqueResult();
	}
	
	@Transactional
	public boolean updatePoints(UserInfo userInfo) throws Exception {
		boolean retBool = true;
		
		try {
			Session session = sessionFactory.getCurrentSession();
			session.update(userInfo);
		}
		catch(Exception e) {
			retBool = false;
			throw e;
		}
		
		return retBool;
	}
}
