package com.ace.dao.impl;

import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.ace.dao.BookDao;
import com.ace.model.BookInfo;

@Repository("bookDao")
public class BookDaoImpl implements BookDao {
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}	

	@Override
	public List<BookInfo> selectBookInfoAll(Map<String, Object> vo) throws Exception {
		Session session = this.sessionFactory.getCurrentSession();
		//List<AdminInfo> AdminInfoList = session.createQuery("from AdminInfo").list();
		
		String hql = "FROM BookInfo WHERE bookDate between CURDATE() + 1 and CURDATE() + 3 ";
		hql += "OR (bookDate = CURDATE() AND bookTime > CURTIME()) AND userId IS NULL ";
        Query query = session.createQuery(hql);
        List<BookInfo> results = query.list();
		
		for(BookInfo p : results) {
			System.out.println("BookInfo List : " + p);
		}
        
		return results;
	}

}
