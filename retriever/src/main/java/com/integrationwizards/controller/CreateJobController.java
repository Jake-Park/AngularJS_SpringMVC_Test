package com.integrationwizards.controller;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.swing.Spring;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.integrationwizards.common.PingCheck;
import com.integrationwizards.model.HJob;
import com.integrationwizards.model.HJobAsset;
import com.integrationwizards.model.HJobService;
import com.integrationwizards.model.HResult;
import com.integrationwizards.model.HSmartLink;
import com.integrationwizards.service.CreateJobService;
import com.integrationwizards.util.DateUtil;
import com.integrationwizards.util.LogManager;
import com.integrationwizards.util.LogUtil;
import com.integrationwizards.util.StringUtil;

import au.com.retriever.test.barking.Job;
import au.com.retriever.test.barking.Result;
import au.com.tmha.cos100mi.getmcohead.GetMCOHeadResponseCollection;
import au.com.tmha.cos100mi.getmcohead.GetMCOHeadResponseItem;
import au.com.tmha.crs610mi.getaddress.GetAddressResponseCollection;
import au.com.tmha.crs610mi.getaddress.GetAddressResponseItem;
import au.com.tmha.mos100mi.get.GetResponseCollection;
import au.com.tmha.mos100mi.get.GetResponseItem;
import au.com.tmha.mos100mi.getop.GetOpResponseCollection;
import au.com.tmha.mos100mi.getop.GetOpResponseItem;
import au.com.tmha.mos104mi.lstoperelement.LstOperElementResponseCollection;
import au.com.tmha.mos104mi.lstoperelement.LstOperElementResponseItem;
import au.com.tmha.mos195mi.selwoelem.SelWoElemResponseCollection;
import au.com.tmha.mos195mi.selwoelem.SelWoElemResponseItem;

@Controller
public class CreateJobController {
	@Autowired
	private CreateJobService createJobService;
	private final String category = "createJob";
	@Value("${createJob.reSmartLink.counts}") 
	private String slCount;
	@Value("${createJob.reCreateJob.counts}") 
	private String cjCount;
	
	/**
	 * Get SmartLink from M3 
	 * @param MWNO
	 * @param PRNO
	 * @param WHLO
	 * @param USID
	 * @param Company
	 * @return
	 * @throws Exception
	 */
    @RequestMapping(value="/parameters", 
    		params = {"p1", "p2", "p3", "p4", "p5"}, method = RequestMethod.GET)    
	public void getSmartLink(
			@RequestParam(value = "p1") String MWNO, 	// WO number
			@RequestParam(value = "p2") String PRNO, 	// Product/Asset
			@RequestParam(value = "p3") String WHLO, 	// Warehouse
			@RequestParam(value = "p4") String USID, 	// User Id
			@RequestParam(value = "p5") String Company)
	{   
    	LogUtil lu = null;
    	try {    		
    		String uuid = UUID.randomUUID().toString();
    		lu = LogManager.getInstance().createLogObj(category, uuid);
    		lu.updateStates(MWNO, "STA", "M3C", null);
    		lu.info("Receive SmartLink From M3 : " + MWNO);
	    	System.out.println("MWNO : " + MWNO);
	    	System.out.println("PRNO : " + PRNO);
	    	System.out.println("WHLO : " + WHLO);
	    	System.out.println("USID : " + USID);
	    	System.out.println("Company : " + Company);
	    	System.out.println("logId : " + uuid);
	    		    	
	    	Map<String, String> map = new HashMap<String, String>();
	    	map.put("MWNO", MWNO);
	    	map.put("PRNO", PRNO);
	    	map.put("WHLO", WHLO);
	    	map.put("USID", USID);
	    	map.put("Company", Company);
	    	map.put("logId", uuid);
	    	
	    	lu.debug("Call M3 Web Service API");
	    	createJobFromM3(map);
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    		lu.error("Errored in getSmartLink : " + e);
    		lu.updateStates(MWNO, "ERR", "M3C", "Errored in getSmartLink");
    	}
	}   
    
