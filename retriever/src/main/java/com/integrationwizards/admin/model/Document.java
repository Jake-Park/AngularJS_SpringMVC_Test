package com.integrationwizards.admin.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DOCUMENT")
public class Document {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	private String id;
	private String uploadFileName;
	private byte[] uploadFileData;
	private String downloadFileName;
	private byte[] downloadFileData;	
	@Column(name="createdDate", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP", insertable=false, updatable=false)
	private Date createdDate;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getUploadFileName() {
		return uploadFileName;
	}
	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}
	public byte[] getUploadFileData() {
		return uploadFileData;
	}
	public void setUploadFileData(byte[] uploadFileData) {
		this.uploadFileData = uploadFileData;
	}
	public String getDownloadFileName() {
		return downloadFileName;
	}
	public void setDownloadFileName(String downloadFileName) {
		this.downloadFileName = downloadFileName;
	}
	public byte[] getDownloadFileData() {
		return downloadFileData;
	}
	public void setDownloadFileData(byte[] downloadFileData) {
		this.downloadFileData = downloadFileData;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
	
	
}
