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

@Entity
@Table(name="echecklistitem")
public class HEChecklistItem {
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
    
    private String checked;
    private String itemText;
    private String checklistAnswer;
    private String checklistComment;
    
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="categoryId", nullable=false, insertable=false, updatable=false)
	private HEChecklistCategory hEChecklistCategory;

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

	public String getChecked() {
		return checked;
	}

	public void setChecked(String checked) {
		this.checked = checked;
	}

	public String getItemText() {
		return itemText;
	}

	public void setItemText(String itemText) {
		this.itemText = itemText;
	}

	public String getChecklistAnswer() {
		return checklistAnswer;
	}

	public void setChecklistAnswer(String checklistAnswer) {
		this.checklistAnswer = checklistAnswer;
	}

	public String getChecklistComment() {
		return checklistComment;
	}

	public void setChecklistComment(String checklistComment) {
		this.checklistComment = checklistComment;
	}

	public HEChecklistCategory gethEChecklistCategory() {
		return hEChecklistCategory;
	}

	public void sethEChecklistCategory(HEChecklistCategory hEChecklistCategory) {
		this.hEChecklistCategory = hEChecklistCategory;
	}

	@Override
	public String toString() {
		return "HEChecklistItem [index=" + index + ", txId=" + txId + ", jobId=" + jobId + ", phaseId=" + phaseId
				+ ", techId=" + techId + ", checklistId=" + checklistId + ", categoryId=" + categoryId + ", checked="
				+ checked + ", itemText=" + itemText + ", checklistAnswer=" + checklistAnswer + ", checklistComment="
				+ checklistComment + ", hEChecklistCategory=" + hEChecklistCategory + "]";
	}
	
	
    
}