    /**
     * Call M3 WebService API and Set data from WebService
     * 
     * sendMOS100MI:Get - get Job and Service Info
     * sendMOS100MI:GetMtrl - get Operation number
     * sendMOS104MI:LstOperElement - get Tech Id and Asset Info
     * sendCOS100MI:GetMCOHead - get Cust Id
     * sendCRS610MI:GetAddress - get Address Info
     * sendMOS100MI:GetOp - get Start Date
     * @param mParam
     */
    public void createJobFromM3(Map<String, String> mParam) throws Exception {
    	LogUtil lu = null;
    	HSmartLink hSmartLink = null;
    	
    	try {
			lu = LogManager.getInstance().getLogObj(category, mParam.get("logId"));   
	    	lu.info("Start createJobFromM3 : " + mParam);
	    		    	
	    	hSmartLink = createJobService.insertSmartLink(mParam);
	    	
    		// Create Parameter Map Object
    		Map<String, Map<String, Object>> rParam = new HashMap<String, Map<String, Object>>();
    		Map<String, Object> jobMap = new HashMap<String, Object>();
    		rParam.put("job", jobMap);
    		Map<String, Object> jobAsset = new HashMap<String, Object>();
    		rParam.put("asset", jobAsset);
    		Map<String, Object> jobService = new HashMap<String, Object>();
    		rParam.put("service", jobService);
    		
    		// SendMOS100MI:Get	    
    		// Get from MOS100MI
    		GetResponseCollection getResponseCollection = createJobService.sendMOS100MIGet(mParam);
    		GetResponseItem getResponseItem = getResponseCollection.getGetResponseItem().get(0);
    		
    		createJobService.setMOS100MIDataGet(getResponseItem, rParam);
    		
    		mParam.put("ADID", 
    				StringUtil.nullToVoid(StringUtil.getString(getResponseItem.getAddressNumber())));	//AddressNumber : ADID
    		mParam.put("ADRT", 
    				StringUtil.nullToVoid(StringUtil.getBigDecimal(getResponseItem.getAddressType())));	//AddressType : ADRT
    		mParam.put("RORN", 	// Reference Order Number
    				String.valueOf(StringUtil.getBigDecimal(getResponseItem.getReferenceOrderNumber()))); 
    		
    		//SendMOS100MI:GetMtrl	

    		//GetMtrlResponseCollection getMtrlResponseCollection = createJobService.sendMOS100MIGetMtrl(header.getMOS100MIPort(), mParam);
    		//GetMtrlResponseItem getMtrlResponseItem = getMtrlResponseCollection.getGetMtrlResponseItem().get(0);
    		
    		// Get Operation Number : SelWoElem from MOS195MI
    		SelWoElemResponseCollection selWoElemResponseCollection = createJobService.sendMOS195MISelWoElem(mParam);
    		SelWoElemResponseItem selWoElemResponseItem = selWoElemResponseCollection.getSelWoElemResponseItem().get(0);

    		// Set Operation Number
    		mParam.put("OPNO", StringUtil.nullToVoid(StringUtil.getBigDecimal(selWoElemResponseItem.getOperationNumber())));    		
    		
    		// SendMOS104MI:LstOperElement
    		// Get Tech Id
    		LstOperElementResponseCollection lstOperElementResponseCollection = 
    				createJobService.sendMOS104MILstOperElement(mParam);
    		LstOperElementResponseItem lstOperElementResponseItem = 
    				lstOperElementResponseCollection.getLstOperElementResponseItem().get(0);
    		
    		createJobService.setMOS104MILstOperElementData(lstOperElementResponseItem, rParam);
    		// If serialNo is null or empty, put TAIL data into serialNo field
    		if(StringUtil.isEmptyString(StringUtil.nullToVoid(jobAsset.get("serialNo")))) {
    			jobAsset.put("serialNo", 
    					StringUtil.getString(selWoElemResponseItem.getRegistrationNumberSite()));
    		}
    		
    		// SendCOS100MI:GetMCOHead
    		GetMCOHeadResponseCollection getMCOHeadResponseCollection = 
    				createJobService.sendCOS100MIGetMCOHead(mParam);
    		GetMCOHeadResponseItem getMCOHeadResponseItem = getMCOHeadResponseCollection.getGetMCOHeadResponseItem().get(0);
    		
    		createJobService.setCOS100MIGetMCOHeadData(getMCOHeadResponseItem, rParam);
    		
    		// Get, set Cust Id
    		mParam.put("CUNO", 
    				StringUtil.nullToVoid(StringUtil.getString(getMCOHeadResponseItem.getCustomer())));	//Customer Number 
    		jobMap.put("custId", StringUtil.getString(getMCOHeadResponseItem.getCustomer()));
    		
    		// SendCRS610MI:GetAddress	
    		// get Address    		
    		GetAddressResponseCollection getAddressResponseCollection = 
			createJobService.sendCRS610MIGetAddress(mParam);
    		GetAddressResponseItem getAddressResponseItem = 
    				getAddressResponseCollection.getGetAddressResponseItem().get(0);
    		
    		createJobService.setCRS610MIGetAddressData(getAddressResponseItem, rParam);
    		
    		// SendMOS100MI:GetOp");	
    		// Get Start Date (STDT)    		
    		GetOpResponseCollection getOpResponseCollection = 
			createJobService.sendMOS100MIGetOp(mParam);
    		GetOpResponseItem getOpResponseItem = 
    				getOpResponseCollection.getGetOpResponseItem().get(0);
    		// Convert StartDate and Time
    		String startDate = DateUtil.getStringCalendar(getOpResponseItem.getStartDate());
    		BigDecimal startTimeDecimal = (BigDecimal)StringUtil.getBigDecimal(getOpResponseItem.getStartTime());
    		String startTimeStr = StringUtil.insertLeftChar(String.valueOf(startTimeDecimal), 4, '0');
			
    		jobMap.put("startDate", DateUtil.getXMLGregorianCalendar("yyyy-MM-dd HHmm", startDate + " " + startTimeStr));
    		
    		// Set Remained data for creating Job.    		
    		jobMap.put("jobId", mParam.get("MWNO"));	//
    		jobService.put("serviceOrderId", mParam.get("MWNO"));    		
    		jobMap.put("duration", String.valueOf(mParam.get("OPNO")));	//
    		
    		Job job = createJobService.setJobData(rParam, lu.getLogId());    
    		
    		// Insert createJob into DB	
    		HJob hJob = createJobService.insertCreateJob(job, lu.getLogId());
    		
    		if(hSmartLink != null) {
    			// update smartlink status
    			createJobService.updateSmartLink(hSmartLink, "True");
    		}
    		
    		// Refresh job status
    		lu.updateStates(mParam.get("MWNO"), "STA", "", "Refresh Job Status");
    		createJob(job, hJob, hSmartLink);
    	}
		catch(Exception e) {	
			e.printStackTrace();			
			lu.error("Errored in createJobFromM3 : " + ExceptionUtils.getStackTrace(e));
			lu.updateStates(mParam.get("MWNO"), "ERR", "M3C", "Errored in createJobFromM3");
			lu.error(String.valueOf(StringUtil.objToMap(mParam)));
			
			// Update SmartLink data
			try {
				if(hSmartLink != null) {
					createJobService.updateSmartLink(hSmartLink, "False");
				}
			}
			catch(Exception ee) {
				ee.printStackTrace();
			}
			
			// if this call is From reSmartLink, throw exception to the caller method 
			if(mParam.get("success") != null) {
				throw e;
			}
		}
    	
		
    }

