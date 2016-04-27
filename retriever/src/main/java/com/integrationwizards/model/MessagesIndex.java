package com.integrationwizards.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="messagesindex")
public class MessagesIndex {
	@Id
	@Column(name="txId")
	private String txId;
	private String success;    
	private String trnCategory;
	@Column(name="createdDate", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP", insertable=false, updatable=false)
	@Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
    private Date lastRetryDate;
    
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
	public String getTrnCategory() {
		return trnCategory;
	}
	public void setTrnCategory(String trnCategory) {
		this.trnCategory = trnCategory;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getLastRetryDate() {
		return lastRetryDate;
	}
	public void setLastRetryDate(Date lastRetryDate) {
		this.lastRetryDate = lastRetryDate;
	}
	@Override
	public String toString() {
		return "MessagesIndex [txId=" + txId + ", success=" + success + ", trnCategory=" + trnCategory
				+ ", createdDate=" + createdDate + ", lastRetryDate=" + lastRetryDate + "]";
	}
	
	
}
