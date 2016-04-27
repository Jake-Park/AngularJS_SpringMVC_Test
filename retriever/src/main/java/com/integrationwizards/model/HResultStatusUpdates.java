package com.integrationwizards.model;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnore;

@Entity
@Table(name="resultexportstatusupdates")
public class HResultStatusUpdates {
	@Id
	@Column(name="txId")
	private String txId;
	private String success;    
	private BigInteger errorCode;
	private String errorMsg;
	@Column(name="createdDate", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP", insertable=false, updatable=false)
    private Date createdDate;
	
	@OneToMany(mappedBy = "hResultStatusUpdates", cascade = CascadeType.ALL)
    private Set<HEStatus> eStatusUpdate = new HashSet<HEStatus>();	
    
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
	public Set<HEStatus> geteStatusUpdate() {
		return eStatusUpdate;
	}
	public void seteStatusUpdate(Set<HEStatus> eStatusUpdate) {
		this.eStatusUpdate = eStatusUpdate;
	}
	@Override
	public String toString() {
		return "HResultStatusUpdates [txId=" + txId + ", success=" + success + ", errorCode=" + errorCode
				+ ", errorMsg=" + errorMsg + ", createdDate=" + createdDate + ", eStatusUpdate=" + eStatusUpdate + "]";
	}
	
}
