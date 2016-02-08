package com.integrationwizards.controller;

import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
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
import com.integrationwizards.model.HJob;
import com.integrationwizards.model.HResult;
import com.integrationwizards.service.CreateJobService;

import au.com.retriever.test.barking.Job;
import au.com.retriever.test.barking.Result;

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
			@RequestParam(value = "p1") String WWMWNO, 	// WO number
			@RequestParam(value = "p2") String WWPRNO, 	// Product/Asset
			@RequestParam(value = "p3") String QHWHLO, 	// Warehouse
			@RequestParam(value = "p4") String USID, 	// User Id
			@RequestParam(value = "p5") String Company) throws Exception
	{   
    	
    	System.out.println("WWMWNO : " + WWMWNO);
    	System.out.println("WWPRNO : " + WWPRNO);
    	System.out.println("QHWHLO : " + QHWHLO);
    	System.out.println("USID : " + USID);
    	System.out.println("Company : " + Company);
    	
    	return null;
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
}
