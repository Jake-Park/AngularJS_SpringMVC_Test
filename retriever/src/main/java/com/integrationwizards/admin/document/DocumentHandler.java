package com.integrationwizards.admin.document;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.apache.commons.io.IOUtils;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.integrationwizards.util.StringUtil;

import generated.DatabaseData;

@Component
public class DocumentHandler {
	@Autowired
	DataHandler dataHandler;
	@Autowired
	TableHandler tableHandler;
	
	/**
	 * Start point of generating document 
	 * @param inputFileName : uploaded file name
	 * @return
	 * @throws Exception
	 */
	public Map<String, Object> startGeneration(String inputFileName) throws Exception {
		Map<String, Object> retMap = new HashMap<>();
		DatabaseData databaseData = initXml(inputFileName);
		DatabaseData.MappingMeta mappingData = databaseData.getMappingMeta();		
		
		String fileName = mappingData.getName() + "_v" + mappingData.getVersion();
		File file = File.createTempFile(fileName, ".docx");
		
		XWPFDocument doc = generateDocument(mappingData);
		tableHandler.setVersionLog(doc, databaseData);
		setIntroduction(doc, databaseData);
		dataHandler.setAPIMessages(doc, databaseData);
		setTranCustomError(doc, databaseData);
		
		try (FileOutputStream out = new FileOutputStream(file.getAbsolutePath())) {
	        doc.write(out);
	        
	        // Read generated document file	        
	        try (FileInputStream inputStream = new FileInputStream(file.getAbsolutePath())) {
	        	retMap.put("downloadFileData", IOUtils.toByteArray(inputStream));
	        }
	        catch(Exception e) {
	        	e.printStackTrace();
	        }
		}
		catch(Exception e) {
			e.printStackTrace();			
		}
		finally {
			file.deleteOnExit();
		}
		
		retMap.put("downloadFileName", fileName + ".docx");
		
		return retMap;
	}
	
	/**
	 * Create JAXB module from uploaded XML file
	 * @param inputFileName
	 * @return
	 * @throws Exception
	 */
	public DatabaseData initXml(String inputFileName) throws Exception {
        JAXBContext jc = JAXBContext.newInstance("generated");
        //"D:\\WORK\\Document\\GeXml\\COL_test.xml"

        Unmarshaller unmarshaller = jc.createUnmarshaller();
        DatabaseData databaseData = (DatabaseData) unmarshaller.unmarshal(new File(inputFileName));

        Marshaller marshaller = jc.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        //marshaller.marshal(databaseData, System.out);
        
        return databaseData;
	}
	
	/**
	 * Create Document object and preparing the title page of the document 
	 * @param mappingData
	 * @return
	 */
	public XWPFDocument generateDocument(DatabaseData.MappingMeta mappingData) {
        XWPFDocument doc = new XWPFDocument();

        XWPFParagraph p1 = doc.createParagraph();        

     // XWPFParagraph, addBreak, bold, FontFamily, FontSize, FontColor
        XWPFRun p1r1 = new StyleBuilder(p1.createRun(), 4, true, "Cambria", 14, "4374D9").getRun();        
        //p1r1.addCarriageReturn();
        p1r1.setText("" + mappingData.getName() + "");
        //r1.setTextPosition(100);
        
        XWPFRun p1r2 = new StyleBuilder(p1.createRun(), 1, true, "Cambria", 13, "79AAFF").getRun();
        p1r2.setText("Functional Specification (Version " + mappingData.getVersion() + ")");        
        
        XWPFRun p1r3 = new StyleBuilder(p1.createRun(), 7, true, "Cambria", 12, "9DCFFF").getRun();
        p1r3.setText("Document Log");
        
        XWPFRun p1r4 = new StyleBuilder(p1.createRun(), 3, false, "Calibri", 11, null).getRun();
        p1r4.setText("Author: ");
        p1r4.addBreak();
        p1r4.setText("Version: ");
        p1r4.addBreak();
        p1r4.setText("Prepared for: ");
        p1r4.addBreak();
        // get Date from substring 
        String strDate = StringUtil.nullToEmpty(mappingData.getChangeDate());
        if(strDate.indexOf(" ") != -1) {
        	strDate = strDate.substring(0, strDate.indexOf(" "));
        }
        p1r4.setText("Date: " + strDate);
        p1r4.addBreak();
        p1r4.setText("Last Reviewed: ");


        return doc;
	}
	
