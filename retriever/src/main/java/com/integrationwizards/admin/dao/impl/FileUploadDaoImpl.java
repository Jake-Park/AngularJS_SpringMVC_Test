package com.integrationwizards.admin.dao.impl;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.integrationwizards.admin.dao.FileUploadDao;
import com.integrationwizards.admin.model.Document;

@Repository
public class FileUploadDaoImpl implements FileUploadDao {
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

}
