package com.ace.service;

import java.util.List;
import java.util.Map;

import com.ace.model.BookInfo;
import com.ace.model.TeacherInfo;

public interface BookService {
	public List<BookInfo> selectBookInfoAll(Map<String, Object> vo) throws Exception;	
	public List<TeacherInfo> getAvailTeacherList(BookInfo vo) throws Exception;	
	public BookInfo addBook(BookInfo vo) throws Exception;
}
