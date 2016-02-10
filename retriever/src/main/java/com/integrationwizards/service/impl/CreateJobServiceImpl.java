package com.integrationwizards.service.impl;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBElement;
import javax.xml.datatype.XMLGregorianCalendar;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.integrationwizards.common.ConstantUtil;
import com.integrationwizards.common.LogManager;
import com.integrationwizards.common.LogUtil;
import com.integrationwizards.common.StringUtil;
import com.integrationwizards.dao.CreateJobDao;
import com.integrationwizards.model.HJob;
import com.integrationwizards.model.HResult;
import com.integrationwizards.service.CreateJobService;

import au.com.retriever.test.barking.Job;
import au.com.retriever.test.barking.JobAsset;
import au.com.retriever.test.barking.JobService;
import au.com.retriever.test.barking.Result;
import au.com.retriever.test.barking.RetrieverBarking;
import au.com.tmha.cos100mi.COS100MI;
import au.com.tmha.cos100mi.getmcohead.GetMCOHeadCollection;
import au.com.tmha.cos100mi.getmcohead.GetMCOHeadItem;
import au.com.tmha.cos100mi.getmcohead.GetMCOHeadResponseCollection;
import au.com.tmha.cos100mi.getmcohead.GetMCOHeadResponseItem;
import au.com.tmha.crs610mi.CRS610MI;
import au.com.tmha.crs610mi.getaddress.GetAddressCollection;
import au.com.tmha.crs610mi.getaddress.GetAddressItem;
import au.com.tmha.crs610mi.getaddress.GetAddressResponseCollection;
import au.com.tmha.crs610mi.getaddress.GetAddressResponseItem;
import au.com.tmha.mos100mi.MOS100MI;
import au.com.tmha.mos100mi.get.GetCollection;
import au.com.tmha.mos100mi.get.GetItem;
import au.com.tmha.mos100mi.get.GetResponseCollection;
import au.com.tmha.mos100mi.get.GetResponseItem;
import au.com.tmha.mos100mi.getmtrl.GetMtrlCollection;
import au.com.tmha.mos100mi.getmtrl.GetMtrlItem;
import au.com.tmha.mos100mi.getmtrl.GetMtrlResponseCollection;
import au.com.tmha.mos100mi.getop.GetOpCollection;
import au.com.tmha.mos100mi.getop.GetOpItem;
import au.com.tmha.mos100mi.getop.GetOpResponseCollection;
import au.com.tmha.mos104mi.MOS104MI;
import au.com.tmha.mos104mi.lstoperelement.LstOperElementCollection;
import au.com.tmha.mos104mi.lstoperelement.LstOperElementItem;
import au.com.tmha.mos104mi.lstoperelement.LstOperElementResponseCollection;
import au.com.tmha.mos104mi.lstoperelement.LstOperElementResponseItem;

@Service
public class CreateJobServiceImpl implements CreateJobService {
	private CreateJobDao createJobDao;
	private final String category = "createJob";
	
	public void setCreateJobDao(CreateJobDao createJobDao) {
		this.createJobDao = createJobDao;
	}	
	
	public GetResponseCollection sendMOS100MIGet(MOS100MI mos100MI, Map<String, String> param) throws Exception {
		GetCollection getCollection = new GetCollection();
		List<GetItem> getItemList = getCollection.getGetItem();		
		
		GetItem gItem = new GetItem();
		au.com.tmha.mos100mi.get.ObjectFactory factory = new au.com.tmha.mos100mi.get.ObjectFactory();
		JAXBElement<BigDecimal> createCompany = factory.createGetItemCompany(BigDecimal.valueOf(1));
		
		gItem.setCompany(createCompany);
		gItem.setFacility(param.get("WHLO"));					// Facility
		gItem.setProductNumber(param.get("PRNO"));				// Product / Asset	
		gItem.setManufacturingOrderNumber(param.get("MWNO")); 	// WO number
		
		JAXBElement<String> createPlanningArea = factory.createGetItemPlanningArea("");
		gItem.setPlanningArea(createPlanningArea);		
		
		getItemList.add(gItem);
		
		GetResponseCollection getResponseCollection = mos100MI.get(getCollection);
		
		return getResponseCollection;
	}
	
