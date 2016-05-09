package com.ace.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.ace.dao.DashboardDao;
import com.ace.model.BookInfo;
import com.ace.model.TeacherInfo;
import com.ace.utils.StringUtil;

@Repository("dashboardDao")
public class DashboardDaoImpl implements DashboardDao {
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}
	
	public List<Map<String, Object>> bookedList(Map<String, Object> vo) throws Exception {
		Session session = this.sessionFactory.getCurrentSession();
		//List<AdminInfo> AdminInfoList = session.createQuery("from AdminInfo").list();
		
		String hql = "SELECT new map(b.id as bookId, b.bookDate as bookDate, b.bookTime as bookTime, b.teacherId as teacherId, a.name as name, a.imageUrl as imageUrl) ";
		hql += "FROM TeacherInfo a inner join a.bookInfos b with b.userId = :userId AND (b.bookDate > CURDATE() OR (b.bookDate = CURDATE() AND b.bookTime > CURTIME())) ";
        Query query = session.createQuery(hql);
        query.setString("userId", (String)vo.get("userId"));
        List<Map<String, Object>> results = (List<Map<String, Object>>)query.list();

		for(Map<String, Object> p : results) {
				System.out.println(p + "BookInfo List : " + p.get("bookId"));
		}
		
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		Map<String, Object> m = new HashMap<String, Object>();
        
		return results;
	}
	
	public BookInfo cancelBooking(Map<String, Object> vo) throws Exception {
		Session session = sessionFactory.openSession();
		String hql = "FROM BookInfo a WHERE a.id = :bookId ";
        Query query = session.createQuery(hql);
        query.setString("bookId", StringUtil.nullConvert(vo.get("bookId")));
        
        BookInfo result = (BookInfo)query.uniqueResult();
        result.setUserId(null);
        
		session.beginTransaction();
		session.update(result);
		session.getTransaction().commit();
		session.close();
        
		return result;
	}	
	
	public List<TeacherInfo> getTeacherDetail(Map<String, Object> vo) throws Exception {
		Session session = this.sessionFactory.getCurrentSession();
		//List<AdminInfo> AdminInfoList = session.createQuery("from AdminInfo").list();
		
		String hql = "FROM TeacherInfo a WHERE a.id = :teacherId ";
        Query query = session.createQuery(hql);
        query.setString("teacherId", StringUtil.nullConvert(vo.get("teacherId")));
        List<TeacherInfo> results = query.list();

		for(TeacherInfo p : results) {			
			System.out.println("TeacherInfo List : " + p.getName());
		}
        
		return results;
	}	
}
