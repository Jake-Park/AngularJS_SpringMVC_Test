package com.integrationwizards.common;

import java.util.HashMap;
import java.util.Map;

public class LogManager {
	private static LogManager instance = null;
	private Map<String, LogUtil> logMap = null;
	
	public LogManager() {
		logMap = new HashMap<String, LogUtil>();
	}
	
	public static LogManager getInstance() {
		if(instance == null) {
			instance = new LogManager();
		}
		
		return instance;
	}
	
	public Map<String, LogUtil> getLogMap() {
		return logMap;
	}
	
	public LogUtil getLogObj(String category) {
		if(logMap.get(category) == null) {
			logMap.put(category, new LogUtil(category));
		}
		
		return logMap.get(category);
	}
	
	public void closeLogObj(String category) {
		if(logMap != null) {
			logMap.put(category, null);
		}
	}
}
