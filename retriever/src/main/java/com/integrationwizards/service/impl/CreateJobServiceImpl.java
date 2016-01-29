package com.integrationwizards.service.impl;

import java.util.Map;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.integrationwizards.dao.CreateJobDao;
import com.integrationwizards.model.HJob;
import com.integrationwizards.model.HResult;
import com.integrationwizards.service.CreateJobService;

import au.com.retriever.test.barking.Job;
import au.com.retriever.test.barking.Result;
import au.com.retriever.test.barking.RetrieverBarking;

@Service
public class CreateJobServiceImpl implements CreateJobService {
	private CreateJobDao createJobDao;
	
	public void setCreateJobDao(CreateJobDao createJobDao) {
		this.createJobDao = createJobDao;
	}	
	
	@Transactional
	public HJob insertCreateJob(Job job) throws Exception {		
		ObjectMapper m = new ObjectMapper();
		Map<String,Object> props = m.convertValue(job, Map.class);
		HJob hJob = m.convertValue(props, HJob.class);
		
		createJobDao.insertCreateJob(hJob);
		
		return hJob;
	}
	
	public Result sendCreateJob(RetrieverBarking changeStudentDetailsImplPort, Job job) {
		return changeStudentDetailsImplPort.createJob(job);
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
	
}
