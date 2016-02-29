package com.integrationwizards.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import com.integrationwizards.admin.model.CodeInfo;
import com.integrationwizards.admin.service.CodeService;

public class CodeUtil {
	@Autowired
	private ApplicationContext appContext;
	private static CodeUtil instance = null;
	private Map<String, Map<String, String>> codeMap = null;
	
	public CodeUtil() {
		init();
		codeMap = new HashMap<String, Map<String, String>>();
	}
	
	public static CodeUtil getInstance() {
		if(instance == null) {
			instance = new CodeUtil();
		}
		
		return instance;
	}
	
	// Initialize all codes
	public void init() {
		try {
			CodeService codeService = appContext.getBean(CodeService.class);
			List<CodeInfo> codeList = codeService.selectAllCode();
			
			if(codeList != null) {
				for(CodeInfo codeInfo : codeList) {
					boolean creClass = true;
					// Check existing class
					for(Map.Entry<String, Map<String, String>> entry : codeMap.entrySet()) {
						if(codeInfo.getCodeClass().equals(entry.getKey())) {
							//	System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
							creClass = false;
							break;
						}					
					}
					
					if(creClass) {
						codeMap.put(codeInfo.getCodeClass(), new HashMap<String, String>());
					}
					
					Map<String, String> map = codeMap.get(codeInfo.getClass());
					map.put(codeInfo.getCodeKey(), codeInfo.getCodeValue());
				}
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public String getCodeValue(String codeClass, String codeKey) {		
		return StringUtil.nullToEmpty(((Map<String, String>)codeMap.get(codeClass)).get(codeKey));
	}
}
