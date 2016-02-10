package com.integrationwizards.controller;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.swing.Spring;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.integrationwizards.common.Header;
import com.integrationwizards.common.LogManager;
import com.integrationwizards.common.LogUtil;
import com.integrationwizards.common.StringUtil;
import com.integrationwizards.model.HJob;
import com.integrationwizards.model.HResult;
import com.integrationwizards.service.CreateJobService;

import au.com.retriever.test.barking.Job;
import au.com.retriever.test.barking.Result;
import au.com.tmha.cos100mi.getmcohead.GetMCOHeadResponseCollection;
import au.com.tmha.cos100mi.getmcohead.GetMCOHeadResponseItem;
import au.com.tmha.crs610mi.getaddress.GetAddressResponseCollection;
import au.com.tmha.crs610mi.getaddress.GetAddressResponseItem;
import au.com.tmha.mos100mi.get.GetResponseCollection;
import au.com.tmha.mos100mi.get.GetResponseItem;
import au.com.tmha.mos100mi.getmtrl.GetMtrlResponseCollection;
import au.com.tmha.mos100mi.getmtrl.GetMtrlResponseItem;
import au.com.tmha.mos100mi.getop.GetOpResponseCollection;
import au.com.tmha.mos100mi.getop.GetOpResponseItem;
import au.com.tmha.mos104mi.lstoperelement.LstOperElementResponseCollection;
import au.com.tmha.mos104mi.lstoperelement.LstOperElementResponseItem;

@Controller
public class CreateJobController {
	@Autowired
	private CreateJobService createJobService;
	@Autowired
	private Header header;
	private final String category = "createJob";
	
	
    @RequestMapping(value="/parameters", 
    		params = {"p1", "p2", "p3", "p4", "p5"}, method = RequestMethod.GET)    
	public Job createJob(
			@RequestParam(value = "p1") String MWNO, 	// WO number
			@RequestParam(value = "p2") String PRNO, 	// Product/Asset
			@RequestParam(value = "p3") String WHLO, 	// Warehouse
			@RequestParam(value = "p4") String USID, 	// User Id
			@RequestParam(value = "p5") String Company) throws Exception
	{   
    	
    	System.out.println("MWNO : " + MWNO);
    	System.out.println("PRNO : " + PRNO);
    	System.out.println("WHLO : " + WHLO);
    	System.out.println("USID : " + USID);
    	System.out.println("Company : " + Company);
    	
    	Map<String, String> map = new HashMap<String, String>();
    	map.put("MWNO", MWNO);
    	map.put("PRNO", PRNO);
    	map.put("WHLO", WHLO);
    	map.put("USID", USID);
    	map.put("Company", Company);
    	
    	createJobFromM3(map);
    	
    	return null;
	}   
    
