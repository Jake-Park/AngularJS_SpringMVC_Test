package com.integrationwizards.model;

import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlElement;

@Entity
@Table(name="Result")
public class HResult {
	
    protected String success;
    protected String txId;
    protected BigInteger errorCode;
    protected String errorMsg;
    private Date createdDate;
    
    private String jobId;
    private BigInteger phaseId;
    private String techId;
    private int job_index;
    
	public String getSuccess() {
		return success;
	}
	public void setSuccess(String success) {
		this.success = success;
	}
	public String getTxId() {
		return txId;
	}
	public void setTxId(String txId) {
		this.txId = txId;
	}
	public BigInteger getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(BigInteger errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public String getJobId() {
		return jobId;
	}
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}
	public BigInteger getPhaseId() {
		return phaseId;
	}
	public void setPhaseId(BigInteger phaseId) {
		this.phaseId = phaseId;
	}
	public String getTechId() {
		return techId;
	}
	public void setTechId(String techId) {
		this.techId = techId;
	}
	public int getJob_index() {
		return job_index;
	}
	public void setJob_index(int job_index) {
		this.job_index = job_index;
	}
    
    
}
