package com.integrationwizards.common;


import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.integrationwizards.model.LogDetail;
import com.integrationwizards.model.LogMaster;

public class LogUtil {
	private String logId;
	private String category;
	Logger logger = null;
	
	public LogUtil() {
	}
		
	public LogUtil(String category, String logId) {
		this.category = category;
		this.logId = logId;
	}
	
	public String getLogId() {
		return this.logId;
	}
	
	public void updateStates(String key1, int state) {
		Session session = null;
		Transaction trans = null;
		
		try {
			session = LogManager.getInstance().getSession();
			trans = session.beginTransaction();
			
			LogMaster lm = new LogMaster();
			lm.setLogId(logId);
			lm.setKey1(key1);	// MWNO : Work Order Number
			lm.setKey2(category);
			lm.setState(state);
			
			if(session != null) {
				session.saveOrUpdate(lm);
				trans.commit();
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			
			if(trans != null) {
				trans.rollback();
			}
		}
	}
	
	public void debug(String msg) {
		detail(1, msg);
	}
	
	public void info(String msg) {
		detail(2, msg);
	}
	
	public void error(String msg) {
		detail(3, msg);
	}	
	
	public void detail(int level, String msg) {
		Session session = null;
		Transaction trans = null;
		
		try {
			session = LogManager.getInstance().getSession();
			trans = session.beginTransaction();
			
			LogDetail ld = new LogDetail();
			StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
			StackTraceElement stack = stackTraceElements[3];
						
			ld.setLogId(logId);
			if(stack != null) {
				logger = Logger.getLogger(stack.getClass());
				ld.setClassMethod(stack.getClassName() + ":" + stack.getMethodName());
				
				if(logger != null) {
					if(level == 1) {
						logger.info(msg);
					}
					else if(level == 2) {
						logger.debug(msg);
					}
					else {
						logger.error(msg);
					}
				}
			}
			
			ld.setLogLevel(level);	// 1 : INFO, 2 : DEBUG, 3 : ERROR
			ld.setText(msg);
			
			if(session != null) {
				session.save(ld);
				trans.commit();
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			
			if(trans != null) {
				trans.rollback();
			}
		}
	}
}
