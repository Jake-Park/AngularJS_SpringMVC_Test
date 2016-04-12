package com.integrationwizards.admin.document;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.xml.bind.JAXBElement;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.integrationwizards.util.StringUtil;

import generated.DatabaseData;

@Component
public class DataHandler {	
	@Autowired
	TableHandler tableHandler;
	
	/**
	 * parsing data from implementation tag by prefix  
	 */
	public List<String> parseData(DatabaseData databaseData, String prefix) {
		DatabaseData.Functions functions = databaseData.getFunctions();
		DatabaseData.Implementations implementations = databaseData.getImplementations();
		String parsedStr = "";
		List<String> parsedDataList = new ArrayList<>();
		
		for(DatabaseData.Functions.Function function : functions.getFunction()) {
			String type = function.getType();
			if(type.equals("UV")) {
				for(DatabaseData.Implementations.Implementation impl : implementations.getImplementation()) {
	        		List<Serializable> contents = impl.getContent();
	        		
	        		for(int i=0; i < contents.size(); i++) {
	        			Serializable content = contents.get(i);
	        			if(content instanceof JAXBElement) {
	        				JAXBElement<DatabaseData.Implementations.Implementation.Language> jaxb 
	        					= (JAXBElement<DatabaseData.Implementations.Implementation.Language>)content;
	        				if(jaxb.getDeclaredType() == DatabaseData.Implementations.Implementation.Language.class) {
	        					DatabaseData.Implementations.Implementation.Language language 
	        						= (DatabaseData.Implementations.Implementation.Language)jaxb.getValue();
	        					
	        					// get version log detail 
	        					if(language.getIDREF().equals(function.getIDF().getID())) {
	        						parsedStr = (String)contents.get(i+1);
	        						break;
	        					}
	        				}
	        			}
	        		}
	        		
	        		if(parsedStr.indexOf(prefix) != -1) {
	        			parsedStr = parsedStr.substring(parsedStr.indexOf(prefix) + (prefix.length() + 1));
	        			int endIndex = parsedStr.indexOf("*/");
	        				        			
	        			parsedStr = parsedStr.substring(0, endIndex);
	        			//System.out.println(parsedStr);
	        			parsedDataList.add(parsedStr);	        			
	        		}
	        		parsedStr = "";
				}
			}
		}
		
		return parsedDataList;
	}
	
	/**
	 * parsing translation, custom code and error handling data
	 */
	public List<Object> getTranCustomError(XWPFDocument doc, DatabaseData databaseData) {
		DatabaseData.Functions functions = databaseData.getFunctions();
		DatabaseData.Implementations implementations = databaseData.getImplementations();
		List<Map<String, String>> tranList = new ArrayList<>();
		List<String> customCodeList = new ArrayList<>();
		List<String> errList = new ArrayList<>();
		String implStr = "";
		List<Object> returnList = new ArrayList<>();

		
		for(DatabaseData.Functions.Function function : functions.getFunction()) {
			String type = function.getType();
			if(type.equals("UV")) {
				
				for(DatabaseData.Implementations.Implementation impl : implementations.getImplementation()) {
	        		List<Serializable> contents = impl.getContent();
	        		
	        		for(int i=0; i < contents.size(); i++) {
	        			Serializable content = contents.get(i);
	        			if(content instanceof JAXBElement) {
	        				JAXBElement<DatabaseData.Implementations.Implementation.Language> jaxb 
	        					= (JAXBElement<DatabaseData.Implementations.Implementation.Language>)content;
	        				if(jaxb.getDeclaredType() == DatabaseData.Implementations.Implementation.Language.class) {
	        					DatabaseData.Implementations.Implementation.Language language 
	        						= (DatabaseData.Implementations.Implementation.Language)jaxb.getValue();
	        					
	        					// get version log detail 
	        					if(language.getIDREF().equals(function.getIDF().getID())) {
	        						implStr = (String)contents.get(i+1);
	        						break;
	        					}
	        				}
	        			}
	        		}
				}
        		
        		if(implStr.indexOf("dt.") != -1) {
        			//System.out.println(implStr);
            		//System.out.println("@@");
            		
            		ArrayList<Integer> positions = new ArrayList<>();
            		Pattern p = Pattern.compile("dt\\.to");  // insert your pattern here
            		Matcher m = p.matcher(implStr);
            		while (m.find()) {
            		   positions.add(m.start());
            		}
            		
            		for(Integer start : positions) {
            			Map<String, String> map = new HashMap<>();
            			
            			String tempStr = implStr.substring(start);
            			//System.out.println(":" + tempStr);
            			if(tempStr.indexOf(" ") == -1) {
            				continue;
            			}
            			String direction = tempStr.substring(3, tempStr.indexOf(" "));
            			map.put("DIRECTION", direction);
            			tranList.add(map);
            			
            			// Get Segment
            			if(tempStr.indexOf(" (\"") == -1) {
            				continue;
            			}
            			tempStr = tempStr.substring(tempStr.indexOf(" (\"") + 3);
            			
            			if(tempStr.indexOf("\"") == -1) {
            				continue;
            			}
            			String segment = tempStr.substring(0, tempStr.indexOf("\""));
            			map.put("SEGMENT", segment);
            			
            			// Get Field
            			if(tempStr.indexOf("\", \"") == -1) {
            				continue;
            			}		            			
            			tempStr = tempStr.substring(tempStr.indexOf("\", \"") + 4);
            			//System.out.println(tempStr);
            			if(tempStr.indexOf("\"") == -1) {
            				continue;
            			}  
            			String field = tempStr.substring(0, tempStr.indexOf("\""));
            			map.put("FIELD", field);
            			//System.out.println(direction + ":" + segment + ":" + field);            			
            		}
        		}
        		
        		// Get Custom Code Data
        		if(implStr.indexOf("mod:") != -1) {
            		ArrayList<Integer> positions = new ArrayList<>();
            		Pattern p = Pattern.compile("mod:");  // insert your pattern here
            		Matcher m = p.matcher(implStr);
            		while (m.find()) {
            		   positions.add(m.start());
            		}
            		
            		for(Integer start : positions) {
            			String tempStr = implStr.substring(start);
            			
            			if(tempStr.indexOf("*/") == -1) {
            				continue;
            			}
            			//System.out.println(tempStr.substring(5, tempStr.indexOf(":mod")));            			
            			customCodeList.add(tempStr.substring(6, tempStr.indexOf("*/")));
            		}
        		}
        		
        		// Get Error Handling Data
        		if(implStr.indexOf("err:") != -1) {
            		ArrayList<Integer> positions = new ArrayList<>();
            		Pattern p = Pattern.compile("err:");  // insert your pattern here
            		Matcher m = p.matcher(implStr);
            		while (m.find()) {
            		   positions.add(m.start());
            		}
            		
            		for(Integer start : positions) {
            			String tempStr = implStr.substring(start);
            			
            			if(tempStr.indexOf("*/") == -1) {
            				continue;
            			}
            			//System.out.println(tempStr.substring(5, tempStr.indexOf(":mod")));            			
            			errList.add(tempStr.substring(6, tempStr.indexOf("*/")));
            		}
        		}
			}
		}
		
		//System.out.println(tranList);
		returnList.add(0, tranList);
		returnList.add(1, customCodeList);		
		returnList.add(2, errList);
		
		return returnList;
	}
	
