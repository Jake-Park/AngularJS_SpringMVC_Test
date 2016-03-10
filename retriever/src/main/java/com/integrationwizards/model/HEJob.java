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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnore;

@Entity
@Table(name="EJob")
public class HEJob {
	@Id
	@Column(name="idx")
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	private int index;
	private String txId;
	
    private String jobId;
    private BigInteger phaseId;
    private String techId;
    private String workDone;
    private String workRecommend;
    private String comments;
    private String officeNotes;
    private Date jobDatetime;
    private String signatureName;
    private BigInteger jobStatus;
    private String customerName;
    private String custId;
    private String address1;
    private String address2;
    private String suburb;
    private String postCode;
    private String contact;
    private String phone;
    private String jobDesc;
    private Date createDatetime;
    private String techName;
    private Double amountOwing;
    private String serialNo;
    private String jobType;
    private String email;
    private String firstOhsCompleted;
    private String accountMgrEmail;
    private String serviceMgrEmail;
    private String logId;
    
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "hEJob", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<HEOhs> eOhs = new HashSet<HEOhs>();
	
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "hEJob", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<HENewAsset> eNewAsset = new HashSet<HENewAsset>();
	
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "hEJob", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<HEService> eService = new HashSet<HEService>();
	    
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "hEJob", cascade = CascadeType.ALL)
    @JsonIgnore
	private Set<HEPart> ePart = new HashSet<HEPart>();
	
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "hEJob", cascade = CascadeType.ALL)
    @JsonIgnore
	private Set<HESignature> eSignature = new HashSet<HESignature>();
	    
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "hEJob", cascade = CascadeType.ALL)
    @JsonIgnore
	private Set<HEChecklist> eChecklist = new HashSet<HEChecklist>();
	    
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "hEJob", cascade = CascadeType.ALL)
    @JsonIgnore
	private Set<HETime> eTime = new HashSet<HETime>();
	      
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "hEJob", cascade = CascadeType.ALL)
    @JsonIgnore
	private Set<HEAllowance> eAllowance = new HashSet<HEAllowance>();
	          
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "hEJob", cascade = CascadeType.ALL)
    @JsonIgnore
	private Set<HEPurchaseOrder> ePurchaseOrder = new HashSet<HEPurchaseOrder>();
	          
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "hEJob", cascade = CascadeType.ALL)
    @JsonIgnore
	private Set<HEReport> eReport = new HashSet<HEReport>();
	          
    private String paymentOption;
    private String cardType;
    private String cardNo;
    private String cardExpiry;
    private String referenceNo;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "hEJob", cascade = CascadeType.ALL)
	private Set<HEAttachment> eAttachment = new HashSet<HEAttachment>();
    
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="txId", nullable=false, insertable=false, updatable=false)
	private HResultExportJobs hResultExportJobs;	
	
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
	public String getWorkDone() {
		return workDone;
	}
	public void setWorkDone(String workDone) {
		this.workDone = workDone;
	}
	public String getWorkRecommend() {
		return workRecommend;
	}
	public void setWorkRecommend(String workRecommend) {
		this.workRecommend = workRecommend;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getOfficeNotes() {
		return officeNotes;
	}
	public void setOfficeNotes(String officeNotes) {
		this.officeNotes = officeNotes;
	}
	public Date getJobDatetime() {
		return jobDatetime;
	}
	public void setJobDatetime(Date jobDatetime) {
		this.jobDatetime = jobDatetime;
	}
	public String getSignatureName() {
		return signatureName;
	}
	public void setSignatureName(String signatureName) {
		this.signatureName = signatureName;
	}
	public BigInteger getJobStatus() {
		return jobStatus;
	}
	public void setJobStatus(BigInteger jobStatus) {
		this.jobStatus = jobStatus;
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
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getJobDesc() {
		return jobDesc;
	}
	public void setJobDesc(String jobDesc) {
		this.jobDesc = jobDesc;
	}
	public Date getCreateDatetime() {
		return createDatetime;
	}
	public void setCreateDatetime(Date createDatetime) {
		this.createDatetime = createDatetime;
	}
	public String getTechName() {
		return techName;
	}
	public void setTechName(String techName) {
		this.techName = techName;
	}
	public Double getAmountOwing() {
		return amountOwing;
	}
	public void setAmountOwing(Double amountOwing) {
		this.amountOwing = amountOwing;
	}
	public String getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}
	public String getJobType() {
		return jobType;
	}
	public void setJobType(String jobType) {
		this.jobType = jobType;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstOhsCompleted() {
		return firstOhsCompleted;
	}
	public void setFirstOhsCompleted(String firstOhsCompleted) {
		this.firstOhsCompleted = firstOhsCompleted;
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
	public String getLogId() {
		return logId;
	}
	public void setLogId(String logId) {
		this.logId = logId;
	}
	public Set<HEOhs> geteOhs() {
		return eOhs;
	}
	public void seteOhs(Set<HEOhs> eOhs) {
		this.eOhs = eOhs;
	}
	public Set<HENewAsset> geteNewAsset() {
		return eNewAsset;
	}
	public void seteNewAsset(Set<HENewAsset> eNewAsset) {
		this.eNewAsset = eNewAsset;
	}
	public Set<HEService> geteService() {
		return eService;
	}
	public void seteService(Set<HEService> eService) {
		this.eService = eService;
	}
	public Set<HEPart> getePart() {
		return ePart;
	}
	public void setePart(Set<HEPart> ePart) {
		this.ePart = ePart;
	}
	public Set<HESignature> geteSignature() {
		return eSignature;
	}
	public void seteSignature(Set<HESignature> eSignature) {
		this.eSignature = eSignature;
	}
	public Set<HEChecklist> geteChecklist() {
		return eChecklist;
	}
	public void seteChecklist(Set<HEChecklist> eChecklist) {
		this.eChecklist = eChecklist;
	}
	public Set<HETime> geteTime() {
		return eTime;
	}
	public void seteTime(Set<HETime> eTime) {
		this.eTime = eTime;
	}
	public Set<HEAllowance> geteAllowance() {
		return eAllowance;
	}
	public void seteAllowance(Set<HEAllowance> eAllowance) {
		this.eAllowance = eAllowance;
	}
	public Set<HEPurchaseOrder> getePurchaseOrder() {
		return ePurchaseOrder;
	}
	public void setePurchaseOrder(Set<HEPurchaseOrder> ePurchaseOrder) {
		this.ePurchaseOrder = ePurchaseOrder;
	}
	public Set<HEReport> geteReport() {
		return eReport;
	}
	public void seteReport(Set<HEReport> eReport) {
		this.eReport = eReport;
	}
	public String getPaymentOption() {
		return paymentOption;
	}
	public void setPaymentOption(String paymentOption) {
		this.paymentOption = paymentOption;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public String getCardExpiry() {
		return cardExpiry;
	}
	public void setCardExpiry(String cardExpiry) {
		this.cardExpiry = cardExpiry;
	}
	public String getReferenceNo() {
		return referenceNo;
	}
	public void setReferenceNo(String referenceNo) {
		this.referenceNo = referenceNo;
	}
	public Set<HEAttachment> geteAttachment() {
		return eAttachment;
	}
	public void seteAttachment(Set<HEAttachment> eAttachment) {
		this.eAttachment = eAttachment;
	}
	
	public HResultExportJobs gethResultExportJobs() {
		return hResultExportJobs;
	}
	public void sethResultExportJobs(HResultExportJobs hResultExportJobs) {
		this.hResultExportJobs = hResultExportJobs;
	}
	@Override
	public String toString() {
		return "HEJob [index=" + index + ", txId=" + txId + ", jobId=" + jobId + ", phaseId=" + phaseId + ", techId="
				+ techId + ", workDone=" + workDone + ", workRecommend=" + workRecommend + ", comments=" + comments
				+ ", officeNotes=" + officeNotes + ", jobDatetime=" + jobDatetime + ", signatureName=" + signatureName
				+ ", jobStatus=" + jobStatus + ", customerName=" + customerName + ", custId=" + custId + ", address1="
				+ address1 + ", address2=" + address2 + ", suburb=" + suburb + ", postCode=" + postCode + ", contact="
				+ contact + ", phone=" + phone + ", jobDesc=" + jobDesc + ", createDatetime=" + createDatetime
				+ ", techName=" + techName + ", amountOwing=" + amountOwing + ", serialNo=" + serialNo + ", jobType="
				+ jobType + ", email=" + email + ", firstOhsCompleted=" + firstOhsCompleted + ", accountMgrEmail="
				+ accountMgrEmail + ", serviceMgrEmail=" + serviceMgrEmail + ", eOhs=" + eOhs + ", paymentOption="
				+ paymentOption + ", cardType=" + cardType + ", cardNo=" + cardNo + ", cardExpiry=" + cardExpiry
				+ ", referenceNo=" + referenceNo + "]";
	}

	
	          
}
