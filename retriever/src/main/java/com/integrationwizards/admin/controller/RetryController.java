package com.integrationwizards.admin.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.integrationwizards.admin.model.PageVO;
import com.integrationwizards.admin.service.RetryService;
import com.integrationwizards.model.LogMaster;

@Controller
@RequestMapping("/retry")
public class RetryController {
	@Autowired
	private RetryService retryService;
	
	/**
	 * Get Retry list
	 */	
    @RequestMapping(value="/list", method = RequestMethod.POST)
	public @ResponseBody List<LogMaster> selectRetryList(@RequestBody PageVO pageVO) throws Exception
	{
    	System.out.println("---" + pageVO);
    	// Set Pagination Data
    	int startIndex = ((pageVO.getPageIndex() - 1) * pageVO.getRecordCountPerPage());
    	pageVO.setFirstIndex(startIndex);
    	pageVO.setLastIndex(pageVO.getRecordCountPerPage());
    	
		List<LogMaster> resultList = retryService.selectRetryList(pageVO);  
	       
	   	return resultList;
	}   
    
	/**
	 * Get Total
	 */	
    @RequestMapping(value="/listCount", method = RequestMethod.POST)
	public @ResponseBody int getRetryListCnt(@RequestBody PageVO pageVO) throws Exception
	{	       
	   	return retryService.getRetryListCnt(pageVO);
	}
    
	/**
	 * Retry Job
	 */	
    @RequestMapping(value="/retryJob", method = RequestMethod.POST)
	public @ResponseBody boolean retryJob(@RequestBody Map<String, String> param) throws Exception
	{	       
	   	return retryService.retryJob(param);
	}
    
	/**
	 * Finish Job
	 */	
    @RequestMapping(value="/finishJob", method = RequestMethod.POST)
	public @ResponseBody boolean finishJob(@RequestBody Map<String, String> param) throws Exception
	{	       
	   	return retryService.finishJob(param);
	}    
}
