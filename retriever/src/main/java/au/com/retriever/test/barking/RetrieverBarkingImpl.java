
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package au.com.retriever.test.barking;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.18
 * 2016-01-27T10:48:01.646+11:00
 * Generated source version: 2.7.18
 * 
 */

@javax.jws.WebService(
                      serviceName = "RetrieverBarkingService",
                      portName = "RetrieverBarkingPort",
                      targetNamespace = "https://test.retriever.com.au/barking",
                      wsdlLocation = "file:/C:/Users/User/workspace/JAXWSEclipse/WebContent/WEB-INF/retriever.wsdl",
                      endpointInterface = "au.com.retriever.test.barking.RetrieverBarking")
                      
public class RetrieverBarkingImpl implements RetrieverBarking {

    private static final Logger LOG = Logger.getLogger(RetrieverBarkingImpl.class.getName());

    /* (non-Javadoc)
     * @see au.com.retriever.test.barking.RetrieverBarking#exportStatusUpdates(au.com.retriever.test.barking.StatusUpdate  statusUpdate )*
     */
    public au.com.retriever.test.barking.ResultExportStatusUpdates exportStatusUpdates(au.com.retriever.test.barking.StatusUpdate statusUpdate) { 
        LOG.info("Executing operation exportStatusUpdates");
        System.out.println(statusUpdate);
        try {
            au.com.retriever.test.barking.ResultExportStatusUpdates _return = new au.com.retriever.test.barking.ResultExportStatusUpdates();
            _return.setSuccess(true);
            _return.setErrorCode(new java.math.BigInteger("79560878612011326363730464994751517156"));
            _return.setErrorMsg("ErrorMsg-650844236");
            _return.setTxId("TxId-2112257284");
            java.util.List<au.com.retriever.test.barking.EStatus> _returnEStatusUpdate = new java.util.ArrayList<au.com.retriever.test.barking.EStatus>();
            au.com.retriever.test.barking.EStatus _returnEStatusUpdateVal1 = new au.com.retriever.test.barking.EStatus();
            _returnEStatusUpdateVal1.setJobId("JobId384836996");
            _returnEStatusUpdateVal1.setPhaseId(new java.math.BigInteger("-17285335941591430596227373336548986872"));
            _returnEStatusUpdateVal1.setTechId("TechId56699604");
            _returnEStatusUpdateVal1.setStatusId(new java.math.BigInteger("44356048663630073845374234945948515373"));
            _returnEStatusUpdateVal1.setStatusDate("StatusDate1686541186");
            _returnEStatusUpdateVal1.setStatusTime("StatusTime2137296992");
            _returnEStatusUpdateVal1.setRejectReason("RejectReason926254589");
            _returnEStatusUpdateVal1.setStatusDesc("StatusDesc-1238544503");
            _returnEStatusUpdate.add(_returnEStatusUpdateVal1);
            _return.getEStatusUpdate().addAll(_returnEStatusUpdate);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see au.com.retriever.test.barking.RetrieverBarking#createJob(au.com.retriever.test.barking.Job  job )*
     */
    public au.com.retriever.test.barking.Result createJob(au.com.retriever.test.barking.Job job) { 
        LOG.info("Executing operation createJob");
        System.out.println(job);
        try {
            au.com.retriever.test.barking.Result _return = new au.com.retriever.test.barking.Result();
            _return.setSuccess(false);
            _return.setTxId("TxId-1276465328");
            _return.setErrorCode(new java.math.BigInteger("-52320851133995356385207839569332440237"));
            _return.setErrorMsg("ErrorMsg-1418064746");
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see au.com.retriever.test.barking.RetrieverBarking#exportJobs(au.com.retriever.test.barking.ExportJob  job )*
     */
    public au.com.retriever.test.barking.ResultExportJobs exportJobs(au.com.retriever.test.barking.ExportJob job) { 
        LOG.info("Executing operation exportJobs");
        System.out.println(job);
        try {
            au.com.retriever.test.barking.ResultExportJobs _return = new au.com.retriever.test.barking.ResultExportJobs();
            _return.setSuccess(false);
            _return.setErrorCode(new java.math.BigInteger("3366181407485118454527478228862258930"));
            _return.setErrorMsg("ErrorMsg698250597");
            _return.setTxId("TxId-177101292");
            java.util.List<au.com.retriever.test.barking.EJob> _returnEJob = new java.util.ArrayList<au.com.retriever.test.barking.EJob>();
            au.com.retriever.test.barking.EJob _returnEJobVal1 = new au.com.retriever.test.barking.EJob();
            _returnEJobVal1.setJobId("JobId1381530761");
            _returnEJobVal1.setPhaseId(new java.math.BigInteger("-28962505458334169855145702110708529355"));
            _returnEJobVal1.setTechId("TechId1415701584");
            _returnEJobVal1.setWorkDone("WorkDone714713145");
            _returnEJobVal1.setWorkRecommend("WorkRecommend-956059262");
            _returnEJobVal1.setComments("Comments505176882");
            _returnEJobVal1.setOfficeNotes("OfficeNotes1261625630");
            _returnEJobVal1.setJobDatetime(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2016-01-27T10:48:01.662+11:00"));
            _returnEJobVal1.setSignatureName("SignatureName369481984");
            _returnEJobVal1.setJobStatus(new java.math.BigInteger("87125379071624943586793185802235737731"));
            _returnEJobVal1.setCustomerName("CustomerName1656387355");
            _returnEJobVal1.setCustId("CustId-1623944435");
            _returnEJobVal1.setAddress1("Address12102146143");
            _returnEJobVal1.setAddress2("Address2-284316307");
            _returnEJobVal1.setSuburb("Suburb-1522711956");
            _returnEJobVal1.setPostCode("PostCode-793511608");
            _returnEJobVal1.setContact("Contact339164555");
            _returnEJobVal1.setPhone("Phone-767917103");
            _returnEJobVal1.setJobDesc("JobDesc1685677237");
            _returnEJobVal1.setCreateDatetime(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2016-01-27T10:48:01.664+11:00"));
            _returnEJobVal1.setTechName("TechName180429885");
            _returnEJobVal1.setAmountOwing(Double.valueOf(0.35023288222512805));
            _returnEJobVal1.setSerialNo("SerialNo293992318");
            _returnEJobVal1.setJobType("JobType1745815558");
            _returnEJobVal1.setEmail("Email1101355415");
            _returnEJobVal1.setFirstOhsCompleted(true);
            _returnEJobVal1.setAccountMgrEmail("AccountMgrEmail1395593307");
            _returnEJobVal1.setServiceMgrEmail("ServiceMgrEmail-676264696");
            java.util.List<au.com.retriever.test.barking.EOhs> _returnEJobVal1EOhs = new java.util.ArrayList<au.com.retriever.test.barking.EOhs>();
            _returnEJobVal1.getEOhs().addAll(_returnEJobVal1EOhs);
            java.util.List<au.com.retriever.test.barking.ENewAsset> _returnEJobVal1ENewAsset = new java.util.ArrayList<au.com.retriever.test.barking.ENewAsset>();
            _returnEJobVal1.getENewAsset().addAll(_returnEJobVal1ENewAsset);
            java.util.List<au.com.retriever.test.barking.EService> _returnEJobVal1EService = new java.util.ArrayList<au.com.retriever.test.barking.EService>();
            _returnEJobVal1.getEService().addAll(_returnEJobVal1EService);
            java.util.List<au.com.retriever.test.barking.EPart> _returnEJobVal1EPart = new java.util.ArrayList<au.com.retriever.test.barking.EPart>();
            _returnEJobVal1.getEPart().addAll(_returnEJobVal1EPart);
            java.util.List<au.com.retriever.test.barking.ESignature> _returnEJobVal1ESignature = new java.util.ArrayList<au.com.retriever.test.barking.ESignature>();
            _returnEJobVal1.getESignature().addAll(_returnEJobVal1ESignature);
            java.util.List<au.com.retriever.test.barking.EChecklist> _returnEJobVal1EChecklist = new java.util.ArrayList<au.com.retriever.test.barking.EChecklist>();
            _returnEJobVal1.getEChecklist().addAll(_returnEJobVal1EChecklist);
            java.util.List<au.com.retriever.test.barking.ETime> _returnEJobVal1ETime = new java.util.ArrayList<au.com.retriever.test.barking.ETime>();
            _returnEJobVal1.getETime().addAll(_returnEJobVal1ETime);
            java.util.List<au.com.retriever.test.barking.EAllowance> _returnEJobVal1EAllowance = new java.util.ArrayList<au.com.retriever.test.barking.EAllowance>();
            _returnEJobVal1.getEAllowance().addAll(_returnEJobVal1EAllowance);
            java.util.List<au.com.retriever.test.barking.EPurchaseOrder> _returnEJobVal1EPurchaseOrder = new java.util.ArrayList<au.com.retriever.test.barking.EPurchaseOrder>();
            _returnEJobVal1.getEPurchaseOrder().addAll(_returnEJobVal1EPurchaseOrder);
            java.util.List<au.com.retriever.test.barking.EReport> _returnEJobVal1EReport = new java.util.ArrayList<au.com.retriever.test.barking.EReport>();
            _returnEJobVal1.getEReport().addAll(_returnEJobVal1EReport);
            _returnEJobVal1.setPaymentOption("PaymentOption1182584362");
            _returnEJobVal1.setCardType("CardType-1532516600");
            _returnEJobVal1.setCardNo("CardNo-679694755");
            _returnEJobVal1.setCardExpiry("CardExpiry198457944");
            _returnEJobVal1.setReferenceNo("ReferenceNo971575639");
            java.util.List<au.com.retriever.test.barking.EAttachment> _returnEJobVal1EAttachment = new java.util.ArrayList<au.com.retriever.test.barking.EAttachment>();
            _returnEJobVal1.getEAttachment().addAll(_returnEJobVal1EAttachment);
            _returnEJob.add(_returnEJobVal1);
            _return.getEJob().addAll(_returnEJob);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
