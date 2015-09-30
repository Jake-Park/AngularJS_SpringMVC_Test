package com.ace.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.ace.dao.BookDao;
import com.ace.model.BookInfo;
import com.ace.model.TeacherInfo;
import com.ace.utils.StringUtil;

@Repository("bookDao")
public class BookDaoImpl implements BookDao {
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}	

	@Override
	public List<BookInfo> selectBookInfoAll(Map<String, Object> vo) throws Exception {
		Session session = this.sessionFactory.getCurrentSession();
		
		String hql = "SELECT * FROM BookInfo a WHERE (a.bookDate between DATE_ADD(CURDATE(), INTERVAL 1 DAY) and DATE_ADD(CURDATE(), INTERVAL 3 DAY) ";
		hql += "OR (a.bookDate = CURDATE() AND a.bookTime > CURTIME())) AND a.userId is null ";
		Query query = session.createSQLQuery(hql);
        List<Object[]> objects = (List<Object[]>)query.list();
        
        System.out.println(objects);
        List<BookInfo> results = new ArrayList<BookInfo>();
        BookInfo bi = null;
		
        for(Object[] p : objects) {
        	bi = new BookInfo();
/*        	for(int i=0; i < p.length; i++) {
        		System.out.println(i + "BookInfo List : " + p[i]);
        	}*/
        	bi.setId(new Integer(String.valueOf(p[0])));
        	bi.setBookDate(String.valueOf(p[1]));
        	bi.setBookTime(String.valueOf(p[2]));
        	bi.setTeacherId(String.valueOf(p[3]));
        	results.add(bi);
		}
        
		return results;
	}

	@Override
	public List<TeacherInfo> getAvailTeacherList(BookInfo vo) throws Exception {
		Session session = this.sessionFactory.getCurrentSession();
		//List<AdminInfo> AdminInfoList = session.createQuery("from AdminInfo").list();
		
		String hql = "SELECT a FROM TeacherInfo a inner join a.bookInfos b with b.bookDate = :bookDate AND b.bookTime = :bookTime AND b.userId is null ";
        Query query = session.createQuery(hql);
        query.setString("bookDate", vo.getBookDate());
        query.setString("bookTime", vo.getBookTime());
        List<TeacherInfo> results = query.list();

		for(TeacherInfo p : results) {			
			System.out.println("BookInfo List : " + p.getName());
		}
        
		return results;
	}
	
	public BookInfo addBook(BookInfo vo) throws Exception {		
		Session session = sessionFactory.openSession();
		String hql = "FROM BookInfo a WHERE a.bookDate = :bookDate AND a.bookTime = :bookTime AND a.teacherId = :teacherId ";
        Query query = session.createQuery(hql);
        query.setString("bookDate", vo.getBookDate());
        query.setString("bookTime", vo.getBookTime());
        query.setString("teacherId", vo.getTeacherId());
        
        BookInfo result = (BookInfo)query.uniqueResult();
        result.setUserId(vo.getUserId());        
        
		session.beginTransaction();
		session.update(result);
		session.getTransaction().commit();
		session.close();
		
		return result;
	}

}
