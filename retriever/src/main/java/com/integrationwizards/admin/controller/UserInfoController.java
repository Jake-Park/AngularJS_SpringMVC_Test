package com.integrationwizards.admin.controller;

import java.util.Date;
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

import com.integrationwizards.admin.model.PageVO;
import com.integrationwizards.admin.model.UserInfo;
import com.integrationwizards.admin.service.UserInfoService;
import com.integrationwizards.admin.util.AdminCommon;
import com.integrationwizards.util.StringUtil;

@Controller
@RequestMapping("/user")
public class UserInfoController {
	@Autowired
	private UserInfoService userInfoService;
	@Autowired
	private AdminCommon adminCommon;
	
	/**
	 *  Login Info Check
	 */	
    @RequestMapping(value="/login", method = RequestMethod.POST)    
	public @ResponseBody UserInfo loginForm(@RequestBody UserInfo userInfo, Model model, HttpServletRequest request) throws Exception
	{   //
    	String strPassword = userInfo.getPassword();//EncryptUtils.toSHA256(    	
    	userInfo = userInfoService.selectAdminInfoByEmail(userInfo);
    	/*
    	if(userInfo != null) {
    		int loginFailCount = StringUtil.nullToInteger(userInfo.getLoginFailCount());  

			userInfo.setPassword(strPassword);
			String email = userInfo.getEmail();
			userInfo = userInfoService.selectAdminInfo(userInfo);
			
    		if(userInfo == null) {
        		userInfoService.updateLoginFail(email);
        		loginFailCount += 1;
        		
    			model.addAttribute("result", "Fail");
    			model.addAttribute("failCount", loginFailCount);
    			
        		return null;
        	}
        	else {
        		userInfoService.updateLoginSuccess(userInfo);
        		request.getSession().setAttribute(AdminCommon.ADMIN_KEY, userInfo);

        		model.addAttribute("id", userInfo.getId());
        		return userInfo;
        	}

    	}
    	else {
    		model.addAttribute("result", "noneUser");
    	}*/
    	
    	return userInfo;
	}
    
    /**
	 *  Logout
	 */	
    @RequestMapping(value="/logout", method=RequestMethod.GET)
	public String logout(@ModelAttribute("userInfo") UserInfo userInfo, HttpServletRequest request) throws Exception
	{
    	request.getSession().setAttribute(AdminCommon.ADMIN_KEY, null);
    	request.getSession().invalidate();
    	return "redirect:/admin/login"; 
	}    
    
    /**
	 * Get Register Form
	 */	
    @RequestMapping(value="/userInfoReg", method=RequestMethod.GET)
	public String userInfoForm(UserInfo userInfo, Model model) throws Exception
	{
    	model.addAttribute("command", "I");
    	
    	return "/userInfo/userInfoReg"; 
	}  
    
    /**
 	 * insert,update Member Info
 	 */	
    @RequestMapping(value="/add/{command}/{id}", method = RequestMethod.POST)    
 	public @ResponseBody UserInfo insertAdminInfo(@RequestBody UserInfo userInfo, @PathVariable String command, @PathVariable String id, BindingResult result) throws Exception	
 	{ 
 	    //userInfo.setEmail(adminCommon.getAdminEmail(request));
 	    //userInfo.setPassword(userInfo.getPassword());//EncryptUtils.toSHA256(
 	    
 	    try {
	 	   		
	 	   	if("Register".equals(StringUtil.nullToEmpty(command))) { 	   		
	 	   		userInfoService.insertUserInfo(userInfo);
	 	   	}
	     	else if ("Edit".equals(StringUtil.nullToEmpty(command))) {
	     		userInfo.setModifiedDate(new Date());
	     		userInfo.setId(StringUtil.nullToEmpty(id));
	     		userInfoService.updateUserInfo(userInfo);
	     	}
 	    }
 	    catch(Exception e) {
 	    	throw e;
 	    }
 	   	
 	   	return userInfo;//"redirect:/userInfo/userInfoList";
 	}  
    
	/**
	 * Get member list
	 */	
    @RequestMapping(value="/userInfoList")
	public @ResponseBody List<UserInfo> userInfoList(PageVO pageVO, HttpServletRequest request, HttpServletResponse response, Model model) throws Exception
	{
    	// Set Pagination Data
    	int startIndex = ((pageVO.getPageIndex() - 1) * pageVO.getPageUnit());
    	pageVO.setFirstIndex(startIndex);
    	pageVO.setLastIndex(startIndex +  pageVO.getPageUnit());
    	
		List<UserInfo> resultList = userInfoService.selectAdminInfoList(pageVO);  
	       
	   	return resultList;
	}   
    
	/**
	 * Get member list
	 */	
    @RequestMapping(value="/userInfoTotal")
	public @ResponseBody int getAdminInfoTotal(PageVO pageVO, HttpServletRequest request, HttpServletResponse response, Model model) throws Exception
	{	       
	   	return userInfoService.selectAdminInfoListCnt(pageVO);
	}
  
	/**
	 * get Member Info by id
	 */	
  	@RequestMapping(value="/view/{id}", method = RequestMethod.GET)
	public @ResponseBody UserInfo selectAdminInfoById(@PathVariable String id, Model model) throws Exception
	{        	    	
  		UserInfo userInfo = new UserInfo(); 
	 	userInfo.setId(StringUtil.nullToEmpty(id));
	 	userInfo = userInfoService.selectAdminInfoById(userInfo);	 	
	 	
	 	return userInfo; 
	}     
  	
    /**
	 *  Delete member info
	 */
    @RequestMapping(value="/deleteAdminInfo/{id}", method = RequestMethod.GET)
	public @ResponseBody boolean deleteAdminInfo(@PathVariable String id, Model model) throws Exception
	{    
    	boolean retBool = true;
    	
    	try {
    		UserInfo userInfo = new UserInfo();
    		userInfo.setId(StringUtil.nullToEmpty(id));
    		userInfoService.deleteAdminInfo(userInfo);
    	}
    	catch(Exception e) {
    		retBool = false;
    		e.printStackTrace();
    		throw e;
    	}
       	
    	return retBool;
	}    	
}
