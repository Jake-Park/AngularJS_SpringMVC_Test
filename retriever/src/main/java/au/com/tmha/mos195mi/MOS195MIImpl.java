
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package au.com.tmha.mos195mi;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.18
 * 2016-02-12T12:42:49.028+11:00
 * Generated source version: 2.7.18
 * 
 */

@javax.jws.WebService(
                      serviceName = "MOS195MIService",
                      portName = "MOS195MIPort",
                      targetNamespace = "http://www.tmha.com.au/MOS195MI",
                      wsdlLocation = "file:/C:/Users/User/workspace/JAXWSEclipse/WebContent/WEB-INF/MOS195MI.wsdl",
                      endpointInterface = "au.com.tmha.mos195mi.MOS195MI")
                      
public class MOS195MIImpl implements MOS195MI {

    private static final Logger LOG = Logger.getLogger(MOS195MIImpl.class.getName());

    /* (non-Javadoc)
     * @see au.com.tmha.mos195mi.MOS195MI#selWoElem(au.com.tmha.mos195mi.selwoelem.SelWoElemCollection  selWoElem )*
     */
    public au.com.tmha.mos195mi.selwoelem.SelWoElemResponseCollection selWoElem(au.com.tmha.mos195mi.selwoelem.SelWoElemCollection selWoElem) { 
        LOG.info("Executing operation selWoElem");
        System.out.println(selWoElem);
        try {
            au.com.tmha.mos195mi.selwoelem.SelWoElemResponseCollection _return = new au.com.tmha.mos195mi.selwoelem.SelWoElemResponseCollection();
            java.util.List<au.com.tmha.mos195mi.selwoelem.SelWoElemResponseItem> _returnSelWoElemResponseItem = new java.util.ArrayList<au.com.tmha.mos195mi.selwoelem.SelWoElemResponseItem>();
            au.com.tmha.mos195mi.selwoelem.SelWoElemResponseItem _returnSelWoElemResponseItemVal1 = new au.com.tmha.mos195mi.selwoelem.SelWoElemResponseItem();
            javax.xml.bind.JAXBElement<java.math.BigDecimal> _returnSelWoElemResponseItemVal1TaskElementNumber = null;
            _returnSelWoElemResponseItemVal1.setTaskElementNumber(_returnSelWoElemResponseItemVal1TaskElementNumber);
            javax.xml.bind.JAXBElement<java.lang.String> _returnSelWoElemResponseItemVal1OperationElementType = null;
            _returnSelWoElemResponseItemVal1.setOperationElementType(_returnSelWoElemResponseItemVal1OperationElementType);
            javax.xml.bind.JAXBElement<java.lang.String> _returnSelWoElemResponseItemVal1EquipmentDescription = null;
            _returnSelWoElemResponseItemVal1.setEquipmentDescription(_returnSelWoElemResponseItemVal1EquipmentDescription);
            javax.xml.bind.JAXBElement<java.lang.String> _returnSelWoElemResponseItemVal1LotNumber = null;
            _returnSelWoElemResponseItemVal1.setLotNumber(_returnSelWoElemResponseItemVal1LotNumber);
            javax.xml.bind.JAXBElement<java.math.BigDecimal> _returnSelWoElemResponseItemVal1Complaint = null;
            _returnSelWoElemResponseItemVal1.setComplaint(_returnSelWoElemResponseItemVal1Complaint);
            javax.xml.bind.JAXBElement<java.lang.String> _returnSelWoElemResponseItemVal1EmployeeNumber = null;
            _returnSelWoElemResponseItemVal1.setEmployeeNumber(_returnSelWoElemResponseItemVal1EmployeeNumber);
            javax.xml.bind.JAXBElement<java.lang.String> _returnSelWoElemResponseItemVal1EquipmentNumber = null;
            _returnSelWoElemResponseItemVal1.setEquipmentNumber(_returnSelWoElemResponseItemVal1EquipmentNumber);
            javax.xml.bind.JAXBElement<java.lang.String> _returnSelWoElemResponseItemVal1Facility = null;
            _returnSelWoElemResponseItemVal1.setFacility(_returnSelWoElemResponseItemVal1Facility);
            javax.xml.bind.JAXBElement<java.lang.String> _returnSelWoElemResponseItemVal1EventType = null;
            _returnSelWoElemResponseItemVal1.setEventType(_returnSelWoElemResponseItemVal1EventType);
            javax.xml.bind.JAXBElement<java.lang.String> _returnSelWoElemResponseItemVal1ErrorCode2 = null;
            _returnSelWoElemResponseItemVal1.setErrorCode2(_returnSelWoElemResponseItemVal1ErrorCode2);
            javax.xml.bind.JAXBElement<java.lang.String> _returnSelWoElemResponseItemVal1ErrorCode3 = null;
            _returnSelWoElemResponseItemVal1.setErrorCode3(_returnSelWoElemResponseItemVal1ErrorCode3);
            javax.xml.bind.JAXBElement<java.lang.String> _returnSelWoElemResponseItemVal1ErrorCode1 = null;
            _returnSelWoElemResponseItemVal1.setErrorCode1(_returnSelWoElemResponseItemVal1ErrorCode1);
            javax.xml.bind.JAXBElement<java.lang.String> _returnSelWoElemResponseItemVal1ItemNumber = null;
            _returnSelWoElemResponseItemVal1.setItemNumber(_returnSelWoElemResponseItemVal1ItemNumber);
            javax.xml.bind.JAXBElement<javax.xml.datatype.XMLGregorianCalendar> _returnSelWoElemResponseItemVal1FinishDate = null;
            _returnSelWoElemResponseItemVal1.setFinishDate(_returnSelWoElemResponseItemVal1FinishDate);
            javax.xml.bind.JAXBElement<java.math.BigDecimal> _returnSelWoElemResponseItemVal1FinishTime = null;
            _returnSelWoElemResponseItemVal1.setFinishTime(_returnSelWoElemResponseItemVal1FinishTime);
            javax.xml.bind.JAXBElement<java.math.BigDecimal> _returnSelWoElemResponseItemVal1SequenceNumber = null;
            _returnSelWoElemResponseItemVal1.setSequenceNumber(_returnSelWoElemResponseItemVal1SequenceNumber);
            javax.xml.bind.JAXBElement<java.lang.String> _returnSelWoElemResponseItemVal1WorkOrderNumber = null;
            _returnSelWoElemResponseItemVal1.setWorkOrderNumber(_returnSelWoElemResponseItemVal1WorkOrderNumber);
            javax.xml.bind.JAXBElement<java.math.BigDecimal> _returnSelWoElemResponseItemVal1OperationNumber = null;
            _returnSelWoElemResponseItemVal1.setOperationNumber(_returnSelWoElemResponseItemVal1OperationNumber);
            javax.xml.bind.JAXBElement<java.lang.String> _returnSelWoElemResponseItemVal1OrderType = null;
            _returnSelWoElemResponseItemVal1.setOrderType(_returnSelWoElemResponseItemVal1OrderType);
            javax.xml.bind.JAXBElement<java.math.BigDecimal> _returnSelWoElemResponseItemVal1StartTime = null;
            _returnSelWoElemResponseItemVal1.setStartTime(_returnSelWoElemResponseItemVal1StartTime);
            javax.xml.bind.JAXBElement<java.lang.String> _returnSelWoElemResponseItemVal1OperationDescription = null;
            _returnSelWoElemResponseItemVal1.setOperationDescription(_returnSelWoElemResponseItemVal1OperationDescription);
            javax.xml.bind.JAXBElement<java.lang.String> _returnSelWoElemResponseItemVal1ProductNumber = null;
            _returnSelWoElemResponseItemVal1.setProductNumber(_returnSelWoElemResponseItemVal1ProductNumber);
            javax.xml.bind.JAXBElement<java.lang.String> _returnSelWoElemResponseItemVal1Responsible = null;
            _returnSelWoElemResponseItemVal1.setResponsible(_returnSelWoElemResponseItemVal1Responsible);
            javax.xml.bind.JAXBElement<java.math.BigDecimal> _returnSelWoElemResponseItemVal1ReferenceOrderCategory = null;
            _returnSelWoElemResponseItemVal1.setReferenceOrderCategory(_returnSelWoElemResponseItemVal1ReferenceOrderCategory);
            javax.xml.bind.JAXBElement<java.math.BigDecimal> _returnSelWoElemResponseItemVal1ReferenceOrderLine = null;
            _returnSelWoElemResponseItemVal1.setReferenceOrderLine(_returnSelWoElemResponseItemVal1ReferenceOrderLine);
            javax.xml.bind.JAXBElement<java.lang.String> _returnSelWoElemResponseItemVal1ReferenceOrderNumber = null;
            _returnSelWoElemResponseItemVal1.setReferenceOrderNumber(_returnSelWoElemResponseItemVal1ReferenceOrderNumber);
            javax.xml.bind.JAXBElement<java.math.BigDecimal> _returnSelWoElemResponseItemVal1LineSuffix = null;
            _returnSelWoElemResponseItemVal1.setLineSuffix(_returnSelWoElemResponseItemVal1LineSuffix);
            javax.xml.bind.JAXBElement<javax.xml.datatype.XMLGregorianCalendar> _returnSelWoElemResponseItemVal1RequestedFinishDate = null;
            _returnSelWoElemResponseItemVal1.setRequestedFinishDate(_returnSelWoElemResponseItemVal1RequestedFinishDate);
            javax.xml.bind.JAXBElement<java.math.BigDecimal> _returnSelWoElemResponseItemVal1RequestedFinishTime = null;
            _returnSelWoElemResponseItemVal1.setRequestedFinishTime(_returnSelWoElemResponseItemVal1RequestedFinishTime);
            javax.xml.bind.JAXBElement<javax.xml.datatype.XMLGregorianCalendar> _returnSelWoElemResponseItemVal1RequestedStartDate = null;
            _returnSelWoElemResponseItemVal1.setRequestedStartDate(_returnSelWoElemResponseItemVal1RequestedStartDate);
            javax.xml.bind.JAXBElement<java.math.BigDecimal> _returnSelWoElemResponseItemVal1RequestedStartTime = null;
            _returnSelWoElemResponseItemVal1.setRequestedStartTime(_returnSelWoElemResponseItemVal1RequestedStartTime);
            javax.xml.bind.JAXBElement<java.lang.String> _returnSelWoElemResponseItemVal1Subprocess = null;
            _returnSelWoElemResponseItemVal1.setSubprocess(_returnSelWoElemResponseItemVal1Subprocess);
            javax.xml.bind.JAXBElement<javax.xml.datatype.XMLGregorianCalendar> _returnSelWoElemResponseItemVal1StartDate = null;
            _returnSelWoElemResponseItemVal1.setStartDate(_returnSelWoElemResponseItemVal1StartDate);
            javax.xml.bind.JAXBElement<java.lang.String> _returnSelWoElemResponseItemVal1StatusMobility = null;
            _returnSelWoElemResponseItemVal1.setStatusMobility(_returnSelWoElemResponseItemVal1StatusMobility);
            javax.xml.bind.JAXBElement<java.lang.String> _returnSelWoElemResponseItemVal1ProductStructureType = null;
            _returnSelWoElemResponseItemVal1.setProductStructureType(_returnSelWoElemResponseItemVal1ProductStructureType);
            javax.xml.bind.JAXBElement<java.lang.String> _returnSelWoElemResponseItemVal1Service = null;
            _returnSelWoElemResponseItemVal1.setService(_returnSelWoElemResponseItemVal1Service);
            javax.xml.bind.JAXBElement<java.lang.String> _returnSelWoElemResponseItemVal1SupplierNumber = null;
            _returnSelWoElemResponseItemVal1.setSupplierNumber(_returnSelWoElemResponseItemVal1SupplierNumber);
            javax.xml.bind.JAXBElement<java.lang.String> _returnSelWoElemResponseItemVal1RegistrationNumberSite = null;
            _returnSelWoElemResponseItemVal1.setRegistrationNumberSite(_returnSelWoElemResponseItemVal1RegistrationNumberSite);
            javax.xml.bind.JAXBElement<java.math.BigDecimal> _returnSelWoElemResponseItemVal1TextIdentity = null;
            _returnSelWoElemResponseItemVal1.setTextIdentity(_returnSelWoElemResponseItemVal1TextIdentity);
            javax.xml.bind.JAXBElement<java.lang.String> _returnSelWoElemResponseItemVal1TextLine1 = null;
            _returnSelWoElemResponseItemVal1.setTextLine1(_returnSelWoElemResponseItemVal1TextLine1);
            javax.xml.bind.JAXBElement<java.lang.String> _returnSelWoElemResponseItemVal1Warehouse = null;
            _returnSelWoElemResponseItemVal1.setWarehouse(_returnSelWoElemResponseItemVal1Warehouse);
            javax.xml.bind.JAXBElement<java.lang.String> _returnSelWoElemResponseItemVal1Location = null;
            _returnSelWoElemResponseItemVal1.setLocation(_returnSelWoElemResponseItemVal1Location);
            javax.xml.bind.JAXBElement<java.lang.String> _returnSelWoElemResponseItemVal1StatusManufacturingOrder = null;
            _returnSelWoElemResponseItemVal1.setStatusManufacturingOrder(_returnSelWoElemResponseItemVal1StatusManufacturingOrder);
            javax.xml.bind.JAXBElement<java.lang.String> _returnSelWoElemResponseItemVal1MaterialStatus = null;
            _returnSelWoElemResponseItemVal1.setMaterialStatus(_returnSelWoElemResponseItemVal1MaterialStatus);
            javax.xml.bind.JAXBElement<java.lang.String> _returnSelWoElemResponseItemVal1Status = null;
            _returnSelWoElemResponseItemVal1.setStatus(_returnSelWoElemResponseItemVal1Status);
            javax.xml.bind.JAXBElement<java.math.BigDecimal> _returnSelWoElemResponseItemVal1ReportingNumber = null;
            _returnSelWoElemResponseItemVal1.setReportingNumber(_returnSelWoElemResponseItemVal1ReportingNumber);
            javax.xml.bind.JAXBElement<java.math.BigDecimal> _returnSelWoElemResponseItemVal1EntryTime = null;
            _returnSelWoElemResponseItemVal1.setEntryTime(_returnSelWoElemResponseItemVal1EntryTime);
            javax.xml.bind.JAXBElement<javax.xml.datatype.XMLGregorianCalendar> _returnSelWoElemResponseItemVal1EntryDate = null;
            _returnSelWoElemResponseItemVal1.setEntryDate(_returnSelWoElemResponseItemVal1EntryDate);
            javax.xml.bind.JAXBElement<java.math.BigDecimal> _returnSelWoElemResponseItemVal1Priority = null;
            _returnSelWoElemResponseItemVal1.setPriority(_returnSelWoElemResponseItemVal1Priority);
            javax.xml.bind.JAXBElement<java.lang.String> _returnSelWoElemResponseItemVal1Process = null;
            _returnSelWoElemResponseItemVal1.setProcess(_returnSelWoElemResponseItemVal1Process);
            javax.xml.bind.JAXBElement<java.lang.String> _returnSelWoElemResponseItemVal1WorkCenter = null;
            _returnSelWoElemResponseItemVal1.setWorkCenter(_returnSelWoElemResponseItemVal1WorkCenter);
            javax.xml.bind.JAXBElement<java.math.BigDecimal> _returnSelWoElemResponseItemVal1MandatoryServiceErrorReport = null;
            _returnSelWoElemResponseItemVal1.setMandatoryServiceErrorReport(_returnSelWoElemResponseItemVal1MandatoryServiceErrorReport);
            javax.xml.bind.JAXBElement<java.lang.String> _returnSelWoElemResponseItemVal1Department = null;
            _returnSelWoElemResponseItemVal1.setDepartment(_returnSelWoElemResponseItemVal1Department);
            _returnSelWoElemResponseItem.add(_returnSelWoElemResponseItemVal1);
            _return.getSelWoElemResponseItem().addAll(_returnSelWoElemResponseItem);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
