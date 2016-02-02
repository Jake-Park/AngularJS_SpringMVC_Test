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
import org.springframework.web.bind.annotation.ResponseBody;

import com.integrationwizards.common.Header;
import com.integrationwizards.model.HJob;
import com.integrationwizards.model.HResult;
import com.integrationwizards.model.MessagesIndex;
import com.integrationwizards.service.CreateJobService;

import au.com.retriever.test.barking.Job;
import au.com.retriever.test.barking.Result;

@Controller
public class CreateJobController {
	@Autowired
	private CreateJobService createJobService;
	@Autowired
	private Header header;
	
    @RequestMapping(value="/createJob", method = RequestMethod.POST)    
	public @ResponseBody Job mockCreateJob(@RequestBody Map<Spring,Spring> params, HttpServletRequest request) throws Exception
	{       	
    	Job job = new Job();
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
		
    	System.out.println(job.toString());
    	
    	createJob(job);
    	
    	return job;
	}
	
	public void createJob(Job job) throws Exception {
		HJob hJob = createJobService.insertCreateJob(job);
		
		Result result = createJobService.sendCreateJob(header.getRetrieverBarking(), job);
		
		System.out.println(result.toString());
		System.out.println("Is Success: " + result.isSuccess());
		System.out.println("Tx Id: " + result.getTxId());
		System.out.println("Error Code: " + result.getErrorCode());
	    System.out.println("Error Msg: " + result.getErrorMsg());
	    
	    HResult hResult = createJobService.insertResult(result, hJob);
	    hJob = createJobService.updateCreatJob(hJob, hResult);
	}	
}
