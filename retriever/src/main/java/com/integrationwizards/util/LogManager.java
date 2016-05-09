package com.integrationwizards.util;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.transaction.support.TransactionTemplate;

import com.integrationwizards.common.StaticSpringApplicationContext;

public class LogManager {
	private static LogManager instance = null;
	private Map<String, LogUtil> logMap = null;
	private SessionFactory sessionFactory;
	
	public LogManager() {
		logMap = new HashMap<String, LogUtil>();
		
	}
	
	public static LogManager getInstance() {
		if(instance == null) {
			instance = new LogManager();
		}
		return instance;
	}
    
    /**
     * Get Session from session factory
     * @return
     */
    public Session getSession() throws Exception {
    	
    	if(this.sessionFactory == null) {
    		this.sessionFactory = (SessionFactory)StaticSpringApplicationContext.getBean("hibernate4AnnotatedSessionFactoryForLog");
    	}    	
    	
    	Session session = null;
    	
    	try {    	
    		session = this.sessionFactory.getCurrentSession();
    	}
    	catch(Exception e) {
    	}
    	
    	if(session == null) {    		
    		session = sessionFactory.openSession();
    	}
    	
    	return session;
    }
	
	public Map<String, LogUtil> getLogMap() {
		return logMap;
	}
	
	public LogUtil createLogObj(String category, String logId) {
		LogUtil lu = new LogUtil(category, logId);
		logMap.put(logId, lu);
		return lu;
	}
	
	public LogUtil getLogObj(String category, String logId) {
		if(logMap.get(logId) == null) {
			logMap.put(logId, new LogUtil(category, logId));
		}
		return logMap.get(logId);
	}
	
	public LogUtil getLogObj(String logId) {
		return logMap.get(logId);
	}
	
	public void closeLogObj(String logId) {
		if(logMap.get(logId) != null) {
			logMap.remove(logId);
		}
	}
}
