package com.integrationwizards.service.impl;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.xml.bind.JAXBElement;
import javax.xml.datatype.XMLGregorianCalendar;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.integrationwizards.common.Constants;
import com.integrationwizards.common.HeaderFactory;
import com.integrationwizards.common.ParamName;
import com.integrationwizards.dao.ExportJobsDao;
import com.integrationwizards.model.HEAllowance;
import com.integrationwizards.model.HEAttachment;
import com.integrationwizards.model.HEChecklist;
import com.integrationwizards.model.HEChecklistCategory;
import com.integrationwizards.model.HEChecklistItem;
import com.integrationwizards.model.HEJob;
import com.integrationwizards.model.HENewAsset;
import com.integrationwizards.model.HEOhs;
import com.integrationwizards.model.HEPart;
import com.integrationwizards.model.HEPurchaseOrder;
import com.integrationwizards.model.HEReport;
import com.integrationwizards.model.HEService;
import com.integrationwizards.model.HESignature;
import com.integrationwizards.model.HETime;
import com.integrationwizards.model.HJob;
import com.integrationwizards.model.HResultExportJobs;
import com.integrationwizards.service.ExportJobsService;
import com.integrationwizards.util.DateUtil;
import com.integrationwizards.util.StringUtil;

import au.com.retriever.test.barking.EAllowance;
import au.com.retriever.test.barking.EAttachment;
import au.com.retriever.test.barking.EChecklist;
import au.com.retriever.test.barking.EChecklistCategory;
import au.com.retriever.test.barking.EChecklistItem;
import au.com.retriever.test.barking.EJob;
import au.com.retriever.test.barking.ENewAsset;
import au.com.retriever.test.barking.EOhs;
import au.com.retriever.test.barking.EPart;
import au.com.retriever.test.barking.EPurchaseOrder;
import au.com.retriever.test.barking.EReport;
import au.com.retriever.test.barking.EService;
import au.com.retriever.test.barking.ESignature;
import au.com.retriever.test.barking.ETime;
import au.com.retriever.test.barking.ExportJob;
import au.com.retriever.test.barking.ResultExportJobs;
import au.com.retriever.test.barking.RetrieverBarking;
import au.com.tmha.mos057mi.MOS057MI;
import au.com.tmha.mos057mi.upd.UpdCollection;
import au.com.tmha.mos057mi.upd.UpdItem;
import au.com.tmha.mos057mi.upd.UpdResponseCollection;
import au.com.tmha.mos070mi.MOS070MI;
import au.com.tmha.mos070mi.updoperation.UpdOperationCollection;
import au.com.tmha.mos070mi.updoperation.UpdOperationItem;
import au.com.tmha.mos070mi.updoperation.UpdOperationResponseCollection;

@Service
public class ExportJobsServiceImpl implements ExportJobsService {
	@Autowired
	private ExportJobsDao exportJobsDao;
	
	public ResultExportJobs sendExportJobs() throws Exception {
		ExportJob exportJob = new ExportJob();
		exportJob.setExport(true);
		exportJob.setMax(BigInteger.valueOf(50));
		exportJob.setTimeout("300000");
		exportJob.setUpdatedSince("300000");
		
		return ((RetrieverBarking)HeaderFactory.getInstance()
				.getHeader(Constants.RetrieverBarking)).exportJobs(exportJob);
	}

