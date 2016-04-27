package com.integrationwizards.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="smartlink")
public class HSmartLink {
	@Id
	@Column(name="idx")
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	private int index;
	
	private String MWNO;	// Work Order Number',
	private String PRNO;	// Product / Asset',
	private String WHLO;	// Warehouse',
	private String USID;	// User Id',
	private String CONO;	// Compnay',
	@Column(name="createdDate", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP", insertable=false, updatable=false)
	private Date createdDate;
	private String success;
	private Date currReqDate;
	private String logId;
	
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public String getMWNO() {
		return MWNO;
	}
	public void setMWNO(String mWNO) {
		MWNO = mWNO;
	}
	public String getPRNO() {
		return PRNO;
	}
	public void setPRNO(String pRNO) {
		PRNO = pRNO;
	}
	public String getWHLO() {
		return WHLO;
	}
	public void setWHLO(String wHLO) {
		WHLO = wHLO;
	}
	public String getUSID() {
		return USID;
	}
	public void setUSID(String uSID) {
		USID = uSID;
	}
	public String getCONO() {
		return CONO;
	}
	public void setCONO(String cONO) {
		CONO = cONO;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
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
		return "HSmartLink [index=" + index + ", MWNO=" + MWNO + ", PRNO=" + PRNO + ", WHLO=" + WHLO + ", USID=" + USID
				+ ", CONO=" + CONO + ", createdDate=" + createdDate + ", success=" + success + ", currReqDate="
				+ currReqDate + ", logId=" + logId + "]";
	}
	
	
	
}