    /**
     * - Insert Job data from M3
     * - Send a request to Retriever in order to create Job
     * - Insert the result of creating Job from Retriever
     * - Update the relevant data to DB
     * @param job
     * @throws Exception
     */
	public void createJob(Job job, HJob hJob, HSmartLink hSmartLink) {
		LogUtil lu = null;

		try {
			lu = LogManager.getInstance().getLogObj(hJob.getLogId());
		
			if(PingCheck.isAccessToRetriever()) {
				lu.info("Send createJob to Retriever");
				Result result = createJobService.sendCreateJob(job);
				lu.debug(String.valueOf(StringUtil.objToMap(result)));
				/*
				System.out.println(result.toString());
				System.out.println("Is Success: " + result.isSuccess());
				System.out.println("Tx Id: " + result.getTxId());
				System.out.println("Error Code: " + result.getErrorCode());
			    System.out.println("Error Msg: " + result.getErrorMsg());*/
			    
			    lu.debug("Insert the result of createJob");	
			    HResult hResult = createJobService.insertResult(result, hJob);
			    lu.debug(String.valueOf(StringUtil.objToMap(result)));
			    
			    lu.debug("Update the result of createJob");	
			    hJob = createJobService.updateCreatJob(hJob, hResult);
			    
			    // Update Log Master 
			    lu.updateStates(hSmartLink.getMWNO(), "FIN", "", "");
			    LogManager.getInstance().closeLogObj(hSmartLink.getLogId());
			}
			
			hJob = createJobService.updateCreateJobIndex(hJob);
		}
		catch(Exception e) {
			e.printStackTrace();
			lu.error("Errored in createJob : " + ExceptionUtils.getStackTrace(e));			
			lu.updateStates(job.getJobId(), "ERR", "RTC", "Errored in createJob");
			lu.error(String.valueOf(StringUtil.objToMap(hSmartLink)));
			lu.error(String.valueOf(StringUtil.objToMap(hJob)));
		}
	}
	
