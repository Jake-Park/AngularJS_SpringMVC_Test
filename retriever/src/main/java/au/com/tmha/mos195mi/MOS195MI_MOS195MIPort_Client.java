
package au.com.tmha.mos195mi;

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
 * 2016-02-12T12:42:48.978+11:00
 * Generated source version: 2.7.18
 * 
 */
public final class MOS195MI_MOS195MIPort_Client {

    private static final QName SERVICE_NAME = new QName("http://www.tmha.com.au/MOS195MI", "MOS195MIService");

    private MOS195MI_MOS195MIPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = MOS195MIService.WSDL_LOCATION;
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
      
        MOS195MIService ss = new MOS195MIService(wsdlURL, SERVICE_NAME);
        MOS195MI port = ss.getMOS195MIPort();  
        
        {
        System.out.println("Invoking selWoElem...");
        au.com.tmha.mos195mi.selwoelem.SelWoElemCollection _selWoElem_selWoElem = new au.com.tmha.mos195mi.selwoelem.SelWoElemCollection();
        java.util.List<au.com.tmha.mos195mi.selwoelem.SelWoElemItem> _selWoElem_selWoElemSelWoElemItem = new java.util.ArrayList<au.com.tmha.mos195mi.selwoelem.SelWoElemItem>();
        au.com.tmha.mos195mi.selwoelem.SelWoElemItem _selWoElem_selWoElemSelWoElemItemVal1 = new au.com.tmha.mos195mi.selwoelem.SelWoElemItem();
        javax.xml.bind.JAXBElement<java.math.BigDecimal> _selWoElem_selWoElemSelWoElemItemVal1Company = null;
        _selWoElem_selWoElemSelWoElemItemVal1.setCompany(_selWoElem_selWoElemSelWoElemItemVal1Company);
        _selWoElem_selWoElemSelWoElemItemVal1.setFacility("Facility672601819");
        javax.xml.bind.JAXBElement<java.lang.String> _selWoElem_selWoElemSelWoElemItemVal1StatusFROM = null;
        _selWoElem_selWoElemSelWoElemItemVal1.setStatusFROM(_selWoElem_selWoElemSelWoElemItemVal1StatusFROM);
        javax.xml.bind.JAXBElement<java.lang.String> _selWoElem_selWoElemSelWoElemItemVal1StatusTo = null;
        _selWoElem_selWoElemSelWoElemItemVal1.setStatusTo(_selWoElem_selWoElemSelWoElemItemVal1StatusTo);
        javax.xml.bind.JAXBElement<java.lang.String> _selWoElem_selWoElemSelWoElemItemVal1WorkCenter = null;
        _selWoElem_selWoElemSelWoElemItemVal1.setWorkCenter(_selWoElem_selWoElemSelWoElemItemVal1WorkCenter);
        javax.xml.bind.JAXBElement<java.lang.String> _selWoElem_selWoElemSelWoElemItemVal1Department = null;
        _selWoElem_selWoElemSelWoElemItemVal1.setDepartment(_selWoElem_selWoElemSelWoElemItemVal1Department);
        javax.xml.bind.JAXBElement<java.lang.String> _selWoElem_selWoElemSelWoElemItemVal1PlanningArea = null;
        _selWoElem_selWoElemSelWoElemItemVal1.setPlanningArea(_selWoElem_selWoElemSelWoElemItemVal1PlanningArea);
        javax.xml.bind.JAXBElement<javax.xml.datatype.XMLGregorianCalendar> _selWoElem_selWoElemSelWoElemItemVal1StartDate = null;
        _selWoElem_selWoElemSelWoElemItemVal1.setStartDate(_selWoElem_selWoElemSelWoElemItemVal1StartDate);
        javax.xml.bind.JAXBElement<javax.xml.datatype.XMLGregorianCalendar> _selWoElem_selWoElemSelWoElemItemVal1StartDateSTD2 = null;
        _selWoElem_selWoElemSelWoElemItemVal1.setStartDateSTD2(_selWoElem_selWoElemSelWoElemItemVal1StartDateSTD2);
        javax.xml.bind.JAXBElement<javax.xml.datatype.XMLGregorianCalendar> _selWoElem_selWoElemSelWoElemItemVal1FinishDate = null;
        _selWoElem_selWoElemSelWoElemItemVal1.setFinishDate(_selWoElem_selWoElemSelWoElemItemVal1FinishDate);
        javax.xml.bind.JAXBElement<javax.xml.datatype.XMLGregorianCalendar> _selWoElem_selWoElemSelWoElemItemVal1FinishDateFID2 = null;
        _selWoElem_selWoElemSelWoElemItemVal1.setFinishDateFID2(_selWoElem_selWoElemSelWoElemItemVal1FinishDateFID2);
        javax.xml.bind.JAXBElement<javax.xml.datatype.XMLGregorianCalendar> _selWoElem_selWoElemSelWoElemItemVal1EntryDate = null;
        _selWoElem_selWoElemSelWoElemItemVal1.setEntryDate(_selWoElem_selWoElemSelWoElemItemVal1EntryDate);
        javax.xml.bind.JAXBElement<javax.xml.datatype.XMLGregorianCalendar> _selWoElem_selWoElemSelWoElemItemVal1EntryDateRGD2 = null;
        _selWoElem_selWoElemSelWoElemItemVal1.setEntryDateRGD2(_selWoElem_selWoElemSelWoElemItemVal1EntryDateRGD2);
        javax.xml.bind.JAXBElement<java.lang.String> _selWoElem_selWoElemSelWoElemItemVal1ItemNumber = null;
        _selWoElem_selWoElemSelWoElemItemVal1.setItemNumber(_selWoElem_selWoElemSelWoElemItemVal1ItemNumber);
        javax.xml.bind.JAXBElement<java.lang.String> _selWoElem_selWoElemSelWoElemItemVal1LotNumber = null;
        _selWoElem_selWoElemSelWoElemItemVal1.setLotNumber(_selWoElem_selWoElemSelWoElemItemVal1LotNumber);
        javax.xml.bind.JAXBElement<java.lang.String> _selWoElem_selWoElemSelWoElemItemVal1EquipmentNumber = null;
        _selWoElem_selWoElemSelWoElemItemVal1.setEquipmentNumber(_selWoElem_selWoElemSelWoElemItemVal1EquipmentNumber);
        javax.xml.bind.JAXBElement<java.lang.String> _selWoElem_selWoElemSelWoElemItemVal1ConfigurationPosition = null;
        _selWoElem_selWoElemSelWoElemItemVal1.setConfigurationPosition(_selWoElem_selWoElemSelWoElemItemVal1ConfigurationPosition);
        javax.xml.bind.JAXBElement<java.lang.String> _selWoElem_selWoElemSelWoElemItemVal1Service = null;
        _selWoElem_selWoElemSelWoElemItemVal1.setService(_selWoElem_selWoElemSelWoElemItemVal1Service);
        javax.xml.bind.JAXBElement<java.lang.String> _selWoElem_selWoElemSelWoElemItemVal1EventType = null;
        _selWoElem_selWoElemSelWoElemItemVal1.setEventType(_selWoElem_selWoElemSelWoElemItemVal1EventType);
        javax.xml.bind.JAXBElement<java.math.BigDecimal> _selWoElem_selWoElemSelWoElemItemVal1Shutdown = null;
        _selWoElem_selWoElemSelWoElemItemVal1.setShutdown(_selWoElem_selWoElemSelWoElemItemVal1Shutdown);
        javax.xml.bind.JAXBElement<java.lang.String> _selWoElem_selWoElemSelWoElemItemVal1OrderType = null;
        _selWoElem_selWoElemSelWoElemItemVal1.setOrderType(_selWoElem_selWoElemSelWoElemItemVal1OrderType);
        javax.xml.bind.JAXBElement<java.lang.String> _selWoElem_selWoElemSelWoElemItemVal1ProductNumber = null;
        _selWoElem_selWoElemSelWoElemItemVal1.setProductNumber(_selWoElem_selWoElemSelWoElemItemVal1ProductNumber);
        javax.xml.bind.JAXBElement<java.lang.String> _selWoElem_selWoElemSelWoElemItemVal1WorkOrderNumber = null;
        _selWoElem_selWoElemSelWoElemItemVal1.setWorkOrderNumber(_selWoElem_selWoElemSelWoElemItemVal1WorkOrderNumber);
        javax.xml.bind.JAXBElement<java.lang.String> _selWoElem_selWoElemSelWoElemItemVal1EmployeeNumber = null;
        _selWoElem_selWoElemSelWoElemItemVal1.setEmployeeNumber(_selWoElem_selWoElemSelWoElemItemVal1EmployeeNumber);
        javax.xml.bind.JAXBElement<java.lang.String> _selWoElem_selWoElemSelWoElemItemVal1ChangedBy = null;
        _selWoElem_selWoElemSelWoElemItemVal1.setChangedBy(_selWoElem_selWoElemSelWoElemItemVal1ChangedBy);
        javax.xml.bind.JAXBElement<java.lang.String> _selWoElem_selWoElemSelWoElemItemVal1Responsible = null;
        _selWoElem_selWoElemSelWoElemItemVal1.setResponsible(_selWoElem_selWoElemSelWoElemItemVal1Responsible);
        javax.xml.bind.JAXBElement<java.lang.String> _selWoElem_selWoElemSelWoElemItemVal1StatusMobility = null;
        _selWoElem_selWoElemSelWoElemItemVal1.setStatusMobility(_selWoElem_selWoElemSelWoElemItemVal1StatusMobility);
        javax.xml.bind.JAXBElement<java.lang.String> _selWoElem_selWoElemSelWoElemItemVal1StatusMobilitySTMT = null;
        _selWoElem_selWoElemSelWoElemItemVal1.setStatusMobilitySTMT(_selWoElem_selWoElemSelWoElemItemVal1StatusMobilitySTMT);
        javax.xml.bind.JAXBElement<java.lang.String> _selWoElem_selWoElemSelWoElemItemVal1OperationElementType = null;
        _selWoElem_selWoElemSelWoElemItemVal1.setOperationElementType(_selWoElem_selWoElemSelWoElemItemVal1OperationElementType);
        javax.xml.bind.JAXBElement<java.lang.String> _selWoElem_selWoElemSelWoElemItemVal1OperationElementTypeACTT = null;
        _selWoElem_selWoElemSelWoElemItemVal1.setOperationElementTypeACTT(_selWoElem_selWoElemSelWoElemItemVal1OperationElementTypeACTT);
        javax.xml.bind.JAXBElement<java.math.BigDecimal> _selWoElem_selWoElemSelWoElemItemVal1OperationNumber = null;
        _selWoElem_selWoElemSelWoElemItemVal1.setOperationNumber(_selWoElem_selWoElemSelWoElemItemVal1OperationNumber);
        _selWoElem_selWoElemSelWoElemItem.add(_selWoElem_selWoElemSelWoElemItemVal1);
        _selWoElem_selWoElem.getSelWoElemItem().addAll(_selWoElem_selWoElemSelWoElemItem);
        _selWoElem_selWoElem.setMaxRecords(Integer.valueOf(1221401974));
        au.com.tmha.mos195mi.selwoelem.SelWoElemResponseCollection _selWoElem__return = port.selWoElem(_selWoElem_selWoElem);
        System.out.println("selWoElem.result=" + _selWoElem__return);


        }

        System.exit(0);
    }

}
