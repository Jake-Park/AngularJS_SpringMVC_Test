
package au.com.tmha.mos070mi;

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
 * 2016-02-24T10:21:59.907+11:00
 * Generated source version: 2.7.18
 * 
 */
public final class MOS070MI_MOS070MIPort_Client {

    private static final QName SERVICE_NAME = new QName("http://www.tmha.com.au/MOS070MI", "MOS070MIService");

    private MOS070MI_MOS070MIPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = MOS070MIService.WSDL_LOCATION;
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
      
        MOS070MIService ss = new MOS070MIService(wsdlURL, SERVICE_NAME);
        MOS070MI port = ss.getMOS070MIPort();  
        
        {
        System.out.println("Invoking updOperation...");
        au.com.tmha.mos070mi.updoperation.UpdOperationCollection _updOperation_updOperation = new au.com.tmha.mos070mi.updoperation.UpdOperationCollection();
        java.util.List<au.com.tmha.mos070mi.updoperation.UpdOperationItem> _updOperation_updOperationUpdOperationItem = new java.util.ArrayList<au.com.tmha.mos070mi.updoperation.UpdOperationItem>();
        au.com.tmha.mos070mi.updoperation.UpdOperationItem _updOperation_updOperationUpdOperationItemVal1 = new au.com.tmha.mos070mi.updoperation.UpdOperationItem();
        javax.xml.bind.JAXBElement<java.math.BigDecimal> _updOperation_updOperationUpdOperationItemVal1CONO = null;
        _updOperation_updOperationUpdOperationItemVal1.setCONO(_updOperation_updOperationUpdOperationItemVal1CONO);
        _updOperation_updOperationUpdOperationItemVal1.setMWNO("MWNO-287810579");
        _updOperation_updOperationUpdOperationItemVal1.setOPNO(new java.math.BigDecimal("-3810181983440602658.789487253546005994"));
        javax.xml.bind.JAXBElement<javax.xml.datatype.XMLGregorianCalendar> _updOperation_updOperationUpdOperationItemVal1RPDT = null;
        _updOperation_updOperationUpdOperationItemVal1.setRPDT(_updOperation_updOperationUpdOperationItemVal1RPDT);
        javax.xml.bind.JAXBElement<java.math.BigDecimal> _updOperation_updOperationUpdOperationItemVal1RTM1 = null;
        _updOperation_updOperationUpdOperationItemVal1.setRTM1(_updOperation_updOperationUpdOperationItemVal1RTM1);
        javax.xml.bind.JAXBElement<java.lang.String> _updOperation_updOperationUpdOperationItemVal1RPRE = null;
        _updOperation_updOperationUpdOperationItemVal1.setRPRE(_updOperation_updOperationUpdOperationItemVal1RPRE);
        javax.xml.bind.JAXBElement<java.lang.String> _updOperation_updOperationUpdOperationItemVal1EMNO = null;
        _updOperation_updOperationUpdOperationItemVal1.setEMNO(_updOperation_updOperationUpdOperationItemVal1EMNO);
        javax.xml.bind.JAXBElement<java.math.BigDecimal> _updOperation_updOperationUpdOperationItemVal1UMAS = null;
        _updOperation_updOperationUpdOperationItemVal1.setUMAS(_updOperation_updOperationUpdOperationItemVal1UMAS);
        javax.xml.bind.JAXBElement<java.math.BigDecimal> _updOperation_updOperationUpdOperationItemVal1UMAT = null;
        _updOperation_updOperationUpdOperationItemVal1.setUMAT(_updOperation_updOperationUpdOperationItemVal1UMAT);
        javax.xml.bind.JAXBElement<java.math.BigDecimal> _updOperation_updOperationUpdOperationItemVal1UPIT = null;
        _updOperation_updOperationUpdOperationItemVal1.setUPIT(_updOperation_updOperationUpdOperationItemVal1UPIT);
        javax.xml.bind.JAXBElement<java.math.BigDecimal> _updOperation_updOperationUpdOperationItemVal1USET = null;
        _updOperation_updOperationUpdOperationItemVal1.setUSET(_updOperation_updOperationUpdOperationItemVal1USET);
        javax.xml.bind.JAXBElement<java.math.BigDecimal> _updOperation_updOperationUpdOperationItemVal1REND = null;
        _updOperation_updOperationUpdOperationItemVal1.setREND(_updOperation_updOperationUpdOperationItemVal1REND);
        javax.xml.bind.JAXBElement<java.math.BigDecimal> _updOperation_updOperationUpdOperationItemVal1MAQA = null;
        _updOperation_updOperationUpdOperationItemVal1.setMAQA(_updOperation_updOperationUpdOperationItemVal1MAQA);
        javax.xml.bind.JAXBElement<java.math.BigDecimal> _updOperation_updOperationUpdOperationItemVal1SCQA = null;
        _updOperation_updOperationUpdOperationItemVal1.setSCQA(_updOperation_updOperationUpdOperationItemVal1SCQA);
        javax.xml.bind.JAXBElement<java.lang.String> _updOperation_updOperationUpdOperationItemVal1SCRE = null;
        _updOperation_updOperationUpdOperationItemVal1.setSCRE(_updOperation_updOperationUpdOperationItemVal1SCRE);
        javax.xml.bind.JAXBElement<java.lang.String> _updOperation_updOperationUpdOperationItemVal1DPLG = null;
        _updOperation_updOperationUpdOperationItemVal1.setDPLG(_updOperation_updOperationUpdOperationItemVal1DPLG);
        javax.xml.bind.JAXBElement<java.lang.String> _updOperation_updOperationUpdOperationItemVal1PCTP = null;
        _updOperation_updOperationUpdOperationItemVal1.setPCTP(_updOperation_updOperationUpdOperationItemVal1PCTP);
        javax.xml.bind.JAXBElement<java.lang.String> _updOperation_updOperationUpdOperationItemVal1FCLA = null;
        _updOperation_updOperationUpdOperationItemVal1.setFCLA(_updOperation_updOperationUpdOperationItemVal1FCLA);
        javax.xml.bind.JAXBElement<java.lang.String> _updOperation_updOperationUpdOperationItemVal1FCL2 = null;
        _updOperation_updOperationUpdOperationItemVal1.setFCL2(_updOperation_updOperationUpdOperationItemVal1FCL2);
        javax.xml.bind.JAXBElement<java.lang.String> _updOperation_updOperationUpdOperationItemVal1FCL3 = null;
        _updOperation_updOperationUpdOperationItemVal1.setFCL3(_updOperation_updOperationUpdOperationItemVal1FCL3);
        javax.xml.bind.JAXBElement<java.math.BigDecimal> _updOperation_updOperationUpdOperationItemVal1DOWT = null;
        _updOperation_updOperationUpdOperationItemVal1.setDOWT(_updOperation_updOperationUpdOperationItemVal1DOWT);
        javax.xml.bind.JAXBElement<java.math.BigDecimal> _updOperation_updOperationUpdOperationItemVal1DLY1 = null;
        _updOperation_updOperationUpdOperationItemVal1.setDLY1(_updOperation_updOperationUpdOperationItemVal1DLY1);
        javax.xml.bind.JAXBElement<java.math.BigDecimal> _updOperation_updOperationUpdOperationItemVal1DLY2 = null;
        _updOperation_updOperationUpdOperationItemVal1.setDLY2(_updOperation_updOperationUpdOperationItemVal1DLY2);
        javax.xml.bind.JAXBElement<java.lang.String> _updOperation_updOperationUpdOperationItemVal1TXL1 = null;
        _updOperation_updOperationUpdOperationItemVal1.setTXL1(_updOperation_updOperationUpdOperationItemVal1TXL1);
        javax.xml.bind.JAXBElement<java.lang.String> _updOperation_updOperationUpdOperationItemVal1TXL2 = null;
        _updOperation_updOperationUpdOperationItemVal1.setTXL2(_updOperation_updOperationUpdOperationItemVal1TXL2);
        javax.xml.bind.JAXBElement<java.lang.String> _updOperation_updOperationUpdOperationItemVal1EQNO = null;
        _updOperation_updOperationUpdOperationItemVal1.setEQNO(_updOperation_updOperationUpdOperationItemVal1EQNO);
        javax.xml.bind.JAXBElement<java.lang.String> _updOperation_updOperationUpdOperationItemVal1STRT = null;
        _updOperation_updOperationUpdOperationItemVal1.setSTRT(_updOperation_updOperationUpdOperationItemVal1STRT);
        javax.xml.bind.JAXBElement<java.lang.String> _updOperation_updOperationUpdOperationItemVal1SUFI = null;
        _updOperation_updOperationUpdOperationItemVal1.setSUFI(_updOperation_updOperationUpdOperationItemVal1SUFI);
        javax.xml.bind.JAXBElement<java.math.BigDecimal> _updOperation_updOperationUpdOperationItemVal1TXID = null;
        _updOperation_updOperationUpdOperationItemVal1.setTXID(_updOperation_updOperationUpdOperationItemVal1TXID);
        javax.xml.bind.JAXBElement<java.math.BigDecimal> _updOperation_updOperationUpdOperationItemVal1CLBL = null;
        _updOperation_updOperationUpdOperationItemVal1.setCLBL(_updOperation_updOperationUpdOperationItemVal1CLBL);
        javax.xml.bind.JAXBElement<java.math.BigDecimal> _updOperation_updOperationUpdOperationItemVal1INFR = null;
        _updOperation_updOperationUpdOperationItemVal1.setINFR(_updOperation_updOperationUpdOperationItemVal1INFR);
        javax.xml.bind.JAXBElement<java.lang.String> _updOperation_updOperationUpdOperationItemVal1REMK = null;
        _updOperation_updOperationUpdOperationItemVal1.setREMK(_updOperation_updOperationUpdOperationItemVal1REMK);
        javax.xml.bind.JAXBElement<java.lang.String> _updOperation_updOperationUpdOperationItemVal1LCDE = null;
        _updOperation_updOperationUpdOperationItemVal1.setLCDE(_updOperation_updOperationUpdOperationItemVal1LCDE);
        _updOperation_updOperationUpdOperationItem.add(_updOperation_updOperationUpdOperationItemVal1);
        _updOperation_updOperation.getUpdOperationItem().addAll(_updOperation_updOperationUpdOperationItem);
        _updOperation_updOperation.setMaxRecords(Integer.valueOf(1406002277));
        au.com.tmha.mos070mi.updoperation.UpdOperationResponseCollection _updOperation__return = port.updOperation(_updOperation_updOperation);
        System.out.println("updOperation.result=" + _updOperation__return);


        }

        System.exit(0);
    }

}