    public void createJobFromM3(Map<String, String> mParam) {
    	LogUtil lu = null;
    	
    	try {
			lu = LogManager.getInstance().getLogObj(category);    	
	    	lu.writeLog("Start createJobFromM3");	    	
    		// Create Parameter Map Object
    		Map<String, Map<String, Object>> rParam = new HashMap<String, Map<String, Object>>();
    		Map<String, Object> jobMap = new HashMap<String, Object>();
    		rParam.put("job", jobMap);
    		rParam.put("asset", new HashMap<String, Object>());
    		rParam.put("service", new HashMap<String, Object>());
    		
    		lu.writeLog("Start sendMOS100MI:Get");	    
    		// Get from MOS100MI
    		GetResponseCollection getResponseCollection = createJobService.sendMOS100MIGet(header.getMOS100MIPort(), mParam);
    		GetResponseItem getResponseItem = getResponseCollection.getGetResponseItem().get(0);
    		
    		createJobService.setMOS100MIDataGet(getResponseItem, rParam);
    		
    		mParam.put("ADID", 
    				StringUtil.nullToVoid(StringUtil.getString(getResponseItem.getAddressNumber())));	//AddressNumber : ADID
    		mParam.put("ADRT", 
    				StringUtil.nullToVoid(StringUtil.getBigDecimal(getResponseItem.getAddressType())));	//AddressType : ADRT
    		mParam.put("RORN", 	// Reference Order Number
    				String.valueOf(StringUtil.getBigDecimal(getResponseItem.getReferenceOrderNumber()))); 
    		
    		lu.writeLog("Start sendMOS100MI:GetMtrl");	
    		// Get Operation Number : GetMtrl from MOS100MI
    		GetMtrlResponseCollection getMtrlResponseCollection = createJobService.sendMOS100MIGetMtrl(header.getMOS100MIPort(), mParam);
    		GetMtrlResponseItem getMtrlResponseItem = getMtrlResponseCollection.getGetMtrlResponseItem().get(0);
    		
    		// Set Operation Number
    		mParam.put("OPNO", StringUtil.nullToVoid(StringUtil.getBigDecimal(getMtrlResponseItem.getOperationNumber())));

    		lu.writeLog("Start sendMOS104MI:LstOperElement");	
    		// Get Tech Id
    		LstOperElementResponseCollection lstOperElementResponseCollection = 
    				createJobService.sendMOS104MILstOperElement(header.getMOS104MIPort(), mParam);
    		LstOperElementResponseItem lstOperElementResponseItem = lstOperElementResponseCollection.getLstOperElementResponseItem().get(0);
    		
    		createJobService.setMOS104MILstOperElementData(lstOperElementResponseItem, rParam);    		    		
    		
    		lu.writeLog("Start sendCOS100MI:GetMCOHead");	
    		GetMCOHeadResponseCollection getMCOHeadResponseCollection = 
    				createJobService.sendCOS100MIGetMCOHead(header.getCOS100MIPort(), mParam);
    		GetMCOHeadResponseItem getMCOHeadResponseItem = getMCOHeadResponseCollection.getGetMCOHeadResponseItem().get(0);
    		
    		createJobService.setCOS100MIGetMCOHeadData(getMCOHeadResponseItem, rParam);
    		
    		// Set Cust Id
    		mParam.put("CUNO", 
    				StringUtil.nullToVoid(StringUtil.getString(getMCOHeadResponseItem.getCustomer())));	//Customer Number 
    		jobMap.put("custId", StringUtil.getString(getMCOHeadResponseItem.getCustomer()));
    		
    		lu.writeLog("Start sendCRS610MI:GetAddress");	
    		// get Address    		
    		GetAddressResponseCollection getAddressResponseCollection = 
			createJobService.sendCRS610MIGetAddress(header.getCRS610MIPort(), mParam);
    		GetAddressResponseItem getAddressResponseItem = 
    				getAddressResponseCollection.getGetAddressResponseItem().get(0);
    		
    		createJobService.setCRS610MIGetAddressData(getAddressResponseItem, rParam);
    		
    		lu.writeLog("Start sendMOS100MI:GetOp");	
    		// Get Start Date (STDT)    		
    		GetOpResponseCollection getOpResponseCollection = 
			createJobService.sendMOS100MIGetOp(header.getMOS100MIPort(), mParam);
    		GetOpResponseItem getOpResponseItem = 
    				getOpResponseCollection.getGetOpResponseItem().get(0);
    		XMLGregorianCalendar startDate = (XMLGregorianCalendar)StringUtil.getCalendar(getOpResponseItem.getStartDate());
    		BigDecimal startTime = (BigDecimal)StringUtil.getBigDecimal(getOpResponseItem.getStartTime());
    		jobMap.put("startDate", startDate);
    		
    		// Set Remain data for creating Job.
    		
    		jobMap.put("jobId", mParam.get("MWNO"));	//
    		
    		// Get Duration
    		Date start = ((XMLGregorianCalendar)jobMap.get("plannedStart")).toGregorianCalendar().getTime();
    		Date end = ((XMLGregorianCalendar)jobMap.get("plannedEnd")).toGregorianCalendar().getTime();
    		long diff = end.getTime() - start.getTime();
    		long minutes = diff / (60 * 1000) % 60;
    		
    		jobMap.put("duration", String.valueOf(minutes));	//
    		
    		System.out.println("--" + jobMap);
    		
    		Job job = createJobService.setJobData(rParam);    		
    		createJob(job);
    	}
		catch(Exception e) {	
			e.printStackTrace();
			System.out.println(e.getMessage());
			lu.writeLog(e.getMessage());
		}
		finally {
		}  
    }

    /**
     * 
     * @param job
     * @throws Exception
     */
	public void createJob(Job job) throws Exception {
		LogUtil lu = LogManager.getInstance().getLogObj(category);
		
		lu.writeLog("Start inserting createJob");		
		HJob hJob = createJobService.insertCreateJob(job);
		lu.writeLog("Finish inserting createJob");
		
		lu.writeLog("Send createJob to Retriever");
		Result result = createJobService.sendCreateJob(header.getRetrieverBarking(), job);
		lu.writeLog("Receive createJob from Retriever");
		lu.writeLog(LogUtil.objToMap(result));
		
		System.out.println(result.toString());
		System.out.println("Is Success: " + result.isSuccess());
		System.out.println("Tx Id: " + result.getTxId());
		System.out.println("Error Code: " + result.getErrorCode());
	    System.out.println("Error Msg: " + result.getErrorMsg());
	    
	    lu.writeLog("Start inserting the result of createJob");	
	    HResult hResult = createJobService.insertResult(result, hJob);
	    lu.writeLog("Finish inserting the result of createJob");
	    lu.writeLog(LogUtil.objToMap(result));
	    
	    lu.writeLog("Start updating the result of createJob");	
	    hJob = createJobService.updateCreatJob(hJob, hResult);
	    lu.writeLog("Finish updating the result of createJob");
	}	
	
    @RequestMapping(value="/createJob", method = RequestMethod.POST)    
	public @ResponseBody Job mockCreateJob(@RequestBody Map<Spring,Spring> params, HttpServletRequest request) throws Exception
	{   
    	Job job = new Job();
		LogUtil lu = null;
		
		try {
			lu = LogManager.getInstance().getLogObj(category);    	
	    	lu.writeLog("Start CreateJob");	    	
	    	
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
			
			lu.writeLog(LogUtil.objToMap(job));
	    	
	    	createJob(job);
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
		
}
