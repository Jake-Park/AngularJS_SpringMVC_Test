package com.integrationwizards.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.integrationwizards.model.FileUpload;

@Component
public class FileUploadValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		//just validate the FileUpload instances
		return FileUpload.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		FileUpload file = (FileUpload)target;
		
		if(file.getFile()!=null){
			if(file.getFile().getSize()==0){
				errors.rejectValue("file", "Please select a file!");
			}
		}
	}

}
