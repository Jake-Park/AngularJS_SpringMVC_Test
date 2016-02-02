package com.integrationwizards.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.integrationwizards.dao.StatusUpdatesDao;
import com.integrationwizards.model.HResultStatusUpdates;

@Repository("statusUpdatesDao")
public class StatusUpdatesDaoImpl implements StatusUpdatesDao {
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}
	
	public void insertResultStatusUpdates(HResultStatusUpdates hResult) throws Exception {
		Session session = this.sessionFactory.getCurrentSession();
		session.save(hResult);
	}

}
