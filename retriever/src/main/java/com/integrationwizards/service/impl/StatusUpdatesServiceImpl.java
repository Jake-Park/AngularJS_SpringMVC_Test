package com.integrationwizards.service.impl;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.integrationwizards.dao.StatusUpdatesDao;
import com.integrationwizards.model.HEStatus;
import com.integrationwizards.model.HResultStatusUpdates;
import com.integrationwizards.service.StatusUpdatesService;
import com.integrationwizards.util.Constant;
import com.integrationwizards.util.HeaderFactory;

import au.com.retriever.test.barking.EStatus;
import au.com.retriever.test.barking.ResultExportStatusUpdates;
import au.com.retriever.test.barking.RetrieverBarking;
import au.com.retriever.test.barking.StatusUpdate;

@Service
public class StatusUpdatesServiceImpl implements StatusUpdatesService {
	@Autowired
	private StatusUpdatesDao statusUpdatesDao;
	
	public ResultExportStatusUpdates sendStatusUpdates() throws Exception {
		StatusUpdate statusUpdate = new StatusUpdate();
		statusUpdate.setExport(true);
		statusUpdate.setMax(BigInteger.valueOf(50));
		statusUpdate.setTimeout("300000");
		statusUpdate.setUpdatedSince("300000");
		
		return ((RetrieverBarking)HeaderFactory.getInstance()
				.getHeader(Constant.RetrieverBarking)).exportStatusUpdates(statusUpdate);
	}

	@Transactional
	public HResultStatusUpdates insertResultStatusUpdates(ResultExportStatusUpdates result) throws Exception {
		ObjectMapper m = new ObjectMapper();
		Map<String,Object> props = m.convertValue(result, Map.class);
		
		// Moving data from EStatus to HEStatus
		List<EStatus> list = result.getEStatusUpdate();

		List<HEStatus> arrList = new ArrayList<HEStatus>();
		
		for(EStatus eStatus : list) {
			Map<String,Object> p = m.convertValue(eStatus, Map.class);
			HEStatus hEstatus = m.convertValue(p, HEStatus.class);
			hEstatus.setTxId(result.getTxId());
			arrList.add(hEstatus);
		}
		
		Set<HEStatus> foo = new HashSet<HEStatus>(arrList);
		props.remove("estatusUpdate");
		props.put("eStatusUpdate", foo);
		HResultStatusUpdates hResult = m.convertValue(props, HResultStatusUpdates.class);		
		
		hResult.seteStatusUpdate(foo);
		statusUpdatesDao.insertResultStatusUpdates(hResult);
		
		return hResult;
	}

}
