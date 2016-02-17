package com.integrationwizards.controller;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.swing.Spring;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
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
import com.integrationwizards.model.HJobAsset;
import com.integrationwizards.model.HJobService;
import com.integrationwizards.model.HResult;
import com.integrationwizards.model.HSmartLink;
import com.integrationwizards.service.CreateJobService;

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
	@Autowired
	private Header header;
	private final String category = "createJob";
	
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
	public Job getSmartLink(
			@RequestParam(value = "p1") String MWNO, 	// WO number
			@RequestParam(value = "p2") String PRNO, 	// Product/Asset
			@RequestParam(value = "p3") String WHLO, 	// Warehouse
			@RequestParam(value = "p4") String USID, 	// User Id
			@RequestParam(value = "p5") String Company)
	{   
    	LogUtil lu = null;
    	try {
    		lu = LogManager.getInstance().getLogObj(category);  
    		lu.info("Receive SmartLink From M3 : " + MWNO);
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
	    	
	    	lu.info("Call M3 Web Service API");
	    	createJobFromM3(map);
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    		lu.severe("Error Occurred getSmartLink : " + e.getMessage());
    		LogManager.getInstance().closeFile(category);
    	}
    	
    	return null;
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
    public void createJobFromM3(Map<String, String> mParam) {
    	LogUtil lu = null;
    	HSmartLink hSmartLink = null;
    	
    	try {
			lu = LogManager.getInstance().getLogObj(category);    	
	    	lu.info("Start createJobFromM3 : " + mParam);
	    	mParam.put("logId", lu.getAbbrFilePath());
	    		    	
	    	hSmartLink = createJobService.insertSmartLink(mParam);
	    	
    		// Create Parameter Map Object
    		Map<String, Map<String, Object>> rParam = new HashMap<String, Map<String, Object>>();
    		Map<String, Object> jobMap = new HashMap<String, Object>();
    		rParam.put("job", jobMap);
    		Map<String, Object> jobAsset = new HashMap<String, Object>();
    		rParam.put("asset", jobAsset);
    		Map<String, Object> jobService = new HashMap<String, Object>();
    		rParam.put("service", jobService);
    		
    		lu.info("Start sendMOS100MI:Get");	    
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
    		
    		lu.info("Start sendMOS100MI:GetMtrl");	

    		//GetMtrlResponseCollection getMtrlResponseCollection = createJobService.sendMOS100MIGetMtrl(header.getMOS100MIPort(), mParam);
    		//GetMtrlResponseItem getMtrlResponseItem = getMtrlResponseCollection.getGetMtrlResponseItem().get(0);
    		
    		// Get Operation Number : SelWoElem from MOS195MI
    		SelWoElemResponseCollection selWoElemResponseCollection = createJobService.sendMOS195MISelWoElem(header.getMOS195MIPort(), mParam);
    		SelWoElemResponseItem selWoElemResponseItem = selWoElemResponseCollection.getSelWoElemResponseItem().get(0);

    		// Set Operation Number
    		mParam.put("OPNO", StringUtil.nullToVoid(StringUtil.getBigDecimal(selWoElemResponseItem.getOperationNumber())));    		
    		
    		lu.info("Start sendMOS104MI:LstOperElement");	
    		// Get Tech Id
    		LstOperElementResponseCollection lstOperElementResponseCollection = 
    				createJobService.sendMOS104MILstOperElement(header.getMOS104MIPort(), mParam);
    		LstOperElementResponseItem lstOperElementResponseItem = lstOperElementResponseCollection.getLstOperElementResponseItem().get(0);
    		
    		createJobService.setMOS104MILstOperElementData(lstOperElementResponseItem, rParam);
    		// If serialNo is null or empty, put TAIL data into serialNo field
    		if(StringUtil.isEmptyString(StringUtil.nullToVoid(jobAsset.get("serialNo")))) {
    			jobAsset.put("serialNo", 
    					StringUtil.getString(selWoElemResponseItem.getRegistrationNumberSite()));
    		}
    		
    		lu.info("Start sendCOS100MI:GetMCOHead");	
    		GetMCOHeadResponseCollection getMCOHeadResponseCollection = 
    				createJobService.sendCOS100MIGetMCOHead(header.getCOS100MIPort(), mParam);
    		GetMCOHeadResponseItem getMCOHeadResponseItem = getMCOHeadResponseCollection.getGetMCOHeadResponseItem().get(0);
    		
    		createJobService.setCOS100MIGetMCOHeadData(getMCOHeadResponseItem, rParam);
    		
    		// Set Cust Id
    		mParam.put("CUNO", 
    				StringUtil.nullToVoid(StringUtil.getString(getMCOHeadResponseItem.getCustomer())));	//Customer Number 
    		jobMap.put("custId", StringUtil.getString(getMCOHeadResponseItem.getCustomer()));
    		
    		lu.info("Start sendCRS610MI:GetAddress");	
    		// get Address    		
    		GetAddressResponseCollection getAddressResponseCollection = 
			createJobService.sendCRS610MIGetAddress(header.getCRS610MIPort(), mParam);
    		GetAddressResponseItem getAddressResponseItem = 
    				getAddressResponseCollection.getGetAddressResponseItem().get(0);
    		
    		createJobService.setCRS610MIGetAddressData(getAddressResponseItem, rParam);
    		
    		lu.info("Start sendMOS100MI:GetOp");	
    		// Get Start Date (STDT)    		
    		GetOpResponseCollection getOpResponseCollection = 
			createJobService.sendMOS100MIGetOp(header.getMOS100MIPort(), mParam);
    		GetOpResponseItem getOpResponseItem = 
    				getOpResponseCollection.getGetOpResponseItem().get(0);
    		String startDate = StringUtil.getStringCalendar(getOpResponseItem.getStartDate());
    		BigDecimal startTimeDecimal = (BigDecimal)StringUtil.getBigDecimal(getOpResponseItem.getStartTime());
    		String startTimeStr = StringUtil.insertLeftChar(String.valueOf(startTimeDecimal), 4, '0');
			
    		jobMap.put("startDate", StringUtil.getXMLGregorianCalendar("yyyy-MM-dd HHmm", startDate + " " + startTimeStr));
    		System.out.println("----startDateTime2---" + jobMap.get("startDate"));
    		
    		// Set Remain data for creating Job.    		
    		jobMap.put("jobId", mParam.get("MWNO"));	//
    		jobService.put("serviceOrderId", mParam.get("MWNO"));
    		
    		// Caculate Duration
    		Date start = ((XMLGregorianCalendar)jobMap.get("plannedStart")).toGregorianCalendar().getTime();
    		Date end = ((XMLGregorianCalendar)jobMap.get("plannedEnd")).toGregorianCalendar().getTime();
    		
    		System.out.println("----startDateTime1---" + start.getTime() + " " + end.getTime());
    		long diff = end.getTime() - start.getTime();
    		long minutes = diff / (60 * 1000);
    		System.out.println(minutes + "--minutes--diff---" + diff);
    		
    		jobMap.put("duration", String.valueOf(minutes));	//
    		
    		Job job = createJobService.setJobData(rParam);    
    		createJob(job, hSmartLink);
    	}
		catch(Exception e) {	
			e.printStackTrace();
			lu.severe("Error in createJobFromM3 : " + e.getMessage());
			
			// Update SmartLink data
			try {
				if(hSmartLink != null) {
					createJobService.updateSmartLink(hSmartLink, "False");
				}
			}
			catch(Exception ee) {
				ee.printStackTrace();
			}
			finally {
				LogManager.getInstance().closeFile(category);
			}
		}
    	
		LogManager.getInstance().removeFile(category);
    }

    /**
     * - Insert Job data from M3
     * - Send a request to Retriever in order to create Job
     * - Insert the result of creating Job from Retriever
     * - Update the relevant data to DB
     * @param job
     * @throws Exception
     */
	public void createJob(Job job, HSmartLink hSmartLink) throws Exception {
		LogUtil lu = LogManager.getInstance().getLogObj(category);
		
		lu.info("Start inserting createJob into DB");		
		HJob hJob = createJobService.insertCreateJob(job, lu.getAbbrFilePath());
		lu.info("Finish inserting createJob into DB");
		
		if(hSmartLink != null) {
			createJobService.updateSmartLink(hSmartLink, "True");
		}
		
		if(header.isAccessToRetriever()) {
			lu.info("Send createJob to Retriever");
			Result result = createJobService.sendCreateJob(header.getRetrieverBarking(), job);
			lu.info("Receive createJob from Retriever");
			lu.info(StringUtil.objToMap(result));
			
			System.out.println(result.toString());
			System.out.println("Is Success: " + result.isSuccess());
			System.out.println("Tx Id: " + result.getTxId());
			System.out.println("Error Code: " + result.getErrorCode());
		    System.out.println("Error Msg: " + result.getErrorMsg());
		    
		    lu.info("Start inserting the result of createJob");	
		    HResult hResult = createJobService.insertResult(result, hJob);
		    lu.info("Finish inserting the result of createJob");
		    lu.info(StringUtil.objToMap(result));
		    
		    lu.info("Start updating the result of createJob");	
		    hJob = createJobService.updateCreatJob(hJob, hResult);
		    lu.info("Finish updating the result of createJob");
		}
		
		hJob = createJobService.updateCreateJobIndex(hJob);
	}
	
	@Scheduled(fixedDelay = 20000)
	private void reSmartLink() throws Exception {
		LogUtil lu = null;
		
		try {
			if(header.isAccessToM3()) {
				List<HSmartLink> hSmartLinkList = createJobService.selectSmartLink();
				for(HSmartLink hSmartLink : hSmartLinkList) {				
					System.out.println("---SmartLink--" + hSmartLink);
					
					// Re create log Object
					lu = LogManager.getInstance().getLogObjById(category, hSmartLink.getLogId());
					
			    	Map<String, String> map = new HashMap<String, String>();
			    	map.put("MWNO", hSmartLink.getMWNO());
			    	map.put("PRNO", hSmartLink.getPRNO());
			    	map.put("WHLO", hSmartLink.getWHLO());
			    	map.put("USID", hSmartLink.getUSID());
			    	map.put("Company", hSmartLink.getCONO());
			    	map.put("success", hSmartLink.getSuccess());
			    	
			    	createJobFromM3(map);
			    	createJobService.updateSmartLink(hSmartLink, "True");
				}
			}
		
    	}
		catch(Exception e) {	
			e.printStackTrace();
			if(lu != null) {
				lu.severe("Error in reSmartLink : " + e.getMessage());
				LogManager.getInstance().closeFile(category);
			}
		}
		
		LogManager.getInstance().removeFile(category);
	}
	
	@Scheduled(fixedDelay = 20000)
	private void reCreateJob() throws Exception {
		LogUtil lu = null;
		
		try {
			lu = LogManager.getInstance().getLogObj(category);
			
			if(header.isAccessToRetriever()) {
				List<HJob> hJobList = createJobService.selectCreateJob();
				for(HJob hJob : hJobList) {				
					System.out.println("---job--" + hJob);
					
					// Re create log Object
					lu = LogManager.getInstance().getLogObjById(category, hJob.getLogId());
					
					Set<HJobAsset> jobAssetSet = hJob.getAssets();
					
					if(jobAssetSet != null) {
						for(HJobAsset hJobAsset : jobAssetSet) {
							System.out.println("--asset--" + hJobAsset);
						}
					}
					
					Set<HJobService> jobServiceSet = hJob.getServices();
					
					if(jobServiceSet != null) {
						for(HJobService hJobService : jobServiceSet) {
							System.out.println("--service--" + hJobService);
						}
					}
					
					lu.info("Send Re createJob to Retriever");
					// retry sending createJob 
					Result result = createJobService.reSendCreateJob(header.getRetrieverBarking(), hJob);
					lu.info("Receive Re createJob from Retriever");
					lu.info(StringUtil.objToMap(result));
					
				    lu.info("Start inserting the result of Re createJob");	
				    HResult hResult = createJobService.insertResult(result, hJob);
				    lu.info("Finish inserting the result of Re createJob");
				    lu.info(StringUtil.objToMap(result));
				    
				    lu.info("Start updating the result of Re createJob");	
				    hJob = createJobService.updateCreatJob(hJob, hResult);
				    lu.info("Finish updating the result of Re createJob");
				}
			}
		
    	}
		catch(Exception e) {	
			e.printStackTrace();
			System.out.println(e.getMessage());
			if(lu != null) {
				lu.severe("Error in reCreateJob : " + e.getMessage());
				LogManager.getInstance().closeFile(category);
			}
		}
		
		LogManager.getInstance().removeFile(category);
		 
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
			
			lu.info(StringUtil.objToMap(job));
	    	
	    	createJob(job, null);
    	}
		catch(Exception e) {
			lu.severe(e.getMessage());
		}
		finally {
			lu.removeFile();
			LogManager.getInstance().closeLogObj(category);
		}    	
    	
    	return job;
	}
		
}
