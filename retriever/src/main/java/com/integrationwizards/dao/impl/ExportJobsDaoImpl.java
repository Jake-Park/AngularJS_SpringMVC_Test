package com.integrationwizards.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.integrationwizards.dao.ExportJobsDao;
import com.integrationwizards.model.HEJob;
import com.integrationwizards.model.HJob;
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
	
	public HJob selectJob(HEJob hEJob) throws Exception {
		Session session = this.sessionFactory.getCurrentSession();
		
		Criteria criteria = session.createCriteria(HJob.class)
				.add(Restrictions.eq("jobId", hEJob.getJobId()))
				.add(Restrictions.eq("phaseId", hEJob.getPhaseId()))
				.add(Restrictions.eq("techId", hEJob.getTechId()));
		
		return (HJob)criteria.uniqueResult();	
	}
}
