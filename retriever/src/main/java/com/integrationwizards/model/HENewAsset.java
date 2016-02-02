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

import org.codehaus.jackson.annotate.JsonIgnore;

@Entity
@Table(name="ENewAsset")
public class HENewAsset {
	@Id
	@Column(name="index")
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	private int index;		
	private String txId;
    private String jobId;
    private BigInteger phaseId;
    private String techId;	
		
    private String serialNo;
    private String serialDesc;
    private String serviceLevel;
    private String modelNumber;
    private String assetType;
    private String location;
    private String buildingName;
    private Date installDate;
    private String make;
    private String assetStatus;
    private String notes;
    private String fieldCreated;
    private Boolean isMandatory;
    private Date finalisedDT;
    
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

	public String getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public String getSerialDesc() {
		return serialDesc;
	}

	public void setSerialDesc(String serialDesc) {
		this.serialDesc = serialDesc;
	}

	public String getServiceLevel() {
		return serviceLevel;
	}

	public void setServiceLevel(String serviceLevel) {
		this.serviceLevel = serviceLevel;
	}

	public String getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

	public String getAssetType() {
		return assetType;
	}

	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public Date getInstallDate() {
		return installDate;
	}

	public void setInstallDate(Date installDate) {
		this.installDate = installDate;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getAssetStatus() {
		return assetStatus;
	}

	public void setAssetStatus(String assetStatus) {
		this.assetStatus = assetStatus;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getFieldCreated() {
		return fieldCreated;
	}

	public void setFieldCreated(String fieldCreated) {
		this.fieldCreated = fieldCreated;
	}

	public Boolean getIsMandatory() {
		return isMandatory;
	}

	public void setIsMandatory(Boolean isMandatory) {
		this.isMandatory = isMandatory;
	}

	public Date getFinalisedDT() {
		return finalisedDT;
	}

	public void setFinalisedDT(Date finalisedDT) {
		this.finalisedDT = finalisedDT;
	}

	public HEJob gethEJob() {
		return hEJob;
	}

	public void sethEJob(HEJob hEJob) {
		this.hEJob = hEJob;
	}

	@Override
	public String toString() {
		return "HENewAsset [index=" + index + ", txId=" + txId + ", jobId=" + jobId + ", phaseId=" + phaseId
				+ ", techId=" + techId + ", serialNo=" + serialNo + ", serialDesc=" + serialDesc + ", serviceLevel="
				+ serviceLevel + ", modelNumber=" + modelNumber + ", assetType=" + assetType + ", location=" + location
				+ ", buildingName=" + buildingName + ", installDate=" + installDate + ", make=" + make
				+ ", assetStatus=" + assetStatus + ", notes=" + notes + ", fieldCreated=" + fieldCreated
				+ ", isMandatory=" + isMandatory + ", finalisedDT=" + finalisedDT + ", hEJob=" + hEJob + "]";
	}


	
	
}
