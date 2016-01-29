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

import org.codehaus.jackson.annotate.JsonIgnore;

@Entity
@Table(name="JobService")
public class HJobService {
	@Id
	@Column(name="index")
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	private int index;	
	
    private String serviceId;
    private String serviceName;
    private String serviceDescription;
    private String serviceType;
    private BigInteger serviceOrderId;
    
    private String jobId;
    private BigInteger phaseId;
    private String techId;
    private int job_index;
    
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="job_index", nullable=false, insertable=false, updatable=false)
	@JsonIgnore
	private HJob hJob;
	
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
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
	public BigInteger getServiceOrderId() {
		return serviceOrderId;
	}
	public void setServiceOrderId(BigInteger serviceOrderId) {
		this.serviceOrderId = serviceOrderId;
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
		return "HJobService [index=" + index + ", serviceId=" + serviceId + ", serviceName=" + serviceName
				+ ", serviceDescription=" + serviceDescription + ", serviceType=" + serviceType + ", serviceOrderId="
				+ serviceOrderId + "]";
	}
    
    
}
