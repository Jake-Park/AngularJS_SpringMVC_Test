package com.ace.service;

import java.util.List;
import java.util.Map;

import com.ace.model.BookInfo;

public interface BookService {
	public List<BookInfo> selectBookInfoAll(Map<String, Object> vo) throws Exception;
}