	public void setMOS100MIDataGet(GetResponseItem getResponseItem, Map<String, Map<String, Object>> rParam) throws Exception {
		// Job
		Map<String, Object> jobMap = rParam.get("job");
		//jobMap.put("serialNo", StringUtil.getString(getResponseItem.getLotnumber()));
		jobMap.put("jobType", StringUtil.getString(getResponseItem.getService()));
		int priority = Integer.parseInt(StringUtil.getBigDecimal(getResponseItem.getPriority()).toString());
		jobMap.put("priority", (priority == 0 ? "false" : "true"));
		
		//jobMap.put("jobDesc", StringUtil.getString(getResponseItem.getTextLine()));
		jobMap.put("plannedEnd", StringUtil.getCalendar(getResponseItem.getPlannedFinishDate()));	
		jobMap.put("plannedStart", StringUtil.getCalendar(getResponseItem.getPlannedStartDate()));
		

		// Asset
		Map<String, Object> assetMap = rParam.get("asset");
		assetMap.put("assetType", StringUtil.getString(getResponseItem.getStructureType()));		
		assetMap.put("location", StringUtil.getString(getResponseItem.getLotnumber()));
		assetMap.put("make", StringUtil.getString(getResponseItem.getProductDescription()));
		
		// Service
		Map<String, Object> serviceMap = rParam.get("service");
		serviceMap.put("serviceId", StringUtil.getString(getResponseItem.getService()));
		serviceMap.put("serviceType", StringUtil.getString(getResponseItem.getStructureType()));
	}
	
	public GetMtrlResponseCollection sendMOS100MIGetMtrl(MOS100MI port, Map<String, String> param) throws Exception {
		GetMtrlCollection getMtrlCollection = new GetMtrlCollection();
		List<GetMtrlItem> getMtrlItemList = getMtrlCollection.getGetMtrlItem();		
		
		GetMtrlItem getMtrlItem = new GetMtrlItem();
		au.com.tmha.mos100mi.getmtrl.ObjectFactory factory = new au.com.tmha.mos100mi.getmtrl.ObjectFactory();
		
		//getMtrlItem.setRetriveCost();
		getMtrlItem.setSequenceNumber(BigDecimal.valueOf(1));
		getMtrlItem.setWorkOrderNumber(param.get("MWNO")); 	// WO number
		//getMtrlItem.setYesNo(value);
		
		getMtrlItemList.add(getMtrlItem);	
		GetMtrlResponseCollection getResponseMtrlCollection = port.getMtrl(getMtrlCollection);
		
		return getResponseMtrlCollection;
	}
	
	public GetAddressResponseCollection sendCRS610MIGetAddress(CRS610MI crs610MI, Map<String, String> param) throws Exception {
		GetAddressCollection getAddressCollection = new GetAddressCollection();
		List<GetAddressItem> getAddressItemList = getAddressCollection.getGetAddressItem();		
		
		GetAddressItem getAddressItem = new GetAddressItem();
		au.com.tmha.crs610mi.getaddress.ObjectFactory factory = new au.com.tmha.crs610mi.getaddress.ObjectFactory();
		JAXBElement<BigDecimal> createCompany = factory.createGetAddressItemCompany(BigDecimal.valueOf(1));
		
		getAddressItem.setAddressNumber(param.get("ADID"));										// Address Number
		getAddressItem.setAddressType(BigDecimal.valueOf(Long.valueOf(param.get("ADRT"))));		// Address Type
		getAddressItem.setCompany(createCompany);
		getAddressItem.setCustomerNumber(param.get("CUNO"));									// Customer Number
		
		
		getAddressItemList.add(getAddressItem);
		
		GetAddressResponseCollection getAddressResponseCollection = crs610MI.getAddress(getAddressCollection);
		
		return getAddressResponseCollection;
	}
	
	public void setCRS610MIGetAddressData(GetAddressResponseItem getAddressResponseItem, 
			Map<String, Map<String, Object>> rParam) throws Exception {
		// Job
		Map<String, Object> jobMap = rParam.get("job");
		jobMap.put("customerName", StringUtil.getString(getAddressResponseItem.getCustomerName()));		    		
		jobMap.put("address1", StringUtil.getString(getAddressResponseItem.getCustomerAddress1()));
		jobMap.put("address2", StringUtil.getString(getAddressResponseItem.getCustomerAddress2()));
		jobMap.put("suburb", StringUtil.getString(getAddressResponseItem.getCity()));
		
		jobMap.put("contactName", StringUtil.getString(getAddressResponseItem.getYourReference()));
		jobMap.put("contactPhone", StringUtil.getString(getAddressResponseItem.getTelephoneNumber1()));
		
		jobMap.put("postCode", StringUtil.getString(getAddressResponseItem.getPostalCode()));
	}
	
