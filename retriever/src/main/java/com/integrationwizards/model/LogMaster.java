package com.integrationwizards.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="LogMaster")
public class LogMaster {
	@Id
	private String logId;
	private String key1;	//'MWNO' - Work Order Number
	private String key2; 	// 'Category (CreateJob, StatusUpdates, ExportJobs)',
	private String key3;
	private String state;		// '1 : Started, 2 : Finished, 4 : Error',
	// '1 : M3_CJ (ServiceHub to M3 in createJobs), 2 : RT_CJ (ServiceHub to Retriever in createJobs), 
	//  3 : M3_EJ (ServiceHub to M3 in exportJobs),
	private String subProcess;		
	private String error;
	@Column(name="createdDate", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP", insertable=false, updatable=false)
	private Date createdDate;
	
	
	public String getLogId() {
		return logId;
	}
	public void setLogId(String logId) {
		this.logId = logId;
	}
	public String getKey1() {
		return key1;
	}
	public void setKey1(String key1) {
		this.key1 = key1;
	}
	public String getKey2() {
		return key2;
	}
	public void setKey2(String key2) {
		this.key2 = key2;
	}
	public String getKey3() {
		return key3;
	}
	public void setKey3(String key3) {
		this.key3 = key3;
	}
	public String getSubProcess() {
		return subProcess;
	}
	public void setSubProcess(String subProcess) {
		this.subProcess = subProcess;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public String getState() {
		return state;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
	
}
