package com.ace.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ace.model.BookInfo;
import com.ace.model.TeacherInfo;
import com.ace.service.DashboardService;

@Controller
@RequestMapping("/dashboard")
public class DashboardController {
	@Autowired
	private DashboardService dashboardService;
	private Map<String, Object> param = null;	
	
	@RequestMapping(value="/bookings/{userId}", method=RequestMethod.GET) 
	public @ResponseBody List<Map<String, Object>> bookedList(@PathVariable String userId) throws Exception {	
		param = new HashMap<String, Object>();
		param.put("userId", userId);
		
		return dashboardService.bookedList(param);
	}
	
	@RequestMapping(value="/cancelBooking/{bookId}", method=RequestMethod.GET) 
	public @ResponseBody BookInfo cancelBooking(@PathVariable String bookId) throws Exception {	
		param = new HashMap<String, Object>();
		param.put("bookId", bookId);
		
		return dashboardService.cancelBooking(param);
	}
	
	@RequestMapping(value="/getTeacherDetail/{teacherId}", method=RequestMethod.GET) 
	public @ResponseBody List<TeacherInfo> getTeacherDetail(@PathVariable String teacherId) throws Exception {	
		param = new HashMap<String, Object>();
		param.put("teacherId", teacherId);
		
		return dashboardService.getTeacherDetail(param);
	}		
}
