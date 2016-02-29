package com.integrationwizards.admin.dao.impl;

import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.integrationwizards.admin.dao.RetryDao;
import com.integrationwizards.admin.model.PageVO;
import com.integrationwizards.model.HJob;
import com.integrationwizards.model.HSmartLink;
import com.integrationwizards.model.LogMaster;

@Repository("retryDao")
public class RetryDaoImpl implements RetryDao {
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}
	
	public List<LogMaster> selectRetryList(PageVO pageVO) throws Exception {
		Session session = this.sessionFactory.getCurrentSession();
		//List<AdminInfo> AdminInfoList = session.createQuery("from AdminInfo").list();
		
		String hql = "FROM LogMaster A WHERE A.state <> '2' ORDER BY A.createdDate DESC";
        Query query = session.createQuery(hql);
        query.setFirstResult(pageVO.getFirstIndex());
        query.setMaxResults(pageVO.getLastIndex());
        
        List<LogMaster> results = query.list();
		
		for(LogMaster p : results) {
			System.out.println("LogMaster List : " + p);
		}
		return results;
	}
	
	public int getRetryListCnt(PageVO pageVO) throws Exception {
		Session session = this.sessionFactory.getCurrentSession();
		
		//Projections example
		long count = (Long)session.createCriteria(LogMaster.class)
				.add( Restrictions.ne("state", "FIN"))
				.setProjection(Projections.rowCount())
				.uniqueResult();
		
		return Integer.parseInt(String.valueOf(count));
	}
	
	public HSmartLink getSmartLink(Map<String, String> param) throws Exception {
		Session session = this.sessionFactory.getCurrentSession();
		
		Criteria criteria = session.createCriteria(HSmartLink.class)
				.add(Restrictions.eq("logId", param.get("logId")));		
		
		return (HSmartLink)criteria.uniqueResult();
	}
	
	public HJob getHJob(Map<String, String> param) throws Exception {
		Session session = this.sessionFactory.getCurrentSession();
		
		Criteria criteria = session.createCriteria(HJob.class)
				.add(Restrictions.eq("logId", param.get("logId")));		
		
		return (HJob)criteria.uniqueResult();
	}
}
