package com.integrationwizards.util;

import java.util.HashMap;
import java.util.Map;

import javax.xml.ws.BindingProvider;

import org.springframework.stereotype.Component;

import au.com.retriever.test.barking.RetrieverBarking;
import au.com.retriever.test.barking.RetrieverBarkingService;
import au.com.tmha.cos100mi.COS100MI;
import au.com.tmha.cos100mi.COS100MIService;
import au.com.tmha.crs610mi.CRS610MI;
import au.com.tmha.crs610mi.CRS610MIService;
import au.com.tmha.mos057mi.MOS057MI;
import au.com.tmha.mos057mi.MOS057MIService;
import au.com.tmha.mos070mi.MOS070MI;
import au.com.tmha.mos070mi.MOS070MIService;
import au.com.tmha.mos100mi.MOS100MI;
import au.com.tmha.mos100mi.MOS100MIService;
import au.com.tmha.mos104mi.MOS104MI;
import au.com.tmha.mos104mi.MOS104MIService;
import au.com.tmha.mos195mi.MOS195MI;
import au.com.tmha.mos195mi.MOS195MIService;

public class HeaderFactory {
	private Map<String, Object> headerMap = null;
	private static HeaderFactory instance = null;
	
	public HeaderFactory() {
		headerMap = new HashMap<String, Object>();
	}
	
	public static HeaderFactory getInstance() {
		if(instance == null) {
			instance = new HeaderFactory();
		}
		
		return instance;
	}
	
	public Object getHeader(String key) {
		if(key.equals(ConstantUtil.RetrieverBarking)) {
			if(headerMap.get(key) == null) {
				headerMap.put(key, getRetrieverBarking());
			}
		}
		else if(key.equals(ConstantUtil.MOS104MI)) {
			if(headerMap.get(key) == null) {
				headerMap.put(key, getMOS104MIPort());
			}
		}
		else if(key.equals(ConstantUtil.MOS100MI)) {
			if(headerMap.get(key) == null) {
				headerMap.put(key, getMOS100MIPort());
			}
		}
		else if(key.equals(ConstantUtil.CRS610MI)) {
			if(headerMap.get(key) == null) {
				headerMap.put(key, getCRS610MIPort());
			}
		}
		else if(key.equals(ConstantUtil.COS100MI)) {
			if(headerMap.get(key) == null) {
				headerMap.put(key, getCOS100MIPort());
			}
		}
		else if(key.equals(ConstantUtil.MOS195MI)) {
			if(headerMap.get(key) == null) {
				headerMap.put(key, getMOS195MIPort());
			}
		}
		else if(key.equals(ConstantUtil.MOS070MI)) {
			if(headerMap.get(key) == null) {
				headerMap.put(key, getMOS070MIPort());
			}
		}
		else if(key.equals(ConstantUtil.MOS057MI)) {
			if(headerMap.get(key) == null) {
				headerMap.put(key, getMOS057MIPort());
			}
		}
		
		return headerMap.get(key);
	}
	
	public RetrieverBarking getRetrieverBarking() {
		RetrieverBarkingService service = new RetrieverBarkingService();
		RetrieverBarking changeStudentDetailsImplPort = service.getRetrieverBarkingPort();
		
		// Set Http Basic Authentication
		((BindingProvider)changeStudentDetailsImplPort).getRequestContext().put(
		    BindingProvider.USERNAME_PROPERTY, ConstantUtil.retrieverWsAccessId);
		((BindingProvider)changeStudentDetailsImplPort).getRequestContext().put(
		    BindingProvider.PASSWORD_PROPERTY, ConstantUtil.retrieverWsAccessPass);	
		
		return changeStudentDetailsImplPort;
	}
	
	public MOS104MI getMOS104MIPort() {
		MOS104MIService mos104MIService = new MOS104MIService();
		MOS104MI mos104MI = mos104MIService.getMOS104MIPort();
		
		// Set Http Basic Authentication
		((BindingProvider)mos104MI).getRequestContext().put(
		    BindingProvider.USERNAME_PROPERTY, ConstantUtil.m3WsAccessId);
		((BindingProvider)mos104MI).getRequestContext().put(
		    BindingProvider.PASSWORD_PROPERTY, ConstantUtil.m3WsAccessPass);
		
		return mos104MI;
	}
	
	public MOS100MI getMOS100MIPort() {
		MOS100MIService mos100MIService = new MOS100MIService();
		MOS100MI mos100MI = mos100MIService.getMOS100MIPort();
		
		// Set Http Basic Authentication
		((BindingProvider)mos100MI).getRequestContext().put(
		    BindingProvider.USERNAME_PROPERTY, ConstantUtil.m3WsAccessId);
		((BindingProvider)mos100MI).getRequestContext().put(
		    BindingProvider.PASSWORD_PROPERTY, ConstantUtil.m3WsAccessPass);
		
		return mos100MI;
	}
	
	public CRS610MI getCRS610MIPort() {
		CRS610MIService crs610MIService = new CRS610MIService();
		CRS610MI crs610MI = crs610MIService.getCRS610MIPort();
		
		// Set Http Basic Authentication
		((BindingProvider)crs610MI).getRequestContext().put(
		    BindingProvider.USERNAME_PROPERTY, ConstantUtil.m3WsAccessId);
		((BindingProvider)crs610MI).getRequestContext().put(
		    BindingProvider.PASSWORD_PROPERTY, ConstantUtil.m3WsAccessPass);
		
		return crs610MI;
	}
	
	public COS100MI getCOS100MIPort() {
		COS100MIService cos100MIService = new COS100MIService();
		COS100MI cos100MI = cos100MIService.getCOS100MIPort();
		
		// Set Http Basic Authentication
		((BindingProvider)cos100MI).getRequestContext().put(
		    BindingProvider.USERNAME_PROPERTY, ConstantUtil.m3WsAccessId);
		((BindingProvider)cos100MI).getRequestContext().put(
		    BindingProvider.PASSWORD_PROPERTY, ConstantUtil.m3WsAccessPass);
		
		return cos100MI;
	}
	
	public MOS195MI getMOS195MIPort() {
		MOS195MIService mos195MIService = new MOS195MIService();
		MOS195MI mos195MI = mos195MIService.getMOS195MIPort();
		
		// Set Http Basic Authentication
		((BindingProvider)mos195MI).getRequestContext().put(
		    BindingProvider.USERNAME_PROPERTY, "MECAPI");
		((BindingProvider)mos195MI).getRequestContext().put(
		    BindingProvider.PASSWORD_PROPERTY, "M3cus3r");
		
		return mos195MI;
	}
	
	public MOS070MI getMOS070MIPort() {
		MOS070MIService mos070MIService = new MOS070MIService();
		MOS070MI mos070MI = mos070MIService.getMOS070MIPort();		
		getAuthentication(mos070MI);
		
		return mos070MI;
	}
	
	public MOS057MI getMOS057MIPort() {
		MOS057MIService mos057MIService = new MOS057MIService();
		MOS057MI mos057MI = mos057MIService.getMOS057MIPort();		
		getAuthentication(mos057MI);
		
		return mos057MI;
	}
	
	public void getAuthentication(Object obj) {
		// Set Http Basic Authentication
		((BindingProvider)obj).getRequestContext().put(
		    BindingProvider.USERNAME_PROPERTY, "MECAPI");
		((BindingProvider)obj).getRequestContext().put(
		    BindingProvider.PASSWORD_PROPERTY, "M3cus3r");
	}
}
