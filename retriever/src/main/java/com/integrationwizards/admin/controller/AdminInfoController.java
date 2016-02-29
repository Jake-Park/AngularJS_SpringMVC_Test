package com.integrationwizards.admin.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.integrationwizards.admin.model.AdminInfo;
import com.integrationwizards.admin.model.PageVO;
import com.integrationwizards.admin.service.AdminInfoService;
import com.integrationwizards.admin.util.AdminCommon;
import com.integrationwizards.util.StringUtil;

@Controller
@RequestMapping("/admin")
public class AdminInfoController {
	@Autowired
	private AdminInfoService adminInfoService;
	@Autowired
	private AdminCommon adminCommon;
	
	/**
	 *  Login Info Check
	 */	
    @RequestMapping(value="/login", method = RequestMethod.POST)    
	public @ResponseBody AdminInfo loginForm(@RequestBody AdminInfo adminInfo, Model model, HttpServletRequest request) throws Exception
	{   //
    	String strPassword = adminInfo.getPassword();//EncryptUtils.toSHA256(    	
    	/*adminInfo = adminInfoService.selectAdminInfoByEmail(adminInfo);
    	
    	if(adminInfo != null) {
    		int loginFailCount = StringUtil.nullToInteger(adminInfo.getLoginFailCount());  

			adminInfo.setPassword(strPassword);
			String email = adminInfo.getEmail();
			adminInfo = adminInfoService.selectAdminInfo(adminInfo);
			
    		if(adminInfo == null) {
        		adminInfoService.updateLoginFail(email);
        		loginFailCount += 1;
        		
    			model.addAttribute("result", "Fail");
    			model.addAttribute("failCount", loginFailCount);
    			
        		return null;
        	}
        	else {
        		adminInfoService.updateLoginSuccess(adminInfo);
        		request.getSession().setAttribute(AdminCommon.ADMIN_KEY, adminInfo);

        		model.addAttribute("id", adminInfo.getId());
        		return adminInfo;
        	}

    	}
    	else {
    		model.addAttribute("result", "noneUser");
    	}*/    	
    	
    	return adminInfo;
	}
    
    /**
	 *  Logout
	 */	
    @RequestMapping(value="/logout", method=RequestMethod.GET)
	public String logout(@ModelAttribute("adminInfo") AdminInfo adminInfo, HttpServletRequest request) throws Exception
	{
    	request.getSession().setAttribute(AdminCommon.ADMIN_KEY, null);
    	request.getSession().invalidate();
    	return "redirect:/admin/login"; 
	}    
    
    /**
	 * Get Register Form
	 */	
    @RequestMapping(value="/adminInfoReg", method=RequestMethod.GET)
	public String adminInfoForm(AdminInfo adminInfo, Model model) throws Exception
	{
    	model.addAttribute("command", "I");
    	
    	return "/adminInfo/adminInfoReg"; 
	}  
    
    /**
 	 * insert,update Member Info
 	 */	
    @RequestMapping(value="/add/{command}/{id}", method = RequestMethod.POST)    
 	public @ResponseBody boolean insertAdminInfo(@RequestBody AdminInfo adminInfo, @PathVariable String command, @PathVariable String id, BindingResult result) throws Exception	
 	{ 
    	boolean retBool = true;
 	    //adminInfo.setEmail(adminCommon.getAdminEmail(request));
 	    adminInfo.setPassword(adminInfo.getPassword());//EncryptUtils.toSHA256(
 	    
 	    try {
	 	   		
	 	   	if("Add".equals(StringUtil.nullToEmpty(command))) { 	   		
	 	   		adminInfoService.insertAdminInfo(adminInfo);
	 	   	}
	     	else if ("Edit".equals(StringUtil.nullToEmpty(command))) {
	     		adminInfo.setId(StringUtil.nullToEmpty(id));
	     		adminInfoService.updateAdminInfo(adminInfo);
	     	}
 	    }
 	    catch(Exception e) {
 	    	retBool = false;
 	    	throw e;
 	    }
 	   	
 	   	return retBool;//"redirect:/adminInfo/adminInfoList";
 	}  
    
	/**
	 * Get member list
	 */	
    @RequestMapping(value="/adminInfoList")
	public @ResponseBody List<AdminInfo> adminInfoList(PageVO pageVO, HttpServletRequest request, HttpServletResponse response, Model model) throws Exception
	{
    	// Set Pagination Data
    	int startIndex = ((pageVO.getPageIndex() - 1) * pageVO.getPageUnit());
    	pageVO.setFirstIndex(startIndex);
    	pageVO.setLastIndex(startIndex +  pageVO.getPageUnit());
    	
		List<AdminInfo> resultList = adminInfoService.selectAdminInfoList(pageVO);  
	       
	   	return resultList;
	}   
    
	/**
	 * Get member list
	 */	
    @RequestMapping(value="/adminInfoTotal")
	public @ResponseBody int getAdminInfoTotal(PageVO pageVO, HttpServletRequest request, HttpServletResponse response, Model model) throws Exception
	{	       
	   	return adminInfoService.selectAdminInfoListCnt(pageVO);
	}
  
	/**
	 * get Member Info by id
	 */	
  	@RequestMapping(value="/adminInfoView/{id}", method = RequestMethod.GET)
	public @ResponseBody AdminInfo selectAdminInfoById(@PathVariable String id, Model model) throws Exception
	{        	    	
  		AdminInfo adminInfo = new AdminInfo(); 
	 	adminInfo.setId(StringUtil.nullToEmpty(id));
	 	adminInfo = adminInfoService.selectAdminInfoById(adminInfo);	 	
	 	
	 	return adminInfo; 
	}     
  	
    /**
	 *  Delete member info
	 */
    @RequestMapping(value="/deleteAdminInfo/{id}", method = RequestMethod.GET)
	public @ResponseBody boolean deleteAdminInfo(@PathVariable String id, Model model) throws Exception
	{    
    	boolean retBool = true;
    	
    	try {
    		AdminInfo adminInfo = new AdminInfo();
    		adminInfo.setId(StringUtil.nullToEmpty(id));
    		adminInfoService.deleteAdminInfo(adminInfo);
    	}
    	catch(Exception e) {
    		retBool = false;
    		e.printStackTrace();
    		throw e;
    	}
       	
    	return retBool;
	}    	
}
