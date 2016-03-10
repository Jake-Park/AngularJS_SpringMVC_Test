package com.integrationwizards.common;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * This class is for getting a bean from POJO class
 * @author User
 *
 */
public class StaticSpringApplicationContext implements ApplicationContextAware {
	private static ApplicationContext CONTEXT;

	public void setApplicationContext(ApplicationContext context) throws BeansException {
		this.CONTEXT = context;
	}
	
    public static Object getBean(String beanName) {
        return CONTEXT.getBean(beanName);
    }	
}
