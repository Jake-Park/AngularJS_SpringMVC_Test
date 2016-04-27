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
@Table(name="eservice")
public class HEService {
	@Id
	@Column(name="idx")
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	private int index;		
	private String txId;
    private String jobId;
    private BigInteger phaseId;
    private String techId;	
		
    private String serviceId;
    private String serviceName;
    private String serviceDescription;
    private String serviceType;
    private String clientId;
    
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

	public String getServiceId() {
		return serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getServiceDescription() {
		return serviceDescription;
	}

	public void setServiceDescription(String serviceDescription) {
		this.serviceDescription = serviceDescription;
	}

	public String getServiceType() {
		return serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public HEJob gethEJob() {
		return hEJob;
	}

	public void sethEJob(HEJob hEJob) {
		this.hEJob = hEJob;
	}

	@Override
	public String toString() {
		return "HEService [index=" + index + ", txId=" + txId + ", jobId=" + jobId + ", phaseId=" + phaseId
				+ ", techId=" + techId + ", serviceId=" + serviceId + ", serviceName=" + serviceName
				+ ", serviceDescription=" + serviceDescription + ", serviceType=" + serviceType + ", clientId="
				+ clientId + ", hEJob=" + hEJob + "]";
	}

	
}
