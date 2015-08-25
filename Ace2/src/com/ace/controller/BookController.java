package com.ace.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ace.model.BookInfo;
import com.ace.service.BookService;

@Lazy(value=true)
@Controller
@RequestMapping("/book")
public class BookController {
	@Autowired
	private BookService bookService;
	private Map<String, Object> param = null;
	
	@RequestMapping(value="/all", method=RequestMethod.POST) 
	public @ResponseBody List<BookInfo> selectBookInfoAll(@RequestBody BookInfo bookInfo) throws Exception {
		param = new HashMap<String, Object>();
		param.put("userId", bookInfo.getUserId());
		
		return bookService.selectBookInfoAll(param);
	}
}
