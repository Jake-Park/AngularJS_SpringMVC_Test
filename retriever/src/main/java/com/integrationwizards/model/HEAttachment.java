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
@Table(name="EAttachment")
public class HEAttachment {
	@Id
	@Column(name="idx")
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	private int index;		
	private String txId;
    private String jobId;
    private BigInteger phaseId;
    private String techId;	
			
    private String attachmentFileName;
    private String attachment;
    private String attachmentComments;
    
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

	public String getAttachmentFileName() {
		return attachmentFileName;
	}

	public void setAttachmentFileName(String attachmentFileName) {
		this.attachmentFileName = attachmentFileName;
	}

	public String getAttachment() {
		return attachment;
	}

	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}

	public String getAttachmentComments() {
		return attachmentComments;
	}

	public void setAttachmentComments(String attachmentComments) {
		this.attachmentComments = attachmentComments;
	}

	public HEJob gethEJob() {
		return hEJob;
	}

	public void sethEJob(HEJob hEJob) {
		this.hEJob = hEJob;
	}

	@Override
	public String toString() {
		return "HEAttachment [index=" + index + ", txId=" + txId + ", jobId=" + jobId + ", phaseId=" + phaseId
				+ ", techId=" + techId + ", attachmentFileName=" + attachmentFileName + ", attachment=" + attachment
				+ ", attachmentComments=" + attachmentComments + ", hEJob=" + hEJob + "]";
	}
    
}
