package com.integrationwizards.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.integrationwizards.admin.dao.CodeDao;
import com.integrationwizards.admin.model.CodeInfo;
import com.integrationwizards.admin.service.CodeService;

@Service
public class CodeServiceImpl implements CodeService {
	@Autowired
	private CodeDao codeDao;
	@Value("${createJob.reSmartLink.counts}") 
	private String slCount;
	@Value("${createJob.reCreateJob.counts}") 
	private String cjCount;
	@Value("${exportJobs.reExportJobs.counts}") 
	private String ejCount;
		
	@Transactional
	public List<CodeInfo> selectAllCode() throws Exception {
		List<CodeInfo> codeInfoList = codeDao.selectAllCode();
		
		// Set maxCounts for transactions into CodeData 
		CodeInfo codeInfo = new CodeInfo();
		codeInfo.setCodeClass("ENV");
		codeInfo.setCodeKey("M3C");		// To M3 in CreateJob
		codeInfo.setCodeValue(slCount);		
		codeInfoList.add(codeInfo);
		
		codeInfo = new CodeInfo();
		codeInfo.setCodeClass("ENV");
		codeInfo.setCodeKey("RTC");		// To Retriever in CreateJob
		codeInfo.setCodeValue(cjCount);
		codeInfoList.add(codeInfo);
		
		codeInfo = new CodeInfo();
		codeInfo.setCodeClass("ENV");
		codeInfo.setCodeKey("M3E");		// To M3 in ExportJobs
		codeInfo.setCodeValue(ejCount);
		codeInfoList.add(codeInfo);
		
		return codeInfoList;
	}

}
