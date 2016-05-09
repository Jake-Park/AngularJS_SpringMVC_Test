package com.integrationwizards.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.integrationwizards.dao.StatusUpdatesDao;
import com.integrationwizards.model.HResultStatusUpdates;

@Repository
public class StatusUpdatesDaoImpl implements StatusUpdatesDao {
	@Autowired
	@Qualifier("hibernate4AnnotatedSessionFactory")
	private SessionFactory sessionFactory;
	
	public void insertResultStatusUpdates(HResultStatusUpdates hResult) throws Exception {
		Session session = this.sessionFactory.getCurrentSession();
		session.save(hResult);
	}

}
