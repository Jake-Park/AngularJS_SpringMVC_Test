package com.integrationwizards.admin.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.integrationwizards.admin.dao.LogDetailDao;
import com.integrationwizards.admin.model.PageVO;
import com.integrationwizards.model.LogDetail;
import com.integrationwizards.util.StringUtil;

@Repository("logDetailDao")
public class LogDetailDaoImpl implements LogDetailDao {
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}
	
	public List<LogDetail> selectLogDetailList(PageVO pageVO) throws Exception {
		Session session = this.sessionFactory.getCurrentSession();
		
		String hql = "FROM LogDetail A ";
		if(!StringUtil.isEmptyString(pageVO.getLogId())) {
			hql +="WHERE A.logId = :logId ";
		}		
		hql += "ORDER BY A.createdDate DESC";
		
        Query query = session.createQuery(hql);
        query.setFirstResult(pageVO.getFirstIndex());
        query.setMaxResults(pageVO.getLastIndex());
        
        if(!StringUtil.isEmptyString(pageVO.getLogId())) {
        	query.setString("logId", pageVO.getLogId());
        }
        
        List<LogDetail> results = query.list();
		
		for(LogDetail p : results) {
			System.out.println("LogDetail List : " + p);
		}
		return results;
	}

	public int getLogDetailListCnt(PageVO pageVO) throws Exception {
		Session session = this.sessionFactory.getCurrentSession();
		
		//Projections
		Criteria criteria = session.createCriteria(LogDetail.class)
				.setProjection(Projections.rowCount());
		
		if(!StringUtil.isEmptyString(pageVO.getLogId())) {
			criteria.add(Restrictions.eq("logId", pageVO.getLogId()));
		}
				
		long count = (Long)criteria.uniqueResult();
		
		return Integer.parseInt(String.valueOf(count));
	}

}
