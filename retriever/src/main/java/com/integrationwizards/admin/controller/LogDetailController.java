package com.integrationwizards.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.integrationwizards.admin.model.PageVO;
import com.integrationwizards.admin.service.LogDetailService;
import com.integrationwizards.model.LogDetail;

@Controller
@RequestMapping("/logDetail")
public class LogDetailController {
	@Autowired
	private LogDetailService logDetailService;
	
	/**
	 * Get  list
	 */	
    @RequestMapping(value="/list", method = RequestMethod.POST)
	public @ResponseBody List<LogDetail> selectLogDetailList(@RequestBody PageVO pageVO) throws Exception
	{    	
    	// Set Pagination Data
    	int startIndex = ((pageVO.getPageIndex() - 1) * pageVO.getRecordCountPerPage());
    	pageVO.setFirstIndex(startIndex);
    	pageVO.setLastIndex(pageVO.getRecordCountPerPage());
    	
    	System.out.println("---" + pageVO);
    	
		List<LogDetail> resultList = logDetailService.selectLogDetailList(pageVO);  
	       
	   	return resultList;
	}   
    
	/**
	 * Get Total
	 */	
    @RequestMapping(value="/listCount", method = RequestMethod.POST)
	public @ResponseBody int getLogDetailListCnt(@RequestBody PageVO pageVO) throws Exception
	{	       
	   	return logDetailService.getLogDetailListCnt(pageVO);
	}
}
