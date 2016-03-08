package com.integrationwizards.service.impl;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.xml.bind.JAXBElement;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.integrationwizards.dao.CreateJobDao;
import com.integrationwizards.model.HJob;
import com.integrationwizards.model.HJobAsset;
import com.integrationwizards.model.HJobService;
import com.integrationwizards.model.HResult;
import com.integrationwizards.model.HSmartLink;
import com.integrationwizards.service.CreateJobService;
import com.integrationwizards.util.Constant;
import com.integrationwizards.util.DateUtil;
import com.integrationwizards.util.HeaderFactory;
import com.integrationwizards.util.LogManager;
import com.integrationwizards.util.LogUtil;
import com.integrationwizards.util.StringUtil;

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
import au.com.tmha.mos195mi.MOS195MI;
import au.com.tmha.mos195mi.selwoelem.SelWoElemCollection;
import au.com.tmha.mos195mi.selwoelem.SelWoElemItem;
import au.com.tmha.mos195mi.selwoelem.SelWoElemResponseCollection;

@Service
public class CreateJobServiceImpl implements CreateJobService {
	@Autowired
	private CreateJobDao createJobDao;
	private final String category = "createJob";
	
	public void setCreateJobDao(CreateJobDao createJobDao) {
		this.createJobDao = createJobDao;
	}	
	
	/**
	 * Insert SmartLink as a log
	 * @param param
	 * @return
	 * @throws Exception
	 */
	@Transactional
	public HSmartLink insertSmartLink(Map<String, String> param) throws Exception {
		HSmartLink hSmartLink = new HSmartLink();
		hSmartLink.setMWNO(param.get("MWNO"));
		hSmartLink.setPRNO(param.get("PRNO"));
		hSmartLink.setWHLO(param.get("WHLO"));
		hSmartLink.setUSID(param.get("USID"));
		hSmartLink.setCONO(param.get("CONO"));
		hSmartLink.setLogId(param.get("logId"));
		
		// When SmartLink is already stored, skip this insert
		if(param.get("success") == null) {
			return createJobDao.insertSmartLink(hSmartLink);
		}
		else {
			return null;
		}		
	}
	
	/**
	 * Update the result of calling M3 API with SmartLink data
	 * @param hSmartLink
	 * @param success
	 * @throws Exception
	 */
	@Transactional
	public void updateSmartLink(HSmartLink hSmartLink, String success) throws Exception {		
		hSmartLink.setSuccess(success);
		hSmartLink.setCurrReqDate(new Date());
		
		createJobDao.updateSmartLink(hSmartLink);
	}
	
	/**
	 * Select SmartLink records which failed to receive the result from M3 API
	 * @return
	 * @throws Exception
	 */
	@Transactional
	public List<HSmartLink> selectSmartLink(String counts) throws Exception {
		return createJobDao.selectSmartLink(counts);
	}
	
	/**
	 * Call MOS100MI:Get API 
	 */
	public GetResponseCollection sendMOS100MIGet(Map<String, String> param) throws Exception {
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
				
		return ((MOS100MI)HeaderFactory.getInstance()
				.getHeader(Constant.MOS100MI)).get(getCollection);
	}
	
