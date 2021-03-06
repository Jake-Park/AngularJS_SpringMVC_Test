
package au.com.retriever.test.barking;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.18
 * 2016-01-27T10:48:01.585+11:00
 * Generated source version: 2.7.18
 * 
 */
public final class RetrieverBarking_RetrieverBarkingPort_Client {

    private static final QName SERVICE_NAME = new QName("https://test.retriever.com.au/barking", "RetrieverBarkingService");

    private RetrieverBarking_RetrieverBarkingPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = RetrieverBarkingService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        RetrieverBarkingService ss = new RetrieverBarkingService(wsdlURL, SERVICE_NAME);
        RetrieverBarking port = ss.getRetrieverBarkingPort();  
        
        {
        System.out.println("Invoking exportStatusUpdates...");
        au.com.retriever.test.barking.StatusUpdate _exportStatusUpdates_statusUpdate = new au.com.retriever.test.barking.StatusUpdate();
        _exportStatusUpdates_statusUpdate.setTimeout("Timeout424395080");
        _exportStatusUpdates_statusUpdate.setUpdatedSince("UpdatedSince-504502506");
        _exportStatusUpdates_statusUpdate.setExport(true);
        _exportStatusUpdates_statusUpdate.setMax(new java.math.BigInteger("-53705669101661736085456397292573098467"));
        _exportStatusUpdates_statusUpdate.setTransactionId("TransactionId-1045183505");
        _exportStatusUpdates_statusUpdate.setMaxProcessingTime(new java.math.BigInteger("-72923179259966471211005440837411742211"));
        au.com.retriever.test.barking.ResultExportStatusUpdates _exportStatusUpdates__return = port.exportStatusUpdates(_exportStatusUpdates_statusUpdate);
        System.out.println("exportStatusUpdates.result=" + _exportStatusUpdates__return);


        }
        {
        System.out.println("Invoking createJob...");
        au.com.retriever.test.barking.Job _createJob_job = new au.com.retriever.test.barking.Job();
        _createJob_job.setJobId("JobId797994897");
        _createJob_job.setPhaseId(new java.math.BigInteger("657679953280794361345932825119586398"));
        _createJob_job.setEmployer("Employer-838254333");
        _createJob_job.setSubEmployer("SubEmployer1148780019");
        _createJob_job.setTechId("TechId-1589747359");
        _createJob_job.setCustomerName("CustomerName765399437");
        _createJob_job.setCustId("CustId436749218");
        _createJob_job.setAddress1("Address1-1048147423");
        _createJob_job.setAddress2("Address2-662885991");
        _createJob_job.setSuburb("Suburb-251221786");
        _createJob_job.setPostCode("PostCode1513480476");
        _createJob_job.setSerialNo("SerialNo1004616212");
        _createJob_job.setContactName("ContactName-285312329");
        _createJob_job.setContactPhone("ContactPhone817017882");
        _createJob_job.setJobDesc("JobDesc448780974");
        _createJob_job.setStartDate(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2016-01-27T10:48:01.639+11:00"));
        _createJob_job.setDuration("Duration1979899489");
        _createJob_job.setPlannedStart(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2016-01-27T10:48:01.640+11:00"));
        _createJob_job.setPlannedEnd(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2016-01-27T10:48:01.640+11:00"));
        _createJob_job.setJobType("JobType1126333483");
        _createJob_job.setCustomerEmail("CustomerEmail-1000796201");
        _createJob_job.setPriority(Boolean.valueOf(false));
        _createJob_job.setSlaPriority("SlaPriority2065118628");
        _createJob_job.setOfficeNote("OfficeNote-637396888");
        _createJob_job.setAccountMgrEmail("AccountMgrEmail1477348523");
        _createJob_job.setServiceMgrEmail("ServiceMgrEmail-1713431573");
        java.util.List<au.com.retriever.test.barking.JobAsset> _createJob_jobAssets = new java.util.ArrayList<au.com.retriever.test.barking.JobAsset>();
        au.com.retriever.test.barking.JobAsset _createJob_jobAssetsVal1 = new au.com.retriever.test.barking.JobAsset();
        _createJob_jobAssetsVal1.setSerialNo("SerialNo-1332028217");
        _createJob_jobAssetsVal1.setDescription("Description581460439");
        _createJob_jobAssetsVal1.setAssetType("AssetType-983948565");
        _createJob_jobAssetsVal1.setServiceLevel("ServiceLevel1542895782");
        _createJob_jobAssetsVal1.setModelNumber("ModelNumber-457015420");
        _createJob_jobAssetsVal1.setLocation("Location-12004595");
        _createJob_jobAssetsVal1.setBuildingName("BuildingName82641110");
        _createJob_jobAssetsVal1.setInstallDate(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2016-01-27T10:48:01.641+11:00"));
        _createJob_jobAssetsVal1.setMake("Make-357717756");
        _createJob_jobAssetsVal1.setOrderId(new java.math.BigInteger("46854469265777536635527369229625110258"));
        _createJob_jobAssetsVal1.setNotes("Notes1000600984");
        _createJob_jobAssetsVal1.setIsMandatory(Boolean.valueOf(false));
        _createJob_jobAssets.add(_createJob_jobAssetsVal1);
        _createJob_job.getAssets().addAll(_createJob_jobAssets);
        java.util.List<au.com.retriever.test.barking.JobService> _createJob_jobServices = new java.util.ArrayList<au.com.retriever.test.barking.JobService>();
        au.com.retriever.test.barking.JobService _createJob_jobServicesVal1 = new au.com.retriever.test.barking.JobService();
        _createJob_jobServicesVal1.setServiceId("ServiceId-243267884");
        _createJob_jobServicesVal1.setServiceName("ServiceName1023349112");
        _createJob_jobServicesVal1.setServiceDescription("ServiceDescription-1381191015");
        _createJob_jobServicesVal1.setServiceType("ServiceType1924974845");
        _createJob_jobServicesVal1.setServiceOrderId(new java.math.BigInteger("32227738446874799784222369517681863774"));
        _createJob_jobServices.add(_createJob_jobServicesVal1);
        _createJob_job.getServices().addAll(_createJob_jobServices);
        au.com.retriever.test.barking.Result _createJob__return = port.createJob(_createJob_job);
        System.out.println("createJob.result=" + _createJob__return);


        }
        {
        System.out.println("Invoking exportJobs...");
        au.com.retriever.test.barking.ExportJob _exportJobs_job = new au.com.retriever.test.barking.ExportJob();
        _exportJobs_job.setTimeout("Timeout-697494012");
        _exportJobs_job.setUpdatedSince("UpdatedSince587938076");
        _exportJobs_job.setExport(false);
        _exportJobs_job.setMax(new java.math.BigInteger("-54249110841864518817040565367413056520"));
        _exportJobs_job.setTransactionId("TransactionId2123453516");
        _exportJobs_job.setMaxProcessingTime(new java.math.BigInteger("-2413214668708212253737710210021229919"));
        _exportJobs_job.setJobId("JobId-1403804724");
        au.com.retriever.test.barking.ResultExportJobs _exportJobs__return = port.exportJobs(_exportJobs_job);
        System.out.println("exportJobs.result=" + _exportJobs__return);


        }

        System.exit(0);
    }

}
