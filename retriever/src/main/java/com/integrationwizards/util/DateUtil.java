package com.integrationwizards.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class DateUtil {

	
	/**
	 * Get XMLGregorianCalendar data from javax.xml.bind.JAXBElement<XMLGregorianCalendar>
	 * @param val
	 * @return
	 */
	public static Object getXMLCalendar(javax.xml.bind.JAXBElement<XMLGregorianCalendar> val) throws Exception {
		if(val == null) {
			return getDummyDate();
		}
		else {
			String value = val.getValue().toString();
			if(value.indexOf("+") != -1) {
				value = value.substring(0, 10);
			}
			Date sdf = new SimpleDateFormat("yyyy-MM-dd").parse(value);
			GregorianCalendar c = new GregorianCalendar();
			c.setTime(sdf);
				
			return DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
		}
	}
	
	/**
	 * Get String type of date from javax.xml.bind.JAXBElement<XMLGregorianCalendar>
	 * @param val
	 * @return
	 */
	public static String getStringCalendar(javax.xml.bind.JAXBElement<XMLGregorianCalendar> val) throws Exception {
		if(val == null) {
			return "0000-00-00";
		}
		else {
			String value = val.getValue().toString();
			if(value.indexOf("+") != -1) {
				value = value.substring(0, 10);
			}
				
			return value;
		}
	}
	
	/**
	 * In case for null data from XMLGregorianCalendar, setting a dummy date 
	 * @param val
	 * @return
	 */
	public static XMLGregorianCalendar getDummyDate() throws Exception {
    	Date sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm").parse("0000-00-00 00:00");
		GregorianCalendar c = new GregorianCalendar();
		c.setTime(sdf);
		return DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
	}
	

	
	/**
	 * Convert String date to XMLGregorianCalendar object
	 * @param date
	 * @return
	 */
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
	
	/**
	 * Convert String date to XMLGregorianCalendar object
	 * @param date
	 * @return
	 */
	public static XMLGregorianCalendar getXMLGregorianCalendar(String format, String date) {
		XMLGregorianCalendar date1 = null;
		
		try {
	    	Date sdf = new SimpleDateFormat(format).parse(date);
			GregorianCalendar c = new GregorianCalendar();
			c.setTime(sdf);
			date1 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return date1;
	}
	
	/**
	 * Convert Date to XMLGregorianCalendar object
	 * @param date
	 * @return
	 */
	public static XMLGregorianCalendar getXMLGregorianCalendar(Date date) {
		XMLGregorianCalendar date1 = null;
		
		try {
			GregorianCalendar c = new GregorianCalendar();
			c.setTime(date);
			date1 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return date1;
	}
	
	public static XMLGregorianCalendar getOnlyXMLGregorianCalendarForDate(Date date) {
		XMLGregorianCalendar date1 = null;
		
		try {
			Calendar cal = Calendar.getInstance();
		    cal.setTime(date);
		    
			date1 = DatatypeFactory.newInstance().newXMLGregorianCalendar();
			date1.setYear(cal.get(Calendar.YEAR));
			date1.setMonth(cal.get(Calendar.MONTH) + 1);
			date1.setDay(cal.get(Calendar.DAY_OF_MONTH));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	    
	    return date1;
	}
}