	public GetOpResponseCollection sendMOS100MIGetOp(MOS100MI port, Map<String, String> param) throws Exception {
		GetOpCollection getOpCollection = new GetOpCollection();
		List<GetOpItem> getOpItemList = getOpCollection.getGetOpItem();		
		
		GetOpItem getOpItem = new GetOpItem();
		
		getOpItem.setOperationNumber(BigDecimal.valueOf(Long.valueOf(param.get("OPNO"))));	// Operation Number		
		//getOpItem.setRetriveEstimatedCost(value);
		getOpItem.setWorkOrderNumber(param.get("MWNO")); 	// WO number
		//getOpItem.setYesNo(value);
		
		getOpItemList.add(getOpItem);	
		GetOpResponseCollection getResponseOpCollection = port.getOp(getOpCollection);
		
		return getResponseOpCollection;
	}
	
	public LstOperElementResponseCollection sendMOS104MILstOperElement(MOS104MI mos104MI, Map<String, String> param) throws Exception {
		LstOperElementCollection lstOperElementCollection = new LstOperElementCollection();
		List<LstOperElementItem> lstOperElementItemList = lstOperElementCollection.getLstOperElementItem();		
		
		LstOperElementItem lstOperElementItem = new LstOperElementItem();
		au.com.tmha.mos104mi.lstoperelement.ObjectFactory factory = new au.com.tmha.mos104mi.lstoperelement.ObjectFactory();
		JAXBElement<String> createFacility = factory.createLstOperElementItemFacility(param.get("WHLO"));
		JAXBElement<String> createProductNumber = factory.createLstOperElementItemProductNumber(param.get("PRNO"));		
		
		lstOperElementItem.setFacility(createFacility);	// Facility
		//lstOperElementItem.setOperationElementType(value);
		lstOperElementItem.setOperationNumber(BigDecimal.valueOf(Long.valueOf(param.get("OPNO"))));	// Operation Number
		lstOperElementItem.setProductNumber(createProductNumber);	// Product / Asset
		lstOperElementItem.setWorkOrderNumber(param.get("MWNO")); 	// WO number
		
		lstOperElementItemList.add(lstOperElementItem);
		LstOperElementResponseCollection lstOperElementResponseCollection = mos104MI.lstOperElement(lstOperElementCollection);
		
		return lstOperElementResponseCollection;
	}
	
	public void setMOS104MILstOperElementData(LstOperElementResponseItem lstOperElementResponseItem, 
			Map<String, Map<String, Object>> rParam) {
		// Job
		Map<String, Object> jobMap = rParam.get("job");
		jobMap.put("techId", StringUtil.getString(lstOperElementResponseItem.getEmployeeNumber()));
		
		// Asset
		Map<String, Object> assetMap = rParam.get("asset");
		assetMap.put("serialNo", StringUtil.getString(lstOperElementResponseItem.getSerialNumber()));
		assetMap.put("description", StringUtil.getString(lstOperElementResponseItem.getDescription()));
		assetMap.put("modelNumber", StringUtil.getString(lstOperElementResponseItem.getProductNumber()));
	}
	
    public Job setJobData(Map<String, Map<String, Object>> rParam) throws Exception
	{   
    	Job job = new Job();
		LogUtil lu = null;
		
		try {
			Map<String, Object> jobMap = rParam.get("job");
			
			lu = LogManager.getInstance().getLogObj(category);    	
	    	lu.writeLog("Start CreateJob");	    	
	    	
	    	// Set Job
	    	job.setJobId(StringUtil.nullToVoid(jobMap.get("jobId")));
	    	job.setPhaseId(BigInteger.valueOf(1));
	    	job.setEmployer(ConstantUtil.employer);
	    	job.setTechId(StringUtil.nullToVoid(jobMap.get("techId")));	    	
	    	
	    	job.setCustomerName(StringUtil.nullToVoid(jobMap.get("customerName")));
	    	job.setAddress1(StringUtil.nullToVoid(jobMap.get("address1")));
	    	job.setAddress2(StringUtil.nullToVoid(jobMap.get("address2")));
	    	job.setSuburb(StringUtil.nullToVoid(jobMap.get("suburb")));
	    	job.setContactName(StringUtil.nullToVoid(jobMap.get("contactName")));
	    	job.setContactPhone(StringUtil.nullToVoid(jobMap.get("contactPhone")));
	    	
	    	job.setJobDesc(StringUtil.nullToVoid(jobMap.get("jobDesc")));	    	
			
			job.setStartDate((XMLGregorianCalendar)jobMap.get("startDate"));
			job.setDuration(StringUtil.nullToVoid(jobMap.get("duration")));
			job.setJobType(StringUtil.nullToVoid(jobMap.get("jobType")));	
			job.setPriority(StringUtil.getBoolean(StringUtil.nullToVoid(jobMap.get("priority"))));
			job.setPostCode(StringUtil.nullToVoid(jobMap.get("postCode")));
			job.setCustId(StringUtil.nullToVoid(jobMap.get("custId")));
			
			job.setPlannedStart((XMLGregorianCalendar)jobMap.get("plannedStart"));
			job.setPlannedEnd((XMLGregorianCalendar)jobMap.get("plannedEnd"));
			
			// Set Asset
			Map<String, Object> assetMap = rParam.get("asset");
			JobAsset jobAsset = job.getAssets().get(0);
			jobAsset.setSerialNo(StringUtil.nullToVoid(assetMap.get("serialNo")));
			jobAsset.setDescription(StringUtil.nullToVoid(assetMap.get("description")));
			jobAsset.setAssetType(StringUtil.nullToVoid(assetMap.get("assetType")));
			jobAsset.setModelNumber(StringUtil.nullToVoid(assetMap.get("modelNumber")));
			jobAsset.setLocation(StringUtil.nullToVoid(assetMap.get("location")));
			jobAsset.setMake(StringUtil.nullToVoid(assetMap.get("make")));
			
			// Set Service Data
			Map<String, Object> serviceMap = rParam.get("service");
			JobService jobService = job.getServices().get(0);
			jobService.setServiceId(StringUtil.nullToVoid(serviceMap.get("serviceId")));
			jobService.setServiceType(StringUtil.nullToVoid(serviceMap.get("serialType")));
			
			lu.writeLog(LogUtil.objToMap(job));
    	}
		catch(Exception e) {
			lu.writeLog(e.getMessage());
		}
		finally {
			lu.closeFile();
			LogManager.getInstance().closeLogObj(category);
		}    	
    	
    	return job;
	}    
	
