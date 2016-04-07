package com.integrationwizards.admin.dao.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.integrationwizards.admin.dao.RetryDao;
import com.integrationwizards.admin.model.PageVO;
import com.integrationwizards.model.HEJob;
import com.integrationwizards.model.HJob;
import com.integrationwizards.model.HSmartLink;
import com.integrationwizards.model.LogMaster;
import com.integrationwizards.util.LogManager;
import com.integrationwizards.util.LogUtil;
import com.integrationwizards.util.StringUtil;

import static com.integrationwizards.util.StringUtil.isEmptyString;
import static com.integrationwizards.util.StringUtil.nullToVoid;;

@Repository
public class RetryDaoImpl implements RetryDao {
	@Autowired
	@Qualifier("hibernate4AnnotatedSessionFactory")
	private SessionFactory sessionFactory;	
	
	public List<LogMaster> selectRetryList(PageVO pageVO) throws Exception {
		Session session = this.sessionFactory.getCurrentSession();
		//List<AdminInfo> AdminInfoList = session.createQuery("from AdminInfo").list();
		
		String hql = "FROM LogMaster A WHERE 1=1 ";
		
			if(!isEmptyString(pageVO.getKeyword())) {	// All search
				hql += "AND (A.logId like :keyword OR A.key1 like :keyword OR A.key2 like :keyword) ";
			}
			else {
				if(!isEmptyString(pageVO.getLogId())) {
					hql += "AND A.logId like :logId ";
				}
				if(!isEmptyString(pageVO.getCategory())) {
					hql += "AND A.key2 like :category ";
				}
				if(!isEmptyString(pageVO.getWorkOrderNum())) {
					hql += "AND A.key1 like :workOrderNum ";
				}
				if(!isEmptyString(StringUtil.nullToVoid(pageVO.getStartDate())) &&
					!isEmptyString(nullToVoid(pageVO.getEndDate()))) {
					hql += "AND A.modifiedDate between :startDate AND :endDate  ";
				}
				else {
					if(!isEmptyString(nullToVoid(pageVO.getStartDate()))) {
						hql += "AND A.modifiedDate > :startDate ";
					}
					if(!isEmptyString(nullToVoid(pageVO.getStartDate()))) {
						hql += "AND A.modifiedDate < :endDate ";
					}
				}
			}
			
		hql += "ORDER BY A.modifiedDate DESC";
		
        Query query = session.createQuery(hql);        
		
		if(!isEmptyString(pageVO.getKeyword())) {
			query.setParameter("keyword", "%" + pageVO.getKeyword() + "%");
		}
		else  {
			if(!isEmptyString(pageVO.getLogId())) {
				query.setParameter("logId", "%" + pageVO.getLogId() + "%");
			}
			if(!isEmptyString(pageVO.getCategory())) {
				query.setParameter("category", "%" + pageVO.getCategory() + "%");
			}
			if(!isEmptyString(pageVO.getWorkOrderNum())) {
				query.setParameter("workOrderNum", "%" + pageVO.getWorkOrderNum()+ "%");
			}
			if(!isEmptyString(nullToVoid(pageVO.getStartDate())) &&
				!isEmptyString(nullToVoid(pageVO.getEndDate()))) {
				query.setParameter("startDate", pageVO.getStartDate());
				query.setParameter("endDate", pageVO.getEndDate());
			}
			else {
				if(!isEmptyString(nullToVoid(pageVO.getStartDate()))) {
					query.setParameter("startDate", pageVO.getStartDate());
				}
				if(!isEmptyString(nullToVoid(pageVO.getStartDate()))) {
					query.setParameter("endDate", pageVO.getEndDate());
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
		

		if(!isEmptyString(pageVO.getKeyword())) {// All search
			criteria.add(Restrictions.disjunction().add(
					Restrictions.or(
							Restrictions.like("logId", "%" + pageVO.getKeyword() + "%"),
							Restrictions.like("key2", "%" + pageVO.getKeyword() + "%"),
							Restrictions.like("key1", "%" + pageVO.getKeyword() + "%")
					)
			));
		}
		else {
			if(!isEmptyString(pageVO.getLogId())) {
				criteria.add(Restrictions.like("logId", "%" + pageVO.getLogId() + "%"));
			}
			if(!isEmptyString(pageVO.getCategory())) {
				criteria.add(Restrictions.like("key2", "%" + pageVO.getCategory() + "%"));
			}
			if(!isEmptyString(pageVO.getWorkOrderNum())) {
				criteria.add(Restrictions.like("key1", "%" + pageVO.getWorkOrderNum() + "%"));
			}
			if(!isEmptyString(nullToVoid(pageVO.getStartDate())) &&
				!isEmptyString(nullToVoid(pageVO.getEndDate()))) {
				criteria.add(Restrictions.between("modifiedDate", pageVO.getStartDate(), pageVO.getEndDate()));
			}
			else {
				if(!isEmptyString(nullToVoid(pageVO.getStartDate()))) {
					criteria.add(Restrictions.gt("startDate", pageVO.getStartDate()));
				}
				if(!isEmptyString(nullToVoid(pageVO.getStartDate()))) {
					criteria.add(Restrictions.lt("startDate", pageVO.getEndDate()));
				}
			}
		}
		
		long count = (Long)criteria.uniqueResult();
		
		return Integer.parseInt(nullToVoid(count));
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
	
	public boolean finishJob(Map<String, String> param) throws Exception {
		Session session = this.sessionFactory.getCurrentSession();
		
		Criteria criteria = session.createCriteria(LogMaster.class)
				.add(Restrictions.eq("logId", param.get("logId")));	
		
		LogUtil lu = LogManager.getInstance().getLogObj(param.get("category"), param.get("logId"));
		lu.info("Finish the job forcefully.");
		
		LogMaster lm = (LogMaster)criteria.uniqueResult();
		lm.setState("FIN");
		lm.setSubProcess("");
		lm.setError("");
		lm.setModifiedDate(new Date());
		session.update(lm);
		
		LogManager.getInstance().closeLogObj(param.get("logId"));
		
		return true;
	}
}
