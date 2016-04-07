package com.integrationwizards.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.integrationwizards.admin.model.CodeInfo;
import com.integrationwizards.admin.service.CodeService;

@Component
public class CodeUtil implements InitializingBean {
	@Autowired
	CodeService codeService;
	private Map<String, Map<String, String>> codeMap = null;
	@Value("${createJob.reSmartLink.counts}") 
	private String slCount;
	@Value("${createJob.reCreateJob.counts}") 
	private String cjCount;
	@Value("${exportJobs.reExportJobs.counts}") 
	private String ejCount;
	
	public void afterPropertiesSet() throws Exception {
		codeMap = new HashMap<String, Map<String, String>>();
		init();
	}
	
	// Initialize all codes
	public void init() {
		try {
			List<CodeInfo> codeList = codeService.selectAllCode();
			
			if(codeList != null) {
				for(CodeInfo codeInfo : codeList) {
					boolean creClass = true;
					// Check existing class
					for(Map.Entry<String, Map<String, String>> entry : codeMap.entrySet()) {
						if(codeInfo.getCodeClass().equals(entry.getKey())) {
							System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
							creClass = false;
							break;
						}					
					}
					
					if(creClass) {
						codeMap.put(codeInfo.getCodeClass(), new HashMap<String, String>());
					}
					
					Map<String, String> map = codeMap.get(codeInfo.getCodeClass());
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
