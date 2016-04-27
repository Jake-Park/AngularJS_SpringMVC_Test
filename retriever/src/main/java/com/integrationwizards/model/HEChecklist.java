package com.integrationwizards.model;

import java.math.BigInteger;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
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

import au.com.retriever.test.barking.EChecklistCategory;

@Entity
@Table(name="echecklist")
public class HEChecklist {
	@Id
	@Column(name="idx")
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	private int index;		
	private String txId;
    private String jobId;
    private BigInteger phaseId;
    private String techId;	
					
    private String checklistId;
    private String checklistText;
    private Date dateCompleted;
    private String serialDesc;

	@OneToMany(mappedBy = "hEChecklist", cascade = CascadeType.ALL)
    private Set<HEChecklistCategory> eChecklistCategory = new HashSet<HEChecklistCategory>();
	
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
	public String getChecklistId() {
		return checklistId;
	}
	public void setChecklistId(String checklistId) {
		this.checklistId = checklistId;
	}
	public String getChecklistText() {
		return checklistText;
	}
	public void setChecklistText(String checklistText) {
		this.checklistText = checklistText;
	}
	public Date getDateCompleted() {
		return dateCompleted;
	}
	public void setDateCompleted(Date dateCompleted) {
		this.dateCompleted = dateCompleted;
	}
	public String getSerialDesc() {
		return serialDesc;
	}
	public void setSerialDesc(String serialDesc) {
		this.serialDesc = serialDesc;
	}
	public Set<HEChecklistCategory> geteChecklistCategory() {
		return eChecklistCategory;
	}
	public void seteChecklistCategory(Set<HEChecklistCategory> eChecklistCategory) {
		this.eChecklistCategory = eChecklistCategory;
	}
	
	public HEJob gethEJob() {
		return hEJob;
	}
	public void sethEJob(HEJob hEJob) {
		this.hEJob = hEJob;
	}
	@Override
	public String toString() {
		return "HEChecklist [index=" + index + ", txId=" + txId + ", jobId=" + jobId + ", phaseId=" + phaseId
				+ ", techId=" + techId + ", checklistId=" + checklistId + ", checklistText=" + checklistText
				+ ", dateCompleted=" + dateCompleted + ", serialDesc=" + serialDesc + "]";
	}
	
	
}
