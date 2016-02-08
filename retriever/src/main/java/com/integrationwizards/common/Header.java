package com.integrationwizards.common;

import javax.servlet.http.HttpSession;
import javax.xml.ws.BindingProvider;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import au.com.retriever.test.barking.RetrieverBarking;
import au.com.retriever.test.barking.RetrieverBarkingService;

@Component
public class Header {
	public RetrieverBarking getRetrieverBarking() {
		RetrieverBarkingService service = new RetrieverBarkingService();
		RetrieverBarking changeStudentDetailsImplPort = service.getRetrieverBarkingPort();
		
		// Set Http Basic Authentication
		((BindingProvider)changeStudentDetailsImplPort).getRequestContext().put(
		    BindingProvider.USERNAME_PROPERTY, "m3sandpitwsuser");
		((BindingProvider)changeStudentDetailsImplPort).getRequestContext().put(
		    BindingProvider.PASSWORD_PROPERTY, "0jntN3dB1zaTRh5cUfZk");	
		
		return changeStudentDetailsImplPort;
	}
	
}
