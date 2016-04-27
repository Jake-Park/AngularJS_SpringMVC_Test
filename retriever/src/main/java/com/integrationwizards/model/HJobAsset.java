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
@Table(name="jobasset")
public class HJobAsset {
	@Id
	@Column(name="idx")
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	private int index;	
	
    private String serialNo;
    private String description;
    private String assetType;
    private String serviceLevel;
    private String modelNumber;
    private String location;
    private String buildingName;
    private Date installDate;
    private String make;
    private BigInteger orderId;
    private String notes;
    private Boolean isMandatory;
    
    private String jobId;
    private BigInteger phaseId;
    private String techId;
    private int job_index;
    
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="job_index", nullable=false, insertable=false, updatable=false)
	private HJob hJob;	
    
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public String getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAssetType() {
		return assetType;
	}
	public void setAssetType(String assetType) {
		this.assetType = assetType;
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
	public BigInteger getOrderId() {
		return orderId;
	}
	public void setOrderId(BigInteger orderId) {
		this.orderId = orderId;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public Boolean getIsMandatory() {
		return isMandatory;
	}
	public void setIsMandatory(Boolean isMandatory) {
		this.isMandatory = isMandatory;
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
	public HJob gethJob() {
		return hJob;
	}
	public void sethJob(HJob hJob) {
		this.hJob = hJob;
	}
	@Override
	public String toString() {
		return "HJobAsset [index=" + index + ", serialNo=" + serialNo + ", description=" + description + ", assetType="
				+ assetType + ", serviceLevel=" + serviceLevel + ", modelNumber=" + modelNumber + ", location="
				+ location + ", buildingName=" + buildingName + ", installDate=" + installDate + ", make=" + make
				+ ", orderId=" + orderId + ", notes=" + notes + ", isMandatory=" + isMandatory + "]";
	}
    
    
}
