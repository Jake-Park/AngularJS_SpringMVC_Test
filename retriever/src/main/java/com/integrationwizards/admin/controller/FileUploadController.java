package com.integrationwizards.admin.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.integrationwizards.admin.model.Document;
import com.integrationwizards.admin.service.FileUploadService;

@Controller
public class FileUploadController {
	@Autowired
	FileUploadService fileUploadService;
	
    /**
     * Upload single file using Spring Controller
     */
    @RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
    public @ResponseBody Map<String, String> uploadFileHandler(@RequestParam("file") MultipartFile file) throws Exception {
        if (!file.isEmpty()) {
        	return fileUploadService.upload(file);
        } 
        else {
        	return null;
        }
    }
    
    
    /**
     * Method for handling file download request from client
     */
    @RequestMapping(value = "/download", method = RequestMethod.GET)
    public void doDownload(HttpServletRequest request,
            HttpServletResponse response) throws Exception {
    	String id = request.getParameter("id");
    	
        // get absolute path of the application
    	if(id == null) {
    		return;
    	}
    	
    	Document document = fileUploadService.getDocument(id);    	
          
        // set content attributes for the response
        response.setContentType("application/octet-stream");
        response.setContentLength(document.getDownloadFileData().length);
 
        // set headers for the response
        String headerKey = "Content-Disposition";
        String headerValue = String.format("attachment; filename=\"%s\"",
        		document.getDownloadFileName());
        response.setHeader(headerKey, headerValue);
 
        // get output stream of the response
        try (OutputStream outStream = response.getOutputStream()) {
	        // write bytes read from the input stream into the output stream
	        outStream.write(document.getDownloadFileData());
        }
        catch(Exception e) {
        	e.printStackTrace();
        }
    }
}
