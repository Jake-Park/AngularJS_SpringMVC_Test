package com.integrationwizards.admin.document;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;

import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableCell;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHeight;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShd;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTbl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcBorders;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcPr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrPr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTVerticalJc;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STBorder;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STShd;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STTblWidth;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STVerticalJc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.integrationwizards.util.StringUtil;

import generated.DatabaseData;

@Component
public class TableHandler {
	@Autowired
	DataHandler dataHandler;
	
	/**
	 * Create XWPF table for translation paragraph
	 * @param doc
	 * @param tranList
	 */
	public void createTranslationTable(XWPFDocument doc, List<Map<String, String>> tranList) {
		XWPFParagraph p5 = doc.createParagraph();
        XWPFRun p5r1 = new StyleBuilder(p5.createRun(), 4, true, "Cambria", 14, "4374D9").getRun();
        p5r1.setText("Translations");
        p5r1.addBreak();
        
        int nRows = tranList.size() + 1;
    	int nCols = 4;
        XWPFTable table = doc.createTable(nRows, nCols);
        CTTbl cttBl = table.getCTTbl();
        // Set Table Column Width
        cttBl.addNewTblGrid().addNewGridCol().setW(BigInteger.valueOf(1500));
        cttBl.getTblGrid().addNewGridCol().setW(BigInteger.valueOf(1500));
        cttBl.getTblGrid().addNewGridCol().setW(BigInteger.valueOf(2500));
        cttBl.getTblGrid().addNewGridCol().setW(BigInteger.valueOf(3200));  
               
        List<XWPFTableRow> rows = table.getRows();
        int rowCt = 0;
        int colCt = 0;
        for (XWPFTableRow row : rows) {
        	// get table row properties (trPr)
        	CTTrPr trPr = row.getCtRow().addNewTrPr();
        	// set row height; units = twentieth of a point, 360 = 0.25"
        	CTHeight ht = trPr.addNewTrHeight();
        	ht.setVal(BigInteger.valueOf(360));
        	
        	//CTTblWidth cttblW = trPr.addNewTblCellSpacing();
        	//cttblW.setW(BigInteger.valueOf(100));

	        // get the cells in this row
        	List<XWPFTableCell> cells = row.getTableCells();
            // add content to each cell
        	for (XWPFTableCell cell : cells) {
        		Map<String, String> param = rowCt > 0 ? tranList.get(rowCt - 1) : null;
        		// get a table cell properties element (tcPr)
        		CTTcPr tcpr = cell.getCTTc().addNewTcPr();
        		// set vertical alignment to "center"
        		CTVerticalJc va = tcpr.addNewVAlign();
        		va.setVal(STVerticalJc.CENTER);
        		        		
        		CTTcBorders cttcB = tcpr.addNewTcBorders();
        		cttcB.addNewLeft().setVal(STBorder.SINGLE);
        		cttcB.addNewBottom().setVal(STBorder.SINGLE);
        		cttcB.addNewTop().setVal(STBorder.SINGLE); 
        		cttcB.addNewRight().setVal(STBorder.SINGLE);
        		 
        		//cttcB.addNewLeft().setColor("79AAFF");
        		//cttcB.addNewBottom().setColor("79AAFF");
        		//cttcB.addNewTop().setColor("79AAFF");
        		//cttcB.addNewRight().setColor("79AAFF");

        		// create cell color element
        		CTShd ctshd = tcpr.addNewShd();
        		//ctshd.setVal(STShd.DIAG_CROSS);
                ctshd.setColor("auto");
                //ctshd.setVal(STShd.CLEAR);
                if (rowCt == 0) {
                	// header row
                	ctshd.setFill("A7BFDE");
                }
                
                CTOnOff ctonoff = tcpr.addNewTcFitText();
                ctonoff.setVal(STOnOff.OFF);
                
                // get 1st paragraph in cell's paragraph list
                XWPFParagraph para = cell.getParagraphs().get(0);
                para.setIndentationLeft(10);
                para.setSpacingBefore(10);
                //para.setBorderBottom(Borders.SINGLE);
                
                           	
                // create a run to contain the content
                XWPFRun rh = para.createRun();
                
                // style cell as desired
                if (colCt == nCols - 1) {
                	// last column is 10pt Courier
                	rh.setFontSize(10);
                	rh.setFontFamily("Courier");
                }
                if (rowCt == 0) {
                	rh = new StyleBuilder(rh, null, true, "Calibri", 11, "4374D9").getRun();
                	
                	// header row
                	switch(colCt) {
                		case 0 :
                			rh.setText(" Direction");
    	        			widthCellsAcrossRow(tcpr, 1500);                			
                			break;
                		case 1 :
                			rh.setText(" Segment");
    	        			widthCellsAcrossRow(tcpr, 1500);                			
                			break; 
                		case 2 :
                			rh.setText(" Field");
    	        			widthCellsAcrossRow(tcpr, 2000);                			
                			break;                 			
                		default :
                			rh.setText(" ");
    	        			widthCellsAcrossRow(tcpr, 4000);                			
                	}
                	
                    para.setAlignment(ParagraphAlignment.CENTER);
                }
            	else {
            		// Type
            		if(colCt == 0) {
            			widthCellsAcrossRow(tcpr, 1500);  
            			para.setAlignment(ParagraphAlignment.CENTER);
            			rh.setText(param.get("DIRECTION"));
            		}
            		// Field
            		else if(colCt == 1) {
            			widthCellsAcrossRow(tcpr, 1500);   
            			para.setAlignment(ParagraphAlignment.CENTER);
            			rh.setText(param.get("SEGMENT"));
            		}
            		// Description
            		else if(colCt == 2) {
            			widthCellsAcrossRow(tcpr, 2000);  
            			para.setAlignment(ParagraphAlignment.LEFT);
            			rh.setText(" " + param.get("FIELD"));
            		}
            		else {
            			widthCellsAcrossRow(tcpr, 4000);  
            			para.setAlignment(ParagraphAlignment.LEFT);
            		}		                    
            	}
                colCt++;
        	} // for cell
        	colCt = 0;
        	rowCt++;
        } // for row	
	}
	
