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
@Table(name="EOhs")
public class HEOhs {
	@Id
	@Column(name="idx")
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	private int index;		
	private String txId;
    private String jobId;
    private BigInteger phaseId;
    private String techId;
    
    private String ohsType;
    private String category;
    private String questionNo;
    private BigInteger questionOrderNo;
    private String questionText;
    private String questionAnswer;
    private String questionComment;
    private String questionRisks;
    private String questionHazards;
    private Date ohsStartDate;
    
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
	public HEJob gethEJob() {
		return hEJob;
	}
	public void sethEJob(HEJob hEJob) {
		this.hEJob = hEJob;
	}
	public String getOhsType() {
		return ohsType;
	}
	public void setOhsType(String ohsType) {
		this.ohsType = ohsType;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getQuestionNo() {
		return questionNo;
	}
	public void setQuestionNo(String questionNo) {
		this.questionNo = questionNo;
	}
	public BigInteger getQuestionOrderNo() {
		return questionOrderNo;
	}
	public void setQuestionOrderNo(BigInteger questionOrderNo) {
		this.questionOrderNo = questionOrderNo;
	}
	public String getQuestionText() {
		return questionText;
	}
	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}
	public String getQuestionAnswer() {
		return questionAnswer;
	}
	public void setQuestionAnswer(String questionAnswer) {
		this.questionAnswer = questionAnswer;
	}
	public String getQuestionComment() {
		return questionComment;
	}
	public void setQuestionComment(String questionComment) {
		this.questionComment = questionComment;
	}
	public String getQuestionRisks() {
		return questionRisks;
	}
	public void setQuestionRisks(String questionRisks) {
		this.questionRisks = questionRisks;
	}
	public String getQuestionHazards() {
		return questionHazards;
	}
	public void setQuestionHazards(String questionHazards) {
		this.questionHazards = questionHazards;
	}
	public Date getOhsStartDate() {
		return ohsStartDate;
	}
	public void setOhsStartDate(Date ohsStartDate) {
		this.ohsStartDate = ohsStartDate;
	}
	@Override
	public String toString() {
		return "HEOhs [index=" + index + ", txId=" + txId + ", jobId=" + jobId + ", phaseId=" + phaseId + ", techId="
				+ techId + ", ohsType=" + ohsType + ", category=" + category + ", questionNo=" + questionNo
				+ ", questionOrderNo=" + questionOrderNo + ", questionText=" + questionText + ", questionAnswer="
				+ questionAnswer + ", questionComment=" + questionComment + ", questionRisks=" + questionRisks
				+ ", questionHazards=" + questionHazards + ", ohsStartDate=" + ohsStartDate + ", hEJob=" + hEJob + "]";
	}

    
    
}