	/**
	 * Set the result from MOS100MI:Get to Map 
	 */
	public void setMOS100MIDataGet(GetResponseItem getResponseItem, Map<String, Map<String, Object>> rParam) throws Exception {
		// Job
		Map<String, Object> jobMap = rParam.get("job");
		jobMap.put("jobType", StringUtil.getString(getResponseItem.getService()));
		int priority = Integer.parseInt(StringUtil.getBigDecimal(getResponseItem.getPriority()).toString());
		jobMap.put("priority", (priority == 0 ? "false" : "true"));
		
		jobMap.put("jobDesc", StringUtil.getString(getResponseItem.getService()));
		jobMap.put("plannedStartDate", DateUtil.getStringCalendar(getResponseItem.getRequestedStartDate()));
		jobMap.put("plannedStartTime", StringUtil.getBigDecimal(getResponseItem.getRequestedStartTime()));
		jobMap.put("plannedEndDate", DateUtil.getStringCalendar(getResponseItem.getRequestedFinishDate()));
		jobMap.put("plannedEndTime", StringUtil.getBigDecimal(getResponseItem.getRequestedFinishTime()));
		
		String plannedStartStr = StringUtil.nullToVoid(jobMap.get("plannedStartDate")) 
				+ " " + StringUtil.insertLeftChar(StringUtil.nullToVoid(jobMap.get("plannedStartTime")), 4, '0');
		String plannedEndStr = StringUtil.nullToVoid(jobMap.get("plannedEndDate")) 
				+ " " + StringUtil.insertLeftChar(StringUtil.nullToVoid(jobMap.get("plannedEndTime")), 4, '0');
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd HHmm");
		format.setLenient(false); // to prevent things like February 30th
		Date plannedStart = format.parse(plannedStartStr);
		Date plannedEnd = format.parse(plannedEndStr);
		
		jobMap.put("plannedStart", DateUtil.getXMLGregorianCalendar(plannedStart));
		jobMap.put("plannedEnd", DateUtil.getXMLGregorianCalendar(plannedEnd));

		// Asset
		Map<String, Object> assetMap = rParam.get("asset");
		assetMap.put("serialNo", StringUtil.getString(getResponseItem.getLotnumber()));
		assetMap.put("assetType", StringUtil.getString(getResponseItem.getStructureType()));		
		//assetMap.put("location", StringUtil.getString(getResponseItem.getLotnumber()));
		assetMap.put("make", StringUtil.getString(getResponseItem.getProductDescription()));
		
		// Service
		Map<String, Object> serviceMap = rParam.get("service");
		serviceMap.put("serviceId", StringUtil.getString(getResponseItem.getService()));
		serviceMap.put("serviceName", StringUtil.getString(getResponseItem.getService()));
		serviceMap.put("serviceType", StringUtil.nullToVoid(StringUtil.getString(getResponseItem.getStructureType()), "FLD"));
	}
	
	/**
	 * Call MOS100MI:GetMtrl API 
	 */
	public GetMtrlResponseCollection sendMOS100MIGetMtrl(Map<String, String> param) throws Exception {
		GetMtrlCollection getMtrlCollection = new GetMtrlCollection();
		List<GetMtrlItem> getMtrlItemList = getMtrlCollection.getGetMtrlItem();		
		
		GetMtrlItem getMtrlItem = new GetMtrlItem();
		au.com.tmha.mos100mi.getmtrl.ObjectFactory factory = new au.com.tmha.mos100mi.getmtrl.ObjectFactory();
		
		//getMtrlItem.setRetriveCost();
		getMtrlItem.setSequenceNumber(BigDecimal.valueOf(1));
		getMtrlItem.setWorkOrderNumber(param.get("MWNO")); 	// WO number
		//getMtrlItem.setYesNo(value);
		
		getMtrlItemList.add(getMtrlItem);
		
		return ((MOS100MI)HeaderFactory.getInstance()
				.getHeader(Constant.MOS100MI)).getMtrl(getMtrlCollection);
	}
	
	/**
	 * Call MOS195MI:SelWoElem API 
	 */
	public SelWoElemResponseCollection sendMOS195MISelWoElem(Map<String, String> param) throws Exception {
		
		SelWoElemCollection selWoElemCollection = new SelWoElemCollection();
		List<SelWoElemItem> selWoElemItemList = selWoElemCollection.getSelWoElemItem();
		
		SelWoElemItem selWoElemItem = new SelWoElemItem();
		
		au.com.tmha.mos195mi.selwoelem.ObjectFactory factory = new au.com.tmha.mos195mi.selwoelem.ObjectFactory();
		JAXBElement<BigDecimal> createCompany = factory.createSelWoElemItemCompany(BigDecimal.valueOf(1));		
		
		selWoElemItem.setCompany(createCompany);		
		selWoElemItem.setFacility(param.get("WHLO"));
		
		JAXBElement<String> createWorkOrderNumber = factory.createSelWoElemItemWorkOrderNumber(param.get("MWNO"));
		selWoElemItem.setWorkOrderNumber(createWorkOrderNumber);

		selWoElemItemList.add(selWoElemItem);
				
		return ((MOS195MI)HeaderFactory.getInstance()
				.getHeader(Constant.MOS195MI)).selWoElem(selWoElemCollection);
	}
	
