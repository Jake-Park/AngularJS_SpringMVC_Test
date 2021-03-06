
package au.com.tmha.cos100mi;

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
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.18
 * 2016-02-09T10:11:06.120+11:00
 * Generated source version: 2.7.18
 * 
 */
public final class COS100MI_COS100MIPort_Client {

    private static final QName SERVICE_NAME = new QName("http://www.tmha.com.au/COS100MI", "COS100MIService");

    private COS100MI_COS100MIPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = COS100MIService.WSDL_LOCATION;
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
      
        COS100MIService ss = new COS100MIService(wsdlURL, SERVICE_NAME);
        COS100MI port = ss.getCOS100MIPort();  
        
        {
        System.out.println("Invoking lstMCOLines...");
        au.com.tmha.cos100mi.lstmcolines.LstMCOLinesCollection _lstMCOLines_lstMCOLines = new au.com.tmha.cos100mi.lstmcolines.LstMCOLinesCollection();
        java.util.List<au.com.tmha.cos100mi.lstmcolines.LstMCOLinesItem> _lstMCOLines_lstMCOLinesLstMCOLinesItem = new java.util.ArrayList<au.com.tmha.cos100mi.lstmcolines.LstMCOLinesItem>();
        au.com.tmha.cos100mi.lstmcolines.LstMCOLinesItem _lstMCOLines_lstMCOLinesLstMCOLinesItemVal1 = new au.com.tmha.cos100mi.lstmcolines.LstMCOLinesItem();
        javax.xml.bind.JAXBElement<java.math.BigDecimal> _lstMCOLines_lstMCOLinesLstMCOLinesItemVal1Company = null;
        _lstMCOLines_lstMCOLinesLstMCOLinesItemVal1.setCompany(_lstMCOLines_lstMCOLinesLstMCOLinesItemVal1Company);
        javax.xml.bind.JAXBElement<java.lang.String> _lstMCOLines_lstMCOLinesLstMCOLinesItemVal1CustomerOrderNumber = null;
        _lstMCOLines_lstMCOLinesLstMCOLinesItemVal1.setCustomerOrderNumber(_lstMCOLines_lstMCOLinesLstMCOLinesItemVal1CustomerOrderNumber);
        _lstMCOLines_lstMCOLinesLstMCOLinesItem.add(_lstMCOLines_lstMCOLinesLstMCOLinesItemVal1);
        _lstMCOLines_lstMCOLines.getLstMCOLinesItem().addAll(_lstMCOLines_lstMCOLinesLstMCOLinesItem);
        _lstMCOLines_lstMCOLines.setMaxRecords(Integer.valueOf(-1493311522));
        au.com.tmha.cos100mi.lstmcolines.LstMCOLinesResponseCollection _lstMCOLines__return = port.lstMCOLines(_lstMCOLines_lstMCOLines);
        System.out.println("lstMCOLines.result=" + _lstMCOLines__return);


        }
        {
        System.out.println("Invoking getMCOHead...");
        au.com.tmha.cos100mi.getmcohead.GetMCOHeadCollection _getMCOHead_getMCOHead = new au.com.tmha.cos100mi.getmcohead.GetMCOHeadCollection();
        java.util.List<au.com.tmha.cos100mi.getmcohead.GetMCOHeadItem> _getMCOHead_getMCOHeadGetMCOHeadItem = new java.util.ArrayList<au.com.tmha.cos100mi.getmcohead.GetMCOHeadItem>();
        au.com.tmha.cos100mi.getmcohead.GetMCOHeadItem _getMCOHead_getMCOHeadGetMCOHeadItemVal1 = new au.com.tmha.cos100mi.getmcohead.GetMCOHeadItem();
        javax.xml.bind.JAXBElement<java.math.BigDecimal> _getMCOHead_getMCOHeadGetMCOHeadItemVal1Company = null;
        _getMCOHead_getMCOHeadGetMCOHeadItemVal1.setCompany(_getMCOHead_getMCOHeadGetMCOHeadItemVal1Company);
        javax.xml.bind.JAXBElement<java.lang.String> _getMCOHead_getMCOHeadGetMCOHeadItemVal1CustomerOrderNumber = null;
        _getMCOHead_getMCOHeadGetMCOHeadItemVal1.setCustomerOrderNumber(_getMCOHead_getMCOHeadGetMCOHeadItemVal1CustomerOrderNumber);
        _getMCOHead_getMCOHeadGetMCOHeadItem.add(_getMCOHead_getMCOHeadGetMCOHeadItemVal1);
        _getMCOHead_getMCOHead.getGetMCOHeadItem().addAll(_getMCOHead_getMCOHeadGetMCOHeadItem);
        _getMCOHead_getMCOHead.setMaxRecords(Integer.valueOf(-1062316407));
        au.com.tmha.cos100mi.getmcohead.GetMCOHeadResponseCollection _getMCOHead__return = port.getMCOHead(_getMCOHead_getMCOHead);
        System.out.println("getMCOHead.result=" + _getMCOHead__return);


        }

        System.exit(0);
    }

}
