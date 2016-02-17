package com.integrationwizards.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.integrationwizards.dao.CreateJobDao;
import com.integrationwizards.model.HJob;
import com.integrationwizards.model.HResult;
import com.integrationwizards.model.HSmartLink;

@Repository("createJobDao")
public class CreateJobDaoImpl implements CreateJobDao {
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}
	
	public HSmartLink insertSmartLink(HSmartLink hSmartLink) throws Exception {
		Session session = this.sessionFactory.getCurrentSession();
		session.save(hSmartLink);
		
		return hSmartLink;
	}
	
	public void updateSmartLink(HSmartLink hSmartLink) throws Exception {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(hSmartLink);
	}

	public void insertCreateJob(HJob hJob) throws Exception {
		Session session = this.sessionFactory.getCurrentSession();
		session.save(hJob);
	}
	
	public void insertResult(HResult hResult) throws Exception {
		Session session = this.sessionFactory.getCurrentSession();
		session.save(hResult);
	}
	
	public void updateCreatJob(HJob hJob) throws Exception {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(hJob);
	}
	
	public List<HJob> selectCreateJob() throws Exception {
		Session session = this.sessionFactory.getCurrentSession();
		
		String hql = "SELECT j "
				+ "FROM HJob AS j "
				+ "LEFT join j.assets AS a "
				+ "LEFT join j.services AS s "
				+ "WHERE j.success = null ";
        Query query = session.createQuery(hql);
        return query.list();
	}
	
	public List<HSmartLink> selectSmartLink() throws Exception {
		Session session = this.sessionFactory.getCurrentSession();
		
		String hql = "SELECT a FROM HSmartLink a WHERE a.success = 'False' or a.success = null ";
        Query query = session.createQuery(hql);
        return query.list();
	}
}
