
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
 * 2016-02-29T11:53:31.090+11:00
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
        System.out.println("Invoking upd...");
        au.com.tmha.mos057mi.upd.UpdCollection _upd_upd = new au.com.tmha.mos057mi.upd.UpdCollection();
        java.util.List<au.com.tmha.mos057mi.upd.UpdItem> _upd_updUpdItem = new java.util.ArrayList<au.com.tmha.mos057mi.upd.UpdItem>();
        au.com.tmha.mos057mi.upd.UpdItem _upd_updUpdItemVal1 = new au.com.tmha.mos057mi.upd.UpdItem();
        javax.xml.bind.JAXBElement<java.math.BigDecimal> _upd_updUpdItemVal1RORC = null;
        _upd_updUpdItemVal1.setRORC(_upd_updUpdItemVal1RORC);
        javax.xml.bind.JAXBElement<java.lang.String> _upd_updUpdItemVal1RORN = null;
        _upd_updUpdItemVal1.setRORN(_upd_updUpdItemVal1RORN);
        javax.xml.bind.JAXBElement<java.math.BigDecimal> _upd_updUpdItemVal1RORL = null;
        _upd_updUpdItemVal1.setRORL(_upd_updUpdItemVal1RORL);
        javax.xml.bind.JAXBElement<java.math.BigDecimal> _upd_updUpdItemVal1RORX = null;
        _upd_updUpdItemVal1.setRORX(_upd_updUpdItemVal1RORX);
        javax.xml.bind.JAXBElement<java.lang.String> _upd_updUpdItemVal1STRT = null;
        _upd_updUpdItemVal1.setSTRT(_upd_updUpdItemVal1STRT);
        javax.xml.bind.JAXBElement<java.lang.String> _upd_updUpdItemVal1SUFI = null;
        _upd_updUpdItemVal1.setSUFI(_upd_updUpdItemVal1SUFI);
        javax.xml.bind.JAXBElement<java.math.BigDecimal> _upd_updUpdItemVal1SQNR = null;
        _upd_updUpdItemVal1.setSQNR(_upd_updUpdItemVal1SQNR);
        javax.xml.bind.JAXBElement<java.math.BigDecimal> _upd_updUpdItemVal1MAIN = null;
        _upd_updUpdItemVal1.setMAIN(_upd_updUpdItemVal1MAIN);
        javax.xml.bind.JAXBElement<java.lang.String> _upd_updUpdItemVal1STAT = null;
        _upd_updUpdItemVal1.setSTAT(_upd_updUpdItemVal1STAT);
        javax.xml.bind.JAXBElement<java.math.BigDecimal> _upd_updUpdItemVal1RIDC = null;
        _upd_updUpdItemVal1.setRIDC(_upd_updUpdItemVal1RIDC);
        javax.xml.bind.JAXBElement<java.lang.String> _upd_updUpdItemVal1RIDN = null;
        _upd_updUpdItemVal1.setRIDN(_upd_updUpdItemVal1RIDN);
        javax.xml.bind.JAXBElement<java.math.BigDecimal> _upd_updUpdItemVal1RIDL = null;
        _upd_updUpdItemVal1.setRIDL(_upd_updUpdItemVal1RIDL);
        javax.xml.bind.JAXBElement<java.math.BigDecimal> _upd_updUpdItemVal1RIDX = null;
        _upd_updUpdItemVal1.setRIDX(_upd_updUpdItemVal1RIDX);
        javax.xml.bind.JAXBElement<java.lang.String> _upd_updUpdItemVal1ITNO = null;
        _upd_updUpdItemVal1.setITNO(_upd_updUpdItemVal1ITNO);
        javax.xml.bind.JAXBElement<java.lang.String> _upd_updUpdItemVal1FCLA = null;
        _upd_updUpdItemVal1.setFCLA(_upd_updUpdItemVal1FCLA);
        javax.xml.bind.JAXBElement<java.lang.String> _upd_updUpdItemVal1FCL2 = null;
        _upd_updUpdItemVal1.setFCL2(_upd_updUpdItemVal1FCL2);
        javax.xml.bind.JAXBElement<java.lang.String> _upd_updUpdItemVal1FCL3 = null;
        _upd_updUpdItemVal1.setFCL3(_upd_updUpdItemVal1FCL3);
        javax.xml.bind.JAXBElement<javax.xml.datatype.XMLGregorianCalendar> _upd_updUpdItemVal1BRDT = null;
        _upd_updUpdItemVal1.setBRDT(_upd_updUpdItemVal1BRDT);
        javax.xml.bind.JAXBElement<java.math.BigDecimal> _upd_updUpdItemVal1BRTI = null;
        _upd_updUpdItemVal1.setBRTI(_upd_updUpdItemVal1BRTI);
        javax.xml.bind.JAXBElement<javax.xml.datatype.XMLGregorianCalendar> _upd_updUpdItemVal1MRDT = null;
        _upd_updUpdItemVal1.setMRDT(_upd_updUpdItemVal1MRDT);
        javax.xml.bind.JAXBElement<java.math.BigDecimal> _upd_updUpdItemVal1MRTI = null;
        _upd_updUpdItemVal1.setMRTI(_upd_updUpdItemVal1MRTI);
        javax.xml.bind.JAXBElement<javax.xml.datatype.XMLGregorianCalendar> _upd_updUpdItemVal1EQDT = null;
        _upd_updUpdItemVal1.setEQDT(_upd_updUpdItemVal1EQDT);
        javax.xml.bind.JAXBElement<java.math.BigDecimal> _upd_updUpdItemVal1EQTI = null;
        _upd_updUpdItemVal1.setEQTI(_upd_updUpdItemVal1EQTI);
        javax.xml.bind.JAXBElement<java.math.BigDecimal> _upd_updUpdItemVal1ERQT = null;
        _upd_updUpdItemVal1.setERQT(_upd_updUpdItemVal1ERQT);
        javax.xml.bind.JAXBElement<java.math.BigDecimal> _upd_updUpdItemVal1NOEM = null;
        _upd_updUpdItemVal1.setNOEM(_upd_updUpdItemVal1NOEM);
        javax.xml.bind.JAXBElement<java.lang.String> _upd_updUpdItemVal1REPR = null;
        _upd_updUpdItemVal1.setREPR(_upd_updUpdItemVal1REPR);
        javax.xml.bind.JAXBElement<java.math.BigDecimal> _upd_updUpdItemVal1MVA1 = null;
        _upd_updUpdItemVal1.setMVA1(_upd_updUpdItemVal1MVA1);
        javax.xml.bind.JAXBElement<java.math.BigDecimal> _upd_updUpdItemVal1MVA2 = null;
        _upd_updUpdItemVal1.setMVA2(_upd_updUpdItemVal1MVA2);
        javax.xml.bind.JAXBElement<java.math.BigDecimal> _upd_updUpdItemVal1MVA3 = null;
        _upd_updUpdItemVal1.setMVA3(_upd_updUpdItemVal1MVA3);
        javax.xml.bind.JAXBElement<java.math.BigDecimal> _upd_updUpdItemVal1MVA4 = null;
        _upd_updUpdItemVal1.setMVA4(_upd_updUpdItemVal1MVA4);
        javax.xml.bind.JAXBElement<java.math.BigDecimal> _upd_updUpdItemVal1FLG1 = null;
        _upd_updUpdItemVal1.setFLG1(_upd_updUpdItemVal1FLG1);
        javax.xml.bind.JAXBElement<java.math.BigDecimal> _upd_updUpdItemVal1FLG2 = null;
        _upd_updUpdItemVal1.setFLG2(_upd_updUpdItemVal1FLG2);
        javax.xml.bind.JAXBElement<java.lang.String> _upd_updUpdItemVal1CFI1 = null;
        _upd_updUpdItemVal1.setCFI1(_upd_updUpdItemVal1CFI1);
        javax.xml.bind.JAXBElement<java.math.BigDecimal> _upd_updUpdItemVal1CFI2 = null;
        _upd_updUpdItemVal1.setCFI2(_upd_updUpdItemVal1CFI2);
        javax.xml.bind.JAXBElement<java.lang.String> _upd_updUpdItemVal1CFI3 = null;
        _upd_updUpdItemVal1.setCFI3(_upd_updUpdItemVal1CFI3);
        javax.xml.bind.JAXBElement<java.lang.String> _upd_updUpdItemVal1CFI4 = null;
        _upd_updUpdItemVal1.setCFI4(_upd_updUpdItemVal1CFI4);
        javax.xml.bind.JAXBElement<java.lang.String> _upd_updUpdItemVal1CFI5 = null;
        _upd_updUpdItemVal1.setCFI5(_upd_updUpdItemVal1CFI5);
        javax.xml.bind.JAXBElement<java.math.BigDecimal> _upd_updUpdItemVal1WARR = null;
        _upd_updUpdItemVal1.setWARR(_upd_updUpdItemVal1WARR);
        javax.xml.bind.JAXBElement<java.lang.String> _upd_updUpdItemVal1DWPO = null;
        _upd_updUpdItemVal1.setDWPO(_upd_updUpdItemVal1DWPO);
        javax.xml.bind.JAXBElement<java.lang.String> _upd_updUpdItemVal1DOID = null;
        _upd_updUpdItemVal1.setDOID(_upd_updUpdItemVal1DOID);
        javax.xml.bind.JAXBElement<java.lang.String> _upd_updUpdItemVal1TXL1 = null;
        _upd_updUpdItemVal1.setTXL1(_upd_updUpdItemVal1TXL1);
        javax.xml.bind.JAXBElement<java.lang.String> _upd_updUpdItemVal1TXL2 = null;
        _upd_updUpdItemVal1.setTXL2(_upd_updUpdItemVal1TXL2);
        javax.xml.bind.JAXBElement<java.lang.String> _upd_updUpdItemVal1TXL3 = null;
        _upd_updUpdItemVal1.setTXL3(_upd_updUpdItemVal1TXL3);
        javax.xml.bind.JAXBElement<java.lang.String> _upd_updUpdItemVal1TXL4 = null;
        _upd_updUpdItemVal1.setTXL4(_upd_updUpdItemVal1TXL4);
        javax.xml.bind.JAXBElement<java.lang.String> _upd_updUpdItemVal1TXL5 = null;
        _upd_updUpdItemVal1.setTXL5(_upd_updUpdItemVal1TXL5);
        javax.xml.bind.JAXBElement<java.lang.String> _upd_updUpdItemVal1TXL6 = null;
        _upd_updUpdItemVal1.setTXL6(_upd_updUpdItemVal1TXL6);
        javax.xml.bind.JAXBElement<java.lang.String> _upd_updUpdItemVal1TXL7 = null;
        _upd_updUpdItemVal1.setTXL7(_upd_updUpdItemVal1TXL7);
        javax.xml.bind.JAXBElement<java.lang.String> _upd_updUpdItemVal1TXL8 = null;
        _upd_updUpdItemVal1.setTXL8(_upd_updUpdItemVal1TXL8);
        javax.xml.bind.JAXBElement<java.lang.String> _upd_updUpdItemVal1TXL9 = null;
        _upd_updUpdItemVal1.setTXL9(_upd_updUpdItemVal1TXL9);
        javax.xml.bind.JAXBElement<java.lang.String> _upd_updUpdItemVal1TXL0 = null;
        _upd_updUpdItemVal1.setTXL0(_upd_updUpdItemVal1TXL0);
        javax.xml.bind.JAXBElement<java.lang.String> _upd_updUpdItemVal1MES0 = null;
        _upd_updUpdItemVal1.setMES0(_upd_updUpdItemVal1MES0);
        javax.xml.bind.JAXBElement<java.math.BigDecimal> _upd_updUpdItemVal1MVA0 = null;
        _upd_updUpdItemVal1.setMVA0(_upd_updUpdItemVal1MVA0);
        javax.xml.bind.JAXBElement<java.lang.String> _upd_updUpdItemVal1SECP = null;
        _upd_updUpdItemVal1.setSECP(_upd_updUpdItemVal1SECP);
        _upd_updUpdItem.add(_upd_updUpdItemVal1);
        _upd_upd.getUpdItem().addAll(_upd_updUpdItem);
        _upd_upd.setMaxRecords(Integer.valueOf(1470806311));
        au.com.tmha.mos057mi.upd.UpdResponseCollection _upd__return = port.upd(_upd_upd);
        System.out.println("upd.result=" + _upd__return);


        }
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
        _add_add.setMaxRecords(Integer.valueOf(700024942));
        au.com.tmha.mos057mi.add.AddResponseCollection _add__return = port.add(_add_add);
        System.out.println("add.result=" + _add__return);


        }

        System.exit(0);
    }

}
