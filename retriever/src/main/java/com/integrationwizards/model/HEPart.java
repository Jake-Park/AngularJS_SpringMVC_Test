package com.integrationwizards.model;

import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="EPart")
public class HEPart {
	@Id
	@Column(name="idx")
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	private int index;		
	private String txId;
    private String jobId;
    private BigInteger phaseId;
    private String techId;	
			
    private String partId;
    private String partDesc;
    private Double partQty;
    private String unitPrice;
    private String poNumber;
    private Date createDatetime;
    private String invLocId;
    
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="txId", nullable=false, insertable=false, updatable=false)
	private HEJob hEJob;

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

	public String getPartId() {
		return partId;
	}

	public void setPartId(String partId) {
		this.partId = partId;
	}

	public String getPartDesc() {
		return partDesc;
	}

	public void setPartDesc(String partDesc) {
		this.partDesc = partDesc;
	}

	public Double getPartQty() {
		return partQty;
	}

	public void setPartQty(Double partQty) {
		this.partQty = partQty;
	}

	public String getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getPoNumber() {
		return poNumber;
	}

	public void setPoNumber(String poNumber) {
		this.poNumber = poNumber;
	}

	public Date getCreateDatetime() {
		return createDatetime;
	}

	public void setCreateDatetime(Date createDatetime) {
		this.createDatetime = createDatetime;
	}

	public String getInvLocId() {
		return invLocId;
	}

	public void setInvLocId(String invLocId) {
		this.invLocId = invLocId;
	}

	public HEJob gethEJob() {
		return hEJob;
	}

	public void sethEJob(HEJob hEJob) {
		this.hEJob = hEJob;
	}

	@Override
	public String toString() {
		return "HEPart [index=" + index + ", txId=" + txId + ", jobId=" + jobId + ", phaseId=" + phaseId + ", techId="
				+ techId + ", partId=" + partId + ", partDesc=" + partDesc + ", partQty=" + partQty + ", unitPrice="
				+ unitPrice + ", poNumber=" + poNumber + ", createDatetime=" + createDatetime + ", invLocId=" + invLocId
				+ ", hEJob=" + hEJob + "]";
	}

    
}
