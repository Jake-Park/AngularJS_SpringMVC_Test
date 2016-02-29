package com.integrationwizards.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.integrationwizards.admin.model.CodeInfo;
import com.integrationwizards.admin.service.CodeService;

@Controller
@RequestMapping(value="/code")
public class CodeController {
	@Autowired
	private CodeService codeService;
	/**
	 * Get Code list
	 */	
    @RequestMapping(value="/all", method = RequestMethod.GET)
	public @ResponseBody List<CodeInfo> selectAllCode() throws Exception
	{    	
	   	return codeService.selectAllCode();
	}   
}
