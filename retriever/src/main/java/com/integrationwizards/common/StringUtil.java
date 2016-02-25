package com.integrationwizards.common;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class StringUtil {
	/**
	 * Get String from javax.xml.bind.JAXBElement<String>
	 * @param val
	 * @return
	 */
	public static Object getString(javax.xml.bind.JAXBElement<String> val) {
		if(val == null) {
			return "";
		}
		else {
			return val.getValue();
		}
	}
	
	/**
	 * Get BigDecimal data from javax.xml.bind.JAXBElement<BigDecimal>
	 * @param val
	 * @return
	 */
	public static Object getBigDecimal(javax.xml.bind.JAXBElement<BigDecimal> val) {
		if(val == null) {
			return BigDecimal.valueOf(0);
		}
		else {
			return val.getValue();
		}
	}
	
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
	 * if String is null, set an empty string
	 * @param obj
	 * @return
	 */
	public static String nullToVoid(Object obj) {
		if(obj == null) {
			return "";		
		}
		else {
			return String.valueOf(obj).trim();
		}
	}

	/**
	 * if String is null, return a defVal string
	 * @param obj
	 * @param defVal
	 * @return
	 */
	public static String nullToVoid(Object obj, String defVal) {
		if(obj == null) {
			return defVal;		
		}
		else {
			return String.valueOf(obj).trim();
		}
	}
	
	/**
	 * String boolean value (ex:True or False) to convert to Boolean
	 * @param obj
	 * @return
	 */
	public static Boolean getBoolean(String obj) {
		if(obj == null || nullToVoid(obj).equals("")) {
			return false;
		}
		else {
			return Boolean.valueOf(obj);
		}
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
			date1.setMonth(cal.get(Calendar.MONTH));
			date1.setDay(cal.get(Calendar.DAY_OF_MONTH));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	    
	    return date1;
	}
	
	public static BigDecimal getOnlyDecimalTime(Date date) {
		BigDecimal time = null;
		
		try {
			Calendar cal = Calendar.getInstance();
		    cal.setTime(date);
		    
		    String timeStr = cal.get(Calendar.HOUR) + "" + cal.get(Calendar.MINUTE) + "" + cal.get(Calendar.SECOND);
		    time = BigDecimal.valueOf(Long.valueOf(timeStr));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return time;
	}
	
	
	/**
	 * Class Object fields to Map
	 * @param o
	 * @return
	 */
	public static Map<String, Object> objToMap(Object o){
	    Field[] fields = o.getClass().getDeclaredFields();
	    Map<String, Object> m = new HashMap<String, Object>();
	    
	    try{
	        for(Field field : fields){
	            field.setAccessible(true);
	            m.put(field.getName(), field.get(o));
	            Object value = field.get(o);
	            System.out.println(field.getName() + "=" + value);
	        }
	    }catch(Exception e){
	        e.printStackTrace();
	    }
	    
	    return m;
	}	
	
    public static String replace(String source, String subject, String object) {
        StringBuffer rtnStr = new StringBuffer();
        String preStr = "";
        String nextStr = source;
        String srcStr  = source;
        
        while (srcStr.indexOf(subject) >= 0) {
            preStr = srcStr.substring(0, srcStr.indexOf(subject));
            nextStr = srcStr.substring(srcStr.indexOf(subject) + subject.length(), srcStr.length());
            srcStr = nextStr;
            rtnStr.append(preStr).append(object);
        }
        rtnStr.append(nextStr);
        return rtnStr.toString();
    }
    
    public static boolean isEmptyString(String obj) {
    	if(obj == null || obj.trim().equals("")) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public static String insertLeftChar(String source, int length, char ch)
    {
        StringBuffer temp = new StringBuffer(length);
        if(source.length() <= length)
        {
            for(int i = 0; i < length - source.length(); i++)
                temp.append(ch);

            temp.append(source);
        }
        return temp.toString();
    }
	
}
