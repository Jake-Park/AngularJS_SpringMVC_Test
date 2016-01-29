package com.integrationwizards.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.integrationwizards.dao.CreateJobDao;
import com.integrationwizards.model.HJob;
import com.integrationwizards.model.HResult;

@Repository("createJobDao")
public class CreateJobDaoImpl implements CreateJobDao {
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	public void insertCreateJob(HJob hJob) {
		Session session = this.sessionFactory.getCurrentSession();
		session.save(hJob);
	}
	
	public void insertResult(HResult hResult) {
		Session session = this.sessionFactory.getCurrentSession();
		session.save(hResult);
	}
}
