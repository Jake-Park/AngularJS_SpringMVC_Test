package com.integrationwizards.admin.document;

import org.apache.poi.xwpf.usermodel.XWPFRun;

/**
 * 
 * @author User
 *
 */
public class StyleBuilder {
	private XWPFRun run;
	
	/**
	 * Constructor for setting style fields for XWPFRun objects
	 * @param run
	 * @param addBreak
	 * @param bold
	 * @param fontFamily
	 * @param fontSize
	 * @param color
	 */
	public StyleBuilder(XWPFRun run, Integer addBreak, Boolean bold, String fontFamily, Integer fontSize, String color) {
		this.run = run;
		
		if(addBreak != null) {
			setBreak(addBreak);
		}
		
		if(bold != null) {
			setBold(bold);
		}
		if(fontFamily != null) {
			setFontFamily(fontFamily);
		}
		if(fontSize != null) {
			setFontSize(fontSize);
		}
		if(color != null) {
			setColor(color);
		}
	}
	
	public StyleBuilder setBreak(int addBreak) {
		for(int i=0; i < addBreak; i++) {
			this.run.addBreak();
		}
		return this;
	}
	
	public StyleBuilder setBold(boolean param) {
		this.run.setBold(param);
		return this;
	}
	
	public StyleBuilder setFontFamily(String param) {
		this.run.setFontFamily(param);
		return this;
	}	
	
	public StyleBuilder setFontSize(int param) {
		this.run.setFontSize(param);
		return this;
	}
	
	public StyleBuilder setColor(String param) {
		this.run.setColor(param);
		return this;
	}
	
	public XWPFRun getRun() {
		return this.run;
	}
}
