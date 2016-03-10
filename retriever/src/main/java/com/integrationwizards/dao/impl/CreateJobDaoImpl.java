package com.integrationwizards.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.integrationwizards.dao.CreateJobDao;
import com.integrationwizards.model.HJob;
import com.integrationwizards.model.HResult;
import com.integrationwizards.model.HSmartLink;
import com.integrationwizards.model.LogMaster;
import com.integrationwizards.util.StringUtil;

@Repository
public class CreateJobDaoImpl implements CreateJobDao {
	@Autowired
	@Qualifier("hibernate4AnnotatedSessionFactory")
	private SessionFactory sessionFactory;
	
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
	
	public List<HJob> selectCreateJob(String maxCount) throws Exception {
		Session session = this.sessionFactory.getCurrentSession();
		
		String hql = "SELECT j "
				+ "FROM HJob AS j "
				+ "LEFT join j.assets AS a "
				+ "LEFT join j.services AS s "
				+ ", LogMaster lm "
				+ "WHERE j.logId = lm.logId AND j.success = null "
				+ "AND lm.count <= :count "
				+ "ORDER BY j.createdDate DESC ";
        Query query = session.createQuery(hql);
        query.setInteger("count", StringUtil.nullToInteger(maxCount));
        
        List<HJob> hJobList = query.list();
        
        // Update counts
        for(HJob hJob : hJobList) {
    		Criteria criteria = session.createCriteria(LogMaster.class)
    				.add(Restrictions.eq("logId", hJob.getLogId()));
    		
    		LogMaster lm = (LogMaster)criteria.uniqueResult();
    		lm.setCount(lm.getCount() + 1);
    		session.update(lm);
        }
        
        return hJobList;
	}
	
	public List<HSmartLink> selectSmartLink(String maxCount) throws Exception {
		Session session = this.sessionFactory.getCurrentSession();
		
		String hql = "SELECT sl FROM HSmartLink AS sl "
				+ "WHERE (sl.success = 'False' OR sl.success = null) "
				+ "AND sl.count <= :count "
				+ "ORDER BY sl.createdDate DESC ";
        Query query = session.createQuery(hql);
        query.setInteger("count", StringUtil.nullToInteger(maxCount));
        
        List<HSmartLink> slList = query.list();
        
        // Update counts // checking count in SmartLink table instead of LogMaster 
        // because logMaster's count field is for creatJob to Retriever.
        for(HSmartLink sl : slList) {
    		sl.setCount(sl.getCount() + 1);
    		session.update(sl);
        }
        return slList;
	}
}