	/**
	 * Call CRS610MI:GetAddress API 
	 */
	public GetAddressResponseCollection sendCRS610MIGetAddress(Map<String, String> param) throws Exception {
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
		
		return ((CRS610MI)HeaderFactory.getInstance()
				.getHeader(Constant.CRS610MI)).getAddress(getAddressCollection);
	}
	
	/**
	 * Set the result from CRS610MI:GetAddress to Map 
	 */
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
	
	/**
	 * Call MOS100MI:GetOp API 
	 */
	public GetOpResponseCollection sendMOS100MIGetOp(Map<String, String> param) throws Exception {
		GetOpCollection getOpCollection = new GetOpCollection();
		List<GetOpItem> getOpItemList = getOpCollection.getGetOpItem();		
		
		GetOpItem getOpItem = new GetOpItem();
		
		getOpItem.setOperationNumber(BigDecimal.valueOf(Long.valueOf(param.get("OPNO"))));	// Operation Number		
		//getOpItem.setRetriveEstimatedCost(value);
		getOpItem.setWorkOrderNumber(param.get("MWNO")); 	// WO number
		//getOpItem.setYesNo(value);
		
		getOpItemList.add(getOpItem);
		
		return ((MOS100MI)HeaderFactory.getInstance()
				.getHeader(Constant.MOS100MI)).getOp(getOpCollection);
	}
	
	/**
	 * Call MOS104MI:LstOperElement API 
	 */
	public LstOperElementResponseCollection sendMOS104MILstOperElement(Map<String, String> param) throws Exception {
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
		
		return ((MOS104MI)HeaderFactory.getInstance()
				.getHeader(Constant.MOS104MI)).lstOperElement(lstOperElementCollection);
	}
	
	/**
	 * Set the result from MOS104MI:LstOperElement to Map 
	 */
	public void setMOS104MILstOperElementData(LstOperElementResponseItem lstOperElementResponseItem, 
			Map<String, Map<String, Object>> rParam) {
		// Job
		Map<String, Object> jobMap = rParam.get("job");
		//TODO:: Removing after enrolling relevant TECH ID			
		jobMap.put("techId", "M3-02");//StringUtil.getString(lstOperElementResponseItem.getEmployeeNumber())
		
		// Asset
		Map<String, Object> assetMap = rParam.get("asset");		
		assetMap.put("description", StringUtil.getString(lstOperElementResponseItem.getDescription()));
		assetMap.put("modelNumber", StringUtil.getString(lstOperElementResponseItem.getProductNumber()));
	}
	
	/**
	 * Call COS100MI:GetMCOHead API 
	 */
	public GetMCOHeadResponseCollection sendCOS100MIGetMCOHead(Map<String, String> param) throws Exception {
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
		
		return ((COS100MI)HeaderFactory.getInstance()
				.getHeader(Constant.COS100MI)).getMCOHead(getMCOHeadCollection);
	}
	
	/**
	 * Set the result from COS100MI:GetMCOHead to Map 
	 */
	public void setCOS100MIGetMCOHeadData(GetMCOHeadResponseItem getMCOHeadResponseItem, 
			Map<String, Map<String, Object>> rParam) throws Exception {
		Map<String, Object> jobMap = rParam.get("job");
		jobMap.put("custId", StringUtil.getString(getMCOHeadResponseItem.getCustomer()));
		//jobMap.put("techId", StringUtil.getString(getMCOHeadResponseItem.getResponsible()));
		
		// Asset
		Map<String, Object> assetMap = rParam.get("asset");
		assetMap.put("orderId", StringUtil.getString(getMCOHeadResponseItem.getCustomerOrderNumber()));
		
	}	
	