	/**
	 * Insert exportJobs data from Retriever to DB
	 */
	@Transactional
	public HResultExportJobs insertResultExportJobs(ResultExportJobs result, String logId) throws Exception {
		ObjectMapper m = new ObjectMapper();
		Map<String,Object> props = m.convertValue(result, Map.class);
		
		// Moving data from EStatus to HEStatus
		List<EJob> eJobList = result.getEJob();
		List<HEJob> hEJobList = new ArrayList<HEJob>();
		
		for(EJob eJob : eJobList) {
			Map<String,Object> p = m.convertValue(eJob, Map.class);				
			p.remove("eohs");
			p.remove("enewAsset");
			p.remove("eservice");
			p.remove("epart");
			p.remove("esignature");
			p.remove("echecklist");
			p.remove("etime");
			p.remove("eallowance");
			p.remove("epurchaseOrder");
			p.remove("ereport");
			p.remove("eattachment");
			HEJob hEJob = m.convertValue(p, HEJob.class);			
			hEJob.setTxId(result.getTxId());
			hEJob.setLogId(logId);
			
			List<HEOhs> hEOhsList = setEOhsList(m, eJob, result);
			List<HENewAsset> hENewAssetList = setENewAssetList(m, eJob, result);			
			List<HEService> hEServiceList = setEServiceList(m, eJob, result);
			List<HEPart> hEPartList = setEPartList(m, eJob, result);
			List<HESignature> hESignatureList = setESignatureList(m, eJob, result);
			List<HETime> hETimeList = setETimeList(m, eJob, result);
			List<HEAllowance> hEAllowanceList = setEAllowanceList(m, eJob, result);
			List<HEPurchaseOrder> hEPurchaseOrderList = setEPurchaseOrderList(m, eJob, result);
			List<HEReport> hEReportList = setEReportList(m, eJob, result);
			List<HEAttachment> hEAttachmentList = setEAttachmentList(m, eJob, result);
			
			Set<HEOhs> hEOhsSet = new HashSet<HEOhs>(hEOhsList);
			Set<HENewAsset> hENewAssetSet = new HashSet<HENewAsset>(hENewAssetList);
			Set<HEService> hEServiceSet = new HashSet<HEService>(hEServiceList);
			Set<HEPart> hEPartSet = new HashSet<HEPart>(hEPartList);
			Set<HESignature> hESignatureSet = new HashSet<HESignature>(hESignatureList);
			Set<HETime> hETimeSet = new HashSet<HETime>(hETimeList);
			Set<HEAllowance> hEAllowanceSet = new HashSet<HEAllowance>(hEAllowanceList);
			Set<HEPurchaseOrder> hEPurchaseOrderSet = new HashSet<HEPurchaseOrder>(hEPurchaseOrderList);
			Set<HEReport> hEReportSet = new HashSet<HEReport>(hEReportList);
			Set<HEAttachment> hEAttachmentSet = new HashSet<HEAttachment>(hEAttachmentList);
			
			hEJob.seteOhs(hEOhsSet);
			hEJob.seteNewAsset(hENewAssetSet);
			hEJob.seteService(hEServiceSet);
			hEJob.setePart(hEPartSet);
			hEJob.seteSignature(hESignatureSet);
			hEJob.seteTime(hETimeSet);
			hEJob.seteAllowance(hEAllowanceSet);
			hEJob.setePurchaseOrder(hEPurchaseOrderSet);
			hEJob.seteReport(hEReportSet);
			hEJob.seteAttachment(hEAttachmentSet);
			
			hEJobList.add(hEJob);
		}
		
		Set<HEJob> hEJobSet = new HashSet<HEJob>(hEJobList);
		props.remove("ejob");
		HResultExportJobs hResultExportJobs = m.convertValue(props, HResultExportJobs.class);		
		
		hResultExportJobs.seteJob(hEJobSet);
		exportJobsDao.insertResultExportJobs(hResultExportJobs);
		
		return hResultExportJobs;
	}
	
	/**
	 * 
	 * @param m
	 * @param eJob
	 * @param result
	 * @return
	 */
	private List<HEOhs> setEOhsList(ObjectMapper m, EJob eJob, ResultExportJobs result) {
		// EOhs
		List<EOhs> eOhsList = eJob.getEOhs();
		List<HEOhs> hEOhsList = new ArrayList<HEOhs>();
		
		for(EOhs eOhs : eOhsList) {
			Map<String,Object> pOhs = m.convertValue(eOhs, Map.class);
			HEOhs hEOhs = m.convertValue(pOhs, HEOhs.class);
			hEOhs.setTxId(result.getTxId());
			hEOhs.setJobId(eJob.getJobId());
			hEOhs.setPhaseId(eJob.getPhaseId());
			hEOhs.setTechId(eJob.getTechId());
			hEOhsList.add(hEOhs);
		}
		
		return hEOhsList;
	}	
	
	/**
	 * 
	 * @param m
	 * @param eJob
	 * @param result
	 * @return
	 */
	private List<HENewAsset> setENewAssetList(ObjectMapper m, EJob eJob, ResultExportJobs result) {
		// EOhs
		List<ENewAsset> eNewAssetList = eJob.getENewAsset();
		List<HENewAsset> hENewAssetList = new ArrayList<HENewAsset>();
		
		for(ENewAsset eNewAsset : eNewAssetList) {
			Map<String,Object> pNewAsset = m.convertValue(eNewAsset, Map.class);
			HENewAsset hENewAsset = m.convertValue(pNewAsset, HENewAsset.class);
			hENewAsset.setTxId(result.getTxId());
			hENewAsset.setJobId(eJob.getJobId());
			hENewAsset.setPhaseId(eJob.getPhaseId());
			hENewAsset.setTechId(eJob.getTechId());
			hENewAssetList.add(hENewAsset);
		}
		
		return hENewAssetList;
	}	
	
