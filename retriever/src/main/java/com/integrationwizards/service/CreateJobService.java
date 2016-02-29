package com.integrationwizards.service;

import java.util.List;
import java.util.Map;

import com.integrationwizards.model.HJob;
import com.integrationwizards.model.HResult;
import com.integrationwizards.model.HSmartLink;

import au.com.retriever.test.barking.Job;
import au.com.retriever.test.barking.Result;
import au.com.retriever.test.barking.RetrieverBarking;
import au.com.tmha.cos100mi.COS100MI;
import au.com.tmha.cos100mi.getmcohead.GetMCOHeadResponseCollection;
import au.com.tmha.cos100mi.getmcohead.GetMCOHeadResponseItem;
import au.com.tmha.crs610mi.CRS610MI;
import au.com.tmha.crs610mi.getaddress.GetAddressResponseCollection;
import au.com.tmha.crs610mi.getaddress.GetAddressResponseItem;
import au.com.tmha.mos100mi.MOS100MI;
import au.com.tmha.mos100mi.get.GetResponseCollection;
import au.com.tmha.mos100mi.get.GetResponseItem;
import au.com.tmha.mos100mi.getmtrl.GetMtrlResponseCollection;
import au.com.tmha.mos100mi.getop.GetOpResponseCollection;
import au.com.tmha.mos104mi.MOS104MI;
import au.com.tmha.mos104mi.lstoperelement.LstOperElementResponseCollection;
import au.com.tmha.mos104mi.lstoperelement.LstOperElementResponseItem;
import au.com.tmha.mos195mi.MOS195MI;
import au.com.tmha.mos195mi.selwoelem.SelWoElemResponseCollection;

public interface CreateJobService {
	/**
	 * Insert SmartLink as a log
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public HSmartLink insertSmartLink(Map<String, String> param) throws Exception;
	
	/**
	 * Update the result of calling M3 API with SmartLink data
	 * @param hSmartLink
	 * @param success
	 * @throws Exception
	 */
	public void updateSmartLink(HSmartLink hSmartLink, String success) throws Exception;
	
	/**
	 * Select SmartLink records which failed to receive the result from M3 API
	 * @return
	 * @throws Exception
	 */
	public List<HSmartLink> selectSmartLink() throws Exception;
	
	/**
	 * Call MOS100MI:Get API 
	 */
	public GetResponseCollection sendMOS100MIGet(Map<String, String> param) throws Exception;
	
	/**
	 * Set the result from MOS100MI:Get to Map 
	 */
	public void setMOS100MIDataGet(GetResponseItem getResponseItem, 
			Map<String, Map<String, Object>> rParam) throws Exception;
	
	/**
	 * Call MOS195MI:SelWoElem API 
	 */
	public SelWoElemResponseCollection sendMOS195MISelWoElem(Map<String, String> param) throws Exception;
	
	/**
	 * Call MOS100MI:GetMtrl API 
	 */
	public GetMtrlResponseCollection sendMOS100MIGetMtrl(Map<String, String> param) throws Exception;
	
	/**
	 * Call CRS610MI:GetAddress API 
	 */
	public GetAddressResponseCollection sendCRS610MIGetAddress(Map<String, String> param) throws Exception;

	/**
	 * Set the result from CRS610MI:GetAddress to Map 
	 */
	public void setCRS610MIGetAddressData(GetAddressResponseItem getAddressResponseItem, 
			Map<String, Map<String, Object>> rParam) throws Exception;
	
	/**
	 * Call MOS100MI:GetOp API 
	 */
	public GetOpResponseCollection sendMOS100MIGetOp(Map<String, String> param) throws Exception;

	/**
	 * Call MOS104MI:LstOperElement API 
	 */
	public LstOperElementResponseCollection sendMOS104MILstOperElement(Map<String, String> param) throws Exception;
	
	/**
	 * Set the result from MOS104MI:LstOperElement to Map 
	 */
	public void setMOS104MILstOperElementData(LstOperElementResponseItem lstOperElementResponseItem, 
			Map<String, Map<String, Object>> rParam);
	
	/**
	 * Call COS100MI:GetMCOHead API 
	 */
	public GetMCOHeadResponseCollection sendCOS100MIGetMCOHead(Map<String, String> param) throws Exception;
	
	/**
	 * Set the result from COS100MI:GetMCOHead to Map 
	 */
	public void setCOS100MIGetMCOHeadData(GetMCOHeadResponseItem getMCOHeadResponseItem, 
			Map<String, Map<String, Object>> rParam) throws Exception;
	
	/**
	 * Set Job data in order to send a request to Retriever
	 */
	public Job setJobData(Map<String, Map<String, Object>> rParam) throws Exception;
	
    /**
     * Insert Job data to DB before sending a request to Retriever
     */
	public HJob insertCreateJob(Job job, String logId) throws Exception;
	
	/**
	 * Send a createJob request to Retriever
	 */
	public Result sendCreateJob(Job job) throws Exception;
	
	/**
	 * Insert the result of CreateJob from Retriever into DB
	 */
	public HResult insertResult(Result result, HJob hJob) throws Exception;
	
	/**
	 * Update the result of CreateJob from Retriever into DB
	 */
	public HJob updateCreatJob(HJob hJob, HResult hResult) throws Exception;
	
	/**
	 * Update Job's index to JobAsset and JobService
	 * @param hJob
	 * @return
	 * @throws Exception
	 */
	public HJob updateCreateJobIndex(HJob hJob) throws Exception;
	
	/**
	 * Select Job records which failed to be sent 
	 * @return
	 * @throws Exception
	 */
	public List<HJob> selectCreateJob() throws Exception;
	
	/**
	 * Convert Job, Asset and Service components for sending a request to Retriever
	 * @param port
	 * @param job
	 * @return
	 * @throws Exception
	 */
	public Result reSendCreateJob(HJob job) throws Exception;
}
