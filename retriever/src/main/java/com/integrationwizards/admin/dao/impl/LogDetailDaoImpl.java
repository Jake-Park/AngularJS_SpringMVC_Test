package com.integrationwizards.admin.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.integrationwizards.admin.dao.LogDetailDao;
import com.integrationwizards.admin.model.PageVO;
import com.integrationwizards.model.LogDetail;
import com.integrationwizards.util.StringUtil;

@Repository
public class LogDetailDaoImpl implements LogDetailDao {
	@Autowired
	@Qualifier("hibernate4AnnotatedSessionFactory")
	private SessionFactory sessionFactory;
	
	public List<LogDetail> selectLogDetailList(PageVO pageVO) throws Exception {
		Session session = this.sessionFactory.getCurrentSession();
		String order = "DESC";
		
		String hql = "FROM LogDetail A WHERE 1=1 ";
		if(StringUtil.isEmptyString(pageVO.getKlass()) && !StringUtil.isEmptyString(pageVO.getLogId())) {
			hql +="AND A.logId = :logId ";
			order = "ASC";
		}		
		else if(!StringUtil.isEmptyString(pageVO.getKlass())) {
			if(pageVO.getKlass().equals("1")) {	// All search
				if(!StringUtil.isEmptyString(pageVO.getKeyword())) {
					hql += "AND (A.logId like :keyword OR A.classMethod like :keyword OR A.logLevel like :keyword) ";
				}
			}
			else if(pageVO.getKlass().equals("2")) {
				if(!StringUtil.isEmptyString(pageVO.getLogId())) {
					hql += "AND A.logId like :logId ";
				}
				if(!StringUtil.isEmptyString(pageVO.getClassName())) {
					hql += "AND A.classMethod like :className ";
				}
				if(!StringUtil.isEmptyString(pageVO.getMethodName())) {
					hql += "AND A.classMethod like :methodName ";
				}				
				if(!StringUtil.isEmptyString(pageVO.getLogLevel())) {
					hql += "AND A.logLevel like :logLevel ";
				}
			}
		}		
		
		
		hql += "ORDER BY A.createdDate " + order;
		
		
        Query query = session.createQuery(hql);
        
        if(StringUtil.isEmptyString(pageVO.getKlass()) && !StringUtil.isEmptyString(pageVO.getLogId())) {
        	query.setParameter("logId", pageVO.getLogId());
        }
        else if(!StringUtil.isEmptyString(pageVO.getKlass())) {
			if(pageVO.getKlass().equals("1")) {	// All search
				if(!StringUtil.isEmptyString(pageVO.getKeyword())) {
					query.setParameter("keyword", "%" + pageVO.getKeyword() + "%");
				}
			}
			else if(pageVO.getKlass().equals("2")) {
				if(!StringUtil.isEmptyString(pageVO.getLogId())) {
					query.setParameter("logId", "%" + pageVO.getLogId() + "%");
				}
				if(!StringUtil.isEmptyString(pageVO.getClassName())) {
					query.setParameter("className", "%" + pageVO.getClassName() + "%");
				}
				if(!StringUtil.isEmptyString(pageVO.getMethodName())) {
					query.setParameter("methodName", "%" + pageVO.getMethodName() + "%");
				}				
				if(!StringUtil.isEmptyString(pageVO.getLogLevel())) {
					query.setParameter("logLevel", "%" + pageVO.getLogLevel() + "%");
				}
			}
		}
        
        query.setFirstResult(pageVO.getFirstIndex());
        query.setMaxResults(pageVO.getLastIndex());
        
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
		
		if(StringUtil.isEmptyString(pageVO.getKlass()) && !StringUtil.isEmptyString(pageVO.getLogId())) {
			criteria.add(Restrictions.eq("logId", pageVO.getLogId()));
		}
		else if(!StringUtil.isEmptyString(pageVO.getKlass())) {
			if(pageVO.getKlass().equals("1")) {	// All search
				if(!StringUtil.isEmptyString(pageVO.getKeyword())) {
					criteria.add(Restrictions.disjunction().add(
							Restrictions.or(
									Restrictions.like("logId", "%" + pageVO.getKeyword() + "%"),
									Restrictions.like("classMethod", "%" + pageVO.getKeyword() + "%"),
									Restrictions.like("logLevel", "%" + pageVO.getKeyword() + "%")
							)
					));
				}
			}
			else if(pageVO.getKlass().equals("2")) {
				if(!StringUtil.isEmptyString(pageVO.getLogId())) {
					criteria.add(Restrictions.like("logId", "%" + pageVO.getLogId() + "%"));
				}
				if(!StringUtil.isEmptyString(pageVO.getClassName())) {
					criteria.add(Restrictions.like("classMethod", "%" + pageVO.getClassName() + "%"));
				}
				if(!StringUtil.isEmptyString(pageVO.getMethodName())) {
					criteria.add(Restrictions.like("classMethod", "%" + pageVO.getMethodName() + "%"));
				}
				if(!StringUtil.isEmptyString(pageVO.getLogLevel())) {
					criteria.add(Restrictions.like("logLevel", "%" + pageVO.getLogLevel() + "%"));
				}
			}
		}
				
		long count = (Long)criteria.uniqueResult();
		
		return Integer.parseInt(String.valueOf(count));
	}

}
