package com.integrationwizards.admin.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.integrationwizards.admin.dao.CodeDao;
import com.integrationwizards.admin.model.CodeInfo;

@Repository("codeDao")
public class CodeDaoImpl implements CodeDao {
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	public List<CodeInfo> selectAllCode() throws Exception {
		Session session = this.sessionFactory.getCurrentSession();
		
		return session.createCriteria(CodeInfo.class).list();
	}

}
