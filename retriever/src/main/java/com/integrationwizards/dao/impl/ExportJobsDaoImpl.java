package com.integrationwizards.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.integrationwizards.dao.ExportJobsDao;
import com.integrationwizards.model.HResultExportJobs;

@Repository("exportJobsDao")
public class ExportJobsDaoImpl implements ExportJobsDao {
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}
	
	public void insertResultExportJobs(HResultExportJobs hResult) throws Exception {
		Session session = this.sessionFactory.getCurrentSession();
		session.save(hResult);
	}

}