	//@Scheduled(fixedDelayString = "${createJob.reSmartLink.delaytime}")
	public void reSmartLink() throws Exception {
		LogUtil lu = null;
		String MWNO = "";	// For error log
		
		try {
			if(PingCheck.isAccessToM3()) {
				List<HSmartLink> hSmartLinkList = createJobService.selectSmartLink(slCount);
				for(HSmartLink hSmartLink : hSmartLinkList) {				
					System.out.println("---SmartLink--" + hSmartLink);
					
					// Re create log Object
					lu = LogManager.getInstance().getLogObj(category, hSmartLink.getLogId());
					
					lu.info("Retry to create SmartLink object");
					// Set SmartLink Data
			    	Map<String, String> map = new HashMap<String, String>();
			    	map.put("MWNO", hSmartLink.getMWNO());
			    	MWNO = hSmartLink.getMWNO();
			    	map.put("PRNO", hSmartLink.getPRNO());
			    	map.put("WHLO", hSmartLink.getWHLO());
			    	map.put("USID", hSmartLink.getUSID());
			    	map.put("Company", hSmartLink.getCONO());
			    	map.put("success", hSmartLink.getSuccess());
			    	map.put("logId", hSmartLink.getLogId());
			    	
			    	lu.debug("Recall createJobFromM3" + map.get("MWNO"));
			    	createJobFromM3(map);
			    	createJobService.updateSmartLink(hSmartLink, "True");
				}
			}
    	}
		catch(Exception e) {	
			e.printStackTrace();
			if(lu != null) {				
				lu.error("Errored in reSmartLink : " + ExceptionUtils.getStackTrace(e));
				lu.updateStates(MWNO, "ERR", "M3C", "Errored in reSmartLink");
			}
		}
	}
	
	//@Scheduled(fixedDelayString = "${createJob.reCreateJob.delaytime}")
	public void reCreateJob() throws Exception {
		LogUtil lu = null;
		String MWNO = "";	// For error log
		
		try {
			
			if(PingCheck.isAccessToRetriever()) {
				System.out.println("--" + createJobService);
				List<HJob> hJobList = createJobService.selectCreateJob(cjCount);
				for(HJob hJob : hJobList) {				
					System.out.println("---job--" + hJob);
					MWNO = hJob.getJobId();
					
					// Re create log Object
					lu = LogManager.getInstance().getLogObj(category, hJob.getLogId());
					
					lu.info("Send Re createJob to Retriever");
					// retry sending createJob 
					Result result = createJobService.reSendCreateJob(hJob);
					lu.debug(String.valueOf(StringUtil.objToMap(result)));
					
				    lu.debug("Insert the result of Re createJob");	
				    HResult hResult = createJobService.insertResult(result, hJob);
				    lu.debug(String.valueOf(StringUtil.objToMap(result)));
				    
				    lu.debug("Update the result of Re createJob");	
				    hJob = createJobService.updateCreatJob(hJob, hResult);
				    lu.updateStates(MWNO, "FIN", "", "");
				}
			}
    	}
		catch(Exception e) {	
			e.printStackTrace();
			System.out.println(e.getMessage());
			if(lu != null) {
				lu.error("Errored in reCreateJob : " + ExceptionUtils.getStackTrace(e));
				lu.updateStates(MWNO, "ERR", "RTC", "Errored in reCreateJob");
			}
		}
	}
	
    @RequestMapping(value="/createJob", method = RequestMethod.POST)    
	public @ResponseBody Job mockCreateJob(@RequestBody Map<Spring,Spring> params, HttpServletRequest request) throws Exception
	{   
    	Job job = new Job();
		LogUtil lu = null;
		
		try {
			lu = LogManager.getInstance().getLogObj(category);    	
	    	lu.info("Start CreateJob");	    	
	    	
	    	job.setJobId(String.valueOf(params.get("jobId")));
	    	job.setPhaseId(BigInteger.valueOf(1));
	    	job.setTechId(String.valueOf(params.get("techId")));
	    	job.setCustomerName(String.valueOf(params.get("customerName")));
	    	job.setAddress1(String.valueOf(params.get("address1")));
	    	job.setJobDesc(String.valueOf(params.get("jobDesc")));
	    	
	    	Date sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(String.valueOf(params.get("startDate")));
			GregorianCalendar c = new GregorianCalendar();
			c.setTime(sdf);
			XMLGregorianCalendar date1 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
			
			job.setStartDate(date1);
			job.setDuration("30");
			job.setJobType("Default");
			job.setPriority(new Boolean(false));
			
			lu.info(String.valueOf(StringUtil.objToMap(job)));
	    	
	    	//createJob(job, null);
    	}
		catch(Exception e) {
			lu.error(e.getMessage());
		}    	
    	
    	return job;
	}
		
}
