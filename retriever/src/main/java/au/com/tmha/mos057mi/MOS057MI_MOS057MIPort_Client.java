
package au.com.tmha.mos057mi;

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
 * 2016-02-24T13:10:05.796+11:00
 * Generated source version: 2.7.18
 * 
 */
public final class MOS057MI_MOS057MIPort_Client {

    private static final QName SERVICE_NAME = new QName("http://www.tmha.com.au/MOS057MI", "MOS057MIService");

    private MOS057MI_MOS057MIPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = MOS057MIService.WSDL_LOCATION;
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
      
        MOS057MIService ss = new MOS057MIService(wsdlURL, SERVICE_NAME);
        MOS057MI port = ss.getMOS057MIPort();  
        
        {
        System.out.println("Invoking add...");
        au.com.tmha.mos057mi.add.AddCollection _add_add = new au.com.tmha.mos057mi.add.AddCollection();
        java.util.List<au.com.tmha.mos057mi.add.AddItem> _add_addAddItem = new java.util.ArrayList<au.com.tmha.mos057mi.add.AddItem>();
        au.com.tmha.mos057mi.add.AddItem _add_addAddItemVal1 = new au.com.tmha.mos057mi.add.AddItem();
        javax.xml.bind.JAXBElement<java.math.BigDecimal> _add_addAddItemVal1ReferenceOrderCategory = null;
        _add_addAddItemVal1.setReferenceOrderCategory(_add_addAddItemVal1ReferenceOrderCategory);
        javax.xml.bind.JAXBElement<java.lang.String> _add_addAddItemVal1ReferenceOrderNumber = null;
        _add_addAddItemVal1.setReferenceOrderNumber(_add_addAddItemVal1ReferenceOrderNumber);
        javax.xml.bind.JAXBElement<java.math.BigDecimal> _add_addAddItemVal1ReferenceOrderLine = null;
        _add_addAddItemVal1.setReferenceOrderLine(_add_addAddItemVal1ReferenceOrderLine);
        javax.xml.bind.JAXBElement<java.math.BigDecimal> _add_addAddItemVal1LineSuffix = null;
        _add_addAddItemVal1.setLineSuffix(_add_addAddItemVal1LineSuffix);
        javax.xml.bind.JAXBElement<java.lang.String> _add_addAddItemVal1ProductStructureType = null;
        _add_addAddItemVal1.setProductStructureType(_add_addAddItemVal1ProductStructureType);
        javax.xml.bind.JAXBElement<java.lang.String> _add_addAddItemVal1Service = null;
        _add_addAddItemVal1.setService(_add_addAddItemVal1Service);
        javax.xml.bind.JAXBElement<java.math.BigDecimal> _add_addAddItemVal1SequenceNumber = null;
        _add_addAddItemVal1.setSequenceNumber(_add_addAddItemVal1SequenceNumber);
        javax.xml.bind.JAXBElement<java.math.BigDecimal> _add_addAddItemVal1MainService = null;
        _add_addAddItemVal1.setMainService(_add_addAddItemVal1MainService);
        javax.xml.bind.JAXBElement<java.lang.String> _add_addAddItemVal1Status = null;
        _add_addAddItemVal1.setStatus(_add_addAddItemVal1Status);
        javax.xml.bind.JAXBElement<java.math.BigDecimal> _add_addAddItemVal1ReferenceIdentityCode = null;
        _add_addAddItemVal1.setReferenceIdentityCode(_add_addAddItemVal1ReferenceIdentityCode);
        javax.xml.bind.JAXBElement<java.lang.String> _add_addAddItemVal1OrderNumber = null;
        _add_addAddItemVal1.setOrderNumber(_add_addAddItemVal1OrderNumber);
        javax.xml.bind.JAXBElement<java.math.BigDecimal> _add_addAddItemVal1OrderLine = null;
        _add_addAddItemVal1.setOrderLine(_add_addAddItemVal1OrderLine);
        javax.xml.bind.JAXBElement<java.math.BigDecimal> _add_addAddItemVal1LineSuffixRIDX = null;
        _add_addAddItemVal1.setLineSuffixRIDX(_add_addAddItemVal1LineSuffixRIDX);
        javax.xml.bind.JAXBElement<java.lang.String> _add_addAddItemVal1ItemNumber = null;
        _add_addAddItemVal1.setItemNumber(_add_addAddItemVal1ItemNumber);
        javax.xml.bind.JAXBElement<java.lang.String> _add_addAddItemVal1ErrorCode1 = null;
        _add_addAddItemVal1.setErrorCode1(_add_addAddItemVal1ErrorCode1);
        javax.xml.bind.JAXBElement<java.lang.String> _add_addAddItemVal1ErrorCode2 = null;
        _add_addAddItemVal1.setErrorCode2(_add_addAddItemVal1ErrorCode2);
        javax.xml.bind.JAXBElement<java.lang.String> _add_addAddItemVal1ErrorCode3 = null;
        _add_addAddItemVal1.setErrorCode3(_add_addAddItemVal1ErrorCode3);
        javax.xml.bind.JAXBElement<javax.xml.datatype.XMLGregorianCalendar> _add_addAddItemVal1BreakdownDate = null;
        _add_addAddItemVal1.setBreakdownDate(_add_addAddItemVal1BreakdownDate);
        javax.xml.bind.JAXBElement<java.math.BigDecimal> _add_addAddItemVal1BreakDownTime = null;
        _add_addAddItemVal1.setBreakDownTime(_add_addAddItemVal1BreakDownTime);
        javax.xml.bind.JAXBElement<javax.xml.datatype.XMLGregorianCalendar> _add_addAddItemVal1MachineReadyDate = null;
        _add_addAddItemVal1.setMachineReadyDate(_add_addAddItemVal1MachineReadyDate);
        javax.xml.bind.JAXBElement<java.math.BigDecimal> _add_addAddItemVal1MachineReadyTime = null;
        _add_addAddItemVal1.setMachineReadyTime(_add_addAddItemVal1MachineReadyTime);
        javax.xml.bind.JAXBElement<javax.xml.datatype.XMLGregorianCalendar> _add_addAddItemVal1EquipmentInProductionDate = null;
        _add_addAddItemVal1.setEquipmentInProductionDate(_add_addAddItemVal1EquipmentInProductionDate);
        javax.xml.bind.JAXBElement<java.math.BigDecimal> _add_addAddItemVal1EquipmentInProductionTime = null;
        _add_addAddItemVal1.setEquipmentInProductionTime(_add_addAddItemVal1EquipmentInProductionTime);
        javax.xml.bind.JAXBElement<java.math.BigDecimal> _add_addAddItemVal1ErrorReportQuantity = null;
        _add_addAddItemVal1.setErrorReportQuantity(_add_addAddItemVal1ErrorReportQuantity);
        javax.xml.bind.JAXBElement<java.math.BigDecimal> _add_addAddItemVal1NonOEMPart = null;
        _add_addAddItemVal1.setNonOEMPart(_add_addAddItemVal1NonOEMPart);
        javax.xml.bind.JAXBElement<java.lang.String> _add_addAddItemVal1ReportedBy = null;
        _add_addAddItemVal1.setReportedBy(_add_addAddItemVal1ReportedBy);
        javax.xml.bind.JAXBElement<java.math.BigDecimal> _add_addAddItemVal1MeterValue1 = null;
        _add_addAddItemVal1.setMeterValue1(_add_addAddItemVal1MeterValue1);
        javax.xml.bind.JAXBElement<java.math.BigDecimal> _add_addAddItemVal1MeterValue2 = null;
        _add_addAddItemVal1.setMeterValue2(_add_addAddItemVal1MeterValue2);
        javax.xml.bind.JAXBElement<java.math.BigDecimal> _add_addAddItemVal1MeterValue3 = null;
        _add_addAddItemVal1.setMeterValue3(_add_addAddItemVal1MeterValue3);
        javax.xml.bind.JAXBElement<java.math.BigDecimal> _add_addAddItemVal1MeterValue4 = null;
        _add_addAddItemVal1.setMeterValue4(_add_addAddItemVal1MeterValue4);
        javax.xml.bind.JAXBElement<java.math.BigDecimal> _add_addAddItemVal1DurabilityFlag = null;
        _add_addAddItemVal1.setDurabilityFlag(_add_addAddItemVal1DurabilityFlag);
        javax.xml.bind.JAXBElement<java.math.BigDecimal> _add_addAddItemVal1Inoperable = null;
        _add_addAddItemVal1.setInoperable(_add_addAddItemVal1Inoperable);
        javax.xml.bind.JAXBElement<java.lang.String> _add_addAddItemVal1UserdefinedField1Item = null;
        _add_addAddItemVal1.setUserdefinedField1Item(_add_addAddItemVal1UserdefinedField1Item);
        javax.xml.bind.JAXBElement<java.math.BigDecimal> _add_addAddItemVal1UserdefinedField2Item = null;
        _add_addAddItemVal1.setUserdefinedField2Item(_add_addAddItemVal1UserdefinedField2Item);
        javax.xml.bind.JAXBElement<java.lang.String> _add_addAddItemVal1UserdefinedField3Item = null;
        _add_addAddItemVal1.setUserdefinedField3Item(_add_addAddItemVal1UserdefinedField3Item);
        javax.xml.bind.JAXBElement<java.lang.String> _add_addAddItemVal1UserdefinedField4Item = null;
        _add_addAddItemVal1.setUserdefinedField4Item(_add_addAddItemVal1UserdefinedField4Item);
        javax.xml.bind.JAXBElement<java.lang.String> _add_addAddItemVal1UserdefinedField5Item = null;
        _add_addAddItemVal1.setUserdefinedField5Item(_add_addAddItemVal1UserdefinedField5Item);
        javax.xml.bind.JAXBElement<java.math.BigDecimal> _add_addAddItemVal1Warranty = null;
        _add_addAddItemVal1.setWarranty(_add_addAddItemVal1Warranty);
        javax.xml.bind.JAXBElement<java.lang.String> _add_addAddItemVal1DrawingPosition = null;
        _add_addAddItemVal1.setDrawingPosition(_add_addAddItemVal1DrawingPosition);
        javax.xml.bind.JAXBElement<java.lang.String> _add_addAddItemVal1DocumentIdentity = null;
        _add_addAddItemVal1.setDocumentIdentity(_add_addAddItemVal1DocumentIdentity);
        javax.xml.bind.JAXBElement<java.lang.String> _add_addAddItemVal1Text = null;
        _add_addAddItemVal1.setText(_add_addAddItemVal1Text);
        javax.xml.bind.JAXBElement<java.lang.String> _add_addAddItemVal1TextTXL2 = null;
        _add_addAddItemVal1.setTextTXL2(_add_addAddItemVal1TextTXL2);
        javax.xml.bind.JAXBElement<java.lang.String> _add_addAddItemVal1TextTXL3 = null;
        _add_addAddItemVal1.setTextTXL3(_add_addAddItemVal1TextTXL3);
        javax.xml.bind.JAXBElement<java.lang.String> _add_addAddItemVal1TextTXL4 = null;
        _add_addAddItemVal1.setTextTXL4(_add_addAddItemVal1TextTXL4);
        javax.xml.bind.JAXBElement<java.lang.String> _add_addAddItemVal1TextTXL5 = null;
        _add_addAddItemVal1.setTextTXL5(_add_addAddItemVal1TextTXL5);
        javax.xml.bind.JAXBElement<java.lang.String> _add_addAddItemVal1TextTXL6 = null;
        _add_addAddItemVal1.setTextTXL6(_add_addAddItemVal1TextTXL6);
        javax.xml.bind.JAXBElement<java.lang.String> _add_addAddItemVal1TextTXL7 = null;
        _add_addAddItemVal1.setTextTXL7(_add_addAddItemVal1TextTXL7);
        javax.xml.bind.JAXBElement<java.lang.String> _add_addAddItemVal1TextTXL8 = null;
        _add_addAddItemVal1.setTextTXL8(_add_addAddItemVal1TextTXL8);
        javax.xml.bind.JAXBElement<java.lang.String> _add_addAddItemVal1TextTXL9 = null;
        _add_addAddItemVal1.setTextTXL9(_add_addAddItemVal1TextTXL9);
        javax.xml.bind.JAXBElement<java.lang.String> _add_addAddItemVal1TextTXL0 = null;
        _add_addAddItemVal1.setTextTXL0(_add_addAddItemVal1TextTXL0);
        javax.xml.bind.JAXBElement<java.lang.String> _add_addAddItemVal1Meter = null;
        _add_addAddItemVal1.setMeter(_add_addAddItemVal1Meter);
        javax.xml.bind.JAXBElement<java.math.BigDecimal> _add_addAddItemVal1SinceNew = null;
        _add_addAddItemVal1.setSinceNew(_add_addAddItemVal1SinceNew);
        javax.xml.bind.JAXBElement<java.lang.String> _add_addAddItemVal1SerialNumber = null;
        _add_addAddItemVal1.setSerialNumber(_add_addAddItemVal1SerialNumber);
        _add_addAddItem.add(_add_addAddItemVal1);
        _add_add.getAddItem().addAll(_add_addAddItem);
        _add_add.setMaxRecords(Integer.valueOf(341792792));
        au.com.tmha.mos057mi.add.AddResponseCollection _add__return = port.add(_add_add);
        System.out.println("add.result=" + _add__return);


        }

        System.exit(0);
    }

}
