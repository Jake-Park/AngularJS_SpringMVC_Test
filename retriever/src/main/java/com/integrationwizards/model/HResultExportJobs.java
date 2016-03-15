package com.integrationwizards.model;

import java.math.BigInteger;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnore;

@Entity
@Table(name="ResultExportJobs")
public class HResultExportJobs {
	@Id
	@Column(name="txId")
	private String txId;
	private String success;    
	private BigInteger errorCode;
	private String errorMsg;
	@Column(name="createdDate", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP", insertable=false, updatable=false)
    private Date createdDate;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "hResultExportJobs", cascade = CascadeType.ALL)
    private Set<HEJob> eJob = new HashSet<HEJob>();

	public String getTxId() {
		return txId;
	}

	public void setTxId(String txId) {
		this.txId = txId;
	}

	public String getSuccess() {
		return success;
	}

	public void setSuccess(String success) {
		this.success = success;
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

	public Set<HEJob> geteJob() {
		return eJob;
	}

	public void seteJob(Set<HEJob> eJob) {
		this.eJob = eJob;
	}

	@Override
	public String toString() {
		return "HResultExportJobs [txId=" + txId + ", success=" + success + ", errorCode=" + errorCode + ", errorMsg="
				+ errorMsg + ", createdDate=" + createdDate + ", eJob=" + eJob + "]";
	}


	
}
