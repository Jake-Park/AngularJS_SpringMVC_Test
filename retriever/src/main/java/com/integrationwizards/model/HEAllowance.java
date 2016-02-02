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
@Table(name="EAllowance")
public class HEAllowance {
	@Id
	@Column(name="index")
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	private int index;		
	private String txId;
    private String jobId;
    private BigInteger phaseId;
    private String techId;	
						
    private String allowanceType;
    private String allowanceDesc;
    private String allowanceUom;
    private Double allowanceValue;
    private Date createDatetime;
    private String allowanceID;
    
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

	public String getAllowanceType() {
		return allowanceType;
	}

	public void setAllowanceType(String allowanceType) {
		this.allowanceType = allowanceType;
	}

	public String getAllowanceDesc() {
		return allowanceDesc;
	}

	public void setAllowanceDesc(String allowanceDesc) {
		this.allowanceDesc = allowanceDesc;
	}

	public String getAllowanceUom() {
		return allowanceUom;
	}

	public void setAllowanceUom(String allowanceUom) {
		this.allowanceUom = allowanceUom;
	}

	public Double getAllowanceValue() {
		return allowanceValue;
	}

	public void setAllowanceValue(Double allowanceValue) {
		this.allowanceValue = allowanceValue;
	}

	public Date getCreateDatetime() {
		return createDatetime;
	}

	public void setCreateDatetime(Date createDatetime) {
		this.createDatetime = createDatetime;
	}

	public String getAllowanceID() {
		return allowanceID;
	}

	public void setAllowanceID(String allowanceID) {
		this.allowanceID = allowanceID;
	}

	public HEJob gethEJob() {
		return hEJob;
	}

	public void sethEJob(HEJob hEJob) {
		this.hEJob = hEJob;
	}

	@Override
	public String toString() {
		return "HEAllowance [index=" + index + ", txId=" + txId + ", jobId=" + jobId + ", phaseId=" + phaseId
				+ ", techId=" + techId + ", allowanceType=" + allowanceType + ", allowanceDesc=" + allowanceDesc
				+ ", allowanceUom=" + allowanceUom + ", allowanceValue=" + allowanceValue + ", createDatetime="
				+ createDatetime + ", allowanceID=" + allowanceID + ", hEJob=" + hEJob + "]";
	}
    
	
}
