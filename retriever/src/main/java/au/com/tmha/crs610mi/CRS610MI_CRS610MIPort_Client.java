
package au.com.tmha.crs610mi;

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
 * 2016-02-10T12:24:18.666+11:00
 * Generated source version: 2.7.18
 * 
 */
public final class CRS610MI_CRS610MIPort_Client {

    private static final QName SERVICE_NAME = new QName("http://www.tmha.com.au/CRS610MI", "CRS610MIService");

    private CRS610MI_CRS610MIPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = CRS610MIService.WSDL_LOCATION;
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
      
        CRS610MIService ss = new CRS610MIService(wsdlURL, SERVICE_NAME);
        CRS610MI port = ss.getCRS610MIPort();  
        
        {
        System.out.println("Invoking getAddress...");
        au.com.tmha.crs610mi.getaddress.GetAddressCollection _getAddress_getAddress = new au.com.tmha.crs610mi.getaddress.GetAddressCollection();
        java.util.List<au.com.tmha.crs610mi.getaddress.GetAddressItem> _getAddress_getAddressGetAddressItem = new java.util.ArrayList<au.com.tmha.crs610mi.getaddress.GetAddressItem>();
        au.com.tmha.crs610mi.getaddress.GetAddressItem _getAddress_getAddressGetAddressItemVal1 = new au.com.tmha.crs610mi.getaddress.GetAddressItem();
        javax.xml.bind.JAXBElement<java.math.BigDecimal> _getAddress_getAddressGetAddressItemVal1Company = null;
        _getAddress_getAddressGetAddressItemVal1.setCompany(_getAddress_getAddressGetAddressItemVal1Company);
        _getAddress_getAddressGetAddressItemVal1.setCustomerNumber("CustomerNumber-425564609");
        _getAddress_getAddressGetAddressItemVal1.setAddressType(new java.math.BigDecimal("-6495905146792654370.2784529050926364384"));
        _getAddress_getAddressGetAddressItemVal1.setAddressNumber("AddressNumber-1319722575");
        _getAddress_getAddressGetAddressItem.add(_getAddress_getAddressGetAddressItemVal1);
        _getAddress_getAddress.getGetAddressItem().addAll(_getAddress_getAddressGetAddressItem);
        _getAddress_getAddress.setMaxRecords(Integer.valueOf(1162021993));
        au.com.tmha.crs610mi.getaddress.GetAddressResponseCollection _getAddress__return = port.getAddress(_getAddress_getAddress);
        System.out.println("getAddress.result=" + _getAddress__return);


        }

        System.exit(0);
    }

}