	/**
	 * Create XWPF table for API list
	 * @param doc
	 * @param paramList
	 */
	public void createFieldTable(XWPFDocument doc, List<Map<String, String>> paramList) {
        int nRows = paramList.size() + 1;
    	int nCols = 3;
        XWPFTable table = doc.createTable(nRows, nCols);
        CTTbl cttBl = table.getCTTbl();        
        // Set Table Column Width
        cttBl.addNewTblGrid().addNewGridCol().setW(BigInteger.valueOf(2000));
        cttBl.getTblGrid().addNewGridCol().setW(BigInteger.valueOf(2500));
        cttBl.getTblGrid().addNewGridCol().setW(BigInteger.valueOf(4000));  
               
        List<XWPFTableRow> rows = table.getRows();
        int rowCt = 0;
        int colCt = 0;
        for (XWPFTableRow row : rows) {
        	// get table row properties (trPr)
        	CTTrPr trPr = row.getCtRow().addNewTrPr();
        	// set row height; units = twentieth of a point, 360 = 0.25"
        	CTHeight ht = trPr.addNewTrHeight();
        	ht.setVal(BigInteger.valueOf(360));
        	
        	//CTTblWidth cttblW = trPr.addNewTblCellSpacing();
        	//cttblW.setW(BigInteger.valueOf(100));

	        // get the cells in this row
        	List<XWPFTableCell> cells = row.getTableCells();
            // add content to each cell
        	for (XWPFTableCell cell : cells) {
        		Map<String, String> param = rowCt > 0 ? paramList.get(rowCt - 1) : null;
        		// get a table cell properties element (tcPr)
        		CTTcPr tcpr = cell.getCTTc().addNewTcPr();
        		// set vertical alignment to "center"
        		CTVerticalJc va = tcpr.addNewVAlign();
        		va.setVal(STVerticalJc.CENTER);
        		
        		        		
        		CTTcBorders cttcB = tcpr.addNewTcBorders();
        		cttcB.addNewLeft().setVal(STBorder.SINGLE);
        		cttcB.addNewBottom().setVal(STBorder.SINGLE);
        		cttcB.addNewTop().setVal(STBorder.SINGLE); 
        		cttcB.addNewRight().setVal(STBorder.SINGLE);
        		 
        		//cttcB.addNewLeft().setColor("79AAFF");
        		//cttcB.addNewBottom().setColor("79AAFF");
        		//cttcB.addNewTop().setColor("79AAFF");
        		//cttcB.addNewRight().setColor("79AAFF");

        		// create cell color element
        		CTShd ctshd = tcpr.addNewShd();
        		//ctshd.setVal(STShd.DIAG_CROSS);
                ctshd.setColor("auto");
                //ctshd.setVal(STShd.CLEAR);
                if (rowCt == 0) {
                	// header row
                	ctshd.setFill("A7BFDE");
                }
                
                CTOnOff ctonoff = tcpr.addNewTcFitText();
                ctonoff.setVal(STOnOff.OFF);
                
                // get 1st paragraph in cell's paragraph list
                XWPFParagraph para = cell.getParagraphs().get(0);
                para.setIndentationLeft(10);
                para.setSpacingBefore(10);
                //para.setBorderBottom(Borders.SINGLE);
                
                           	
                // create a run to contain the content
                XWPFRun rh = para.createRun();
                
                // style cell as desired
                if (colCt == nCols - 1) {
                	// last column is 10pt Courier
                	rh.setFontSize(10);
                	rh.setFontFamily("Courier");
                }
                if (rowCt == 0) {
                	rh = new StyleBuilder(rh, null, true, "Calibri", 11, "4374D9").getRun();
                	
                	// header row
                	switch(colCt) {
                		case 0 :
                			rh.setText(" USED");
    	        			widthCellsAcrossRow(tcpr, 1000);                			
                			break;
                		case 1 :
                			rh.setText(" Field");
    	        			widthCellsAcrossRow(tcpr, 2000);                			
                			break; 
                		default :
                			rh.setText(" Description");
    	        			widthCellsAcrossRow(tcpr, 5000);                			
                	}
                	
                    para.setAlignment(ParagraphAlignment.CENTER);
                }
            	else {
            		// Type
            		if(colCt == 0) {
            			widthCellsAcrossRow(tcpr, 1000);  
            			para.setAlignment(ParagraphAlignment.CENTER);
            			rh.setText(param.get("USED"));
            		}
            		// Field
            		else if(colCt == 1) {
            			widthCellsAcrossRow(tcpr, 2000);   
            			para.setAlignment(ParagraphAlignment.CENTER);
            			rh.setText(param.get("NAME"));
            		}
            		// Description
            		else if(colCt == 2) {
            			widthCellsAcrossRow(tcpr, 5000);  
            			para.setAlignment(ParagraphAlignment.LEFT);
            			rh.setText(param.get("DESC"));
            		}
            		else {
            			// 	Used
            			//rh.setText(texts[rowCt-1][colCt]);
            		}		                    
            	}
                colCt++;
        	} // for cell
        	colCt = 0;
        	rowCt++;
        } // for row	
	}
	
