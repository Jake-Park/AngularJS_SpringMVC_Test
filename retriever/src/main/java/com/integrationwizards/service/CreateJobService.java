package com.integrationwizards.service;

import com.integrationwizards.model.HJob;
import com.integrationwizards.model.HResult;

import au.com.retriever.test.barking.Job;
import au.com.retriever.test.barking.Result;
import au.com.retriever.test.barking.RetrieverBarking;

public interface CreateJobService {
	public HJob insertCreateJob(Job job) throws Exception;
	public Result sendCreateJob(RetrieverBarking changeStudentDetailsImplPort, Job job) throws Exception;
	public HResult insertResult(Result result, HJob hJob) throws Exception;
}
