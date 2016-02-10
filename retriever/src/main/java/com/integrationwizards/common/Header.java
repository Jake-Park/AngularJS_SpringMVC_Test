package com.integrationwizards.common;

import javax.xml.ws.BindingProvider;

import org.springframework.stereotype.Component;

import au.com.retriever.test.barking.RetrieverBarking;
import au.com.retriever.test.barking.RetrieverBarkingService;
import au.com.tmha.cos100mi.COS100MI;
import au.com.tmha.cos100mi.COS100MIService;
import au.com.tmha.crs610mi.CRS610MI;
import au.com.tmha.crs610mi.CRS610MIService;
import au.com.tmha.mos100mi.MOS100MI;
import au.com.tmha.mos100mi.MOS100MIService;
import au.com.tmha.mos104mi.MOS104MI;
import au.com.tmha.mos104mi.MOS104MIService;

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
	
	public MOS104MI getMOS104MIPort() {
		MOS104MIService mos104MIService = new MOS104MIService();
		MOS104MI mos104MI = mos104MIService.getMOS104MIPort();
		
		// Set Http Basic Authentication
		((BindingProvider)mos104MI).getRequestContext().put(
		    BindingProvider.USERNAME_PROPERTY, "MECAPI");
		((BindingProvider)mos104MI).getRequestContext().put(
		    BindingProvider.PASSWORD_PROPERTY, "M3cus3r");
		
		return mos104MI;
	}
	
	public MOS100MI getMOS100MIPort() {
		MOS100MIService mos100MIService = new MOS100MIService();
		MOS100MI mos100MI = mos100MIService.getMOS100MIPort();
		
		// Set Http Basic Authentication
		((BindingProvider)mos100MI).getRequestContext().put(
		    BindingProvider.USERNAME_PROPERTY, "MECAPI");
		((BindingProvider)mos100MI).getRequestContext().put(
		    BindingProvider.PASSWORD_PROPERTY, "M3cus3r");
		
		return mos100MI;
	}
	
	public CRS610MI getCRS610MIPort() {
		CRS610MIService crs610MIService = new CRS610MIService();
		CRS610MI crs610MI = crs610MIService.getCRS610MIPort();
		
		// Set Http Basic Authentication
		((BindingProvider)crs610MI).getRequestContext().put(
		    BindingProvider.USERNAME_PROPERTY, "MECAPI");
		((BindingProvider)crs610MI).getRequestContext().put(
		    BindingProvider.PASSWORD_PROPERTY, "M3cus3r");
		
		return crs610MI;
	}
	
	public COS100MI getCOS100MIPort() {
		COS100MIService cos100MIService = new COS100MIService();
		COS100MI cos100MI = cos100MIService.getCOS100MIPort();
		
		// Set Http Basic Authentication
		((BindingProvider)cos100MI).getRequestContext().put(
		    BindingProvider.USERNAME_PROPERTY, "MECAPI");
		((BindingProvider)cos100MI).getRequestContext().put(
		    BindingProvider.PASSWORD_PROPERTY, "M3cus3r");
		
		return cos100MI;
	}
	
}
