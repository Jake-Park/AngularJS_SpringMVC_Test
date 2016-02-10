package com.integrationwizards.service;

import java.util.Map;

import com.integrationwizards.model.HJob;
import com.integrationwizards.model.HResult;

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

public interface CreateJobService {
	public HJob insertCreateJob(Job job) throws Exception;
	public Result sendCreateJob(RetrieverBarking port, Job job) throws Exception;
	public HResult insertResult(Result result, HJob hJob) throws Exception;
	public HJob updateCreatJob(HJob hJob, HResult hResult) throws Exception;
	public GetResponseCollection sendMOS100MIGet(MOS100MI port, Map<String, String> param) throws Exception;
	public void setMOS100MIDataGet(GetResponseItem getResponseItem, Map<String, Map<String, Object>> rParam) throws Exception;
	public GetMtrlResponseCollection sendMOS100MIGetMtrl(MOS100MI port, Map<String, String> param) throws Exception;
	public GetMCOHeadResponseCollection sendCOS100MIGetMCOHead(COS100MI port, Map<String, String> param) throws Exception;
	public void setCOS100MIGetMCOHeadData(GetMCOHeadResponseItem getMCOHeadResponseItem, Map<String, Map<String, Object>> rParam) throws Exception;
	public Job setJobData(Map<String, Map<String, Object>> rParam) throws Exception;
	public LstOperElementResponseCollection sendMOS104MILstOperElement(MOS104MI mos104MI, Map<String, String> param) throws Exception;
	public void setMOS104MILstOperElementData(LstOperElementResponseItem lstOperElementResponseItem, Map<String, Map<String, Object>> rParam);
	public GetAddressResponseCollection sendCRS610MIGetAddress(CRS610MI crs610MI, Map<String, String> param) throws Exception;
	public void setCRS610MIGetAddressData(GetAddressResponseItem getAddressResponseItem, Map<String, Map<String, Object>> rParam) throws Exception;
	public GetOpResponseCollection sendMOS100MIGetOp(MOS100MI port, Map<String, String> param) throws Exception;
}