	/**
	 * Get data from API table
	 * @param doc
	 * @param databaseData
	 */
	public void setAPIMessages(XWPFDocument doc, DatabaseData databaseData) {
		// Get API Data
        DatabaseData.Functions functions = databaseData.getFunctions();
        DatabaseData.Parameters paramters = databaseData.getParameters();
        DatabaseData.Links links = databaseData.getLinks();
        List<HashMap<String, Object>> apiList = new ArrayList<HashMap<String, Object>>();
        
        for(DatabaseData.Functions.Function function : functions.getFunction()) {
        	String type = function.getType();
        	if(type.equals("AVI")) {
        		HashMap<String, Object> map = new HashMap<>();
        		String pathStr = function.getPATH();
        		if(!StringUtil.isEmptyString(pathStr) && pathStr.substring(0, 1).equals("/")) {
        			pathStr = pathStr.substring(1);
        		}
        		map.put("PATH", pathStr);
        		map.put("DESC", function.getDescription());
        		map.put("IDF", function.getIDF().getID());
        		apiList.add(map);
        		
                // Get Parameters for each API
                for(DatabaseData.Parameters.Parameter parameter : paramters.getParameter()) {
                	String idref = parameter.getIDF().getIDREF();
                	
                	List<HashMap<String, String>> paramList = null;
            		if(idref.equals(map.get("IDF"))) {
            			if(map.get("PARAM_" + parameter.getType()) == null) {
            				map.put("PARAM_" + parameter.getType(), new ArrayList<HashMap<String, String>>());
            			}
            			
            			paramList = (List<HashMap<String, String>>)map.get("PARAM_" + parameter.getType());            			
            		}
            		
            		if(paramList != null) {
	            		HashMap<String, String> param = new HashMap<>();
	        			param.put("POSITION", String.valueOf(parameter.getPosition()));
	        			param.put("NAME", parameter.getName());
	        			param.put("TYPE", parameter.getType());
	        			param.put("DATA_TYPE", parameter.getDataType());
	        			param.put("DESC", parameter.getDescription());
	        			param.put("USED", "");
	        			
	        			String idpStr = parameter.getIDP().getID();
	        			for(DatabaseData.Links.Link link : links.getLink()) {
	        				if(idpStr.equals(link.getOutTo().getIDREF())) {
	        					param.put("USED", "X");
	        					break;
	        				}
	        			}
	        			paramList.add(param);
            		}
                }        		
        	}
        }        
        
		
		XWPFParagraph p4 = doc.createParagraph();
        XWPFRun p4r1 = new StyleBuilder(p4.createRun(), 4, true, "Cambria", 14, "4374D9").getRun();
        p4r1.setText("M3 API's used in this message");
        
        for(Map<String, Object> api : apiList) {
        	XWPFParagraph p5 = doc.createParagraph();
        	// API Title
        	XWPFRun p5r1 = new StyleBuilder(p5.createRun(), 2, true, "Cambria", 13, "79AAFF").getRun();
        	p5r1.setText(String.valueOf(api.get("PATH")));
        	 	
        	// Inbound
        	if(api.get("PARAM_I") != null) {
            	XWPFRun p5r2 = new StyleBuilder(p5.createRun(), 2, true, "Cambria", 12, null).getRun();
            	p5r2.setText("Inbound");
            	//p5r2.addBreak();
            	
        		tableHandler.createFieldTable(doc, (List<Map<String, String>>)api.get("PARAM_I"));
        	}
        	
        	XWPFParagraph p6 = doc.createParagraph();
        	
        	// OutBound 
        	if(api.get("PARAM_O") != null) {
            	XWPFRun p6r3 = new StyleBuilder(p6.createRun(), 1, true, "Cambria", 12, null).getRun();
            	p6r3.setText("Outbound");
            	//p6r3.addBreak();
            	
            	tableHandler.createFieldTable(doc, (List<Map<String, String>>)api.get("PARAM_O"));
        	}
        } // for API
        
	}

}
