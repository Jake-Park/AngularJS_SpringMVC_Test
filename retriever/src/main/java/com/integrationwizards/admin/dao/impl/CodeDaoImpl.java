package com.integrationwizards.admin.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.integrationwizards.admin.dao.CodeDao;
import com.integrationwizards.admin.model.CodeInfo;

@Repository
public class CodeDaoImpl implements CodeDao {
	@Autowired
	@Qualifier("hibernate4AnnotatedSessionFactory")
	private SessionFactory sessionFactory;
	
	public List<CodeInfo> selectAllCode() throws Exception {
		Session session = this.sessionFactory.getCurrentSession();
		
		return session.createCriteria(CodeInfo.class).list();
	}

}