	/**
	 * 
	 * @param m
	 * @param eJob
	 * @param result
	 * @return
	 */
	private List<HEService> setEServiceList(ObjectMapper m, EJob eJob, ResultExportJobs result) {
		// EOhs
		List<EService> eServiceList = eJob.getEService();
		List<HEService> hEServiceList = new ArrayList<HEService>();
		
		for(EService eService : eServiceList) {
			Map<String,Object> pService = m.convertValue(eService, Map.class);
			HEService hEService = m.convertValue(pService, HEService.class);
			hEService.setTxId(result.getTxId());
			hEService.setJobId(eJob.getJobId());
			hEService.setPhaseId(eJob.getPhaseId());
			hEService.setTechId(eJob.getTechId());
			hEServiceList.add(hEService);
		}
		
		return hEServiceList;
	}		
	
	/**
	 * 
	 * @param m
	 * @param eJob
	 * @param result
	 * @return
	 */
	private List<HEPart> setEPartList(ObjectMapper m, EJob eJob, ResultExportJobs result) {
		// EOhs
		List<EPart> ePartList = eJob.getEPart();
		List<HEPart> hEPartList = new ArrayList<HEPart>();
		
		for(EPart ePart : ePartList) {
			Map<String,Object> pPart = m.convertValue(ePart, Map.class);
			HEPart hEPart = m.convertValue(pPart, HEPart.class);
			hEPart.setTxId(result.getTxId());
			hEPart.setJobId(eJob.getJobId());
			hEPart.setPhaseId(eJob.getPhaseId());
			hEPart.setTechId(eJob.getTechId());
			hEPartList.add(hEPart);
		}
		
		return hEPartList;
	}		
	
	/**
	 * 
	 * @param m
	 * @param eJob
	 * @param result
	 * @return
	 */
	private List<HESignature> setESignatureList(ObjectMapper m, EJob eJob, ResultExportJobs result) {
		// EOhs
		List<ESignature> eSignatureList = eJob.getESignature();
		List<HESignature> hESignatureList = new ArrayList<HESignature>();
		
		for(ESignature eSignature : eSignatureList) {
			Map<String,Object> pSignature = m.convertValue(eSignature, Map.class);
			HESignature hESignature = m.convertValue(pSignature, HESignature.class);
			hESignature.setTxId(result.getTxId());
			hESignature.setJobId(eJob.getJobId());
			hESignature.setPhaseId(eJob.getPhaseId());
			hESignature.setTechId(eJob.getTechId());
			hESignatureList.add(hESignature);
		}
		
		return hESignatureList;
	}		
	
	/**
	 * 
	 * @param m
	 * @param eJob
	 * @param result
	 * @return
	 */
	private List<HEChecklist> setEChecklistList(ObjectMapper m, EJob eJob, ResultExportJobs result) {
		List<EChecklist> eChecklistList = eJob.getEChecklist();
		List<HEChecklist> hEChecklistList = new ArrayList<HEChecklist>();
		
		for(EChecklist eChecklist : eChecklistList) {
			Map<String,Object> pEChecklist = m.convertValue(eChecklist, Map.class);
			pEChecklist.remove("echecklistCategory");
			
			HEChecklist hChecklist = m.convertValue(pEChecklist, HEChecklist.class);
			hChecklist.setTxId(result.getTxId());
			hChecklist.setJobId(eJob.getJobId());
			hChecklist.setPhaseId(eJob.getPhaseId());
			hChecklist.setTechId(eJob.getTechId());
			
			List<HEChecklistCategory> hEChecklistCategoryList = setEChecklistCategoryList(m, eJob, eChecklist, result);
			Set<HEChecklistCategory> hEChecklistCategorySet = new HashSet<HEChecklistCategory>(hEChecklistCategoryList);
			
			hChecklist.seteChecklistCategory(hEChecklistCategorySet);
			
			hEChecklistList.add(hChecklist);
		}
		
		return hEChecklistList;
	}	
	