	/**
	 * Set Job data in order to send a request to Retriever
	 */
    public Job setJobData(Map<String, Map<String, Object>> rParam, String logId) throws Exception
	{   
    	Job job = new Job();
		LogUtil lu = null;
		
		try {
			Map<String, Object> jobMap = rParam.get("job");
			
			lu = LogManager.getInstance().getLogObj(category, logId);    	
	    	lu.info("Start setJobData");	    	
	    	
	    	// Set Job Data
	    	job.setJobId(StringUtil.nullToVoid(jobMap.get("jobId")));
	    	job.setPhaseId(BigInteger.valueOf(1));
	    	job.setEmployer(Constant.employer);
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
			List<JobAsset> jobAssetList = job.getAssets();
			JobAsset jobAsset = new JobAsset();

			jobAsset.setSerialNo(StringUtil.nullToVoid(assetMap.get("serialNo")));
			jobAsset.setDescription(StringUtil.nullToVoid(assetMap.get("description")));
			jobAsset.setAssetType(StringUtil.nullToVoid(assetMap.get("assetType")));
			jobAsset.setModelNumber(StringUtil.nullToVoid(assetMap.get("modelNumber")));
			jobAsset.setLocation(StringUtil.nullToVoid(assetMap.get("location")));
			jobAsset.setMake(StringUtil.nullToVoid(assetMap.get("make")));
			jobAssetList.add(jobAsset);
			
			// Set Service Data
			Map<String, Object> serviceMap = rParam.get("service");
			List<JobService> jobServiceList = job.getServices();
			JobService jobService = new JobService();

			jobService.setServiceId(StringUtil.nullToVoid(serviceMap.get("serviceId")));
			jobService.setServiceName(StringUtil.nullToVoid(serviceMap.get("serviceName")));
			jobService.setServiceType(StringUtil.nullToVoid(serviceMap.get("serviceType")));
			jobServiceList.add(jobService);
			
			lu.info(String.valueOf(StringUtil.objToMap(job)));
			
    	}
		catch(Exception e) {
			e.printStackTrace();
			lu.error("Error in setJobData : " + ExceptionUtils.getStackTrace(e));
			throw e;
		}    	
    	
    	return job;
	}
	
    /**
     * Insert Job data to DB before sending a request to Retriever
     */
	@Transactional
	public HJob insertCreateJob(Job job, String logId) throws Exception {		
		ObjectMapper m = new ObjectMapper();
		Map<String,Object> props = m.convertValue(job, Map.class);
		
		// Move JobAsset to HJobAsset to store data
		List<JobAsset> jobAssetList = job.getAssets();		
		List<HJobAsset> hJobAssetList = new ArrayList<HJobAsset>();
		
		for(JobAsset jobAsset : jobAssetList) {
			Map<String,Object> p = m.convertValue(jobAsset, Map.class);
			HJobAsset hJobAsset = m.convertValue(p, HJobAsset.class);	
			hJobAsset.setJobId(job.getJobId());
			hJobAsset.setPhaseId(job.getPhaseId());
			hJobAsset.setTechId(job.getTechId());
			hJobAssetList.add(hJobAsset);
		}
		
		Set<HJobAsset> hJobAssetSet = new HashSet<HJobAsset>(hJobAssetList);
		//props.put("assets", hJobAssetSet);		
		
		// Move JobAsset to HJobAsset to store data
		List<JobService> jobServiceList = job.getServices();		
		List<HJobService> hJobServiceList = new ArrayList<HJobService>();
		
		for(JobService jobService : jobServiceList) {
			Map<String,Object> p = m.convertValue(jobService, Map.class);
			HJobService hJobService = m.convertValue(p, HJobService.class);
			hJobService.setJobId(job.getJobId());
			hJobService.setPhaseId(job.getPhaseId());
			hJobService.setTechId(job.getTechId());
			hJobServiceList.add(hJobService);
		}
		
		Set<HJobService> hJobServiceSet = new HashSet<HJobService>(hJobServiceList);
		//props.put("services", hJobServiceSet);
		
		HJob hJob = m.convertValue(props, HJob.class);		
		hJob.setPlannedStart(job.getPlannedStart().toGregorianCalendar().getTime());
		hJob.setPlannedEnd(job.getPlannedEnd().toGregorianCalendar().getTime());
		hJob.setAssets(hJobAssetSet);
		hJob.setServices(hJobServiceSet);
		hJob.setLogId(logId);
				
		createJobDao.insertCreateJob(hJob);
		
		return hJob;
	}
	
