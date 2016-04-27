package com.integrationwizards.model;

import java.math.BigInteger;
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
import javax.xml.bind.annotation.XmlElement;

import org.codehaus.jackson.annotate.JsonIgnore;

import au.com.retriever.test.barking.EChecklistItem;

@Entity
@Table(name="echecklistcategory")
public class HEChecklistCategory {
	@Id
	@Column(name="idx")
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	private int index;		
	private String txId;
    private String jobId;
    private BigInteger phaseId;
    private String techId;
    private String checklistId;
    
    private String categoryId;
    private String categoryText;
    private String orderId;

	@OneToMany(mappedBy = "hEChecklistCategory", cascade = CascadeType.ALL)
    private Set<HEChecklistItem> eChecklistItem = new HashSet<HEChecklistItem>();
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="checklistId", nullable=false, insertable=false, updatable=false)
	private HEChecklist hEChecklist;

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

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryText() {
		return categoryText;
	}

	public void setCategoryText(String categoryText) {
		this.categoryText = categoryText;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public Set<HEChecklistItem> geteChecklistItem() {
		return eChecklistItem;
	}

	public void seteChecklistItem(Set<HEChecklistItem> eChecklistItem) {
		this.eChecklistItem = eChecklistItem;
	}

	public HEChecklist gethEChecklist() {
		return hEChecklist;
	}

	public void sethEChecklist(HEChecklist hEChecklist) {
		this.hEChecklist = hEChecklist;
	}

	@Override
	public String toString() {
		return "HEChecklistCategory [index=" + index + ", txId=" + txId + ", jobId=" + jobId + ", phaseId=" + phaseId
				+ ", techId=" + techId + ", checklistId=" + checklistId + ", categoryId=" + categoryId
				+ ", categoryText=" + categoryText + ", orderId=" + orderId + ", hEChecklist=" + hEChecklist + "]";
	}
	
	
	
}
