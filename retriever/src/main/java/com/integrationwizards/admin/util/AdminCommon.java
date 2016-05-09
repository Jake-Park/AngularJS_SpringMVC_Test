package com.integrationwizards.admin.util;

import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

import com.integrationwizards.admin.model.UserInfo;
import com.integrationwizards.admin.model.PageVO;

@Component
public class AdminCommon {
	public final static String ADMIN_KEY = "adminInfo";	
	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");    	
	private SessionFactory sessionFactory;
	private int lastTeacherId = 1;
	private String lastMinute = "";
	
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}	
	
	public String getAdminEmail(HttpServletRequest request) {
		UserInfo adminInfo = ((UserInfo)request.getSession().getAttribute("adminInfo"));
		if(adminInfo != null) {
			return adminInfo.getEmail();
		}
		else {
			return "";
		}		
	}
	
	public void setAdminPagingInfo(HttpServletRequest request, PageVO vo) {//, PaginationInfo paginationInfo
		if(request.getParameter("pageNo") != null){        	
			vo.setPageIndex(Integer.parseInt(request.getParameter("pageNo")));
		}        
/*	   	paginationInfo.setCurrentPageNo(vo.getPageIndex());
	   	paginationInfo.setRecordCountPerPage(vo.getPageUnit());
	   	paginationInfo.setPageSize(vo.getPageSize());	   	
*/
	   	vo.setFirstIndex((vo.getPageIndex() - 1) * vo.getPageUnit());
	   	vo.setLastIndex(vo.getPageIndex() * vo.getPageUnit());	   	
	}	
}