	/**
	 * Send a createJob request to Retriever
	 */
	public Result sendCreateJob(Job job) {
		return ((RetrieverBarking)HeaderFactory.getInstance()
				.getHeader(Constant.RetrieverBarking)).createJob(job);
	}
	
	/**
	 * Insert the result of CreateJob from Retriever to DB
	 */
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
	
	/**
	 * Update the result of CreateJob from Retriever to DB
	 */
	@Transactional
	public HJob updateCreatJob(HJob hJob, HResult hResult) throws Exception {		
		hJob.setSuccess(hResult.getSuccess());
		hJob.setCurrReqDate(new Date());
		
		createJobDao.updateCreatJob(hJob);
		
		return hJob;
	}
	
	/**
	 * Update Job's index to JobAsset and JobService
	 * @param hJob
	 * @return
	 * @throws Exception
	 */	
	@Transactional	
	public HJob updateCreateJobIndex(HJob hJob) throws Exception {
		// update JobAsset and JobService's job_index
		Set<HJobAsset> hJobAssetSet = hJob.getAssets();
		
		for(HJobAsset hJobAsset : hJobAssetSet) {
			hJobAsset.setJob_index(hJob.getIndex());
		}		
		
		Set<HJobService> hJobServiceSet = hJob.getServices();
		
		for(HJobService hJobService : hJobServiceSet) {
			hJobService.setJob_index(hJob.getIndex());
		}
		
		createJobDao.updateCreatJob(hJob);
		
		return hJob;
	}
	
	/**
	 * Select Job records which failed to be sent 
	 * @return
	 * @throws Exception
	 */	
	@Transactional
	public List<HJob> selectCreateJob(String counts) throws Exception {
		return createJobDao.selectCreateJob(counts);
	}
	
	/**
	 * Convert Job, Asset and Service components for sending a request to Retriever
	 * @param port
	 * @param job
	 * @return
	 * @throws Exception
	 */
	public Result reSendCreateJob(HJob hJob) throws Exception {
		ObjectMapper m = new ObjectMapper();
		Map<String,Object> hJobMap = m.convertValue(hJob, Map.class);
		hJobMap.remove("index");
		hJobMap.remove("createdDate");
		hJobMap.remove("success");
		hJobMap.remove("currReqDate");
		hJobMap.remove("logId");

		Job job = m.convertValue(hJobMap, Job.class);
		
		// Move JobAsset to HJobAsset to store data
		Set<HJobAsset> hJobAssetSet = hJob.getAssets();		
		List<JobAsset> jobAssetList = job.getAssets();
		
		for(HJobAsset hJobAsset : hJobAssetSet) {
			Map<String,Object> hJobAssetMap = m.convertValue(hJobAsset, Map.class);
			hJobAssetMap.remove("index");
			hJobAssetMap.remove("jobId");
			hJobAssetMap.remove("phaseId");
			hJobAssetMap.remove("techId");
			hJobAssetMap.remove("job_index");
			hJobAssetMap.remove("hJob");
			JobAsset jobAsset = m.convertValue(hJobAssetMap, JobAsset.class);

			jobAssetList.add(jobAsset);
		}		
		
		//jobMap.put("assets", jobAssetList);		
		
		// Move JobAsset to HJobAsset to store data
		Set<HJobService> hJobServiceSet = hJob.getServices();		
		List<JobService> jobServiceList = job.getServices();
		
		for(HJobService hJobService : hJobServiceSet) {
			Map<String,Object> hJobServiceMap = m.convertValue(hJobService, Map.class);
			hJobServiceMap.remove("index");
			hJobServiceMap.remove("jobId");
			hJobServiceMap.remove("phaseId");
			hJobServiceMap.remove("techId");
			hJobServiceMap.remove("job_index");
			hJobServiceMap.remove("hJob");
			JobService jobService = m.convertValue(hJobServiceMap, JobService.class);
			
			//jobServiceList.add(jobService);
		}
		
		//jobMap.put("services", jobServiceList);
		return ((RetrieverBarking)HeaderFactory.getInstance()
				.getHeader(Constant.RetrieverBarking)).createJob(job);
		//return null;
	}
}
