package com.ace.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.transaction.annotation.Transactional;

import com.ace.dao.impl.DashboardDaoImpl;
import com.ace.model.BookInfo;
import com.ace.model.TeacherInfo;
import com.ace.service.DashboardService;

public class DashboardServiceImpl implements DashboardService {
	private DashboardDaoImpl dashboardDao;
	
	public void setDashboardDao(DashboardDaoImpl dashboardDao) {
		this.dashboardDao = dashboardDao;
	}	
	
	@Transactional
	public List<Map<String, Object>> bookedList(Map<String, Object> vo) throws Exception {
		return dashboardDao.bookedList(vo);
	}
	
	@Transactional
	public BookInfo cancelBooking(Map<String, Object> vo) throws Exception {
		return dashboardDao.cancelBooking(vo);
	}
	
	@Transactional
	public List<TeacherInfo> getTeacherDetail(Map<String, Object> vo) throws Exception {
		return dashboardDao.getTeacherDetail(vo);
	}
}
