package com.integrationwizards.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.integrationwizards.dao.ExportJobsDao;
import com.integrationwizards.model.HEJob;
import com.integrationwizards.model.HJob;
import com.integrationwizards.model.HResultExportJobs;
import com.integrationwizards.model.LogMaster;
import com.integrationwizards.util.StringUtil;

@Repository
public class ExportJobsDaoImpl implements ExportJobsDao {
	@Autowired
	@Qualifier("hibernate4AnnotatedSessionFactory")
	private SessionFactory sessionFactory;
	
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
		
		return (HJob)(criteria.list().get(0));	
	}
	
	/**
	 * Select failed to send exportJobs with limited maxCount
	 */
	public List<HEJob> selectExportJobs(String maxCount) throws Exception {
		Session session = this.sessionFactory.getCurrentSession();
		
		Criteria criteria = session.createCriteria(LogMaster.class)
				.add(Restrictions.eq("key2", "exportJobs"))
				.add(Restrictions.ne("key1", ""))
				.add(Restrictions.ne("subProcess", ""))
				.add(Restrictions.lt("count", StringUtil.nullToInteger(maxCount)))
				.add(Restrictions.disjunction().add(
						Restrictions.or(
								Restrictions.eq("state", "ERR"),
								Restrictions.eq("state", "STA")
						)
				));
		
		List<LogMaster> logMasterList = criteria.list();
		
		List<HEJob> hEJobList = new ArrayList<HEJob>();
		
		for(LogMaster logMaster : logMasterList) {
			String hql = "SELECT eJob "
					+ "FROM HEJob AS eJob "
					+ "LEFT join eJob.eOhs AS ohs "
					+ "LEFT join eJob.eNewAsset AS newAsset "
					+ "LEFT join eJob.eService AS service "
					+ "LEFT join eJob.ePart AS part "
					+ "LEFT join eJob.eSignature AS signature "
					+ "LEFT join eJob.eChecklist AS checklist "
					+ "LEFT join eJob.eTime AS time "
					+ "LEFT join eJob.eAllowance AS allowance "
					+ "LEFT join eJob.ePurchaseOrder AS purchaseOrder "
					+ "LEFT join eJob.eReport AS report "
					+ "WHERE eJob.logId = :logId "
					+ "ORDER BY eJob.createDatetime DESC ";
			
	        Query query = session.createQuery(hql);
	        query.setParameter("logId", logMaster.getLogId());
	        
	        hEJobList.add((HEJob)query.uniqueResult());
	        
	        // Whenever selected, plus count one in order to increase attempted count number
	        logMaster.setCount(logMaster.getCount() + 1);
    		session.update(logMaster);
		}
		
        return hEJobList;
	}
	
	public void updateLogId(HEJob hEJob) throws Exception {
		this.sessionFactory.getCurrentSession().update(hEJob);
	}
}
