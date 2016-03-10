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
@Table(name="ETime")
public class HETime {
	@Id
	@Column(name="idx")
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	private int index;		
	private String txId;
    private String jobId;
    private BigInteger phaseId;
    private String techId;	
					
    private String labType;
    private Double labQty;
    private Double labQtyOt;
    private Double labQtyDt;
    private Double travelQty;
    private String statusTime;
    private Double normalRate;
    private Double otRate;
    private Double dtRate;
    private Double travelRate;
    private String fieldWorker;
    private Date endDatetime;
    private Date startDatetime;
    private String apprenticeId;
    
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

	public String getLabType() {
		return labType;
	}

	public void setLabType(String labType) {
		this.labType = labType;
	}

	public Double getLabQty() {
		return labQty;
	}

	public void setLabQty(Double labQty) {
		this.labQty = labQty;
	}

	public Double getLabQtyOt() {
		return labQtyOt;
	}

	public void setLabQtyOt(Double labQtyOt) {
		this.labQtyOt = labQtyOt;
	}

	public Double getLabQtyDt() {
		return labQtyDt;
	}

	public void setLabQtyDt(Double labQtyDt) {
		this.labQtyDt = labQtyDt;
	}

	public Double getTravelQty() {
		return travelQty;
	}

	public void setTravelQty(Double travelQty) {
		this.travelQty = travelQty;
	}

	public String getStatusTime() {
		return statusTime;
	}

	public void setStatusTime(String statusTime) {
		this.statusTime = statusTime;
	}

	public Double getNormalRate() {
		return normalRate;
	}

	public void setNormalRate(Double normalRate) {
		this.normalRate = normalRate;
	}

	public Double getOtRate() {
		return otRate;
	}

	public void setOtRate(Double otRate) {
		this.otRate = otRate;
	}

	public Double getDtRate() {
		return dtRate;
	}

	public void setDtRate(Double dtRate) {
		this.dtRate = dtRate;
	}

	public Double getTravelRate() {
		return travelRate;
	}

	public void setTravelRate(Double travelRate) {
		this.travelRate = travelRate;
	}

	public String getFieldWorker() {
		return fieldWorker;
	}

	public void setFieldWorker(String fieldWorker) {
		this.fieldWorker = fieldWorker;
	}

	public Date getEndDatetime() {
		return endDatetime;
	}

	public void setEndDatetime(Date endDatetime) {
		this.endDatetime = endDatetime;
	}

	public Date getStartDatetime() {
		return startDatetime;
	}

	public void setStartDatetime(Date startDatetime) {
		this.startDatetime = startDatetime;
	}

	public String getApprenticeId() {
		return apprenticeId;
	}

	public void setApprenticeId(String apprenticeId) {
		this.apprenticeId = apprenticeId;
	}

	public HEJob gethEJob() {
		return hEJob;
	}

	public void sethEJob(HEJob hEJob) {
		this.hEJob = hEJob;
	}

	@Override
	public String toString() {
		return "HETime [index=" + index + ", txId=" + txId + ", jobId=" + jobId + ", phaseId=" + phaseId + ", techId="
				+ techId + ", labType=" + labType + ", labQty=" + labQty + ", labQtyOt=" + labQtyOt + ", labQtyDt="
				+ labQtyDt + ", travelQty=" + travelQty + ", statusTime=" + statusTime + ", normalRate=" + normalRate
				+ ", otRate=" + otRate + ", dtRate=" + dtRate + ", travelRate=" + travelRate + ", fieldWorker="
				+ fieldWorker + ", endDatetime=" + endDatetime + ", startDatetime=" + startDatetime + ", apprenticeId="
				+ apprenticeId + ", hEJob=" + hEJob + "]";
	}
	    
	
}