	/**
	 * Prepare custom code paragraph
	 * @param doc
	 * @param customCodeList
	 */
	public void createCustomeCode(XWPFDocument doc, List<String> customCodeList) {
		XWPFParagraph p6 = doc.createParagraph();
        XWPFRun p6r1 = new StyleBuilder(p6.createRun(), 3, true, "Cambria", 14, "4374D9").getRun();
        p6r1.setText("Custom Code");
        
        for(String customCode : customCodeList) {
            XWPFRun p6r2 = new StyleBuilder(p6.createRun(), 1, false, "Calibri", 11, null).getRun();
            p6r2.setTextPosition(15);
            
    		
        	String[] lines = customCode.split("\\*");
        	for(int i=0; i < lines.length; i++) {
        		if(i == 0) {
        			lines[i] = "- " + lines[i];
        		}
        		else {
        			lines[i] = "  " + lines[i];
        		}
        		p6r2.setText(lines[i]);
        		p6r2.addBreak();
        	}
        }
	}
	
	/**
	 * Prepare Error handling paragraph
	 * @param doc
	 * @param errList
	 */
	public void createErrorHandling(XWPFDocument doc, List<String> errList) {
		XWPFParagraph p7 = doc.createParagraph();
        XWPFRun p7r1 = new StyleBuilder(p7.createRun(), 3, true, "Cambria", 14, "4374D9").getRun();
        p7r1.setText("Error Handling");
        p7r1.addBreak();
        
        XWPFRun p7r2 = new StyleBuilder(p7.createRun(), 1, false, "Calibri", 11, null).getRun();
        p7r2.setTextPosition(15);
        
        for(String error : errList) {
        	String[] lines = error.split("\\*");
        	for(int i=0; i < lines.length; i++) {
        		p7r2.setText(lines[i]);
        		p7r2.addBreak();
        	}
        }
	}
	
	/**
	 * Prepare introduction of the document	
	 * @param doc
	 * @param databaseData
	 */
	public void setIntroduction(XWPFDocument doc, DatabaseData databaseData) {
		// Get Introduction and Assumption ID
        DatabaseData.Functions functions = databaseData.getFunctions();
        String mapInfoID = "", introductionStr = "", assumptionStr = "";
        
        introductionStr = dataHandler.parseData(databaseData, "intro:").get(0); //introductionStr.replace("intro:", "");
        assumptionStr = dataHandler.parseData(databaseData, "assum:").get(0); //assumptionStr.replace("assum:", "");
        
        		
		XWPFParagraph p3 = doc.createParagraph();
		p3.setIndentationFirstLine(600);
        XWPFRun p3r1 = new StyleBuilder(p3.createRun(), 3, true, "Cambria", 14, "4374D9").getRun();        
        //p2r1.addBreak(BreakType.PAGE);
        p3r1.setText("Introduction");
        XWPFRun p3r2 = new StyleBuilder(p3.createRun(), 0, false, "Calibri", 11, null).getRun();
        p3r2.setTextPosition(15);
        String[] introductions = introductionStr.split("\\*");
        
        for(String introduction : introductions) {
        	p3r2.setText(introduction);
        	p3r2.addBreak();
        }
        
        
        XWPFRun p3r3 = new StyleBuilder(p3.createRun(), 3, true, "Cambria", 14, "4374D9").getRun();
        p3r3.setText("Assumption");
        XWPFRun p3r4 = new StyleBuilder(p3.createRun(), 0, false, "Calibri", 11, null).getRun();
        String[] assumptions = assumptionStr.split("\\*");
        p3r4.setTextPosition(15);
        
        for(String assumption : assumptions) {
        	p3r4.setText(assumption);
        	p3r4.addBreak();
        }
        
	}	
	
	/**
	 * Call traslantion, customecode and error handling data
	 * and these data to prepare these paragraphs 
	 * @param doc
	 * @param databaseData
	 */
	public void setTranCustomError(XWPFDocument doc, DatabaseData databaseData) {
		List<Object> list = dataHandler.getTranCustomError(doc, databaseData);

		tableHandler.createTranslationTable(doc, (List<Map<String,String>>)list.get(0));
		createCustomeCode(doc, (List<String>)list.get(1));
		createErrorHandling(doc, (List<String>)list.get(2));
	}
	

}
