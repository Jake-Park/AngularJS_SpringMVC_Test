package com.ace.service;

import java.util.List;
import java.util.Map;

import com.ace.model.BookInfo;
import com.ace.model.TeacherInfo;

public interface DashboardService {	
	public List<Map<String, Object>> bookedList(Map<String, Object> vo) throws Exception;
	public BookInfo cancelBooking(Map<String, Object> vo) throws Exception;
	public List<TeacherInfo> getTeacherDetail(Map<String, Object> vo) throws Exception;
}