	/**
	 * 
	 * @param m
	 * @param eJob
	 * @param result
	 * @return
	 */
	private List<HEChecklistCategory> setEChecklistCategoryList(ObjectMapper m, EJob eJob, EChecklist eChecklist, ResultExportJobs result) {
		// EChecklistCategory
		List<EChecklistCategory> eChecklistCategoryList = eChecklist.getEChecklistCategory();
		List<HEChecklistCategory> hEChecklistCategoryList = new ArrayList<HEChecklistCategory>();
		
		for(EChecklistCategory eChecklistCategory : eChecklistCategoryList) {
			Map<String,Object> pEChecklistCategory = m.convertValue(eChecklistCategory, Map.class);
			pEChecklistCategory.remove("echecklistItem");
			
			HEChecklistCategory hChecklistCategory = m.convertValue(pEChecklistCategory, HEChecklistCategory.class);
			hChecklistCategory.setTxId(result.getTxId());
			hChecklistCategory.setJobId(eJob.getJobId());
			hChecklistCategory.setPhaseId(eJob.getPhaseId());
			hChecklistCategory.setTechId(eJob.getTechId());
			hChecklistCategory.setChecklistId(eChecklist.getChecklistId());
			
			List<HEChecklistItem> hEChecklistItemList = setEChecklistItemList(m, eJob, eChecklist, eChecklistCategory, result);
			Set<HEChecklistItem> hEChecklistItemSet = new HashSet<HEChecklistItem>(hEChecklistItemList);
			
			hChecklistCategory.seteChecklistItem(hEChecklistItemSet);
			
			hEChecklistCategoryList.add(hChecklistCategory);
		}
		
		return hEChecklistCategoryList;
	}	
	
	/**
	 * 
	 * @param m
	 * @param eJob
	 * @param result
	 * @return
	 */
	private List<HEChecklistItem> setEChecklistItemList(ObjectMapper m, EJob eJob, EChecklist eChecklist, 
			EChecklistCategory eChecklistCategory ,ResultExportJobs result) {
		// EChecklistCategory
		List<EChecklistItem> eChecklistItemList = eChecklistCategory.getEChecklistItem();
		List<HEChecklistItem> hEChecklistItemList = new ArrayList<HEChecklistItem>();
		
		for(EChecklistItem eChecklistItem : eChecklistItemList) {
			Map<String,Object> pEChecklistItem = m.convertValue(eChecklistItem, Map.class);
			
			HEChecklistItem hChecklistItem = m.convertValue(pEChecklistItem, HEChecklistItem.class);
			hChecklistItem.setTxId(result.getTxId());
			hChecklistItem.setJobId(eJob.getJobId());
			hChecklistItem.setPhaseId(eJob.getPhaseId());
			hChecklistItem.setTechId(eJob.getTechId());
			hChecklistItem.setChecklistId(eChecklist.getChecklistId());
			hChecklistItem.setCategoryId(eChecklistCategory.getCategoryId());
			hEChecklistItemList.add(hChecklistItem);
		}
		
		return hEChecklistItemList;
	}		
	
	/**
	 * 
	 * @param m
	 * @param eJob
	 * @param result
	 * @return
	 */
	private List<HETime> setETimeList(ObjectMapper m, EJob eJob, ResultExportJobs result) {
		// EOhs
		List<ETime> eTimeList = eJob.getETime();
		List<HETime> hETimeList = new ArrayList<HETime>();
		
		for(ETime eTime : eTimeList) {
			Map<String,Object> pTime = m.convertValue(eTime, Map.class);
			HETime hETime = m.convertValue(pTime, HETime.class);
			hETime.setTxId(result.getTxId());
			hETime.setJobId(eJob.getJobId());
			hETime.setPhaseId(eJob.getPhaseId());
			hETime.setTechId(eJob.getTechId());
			hETimeList.add(hETime);
		}
		
		return hETimeList;
	}		
	
	/**
	 * 
	 * @param m
	 * @param eJob
	 * @param result
	 * @return
	 */
	private List<HEAllowance> setEAllowanceList(ObjectMapper m, EJob eJob, ResultExportJobs result) {
		// EOhs
		List<EAllowance> eAllowanceList = eJob.getEAllowance();
		List<HEAllowance> hEAllowanceList = new ArrayList<HEAllowance>();
		
		for(EAllowance eAllowance : eAllowanceList) {
			Map<String,Object> pAllowance = m.convertValue(eAllowance, Map.class);
			HEAllowance hEAllowance = m.convertValue(pAllowance, HEAllowance.class);
			hEAllowance.setTxId(result.getTxId());
			hEAllowance.setJobId(eJob.getJobId());
			hEAllowance.setPhaseId(eJob.getPhaseId());
			hEAllowance.setTechId(eJob.getTechId());
			hEAllowanceList.add(hEAllowance);
		}
		
		return hEAllowanceList;
	}			

