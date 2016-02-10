package com.integrationwizards.common;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class StringUtil {
	public static Object getString(javax.xml.bind.JAXBElement<String> val) {
		if(val == null) {
			return "";
		}
		else {
			return val.getValue();
		}
	}
	
	public static Object getBigDecimal(javax.xml.bind.JAXBElement<BigDecimal> val) {
		if(val == null) {
			return BigDecimal.valueOf(0);
		}
		else {
			return val.getValue();
		}
	}
	
	public static Object getCalendar(javax.xml.bind.JAXBElement<XMLGregorianCalendar> val) throws Exception {
		if(val == null) {
			return getDummyDate();
		}
		else {
			return val.getValue();
		}
	}
	
	public static XMLGregorianCalendar getDummyDate() throws Exception {
    	Date sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse("0000-00-00 00:00:00");
		GregorianCalendar c = new GregorianCalendar();
		c.setTime(sdf);
		return DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
	}
	
	public static String nullToVoid(Object obj) {
		if(obj == null) {
			return "";		
		}
		else {
			return String.valueOf(obj).trim();
		}
	}
	
	public static Boolean getBoolean(String obj) {
		if(obj == null || nullToVoid(obj).equals("")) {
			return false;
		}
		else {
			return Boolean.valueOf(obj);
		}
	}
	
	public static XMLGregorianCalendar getXMLGregorianCalendar(String date) {
		XMLGregorianCalendar date1 = null;
		
		try {
	    	Date sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(date);
			GregorianCalendar c = new GregorianCalendar();
			c.setTime(sdf);
			date1 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return date1;
	}
}
