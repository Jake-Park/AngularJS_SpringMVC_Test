package com.integrationwizards.model;

import java.math.BigInteger;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnore;

@Entity
@Table(name="Job")
public class HJob {	
	@Id
	@Column(name="idx")
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	private int index;	
	
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	
    private String jobId;
    private BigInteger phaseId;
    private String employer;
    private String subEmployer;
    private String techId;
    private String customerName;
    private String custId;
    private String address1;
    private String address2;
    private String suburb;
    private String postCode;
    private String serialNo;
    private String contactName;
    private String contactPhone;
    private String jobDesc;
    private Date startDate;
    private String duration;
    private Date plannedStart;
    private Date plannedEnd;
    private String jobType;
    private String customerEmail;
    private Boolean priority;
    private String slaPriority;
    private String officeNote;
    private String accountMgrEmail;
    private String serviceMgrEmail;
	@Column(name="createdDate", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP", insertable=false, updatable=false)
	private Date createdDate;
    private String success;
    private Date currReqDate;
    private String logId;
    
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "hJob", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<HJobAsset> assets = new HashSet<HJobAsset>();
	
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "hJob", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<HJobService> services = new HashSet<HJobService>();


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
	public String getEmployer() {
		return employer;
	}
	public void setEmployer(String employer) {
		this.employer = employer;
	}
	public String getSubEmployer() {
		return subEmployer;
	}
	public void setSubEmployer(String subEmployer) {
		this.subEmployer = subEmployer;
	}
	public String getTechId() {
		return techId;
	}
	public void setTechId(String techId) {
		this.techId = techId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getSuburb() {
		return suburb;
	}
	public void setSuburb(String suburb) {
		this.suburb = suburb;
	}
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	public String getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public String getContactPhone() {
		return contactPhone;
	}
	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}
	public String getJobDesc() {
		return jobDesc;
	}
	public void setJobDesc(String jobDesc) {
		this.jobDesc = jobDesc;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public Date getPlannedStart() {
		return plannedStart;
	}
	public void setPlannedStart(Date plannedStart) {
		this.plannedStart = plannedStart;
	}
	public Date getPlannedEnd() {
		return plannedEnd;
	}
	public void setPlannedEnd(Date plannedEnd) {
		this.plannedEnd = plannedEnd;
	}
	public String getJobType() {
		return jobType;
	}
	public void setJobType(String jobType) {
		this.jobType = jobType;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public Boolean getPriority() {
		return priority;
	}
	public void setPriority(Boolean priority) {
		this.priority = priority;
	}
	public String getSlaPriority() {
		return slaPriority;
	}
	public void setSlaPriority(String slaPriority) {
		this.slaPriority = slaPriority;
	}
	public String getOfficeNote() {
		return officeNote;
	}
	public void setOfficeNote(String officeNote) {
		this.officeNote = officeNote;
	}
	public String getAccountMgrEmail() {
		return accountMgrEmail;
	}
	public void setAccountMgrEmail(String accountMgrEmail) {
		this.accountMgrEmail = accountMgrEmail;
	}
	public String getServiceMgrEmail() {
		return serviceMgrEmail;
	}
	public void setServiceMgrEmail(String serviceMgrEmail) {
		this.serviceMgrEmail = serviceMgrEmail;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Set<HJobAsset> getAssets() {
		return assets;
	}
	public void setAssets(Set<HJobAsset> assets) {
		this.assets = assets;
	}
	public Set<HJobService> getServices() {
		return services;
	}
	public void setServices(Set<HJobService> services) {
		this.services = services;
	}
	public String getSuccess() {
		return success;
	}
	public void setSuccess(String success) {
		this.success = success;
	}
	public Date getCurrReqDate() {
		return currReqDate;
	}
	public void setCurrReqDate(Date currReqDate) {
		this.currReqDate = currReqDate;
	}
	public String getLogId() {
		return logId;
	}
	public void setLogId(String logId) {
		this.logId = logId;
	}
	@Override
	public String toString() {
		return "HJob [index=" + index + ", jobId=" + jobId + ", phaseId=" + phaseId + ", employer=" + employer
				+ ", subEmployer=" + subEmployer + ", techId=" + techId + ", customerName=" + customerName + ", custId="
				+ custId + ", address1=" + address1 + ", address2=" + address2 + ", suburb=" + suburb + ", postCode="
				+ postCode + ", serialNo=" + serialNo + ", contactName=" + contactName + ", contactPhone="
				+ contactPhone + ", jobDesc=" + jobDesc + ", startDate=" + startDate + ", duration=" + duration
				+ ", plannedStart=" + plannedStart + ", plannedEnd=" + plannedEnd + ", jobType=" + jobType
				+ ", customerEmail=" + customerEmail + ", priority=" + priority + ", slaPriority=" + slaPriority
				+ ", officeNote=" + officeNote + ", accountMgrEmail=" + accountMgrEmail + ", serviceMgrEmail="
				+ serviceMgrEmail + "]";
	}	
	
	
}
