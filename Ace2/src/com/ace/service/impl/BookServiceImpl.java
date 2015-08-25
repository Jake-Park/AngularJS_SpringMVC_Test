package com.ace.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.transaction.annotation.Transactional;

import com.ace.dao.BookDao;
import com.ace.model.BookInfo;
import com.ace.service.BookService;

public class BookServiceImpl implements BookService {
	private BookDao bookDao;
	
	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}	
	
	@Transactional
	public List<BookInfo> selectBookInfoAll(Map<String, Object> vo) throws Exception {
		return bookDao.selectBookInfoAll(vo);
	}
}
