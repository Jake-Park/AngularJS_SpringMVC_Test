package com.integrationwizards.util;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import com.integrationwizards.common.Constants;

/**
 * Every transaction has an own log file and this file is generated when a transaction is occurred
 * and after the end of transaction, this log file is deleted
 * Log Leverl
 * 
    SEVERE (highest value)
    WARNING
    INFO
    CONFIG
    FINE
    FINER
    FINEST (lowest value)

 * @author User
 */
public class LogFileUtil {
    Logger logger = null;
    FileHandler fh;
    String abbrFilePath;
    String fullFilePath;
    String category;
	
	public LogFileUtil(String category) {
		this.category = category;
		createLogFile();
	}
	
	public LogFileUtil(String category, String id) {
		this.category = category;
		createLogFile(id);
	}
	
	/**
	 * Create log directory with current date
	 * @param path
	 * @return
	 */
	public String createLogDirectory(String path) {
		DateFormat df2 = new SimpleDateFormat("yyyy-MM-dd");
		String today = df2.format(new Date());
		boolean retBool = true;
		
		//System.out.println(today);
		
		File dir = new File(path + today);
		if(!(dir.exists() && dir.isDirectory())) {
			retBool = dir.mkdir();
		}
		
		return retBool ? today : null;		
	}

	/**
	 * Create log file for every transaction	 * 
	 * @param category
	 */
	public void createLogFile() {
		logger = Logger.getLogger(category); 
		String path = Constants.logFileDirectory;
		String dir = createLogDirectory(path);		
		if(dir == null) {
			System.out.println("Fail to Create Log Directory!");
			return;
		}
		path = path + dir;
		
		SimpleDateFormat nowTime = new SimpleDateFormat("HHmmss");
		String now = nowTime.format(new Date());
		
		final File folder = new File(path);
		
		try {
			int maxFnum = getMaxFileNumber(folder, category);
			abbrFilePath = dir + File.separator + category + "_" + (maxFnum + 1) + "_" + now + ".log";
			fullFilePath = path + File.separator + category + "_" + (maxFnum + 1) + "_" + now + ".log";
	        // This block configure the logger with handler and formatter  
	        fh = new FileHandler(fullFilePath);  
	        logger.addHandler(fh);
	        fh.setFormatter(new Formatter2()); 
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	/**
	 * Create log file for every transaction	 * 
	 * @param category
	 */
	public void createLogFile(String path) {
		logger = Logger.getLogger(category);
		
		try {
			abbrFilePath = path;
			fullFilePath = Constants.logFileDirectory + path;
	        // This block configure the logger with handler and formatter 
			fh = new FileHandler(fullFilePath, true); 
			
	        logger.addHandler(fh);
	        fh.setFormatter(new Formatter2()); 
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void info(Object message) {
		if(fh != null && logger != null && message != null) {
			logger.info(message.toString());
		}
	}
	
	public void severe(Object message) {
		if(fh != null && logger != null && message != null) {
			logger.severe(message.toString());			
		}
	}
	
	/**
	 * Get Max File index number - Each log file has an index with ascending order
	 * @param folder
	 * @param prefix
	 * @return
	 * @throws Exception
	 */
	public int getMaxFileNumber(File folder, String prefix) throws Exception {		
		int fIdx = 0;
		
	    for (File fileEntry : folder.listFiles()) {
	        if (!fileEntry.isDirectory()) {
	        	String fileName = fileEntry.getName();
	        	//System.out.println(fileName.indexOf("_") + "-----" + fileName);
	        	
	        	if(fileName.indexOf(prefix + "_") != -1 && fileName.indexOf("_") > 0) {
	        		int startPos = fileName.indexOf("_") + 1;
	        		int endPos = fileName.lastIndexOf("_");
	        		//System.out.println("--" + startPos + "_" + endPos + "-----" + fileName.substring(startPos, endPos));
	        		if(startPos >= endPos) {
	        			continue;
	        		}	        		
	        		int tNum = Integer.parseInt(fileName.substring(startPos, endPos));
	        		//System.out.println(fIdx + "--" + tNum);
	        		if(tNum > fIdx) {
	        			fIdx = tNum;
	        		}
	        	}
	        }
	    }
	    
		return fIdx;
	}
	
	public String getFullFilePath() {
		return fullFilePath;
	}
	
	public String getAbbrFilePath() {
		return abbrFilePath;
	}
	
	public void removeFile() {		
		try {
			if(fh != null) {
				fh.close();
			}
			if(fullFilePath != null) {
				File f = new File(fullFilePath);
				if(f != null) {
					f.delete();
				}
			}		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void closeFile() {		
		try {
			if(fh != null) {
				fh.flush();
				fh.close();
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}

class Formatter2 extends Formatter {
	@Override
    public String format(LogRecord record) {
        SimpleDateFormat logTime = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");
        Calendar cal = new GregorianCalendar();
        cal.setTimeInMillis(record.getMillis());
        return record.getLevel()
        		+ " "
                + logTime.format(cal.getTime())
                + " || "
                + record.getSourceClassName().substring(
                        record.getSourceClassName().lastIndexOf(".")+1,
                        record.getSourceClassName().length())
                + "."
                + record.getSourceMethodName()
                + "() : "
                + record.getMessage() + "\n";
    }
}