	/**
	 * 
	 * @param m
	 * @param eJob
	 * @param result
	 * @return
	 */
	private List<HEPurchaseOrder> setEPurchaseOrderList(ObjectMapper m, EJob eJob, ResultExportJobs result) {
		// EPurchaseOrder
		List<EPurchaseOrder> ePurchaseOrderList = eJob.getEPurchaseOrder();
		List<HEPurchaseOrder> hEPurchaseOrderList = new ArrayList<HEPurchaseOrder>();
		
		for(EPurchaseOrder ePurchaseOrder : ePurchaseOrderList) {
			Map<String,Object> pEPurchaseOrder = m.convertValue(ePurchaseOrder, Map.class);
			HEPurchaseOrder hPurchaseOrder = m.convertValue(pEPurchaseOrder, HEPurchaseOrder.class);
			hPurchaseOrder.setTxId(result.getTxId());
			hPurchaseOrder.setJobId(eJob.getJobId());
			hPurchaseOrder.setPhaseId(eJob.getPhaseId());
			hPurchaseOrder.setTechId(eJob.getTechId());
			hEPurchaseOrderList.add(hPurchaseOrder);
		}
		
		return hEPurchaseOrderList;
	}
	
	/**
	 * 
	 * @param m
	 * @param eJob
	 * @param result
	 * @return
	 */
	private List<HEReport> setEReportList(ObjectMapper m, EJob eJob, ResultExportJobs result) {
		// EReport
		List<EReport> eReportList = eJob.getEReport();
		List<HEReport> hEReportList = new ArrayList<HEReport>();
		
		for(EReport eReport : eReportList) {
			Map<String,Object> pEReport = m.convertValue(eReport, Map.class);
			HEReport hReport = m.convertValue(pEReport, HEReport.class);
			hReport.setTxId(result.getTxId());
			hReport.setJobId(eJob.getJobId());
			hReport.setPhaseId(eJob.getPhaseId());
			hReport.setTechId(eJob.getTechId());
			hEReportList.add(hReport);
		}
		
		return hEReportList;
	}	
	
	/**
	 * 
	 * @param m
	 * @param eJob
	 * @param result
	 * @return
	 */
	private List<HEAttachment> setEAttachmentList(ObjectMapper m, EJob eJob, ResultExportJobs result) {
		// EAttachment
		List<EAttachment> eAttachmentList = eJob.getEAttachment();
		List<HEAttachment> hEAttachmentList = new ArrayList<HEAttachment>();
		
		for(EAttachment eAttachment : eAttachmentList) {
			Map<String,Object> pEAttachment = m.convertValue(eAttachment, Map.class);
			HEAttachment hAttachment = m.convertValue(pEAttachment, HEAttachment.class);
			hAttachment.setTxId(result.getTxId());
			hAttachment.setJobId(eJob.getJobId());
			hAttachment.setPhaseId(eJob.getPhaseId());
			hAttachment.setTechId(eJob.getTechId());
			hEAttachmentList.add(hAttachment);
		}
		
		return hEAttachmentList;
	}
	