	public GetMCOHeadResponseCollection sendCOS100MIGetMCOHead(COS100MI port, Map<String, String> param) throws Exception {
		GetMCOHeadCollection getMCOHeadCollection = new GetMCOHeadCollection();
		List<GetMCOHeadItem> getMCOHeadItemList = getMCOHeadCollection.getGetMCOHeadItem();
		
		au.com.tmha.cos100mi.getmcohead.ObjectFactory factory = new au.com.tmha.cos100mi.getmcohead.ObjectFactory();
		JAXBElement<BigDecimal> createCompany = factory.createGetMCOHeadItemCompany(BigDecimal.valueOf(1));
		
		GetMCOHeadItem getMCOHeadItem = new GetMCOHeadItem();
		getMCOHeadItem.setCompany(createCompany);
		
		JAXBElement<String> createCustomerOrderNumber = 
				factory.createGetMCOHeadItemCustomerOrderNumber(param.get("RORN"));	// Reference Order Number
		getMCOHeadItem.setCustomerOrderNumber(createCustomerOrderNumber);		
		
		getMCOHeadItemList.add(getMCOHeadItem);
		
		return port.getMCOHead(getMCOHeadCollection);
	}
	
	public void setCOS100MIGetMCOHeadData(GetMCOHeadResponseItem getMCOHeadResponseItem, 
			Map<String, Map<String, Object>> rParam) throws Exception {
		Map<String, Object> jobMap = rParam.get("job");
		jobMap.put("custId", StringUtil.getString(getMCOHeadResponseItem.getCustomer()));
		jobMap.put("techId", StringUtil.getString(getMCOHeadResponseItem.getResponsible()));
		
		// Asset
		Map<String, Object> assetMap = rParam.get("asset");
		assetMap.put("orderId", StringUtil.getString(getMCOHeadResponseItem.getCustomerOrderNumber()));
		
	}
	
	@Transactional
	public HJob insertCreateJob(Job job) throws Exception {		
		ObjectMapper m = new ObjectMapper();
		Map<String,Object> props = m.convertValue(job, Map.class);
		HJob hJob = m.convertValue(props, HJob.class);
		
		createJobDao.insertCreateJob(hJob);
		
		return hJob;
	}
	
	public Result sendCreateJob(RetrieverBarking port, Job job) {
		return port.createJob(job);
	}
	
	@Transactional
	public HResult insertResult(Result result, HJob hJob) throws Exception {
		ObjectMapper m = new ObjectMapper();
		Map<String,Object> props = m.convertValue(result, Map.class);
		HResult hResult = m.convertValue(props, HResult.class);
		hResult.setJobId(hJob.getJobId());
		hResult.setPhaseId(hJob.getPhaseId());
		hResult.setTechId(hJob.getTechId());
		hResult.setJob_index(hJob.getIndex());		
		
		createJobDao.insertResult(hResult);
	    
	    return hResult;
	}
	
	@Transactional
	public HJob updateCreatJob(HJob hJob, HResult hResult) throws Exception {		
		hJob.setSucceededToSend(hResult.getSuccess());
		hJob.setCurrReqDate(new Date());
		
		createJobDao.updateCreatJob(hJob);
		
		return hJob;
	}
}
