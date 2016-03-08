package com.integrationwizards.admin.dao.impl;

import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.integrationwizards.admin.dao.RetryDao;
import com.integrationwizards.admin.model.PageVO;
import com.integrationwizards.model.HEJob;
import com.integrationwizards.model.HJob;
import com.integrationwizards.model.HSmartLink;
import com.integrationwizards.model.LogMaster;
import com.integrationwizards.util.StringUtil;

@Repository
public class RetryDaoImpl implements RetryDao {
	@Autowired
	private SessionFactory sessionFactory;	
	
	public List<LogMaster> selectRetryList(PageVO pageVO) throws Exception {
		Session session = this.sessionFactory.getCurrentSession();
		//List<AdminInfo> AdminInfoList = session.createQuery("from AdminInfo").list();
		
		String hql = "FROM LogMaster A WHERE 1=1 ";
		if(!StringUtil.isEmptyString(pageVO.getKlass())) {
			if(pageVO.getKlass().equals("1")) {	// All search
				if(!StringUtil.isEmptyString(pageVO.getKeyword())) {
					hql += "AND (A.logId like :keyword OR A.key1 like :keyword OR A.key2 like :keyword) ";
				}
			}
			else if(pageVO.getKlass().equals("2")) {
				if(!StringUtil.isEmptyString(pageVO.getLogId())) {
					hql += "AND A.logId like :logId ";
				}
				if(!StringUtil.isEmptyString(pageVO.getCategory())) {
					hql += "AND A.key2 like :category ";
				}
				if(!StringUtil.isEmptyString(pageVO.getWorkOrderNum())) {
					hql += "AND A.key1 like :workOrderNum ";
				}
			}
		}		
		hql += "ORDER BY A.createdDate DESC";
		
        Query query = session.createQuery(hql);        
		if(!StringUtil.isEmptyString(pageVO.getKlass())) {
			if(pageVO.getKlass().equals("1")) {	// All search
				if(!StringUtil.isEmptyString(pageVO.getKeyword())) {
					query.setParameter("keyword", "%" + pageVO.getKeyword() + "%");
				}
			}
			else if(pageVO.getKlass().equals("2")) {
				if(!StringUtil.isEmptyString(pageVO.getLogId())) {
					query.setParameter("logId", "%" + pageVO.getLogId() + "%");
				}
				if(!StringUtil.isEmptyString(pageVO.getCategory())) {
					query.setParameter("category", "%" + pageVO.getCategory() + "%");
				}
				if(!StringUtil.isEmptyString(pageVO.getWorkOrderNum())) {
					query.setParameter("workOrderNum", "%" + pageVO.getWorkOrderNum()+ "%");
				}
			}
		}	
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
		Criteria criteria = session.createCriteria(LogMaster.class)
				.setProjection(Projections.rowCount());
		
		if(!StringUtil.isEmptyString(pageVO.getKlass())) {
			if(pageVO.getKlass().equals("1")) {	// All search
				if(!StringUtil.isEmptyString(pageVO.getKeyword())) {
					criteria.add(Restrictions.disjunction().add(
							Restrictions.or(
									Restrictions.like("logId", "%" + pageVO.getKeyword() + "%"),
									Restrictions.like("key2", "%" + pageVO.getKeyword() + "%"),
									Restrictions.like("key1", "%" + pageVO.getKeyword() + "%")
							)
					));
				}
			}
			else if(pageVO.getKlass().equals("2")) {
				if(!StringUtil.isEmptyString(pageVO.getLogId())) {
					criteria.add(Restrictions.like("logId", "%" + pageVO.getLogId() + "%"));
				}
				if(!StringUtil.isEmptyString(pageVO.getCategory())) {
					criteria.add(Restrictions.like("key2", "%" + pageVO.getCategory() + "%"));
				}
				if(!StringUtil.isEmptyString(pageVO.getWorkOrderNum())) {
					criteria.add(Restrictions.like("key1", "%" + pageVO.getWorkOrderNum() + "%"));
				}
			}
		}
		
		long count = (Long)criteria.uniqueResult();
		
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
	
	public HEJob getHEJob(Map<String, String> param) throws Exception {
		Session session = this.sessionFactory.getCurrentSession();
		
		Criteria criteria = session.createCriteria(HEJob.class)
				.add(Restrictions.eq("logId", param.get("logId")));		
		
		return (HEJob)criteria.uniqueResult();
	}
}
