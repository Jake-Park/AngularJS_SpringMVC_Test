package com.integrationwizards.util;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

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
	 * Get Session Factory from hibernate.cfg.xml
	 * @return
	 */
    public SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            // loads configuration and mappings
            Configuration configuration = new Configuration().configure();
            ServiceRegistry serviceRegistry
                = new StandardServiceRegistryBuilder()
                    .applySettings(configuration.getProperties()).build();
             
            // builds a session factory from the service registry
            sessionFactory = configuration.buildSessionFactory(serviceRegistry);           
        }
         
        return sessionFactory;
    }
    
    /**
     * Get Session from session factory
     * @return
     */
    public Session getSession() {
    	Session session = getSessionFactory().getCurrentSession();
    	if(session == null) {
    		session = getSessionFactory().openSession();
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
