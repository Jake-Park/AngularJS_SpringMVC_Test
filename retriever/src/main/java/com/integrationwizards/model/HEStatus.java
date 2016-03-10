package com.integrationwizards.model;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlElement;

import org.codehaus.jackson.annotate.JsonIgnore;

@Entity
@Table(name="EStatus")
public class HEStatus {
	@Id
	@Column(name="idx")
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	private int index;	
	private String txId;
    private String jobId;
    private BigInteger phaseId;
    private String techId;
    private BigInteger statusId;
    private String statusDate;
    private String statusTime;
    private String rejectReason;
    private String statusDesc;
    
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="txId", nullable=false, insertable=false, updatable=false)
	private HResultStatusUpdates hResultStatusUpdates;	
    
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public String getTxId() {
		return txId;
	}
	public void setTxId(String txId) {
		this.txId = txId;
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
	public BigInteger getStatusId() {
		return statusId;
	}
	public void setStatusId(BigInteger statusId) {
		this.statusId = statusId;
	}
	public String getStatusDate() {
		return statusDate;
	}
	public void setStatusDate(String statusDate) {
		this.statusDate = statusDate;
	}
	public String getStatusTime() {
		return statusTime;
	}
	public void setStatusTime(String statusTime) {
		this.statusTime = statusTime;
	}
	public String getRejectReason() {
		return rejectReason;
	}
	public void setRejectReason(String rejectReason) {
		this.rejectReason = rejectReason;
	}
	public String getStatusDesc() {
		return statusDesc;
	}
	public void setStatusDesc(String statusDesc) {
		this.statusDesc = statusDesc;
	}
	public HResultStatusUpdates gethResultStatusUpdates() {
		return hResultStatusUpdates;
	}
	public void sethResultStatusUpdates(HResultStatusUpdates hResultStatusUpdates) {
		this.hResultStatusUpdates = hResultStatusUpdates;
	}
	@Override
	public String toString() {
		return "HEStatus [index=" + index + ", txId=" + txId + ", jobId=" + jobId + ", phaseId=" + phaseId + ", techId="
				+ techId + ", statusId=" + statusId + ", statusDate=" + statusDate + ", statusTime=" + statusTime
				+ ", rejectReason=" + rejectReason + ", statusDesc=" + statusDesc + ", hResultStatusUpdates="
				+ hResultStatusUpdates + "]";
	}
    
    
}
