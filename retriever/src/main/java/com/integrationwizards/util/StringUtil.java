package com.integrationwizards.util;

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
	
	public static BigDecimal getOnlyDecimalTime(Date date) {
		BigDecimal time = null;
		
		try {
			Calendar cal = Calendar.getInstance();
		    cal.setTime(date);
		    
		    String timeStr = cal.get(Calendar.HOUR_OF_DAY) + insertLeftChar(String.valueOf(cal.get(Calendar.MINUTE)), 2, '0');
		    
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
    
    public static String nullToEmpty(String str)
    {
        return str != null ? str : "";
    }
    
    public static int nullToInteger(String str){
    	return str != null ? Integer.parseInt(str) : 0;
    }
	
}
