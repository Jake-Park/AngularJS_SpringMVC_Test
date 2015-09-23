package com.ace.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.ace.model.AdminInfo;
import com.ace.model.BookInfo;
import com.ace.model.PageVO;


@Component
public class AdminCommon {
	public final static String ADMIN_KEY = "adminInfo";	
	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");    	
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}	
	
	public String getAdminEmail(HttpServletRequest request) {
		AdminInfo adminInfo = ((AdminInfo)request.getSession().getAttribute("adminInfo"));
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

    @Scheduled(fixedDelay = 500000)
    public void insertDummyBookData() {
    	Date date = new Date();    	
    	Random randomGenerator = new Random();
    	int randInt = randomGenerator.nextInt(3)+1;
    	
    	Calendar c = Calendar.getInstance(); 
    	c.setTime(date);    	
    	c.add(Calendar.DATE, randInt);
    	date = c.getTime();
    	
    	SimpleDateFormat hourFormat = new SimpleDateFormat("HH");
    	SimpleDateFormat minuteFormat = new SimpleDateFormat("mm");
    	int minInt = StringUtil.zeroConvert(minuteFormat.format(date));
    	String bookTime = minInt < 30 ? "00" : "30";
    	bookTime = hourFormat.format(date) + ":" + bookTime + ":00";
    	
    	BookInfo bookInfo = new BookInfo();
    	bookInfo.setBookDate(dateFormat.format(date));
    	bookInfo.setBookTime(bookTime);
    	bookInfo.setTeacherId(String.valueOf(randInt));
    	
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(bookInfo);
		session.getTransaction().commit();
		session.close();
		
    	
        System.out.println("Insert Info : date > " + dateFormat.format(date));
        System.out.println("Insert Info : time > " + bookTime);
        System.out.println("Insert Info : teacher id > " + randInt);
    }
}