	@Transactional
	public UpdOperationResponseCollection sendMOS070MIUpdOperation(HEJob hEJob) throws Exception {
		UpdOperationCollection getCollection = new UpdOperationCollection();
		List<UpdOperationItem> getItemList = getCollection.getUpdOperationItem();		
		
		UpdOperationItem gItem = new UpdOperationItem();
		au.com.tmha.mos070mi.updoperation.ObjectFactory factory = new au.com.tmha.mos070mi.updoperation.ObjectFactory();
		JAXBElement<BigDecimal> createCompany = factory.createUpdOperationItemCONO(BigDecimal.valueOf(1));		
		
		gItem.setCONO(createCompany);
		gItem.setMWNO(hEJob.getJobId());
		
		// Get OPNO from Job:duration in DB
		long opno = -1;
		HJob hJob = exportJobsDao.selectJob(hEJob);
		if(hJob != null) {
			opno = Long.valueOf(hJob.getDuration());
		}
		gItem.setOPNO(BigDecimal.valueOf(opno));
		
		
		JAXBElement<XMLGregorianCalendar> createRPDT = factory.createUpdOperationItemRPDT(
				DateUtil.getOnlyXMLGregorianCalendarForDate(hEJob.getJobDatetime()));		
		gItem.setRPDT(createRPDT);		// Reporting Date
		
		JAXBElement<BigDecimal> createRTM1 = factory.createUpdOperationItemRTM1(
				StringUtil.getOnlyDecimalTime(hEJob.getJobDatetime()));
		gItem.setRTM1(createRTM1);
		
		// TODO : 
		JAXBElement<BigDecimal> createUMAT = factory.createUpdOperationItemUMAT(BigDecimal.valueOf(60));
		gItem.setUMAT(createUMAT);
		
		JAXBElement<BigDecimal> createREND = factory.createUpdOperationItemREND(BigDecimal.valueOf(1));
		gItem.setREND(createREND);
		
		getItemList.add(gItem);
				
		return ((MOS070MI)HeaderFactory.getInstance()
				.getHeader(Constants.MOS070MI)).updOperation(getCollection);
	}
	
	public UpdResponseCollection sendMOS057MIUpd(HEJob hEJob) throws Exception {
		// Get Structure Type and Serial No from Asset
		Set<HENewAsset> eNewAssetSet = hEJob.geteNewAsset();
		String structureType = "002";
		String serialNo = "";
		if(eNewAssetSet != null && eNewAssetSet.size() > 0) {
			// Get First element of Set Object
			for(HENewAsset eNewAsset: eNewAssetSet) {
				structureType = eNewAsset.getAssetType();
				serialNo = eNewAsset.getSerialNo();
			    break;
			}
		}
		
		UpdCollection getCollection = new UpdCollection();
		List<UpdItem> getItemList = getCollection.getUpdItem();		
		
		UpdItem gItem = new UpdItem();
		au.com.tmha.mos057mi.upd.ObjectFactory factory = new au.com.tmha.mos057mi.upd.ObjectFactory();
		JAXBElement<BigDecimal> createReferenceOrderCategory = factory.createUpdItemRORC(BigDecimal.valueOf(6));
		
		gItem.setRORC(createReferenceOrderCategory);
		
		// Work Order Number
		JAXBElement<String> createReferenceOrderNumber = factory.createUpdItemRORN(hEJob.getJobId());
		gItem.setRORN(createReferenceOrderNumber);
		
		// Structure Type
		JAXBElement<String> createProductStructureType = factory.createUpdItemSTRT(structureType);
		gItem.setSTRT(createProductStructureType);
		
		JAXBElement<String> createService = factory.createUpdItemSUFI(hEJob.getJobDesc());
		gItem.setSUFI(createService);
		
		// Sequence Number
		JAXBElement<BigDecimal> createSequenceNumber = factory.createUpdItemSQNR(BigDecimal.valueOf(1));
		gItem.setSQNR(createSequenceNumber);
		
		// WorkDone messages
		JAXBElement<String> createText = factory.createUpdItemTXL1(hEJob.getWorkDone());
		gItem.setTXL1(createText);
		
		// Serial No
		JAXBElement<String> createSerialNumber = factory.createUpdItemSECP(serialNo);
		gItem.setSECP(createSerialNumber);
		
		
		JAXBElement<String> createStatus = factory.createUpdItemSTAT("20");
		//gItem.setSTAT(createStatus);
		
		JAXBElement<XMLGregorianCalendar> createMachineReadyDate = 
				factory.createUpdItemMRDT(DateUtil.getOnlyXMLGregorianCalendarForDate(hEJob.getJobDatetime()));
		gItem.setMRDT(createMachineReadyDate);
		
		// Tech Id
		JAXBElement<String> createReportedBy = factory.createUpdItemREPR("M3-02");
		//gItem.setREPR(createReportedBy);
		
		getItemList.add(gItem);
				
		return ((MOS057MI)HeaderFactory.getInstance()
				.getHeader(Constants.MOS057MI)).upd(getCollection);
	}
	
	/**
	 * Select failed exportJobs data	
	 */
	@Transactional
	public List<HEJob> selectExportJobs(String count) throws Exception {
		return exportJobsDao.selectExportJobs(count);
	}
	
	/**
	 * Update LogId after receiving data from REtriever
	 */
	@Transactional
	public void updateLogId(HEJob hEJob) throws Exception {
		exportJobsDao.updateLogId(hEJob);
	}
}