	/**
	 * Create Table for version log 
	 * @param doc
	 * @param databaseData
	 */
	public void setVersionLog(XWPFDocument doc, DatabaseData databaseData) {
		XWPFParagraph p2 = doc.createParagraph();
        XWPFRun p2r1 = new StyleBuilder(p2.createRun(), 4, true, "Cambria", 12, "9DCFFF").getRun();        
        p2r1.setText("Change Log");
        p2r1.addBreak();
        p2r1.addBreak();
        
        String versionLogDetail = dataHandler.parseData(databaseData, "version:").get(0);
        
        String[][] texts = null;
        // Parse version log to table
        if(!StringUtil.isEmptyString(versionLogDetail)) {
        	String[] rows = versionLogDetail.split("\\*");
        	//System.out.println("-----------" + rows.length);   
        	texts = new String[rows.length-1][4];
        	
        	if(rows != null) {
        		for(int i=1; i < rows.length; i++) {
        			String row = rows[i];
        			if(StringUtil.isEmptyString(row)) {
        				continue;
        			}
        			System.out.print(i + "===>" + row + "\t");
        			String[] cols = row.split("\t");
        			for(int j=0; j < cols.length; j++) {
        				String col = cols[j];
        				System.out.print(i + ":" + j + "===>" + col + "\t");
        				if(col.equals("@")) {
        					col = " ";
        				}
        				texts[i-1][j] = col;
        			}
        			System.out.println("");
        		}
        	}
        }
        
        int nRows = texts == null ? 0 : texts.length;
    	int nCols = texts == null ? 0 : texts[0].length;
        XWPFTable table = doc.createTable(nRows, nCols);
        CTTbl cttBl = table.getCTTbl();        
        // Set Table Column Width
        cttBl.addNewTblGrid().addNewGridCol().setW(BigInteger.valueOf(1000));
        cttBl.getTblGrid().addNewGridCol().setW(BigInteger.valueOf(1500));
        cttBl.getTblGrid().addNewGridCol().setW(BigInteger.valueOf(1500));
        cttBl.getTblGrid().addNewGridCol().setW(BigInteger.valueOf(4800));  
               
        List<XWPFTableRow> rows = table.getRows();
        int rowCt = 0;
        int colCt = 0;
        for (XWPFTableRow row : rows) {
        	// get table row properties (trPr)
        	CTTrPr trPr = row.getCtRow().addNewTrPr();
        	// set row height; units = twentieth of a point, 360 = 0.25"
        	CTHeight ht = trPr.addNewTrHeight();
        	ht.setVal(BigInteger.valueOf(360));

	        // get the cells in this row
        	List<XWPFTableCell> cells = row.getTableCells();
            // add content to each cell
        	for (XWPFTableCell cell : cells) {
        		// get a table cell properties element (tcPr)
        		CTTcPr tcpr = cell.getCTTc().addNewTcPr();
        		// set vertical alignment to "center"
        		CTVerticalJc va = tcpr.addNewVAlign();
        		va.setVal(STVerticalJc.CENTER);
        		
        		CTTcBorders cttcB = tcpr.addNewTcBorders();
        		cttcB.addNewBottom().setVal(STBorder.SINGLE);
        		cttcB.addNewLeft().setVal(STBorder.SINGLE);
        		cttcB.addNewTop().setVal(STBorder.SINGLE); 
        		cttcB.addNewRight().setVal(STBorder.SINGLE);
        		//cttcB.addNewBottom().setColor("79AAFF");
        		//cttcB.addNewTop().setColor("79AAFF");

        		// create cell color element
        		CTShd ctshd = tcpr.addNewShd();
                ctshd.setColor("auto");
                ctshd.setVal(STShd.CLEAR);
                if (rowCt == 0) {
                	// header row
                	ctshd.setFill("A7BFDE");
                }
            	else if (rowCt > 0 && rowCt + 1 == nRows) {
            		// even row
                	ctshd.setFill("D3DFEE");
            	}
            	else {
            		// odd row
                	//ctshd.setFill("EDF2F8");
            	}

                // get 1st paragraph in cell's paragraph list
                XWPFParagraph para = cell.getParagraphs().get(0);
                //para.setBorderBottom(Borders.SINGLE);
                //para.setBorderTop(Borders.SINGLE);
                           	
                // create a run to contain the content
                XWPFRun rh = para.createRun();
                // style cell as desired
                if (colCt == nCols - 1) {
                	// last column is 10pt Courier
                	rh.setFontSize(10);
                	rh.setFontFamily("Courier");
                }
                if (rowCt == 0) {
                
                	rh = new StyleBuilder(rh, null, true, "Calibri", 11, "4374D9").getRun();
                	
                	// header row
                	switch(colCt) {
                		case 0 :
    	        			widthCellsAcrossRow(tcpr, 1000);                			
                			break;
                		case 1 :
    	        			widthCellsAcrossRow(tcpr, 1300);                			
                			break;                			
                		case 2 :
    	        			widthCellsAcrossRow(tcpr, 1300);                			
                			break;
                		default :   
    	        			widthCellsAcrossRow(tcpr, 5500);                			
                	}
                	//System.out.println(rowCt + ":" + colCt + ":" + texts[rowCt][colCt]);
                	rh.setText(texts[rowCt][colCt]);                	
                    para.setAlignment(ParagraphAlignment.CENTER);
                }
            	else {
            		// Description
            		if(colCt == 3) {
            			String strDesc = texts[rowCt][colCt];   
            			System.out.println(rowCt + "---" + colCt + "----Desc----" + strDesc);
            			String[] strs = strDesc.split("\\n");
            			for(int i=0; i < strs.length; i++) {
            				rh.setText(strs[i].replaceAll("\\n", ""));
            				if(i != strs.length - 1) {
            					rh.addBreak();
            				}
            			}
            		}
            		else {
            			//System.out.println(rowCt + ":" + colCt + "%" + texts[rowCt-1][colCt]);
            			// 	other rows
            			rh.setText(texts[rowCt][colCt]);
            		}
            		
            		// Set alignment and width 
                	switch(colCt) {
	            		case 0 :
		        			widthCellsAcrossRow(tcpr, 1000);
		        			para.setAlignment(ParagraphAlignment.CENTER);
	            			break;
	            		case 1 :
		        			widthCellsAcrossRow(tcpr, 1300);
		        			para.setAlignment(ParagraphAlignment.CENTER);
	            			break;                			
	            		case 2 :
		        			widthCellsAcrossRow(tcpr, 1300);
		        			para.setAlignment(ParagraphAlignment.CENTER);
	            			break;
	            		default :   
		        			widthCellsAcrossRow(tcpr, 5500);
		        			para.setAlignment(ParagraphAlignment.LEFT);
	            	}
            	}
                colCt++;
        	} // for cell
        	colCt = 0;
        	rowCt++;
        } // for row
	}
	
	/**
	 * common function for setting width of table cells
	 * @param tcpr
	 * @param width
	 */
	private void widthCellsAcrossRow (CTTcPr tcpr, int width) {
        if (tcpr.getTcW()==null) {   
        	CTTblWidth cttbl = tcpr.addNewTcW();
        	cttbl.setType(STTblWidth.DXA);
        	cttbl.setW(new BigInteger("" + width));
        }
        //cell.getCTTc().getTcPr().getTcW().setW(new BigInteger("" + width));
        //cell.getCTTc().addNewTcPr().addNewTcW().setW(new BigInteger("" + width)); 
	}		
}
