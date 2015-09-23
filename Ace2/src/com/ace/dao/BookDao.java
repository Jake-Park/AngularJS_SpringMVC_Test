package com.ace.dao;

import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Lazy;

import com.ace.model.BookInfo;
import com.ace.model.TeacherInfo;

@Lazy(value=true)
public interface BookDao {
	public List<BookInfo> selectBookInfoAll(Map<String, Object> vo) throws Exception;
	public List<TeacherInfo> getAvailTeacherList(BookInfo vo) throws Exception;
	
}
