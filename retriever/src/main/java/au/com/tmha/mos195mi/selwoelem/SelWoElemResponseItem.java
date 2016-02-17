
package au.com.tmha.mos195mi.selwoelem;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SelWoElemResponseItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SelWoElemResponseItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TaskElementNumber" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OperationElementType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EquipmentDescription" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LotNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Complaint" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="EmployeeNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EquipmentNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Facility" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EventType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ErrorCode2" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ErrorCode3" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ErrorCode1" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ItemNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FinishDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="FinishTime" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SequenceNumber" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="WorkOrderNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="OperationNumber" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OrderType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OperationDescription" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ProductNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Responsible" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ReferenceOrderCategory" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ReferenceOrderLine" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ReferenceOrderNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LineSuffix" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RequestedFinishDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="RequestedFinishTime" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RequestedStartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="RequestedStartTime" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Subprocess" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="StatusMobility" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ProductStructureType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Service" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SupplierNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RegistrationNumberSite" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TextIdentity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TextLine1" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="60"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Warehouse" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Location" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="StatusManufacturingOrder" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MaterialStatus" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Status" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ReportingNumber" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="EntryTime" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="EntryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Process" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="WorkCenter" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MandatoryServiceErrorReport" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Department" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelWoElemResponseItem", propOrder = {
    "taskElementNumber",
    "operationElementType",
    "equipmentDescription",
    "lotNumber",
    "complaint",
    "employeeNumber",
    "equipmentNumber",
    "facility",
    "eventType",
    "errorCode2",
    "errorCode3",
    "errorCode1",
    "itemNumber",
    "finishDate",
    "finishTime",
    "sequenceNumber",
    "workOrderNumber",
    "operationNumber",
    "orderType",
    "startTime",
    "operationDescription",
    "productNumber",
    "responsible",
    "referenceOrderCategory",
    "referenceOrderLine",
    "referenceOrderNumber",
    "lineSuffix",
    "requestedFinishDate",
    "requestedFinishTime",
    "requestedStartDate",
    "requestedStartTime",
    "subprocess",
    "startDate",
    "statusMobility",
    "productStructureType",
    "service",
    "supplierNumber",
    "registrationNumberSite",
    "textIdentity",
    "textLine1",
    "warehouse",
    "location",
    "statusManufacturingOrder",
    "materialStatus",
    "status",
    "reportingNumber",
    "entryTime",
    "entryDate",
    "priority",
    "process",
    "workCenter",
    "mandatoryServiceErrorReport",
    "department"
})
public class SelWoElemResponseItem {

    @XmlElementRef(name = "TaskElementNumber", namespace = "http://www.tmha.com.au/MOS195MI/SelWoElem", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> taskElementNumber;
    @XmlElementRef(name = "OperationElementType", namespace = "http://www.tmha.com.au/MOS195MI/SelWoElem", type = JAXBElement.class, required = false)
    protected JAXBElement<String> operationElementType;
    @XmlElementRef(name = "EquipmentDescription", namespace = "http://www.tmha.com.au/MOS195MI/SelWoElem", type = JAXBElement.class, required = false)
    protected JAXBElement<String> equipmentDescription;
    @XmlElementRef(name = "LotNumber", namespace = "http://www.tmha.com.au/MOS195MI/SelWoElem", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lotNumber;
    @XmlElementRef(name = "Complaint", namespace = "http://www.tmha.com.au/MOS195MI/SelWoElem", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> complaint;
    @XmlElementRef(name = "EmployeeNumber", namespace = "http://www.tmha.com.au/MOS195MI/SelWoElem", type = JAXBElement.class, required = false)
    protected JAXBElement<String> employeeNumber;
    @XmlElementRef(name = "EquipmentNumber", namespace = "http://www.tmha.com.au/MOS195MI/SelWoElem", type = JAXBElement.class, required = false)
    protected JAXBElement<String> equipmentNumber;
    @XmlElementRef(name = "Facility", namespace = "http://www.tmha.com.au/MOS195MI/SelWoElem", type = JAXBElement.class, required = false)
    protected JAXBElement<String> facility;
    @XmlElementRef(name = "EventType", namespace = "http://www.tmha.com.au/MOS195MI/SelWoElem", type = JAXBElement.class, required = false)
    protected JAXBElement<String> eventType;
    @XmlElementRef(name = "ErrorCode2", namespace = "http://www.tmha.com.au/MOS195MI/SelWoElem", type = JAXBElement.class, required = false)
    protected JAXBElement<String> errorCode2;
    @XmlElementRef(name = "ErrorCode3", namespace = "http://www.tmha.com.au/MOS195MI/SelWoElem", type = JAXBElement.class, required = false)
    protected JAXBElement<String> errorCode3;
    @XmlElementRef(name = "ErrorCode1", namespace = "http://www.tmha.com.au/MOS195MI/SelWoElem", type = JAXBElement.class, required = false)
    protected JAXBElement<String> errorCode1;
    @XmlElementRef(name = "ItemNumber", namespace = "http://www.tmha.com.au/MOS195MI/SelWoElem", type = JAXBElement.class, required = false)
    protected JAXBElement<String> itemNumber;
    @XmlElementRef(name = "FinishDate", namespace = "http://www.tmha.com.au/MOS195MI/SelWoElem", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> finishDate;
    @XmlElementRef(name = "FinishTime", namespace = "http://www.tmha.com.au/MOS195MI/SelWoElem", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> finishTime;
    @XmlElementRef(name = "SequenceNumber", namespace = "http://www.tmha.com.au/MOS195MI/SelWoElem", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> sequenceNumber;
    @XmlElementRef(name = "WorkOrderNumber", namespace = "http://www.tmha.com.au/MOS195MI/SelWoElem", type = JAXBElement.class, required = false)
    protected JAXBElement<String> workOrderNumber;
    @XmlElementRef(name = "OperationNumber", namespace = "http://www.tmha.com.au/MOS195MI/SelWoElem", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> operationNumber;
    @XmlElementRef(name = "OrderType", namespace = "http://www.tmha.com.au/MOS195MI/SelWoElem", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orderType;
    @XmlElementRef(name = "StartTime", namespace = "http://www.tmha.com.au/MOS195MI/SelWoElem", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> startTime;
    @XmlElementRef(name = "OperationDescription", namespace = "http://www.tmha.com.au/MOS195MI/SelWoElem", type = JAXBElement.class, required = false)
    protected JAXBElement<String> operationDescription;
    @XmlElementRef(name = "ProductNumber", namespace = "http://www.tmha.com.au/MOS195MI/SelWoElem", type = JAXBElement.class, required = false)
    protected JAXBElement<String> productNumber;
    @XmlElementRef(name = "Responsible", namespace = "http://www.tmha.com.au/MOS195MI/SelWoElem", type = JAXBElement.class, required = false)
    protected JAXBElement<String> responsible;
    @XmlElementRef(name = "ReferenceOrderCategory", namespace = "http://www.tmha.com.au/MOS195MI/SelWoElem", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> referenceOrderCategory;
    @XmlElementRef(name = "ReferenceOrderLine", namespace = "http://www.tmha.com.au/MOS195MI/SelWoElem", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> referenceOrderLine;
    @XmlElementRef(name = "ReferenceOrderNumber", namespace = "http://www.tmha.com.au/MOS195MI/SelWoElem", type = JAXBElement.class, required = false)
    protected JAXBElement<String> referenceOrderNumber;
    @XmlElementRef(name = "LineSuffix", namespace = "http://www.tmha.com.au/MOS195MI/SelWoElem", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> lineSuffix;
    @XmlElementRef(name = "RequestedFinishDate", namespace = "http://www.tmha.com.au/MOS195MI/SelWoElem", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> requestedFinishDate;
    @XmlElementRef(name = "RequestedFinishTime", namespace = "http://www.tmha.com.au/MOS195MI/SelWoElem", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> requestedFinishTime;
    @XmlElementRef(name = "RequestedStartDate", namespace = "http://www.tmha.com.au/MOS195MI/SelWoElem", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> requestedStartDate;
    @XmlElementRef(name = "RequestedStartTime", namespace = "http://www.tmha.com.au/MOS195MI/SelWoElem", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> requestedStartTime;
    @XmlElementRef(name = "Subprocess", namespace = "http://www.tmha.com.au/MOS195MI/SelWoElem", type = JAXBElement.class, required = false)
    protected JAXBElement<String> subprocess;
    @XmlElementRef(name = "StartDate", namespace = "http://www.tmha.com.au/MOS195MI/SelWoElem", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> startDate;
    @XmlElementRef(name = "StatusMobility", namespace = "http://www.tmha.com.au/MOS195MI/SelWoElem", type = JAXBElement.class, required = false)
    protected JAXBElement<String> statusMobility;
    @XmlElementRef(name = "ProductStructureType", namespace = "http://www.tmha.com.au/MOS195MI/SelWoElem", type = JAXBElement.class, required = false)
    protected JAXBElement<String> productStructureType;
    @XmlElementRef(name = "Service", namespace = "http://www.tmha.com.au/MOS195MI/SelWoElem", type = JAXBElement.class, required = false)
    protected JAXBElement<String> service;
    @XmlElementRef(name = "SupplierNumber", namespace = "http://www.tmha.com.au/MOS195MI/SelWoElem", type = JAXBElement.class, required = false)
    protected JAXBElement<String> supplierNumber;
    @XmlElementRef(name = "RegistrationNumberSite", namespace = "http://www.tmha.com.au/MOS195MI/SelWoElem", type = JAXBElement.class, required = false)
    protected JAXBElement<String> registrationNumberSite;
    @XmlElementRef(name = "TextIdentity", namespace = "http://www.tmha.com.au/MOS195MI/SelWoElem", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> textIdentity;
    @XmlElementRef(name = "TextLine1", namespace = "http://www.tmha.com.au/MOS195MI/SelWoElem", type = JAXBElement.class, required = false)
    protected JAXBElement<String> textLine1;
    @XmlElementRef(name = "Warehouse", namespace = "http://www.tmha.com.au/MOS195MI/SelWoElem", type = JAXBElement.class, required = false)
    protected JAXBElement<String> warehouse;
    @XmlElementRef(name = "Location", namespace = "http://www.tmha.com.au/MOS195MI/SelWoElem", type = JAXBElement.class, required = false)
    protected JAXBElement<String> location;
    @XmlElementRef(name = "StatusManufacturingOrder", namespace = "http://www.tmha.com.au/MOS195MI/SelWoElem", type = JAXBElement.class, required = false)
    protected JAXBElement<String> statusManufacturingOrder;
    @XmlElementRef(name = "MaterialStatus", namespace = "http://www.tmha.com.au/MOS195MI/SelWoElem", type = JAXBElement.class, required = false)
    protected JAXBElement<String> materialStatus;
    @XmlElementRef(name = "Status", namespace = "http://www.tmha.com.au/MOS195MI/SelWoElem", type = JAXBElement.class, required = false)
    protected JAXBElement<String> status;
    @XmlElementRef(name = "ReportingNumber", namespace = "http://www.tmha.com.au/MOS195MI/SelWoElem", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> reportingNumber;
    @XmlElementRef(name = "EntryTime", namespace = "http://www.tmha.com.au/MOS195MI/SelWoElem", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> entryTime;
    @XmlElementRef(name = "EntryDate", namespace = "http://www.tmha.com.au/MOS195MI/SelWoElem", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> entryDate;
    @XmlElementRef(name = "Priority", namespace = "http://www.tmha.com.au/MOS195MI/SelWoElem", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> priority;
    @XmlElementRef(name = "Process", namespace = "http://www.tmha.com.au/MOS195MI/SelWoElem", type = JAXBElement.class, required = false)
    protected JAXBElement<String> process;
    @XmlElementRef(name = "WorkCenter", namespace = "http://www.tmha.com.au/MOS195MI/SelWoElem", type = JAXBElement.class, required = false)
    protected JAXBElement<String> workCenter;
    @XmlElementRef(name = "MandatoryServiceErrorReport", namespace = "http://www.tmha.com.au/MOS195MI/SelWoElem", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> mandatoryServiceErrorReport;
    @XmlElementRef(name = "Department", namespace = "http://www.tmha.com.au/MOS195MI/SelWoElem", type = JAXBElement.class, required = false)
    protected JAXBElement<String> department;

    /**
     * Gets the value of the taskElementNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getTaskElementNumber() {
        return taskElementNumber;
    }

    /**
     * Sets the value of the taskElementNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setTaskElementNumber(JAXBElement<BigDecimal> value) {
        this.taskElementNumber = value;
    }

    /**
     * Gets the value of the operationElementType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOperationElementType() {
        return operationElementType;
    }

    /**
     * Sets the value of the operationElementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOperationElementType(JAXBElement<String> value) {
        this.operationElementType = value;
    }

    /**
     * Gets the value of the equipmentDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEquipmentDescription() {
        return equipmentDescription;
    }

    /**
     * Sets the value of the equipmentDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEquipmentDescription(JAXBElement<String> value) {
        this.equipmentDescription = value;
    }

    /**
     * Gets the value of the lotNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLotNumber() {
        return lotNumber;
    }

    /**
     * Sets the value of the lotNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLotNumber(JAXBElement<String> value) {
        this.lotNumber = value;
    }

    /**
     * Gets the value of the complaint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getComplaint() {
        return complaint;
    }

    /**
     * Sets the value of the complaint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setComplaint(JAXBElement<BigDecimal> value) {
        this.complaint = value;
    }

    /**
     * Gets the value of the employeeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmployeeNumber() {
        return employeeNumber;
    }

    /**
     * Sets the value of the employeeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmployeeNumber(JAXBElement<String> value) {
        this.employeeNumber = value;
    }

    /**
     * Gets the value of the equipmentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEquipmentNumber() {
        return equipmentNumber;
    }

    /**
     * Sets the value of the equipmentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEquipmentNumber(JAXBElement<String> value) {
        this.equipmentNumber = value;
    }

    /**
     * Gets the value of the facility property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFacility() {
        return facility;
    }

    /**
     * Sets the value of the facility property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFacility(JAXBElement<String> value) {
        this.facility = value;
    }

    /**
     * Gets the value of the eventType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEventType() {
        return eventType;
    }

    /**
     * Sets the value of the eventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEventType(JAXBElement<String> value) {
        this.eventType = value;
    }

    /**
     * Gets the value of the errorCode2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getErrorCode2() {
        return errorCode2;
    }

    /**
     * Sets the value of the errorCode2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setErrorCode2(JAXBElement<String> value) {
        this.errorCode2 = value;
    }

    /**
     * Gets the value of the errorCode3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getErrorCode3() {
        return errorCode3;
    }

    /**
     * Sets the value of the errorCode3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setErrorCode3(JAXBElement<String> value) {
        this.errorCode3 = value;
    }

    /**
     * Gets the value of the errorCode1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getErrorCode1() {
        return errorCode1;
    }

    /**
     * Sets the value of the errorCode1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setErrorCode1(JAXBElement<String> value) {
        this.errorCode1 = value;
    }

    /**
     * Gets the value of the itemNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getItemNumber() {
        return itemNumber;
    }

    /**
     * Sets the value of the itemNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setItemNumber(JAXBElement<String> value) {
        this.itemNumber = value;
    }

    /**
     * Gets the value of the finishDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFinishDate() {
        return finishDate;
    }

    /**
     * Sets the value of the finishDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFinishDate(JAXBElement<XMLGregorianCalendar> value) {
        this.finishDate = value;
    }

    /**
     * Gets the value of the finishTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getFinishTime() {
        return finishTime;
    }

    /**
     * Sets the value of the finishTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setFinishTime(JAXBElement<BigDecimal> value) {
        this.finishTime = value;
    }

    /**
     * Gets the value of the sequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setSequenceNumber(JAXBElement<BigDecimal> value) {
        this.sequenceNumber = value;
    }

    /**
     * Gets the value of the workOrderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorkOrderNumber() {
        return workOrderNumber;
    }

    /**
     * Sets the value of the workOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorkOrderNumber(JAXBElement<String> value) {
        this.workOrderNumber = value;
    }

    /**
     * Gets the value of the operationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getOperationNumber() {
        return operationNumber;
    }

    /**
     * Sets the value of the operationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setOperationNumber(JAXBElement<BigDecimal> value) {
        this.operationNumber = value;
    }

    /**
     * Gets the value of the orderType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrderType() {
        return orderType;
    }

    /**
     * Sets the value of the orderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrderType(JAXBElement<String> value) {
        this.orderType = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setStartTime(JAXBElement<BigDecimal> value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the operationDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOperationDescription() {
        return operationDescription;
    }

    /**
     * Sets the value of the operationDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOperationDescription(JAXBElement<String> value) {
        this.operationDescription = value;
    }

    /**
     * Gets the value of the productNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProductNumber() {
        return productNumber;
    }

    /**
     * Sets the value of the productNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProductNumber(JAXBElement<String> value) {
        this.productNumber = value;
    }

    /**
     * Gets the value of the responsible property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getResponsible() {
        return responsible;
    }

    /**
     * Sets the value of the responsible property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setResponsible(JAXBElement<String> value) {
        this.responsible = value;
    }

    /**
     * Gets the value of the referenceOrderCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getReferenceOrderCategory() {
        return referenceOrderCategory;
    }

    /**
     * Sets the value of the referenceOrderCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setReferenceOrderCategory(JAXBElement<BigDecimal> value) {
        this.referenceOrderCategory = value;
    }

    /**
     * Gets the value of the referenceOrderLine property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getReferenceOrderLine() {
        return referenceOrderLine;
    }

    /**
     * Sets the value of the referenceOrderLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setReferenceOrderLine(JAXBElement<BigDecimal> value) {
        this.referenceOrderLine = value;
    }

    /**
     * Gets the value of the referenceOrderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReferenceOrderNumber() {
        return referenceOrderNumber;
    }

    /**
     * Sets the value of the referenceOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReferenceOrderNumber(JAXBElement<String> value) {
        this.referenceOrderNumber = value;
    }

    /**
     * Gets the value of the lineSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getLineSuffix() {
        return lineSuffix;
    }

    /**
     * Sets the value of the lineSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setLineSuffix(JAXBElement<BigDecimal> value) {
        this.lineSuffix = value;
    }

    /**
     * Gets the value of the requestedFinishDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getRequestedFinishDate() {
        return requestedFinishDate;
    }

    /**
     * Sets the value of the requestedFinishDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setRequestedFinishDate(JAXBElement<XMLGregorianCalendar> value) {
        this.requestedFinishDate = value;
    }

    /**
     * Gets the value of the requestedFinishTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getRequestedFinishTime() {
        return requestedFinishTime;
    }

    /**
     * Sets the value of the requestedFinishTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setRequestedFinishTime(JAXBElement<BigDecimal> value) {
        this.requestedFinishTime = value;
    }

    /**
     * Gets the value of the requestedStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getRequestedStartDate() {
        return requestedStartDate;
    }

    /**
     * Sets the value of the requestedStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setRequestedStartDate(JAXBElement<XMLGregorianCalendar> value) {
        this.requestedStartDate = value;
    }

    /**
     * Gets the value of the requestedStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getRequestedStartTime() {
        return requestedStartTime;
    }

    /**
     * Sets the value of the requestedStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setRequestedStartTime(JAXBElement<BigDecimal> value) {
        this.requestedStartTime = value;
    }

    /**
     * Gets the value of the subprocess property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSubprocess() {
        return subprocess;
    }

    /**
     * Sets the value of the subprocess property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSubprocess(JAXBElement<String> value) {
        this.subprocess = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setStartDate(JAXBElement<XMLGregorianCalendar> value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the statusMobility property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStatusMobility() {
        return statusMobility;
    }

    /**
     * Sets the value of the statusMobility property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStatusMobility(JAXBElement<String> value) {
        this.statusMobility = value;
    }

    /**
     * Gets the value of the productStructureType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProductStructureType() {
        return productStructureType;
    }

    /**
     * Sets the value of the productStructureType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProductStructureType(JAXBElement<String> value) {
        this.productStructureType = value;
    }

    /**
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setService(JAXBElement<String> value) {
        this.service = value;
    }

    /**
     * Gets the value of the supplierNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSupplierNumber() {
        return supplierNumber;
    }

    /**
     * Sets the value of the supplierNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSupplierNumber(JAXBElement<String> value) {
        this.supplierNumber = value;
    }

    /**
     * Gets the value of the registrationNumberSite property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegistrationNumberSite() {
        return registrationNumberSite;
    }

    /**
     * Sets the value of the registrationNumberSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegistrationNumberSite(JAXBElement<String> value) {
        this.registrationNumberSite = value;
    }

    /**
     * Gets the value of the textIdentity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getTextIdentity() {
        return textIdentity;
    }

    /**
     * Sets the value of the textIdentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setTextIdentity(JAXBElement<BigDecimal> value) {
        this.textIdentity = value;
    }

    /**
     * Gets the value of the textLine1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTextLine1() {
        return textLine1;
    }

    /**
     * Sets the value of the textLine1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTextLine1(JAXBElement<String> value) {
        this.textLine1 = value;
    }

    /**
     * Gets the value of the warehouse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWarehouse() {
        return warehouse;
    }

    /**
     * Sets the value of the warehouse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWarehouse(JAXBElement<String> value) {
        this.warehouse = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocation(JAXBElement<String> value) {
        this.location = value;
    }

    /**
     * Gets the value of the statusManufacturingOrder property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStatusManufacturingOrder() {
        return statusManufacturingOrder;
    }

    /**
     * Sets the value of the statusManufacturingOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStatusManufacturingOrder(JAXBElement<String> value) {
        this.statusManufacturingOrder = value;
    }

    /**
     * Gets the value of the materialStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMaterialStatus() {
        return materialStatus;
    }

    /**
     * Sets the value of the materialStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMaterialStatus(JAXBElement<String> value) {
        this.materialStatus = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStatus(JAXBElement<String> value) {
        this.status = value;
    }

    /**
     * Gets the value of the reportingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getReportingNumber() {
        return reportingNumber;
    }

    /**
     * Sets the value of the reportingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setReportingNumber(JAXBElement<BigDecimal> value) {
        this.reportingNumber = value;
    }

    /**
     * Gets the value of the entryTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getEntryTime() {
        return entryTime;
    }

    /**
     * Sets the value of the entryTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setEntryTime(JAXBElement<BigDecimal> value) {
        this.entryTime = value;
    }

    /**
     * Gets the value of the entryDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEntryDate() {
        return entryDate;
    }

    /**
     * Sets the value of the entryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEntryDate(JAXBElement<XMLGregorianCalendar> value) {
        this.entryDate = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPriority(JAXBElement<BigDecimal> value) {
        this.priority = value;
    }

    /**
     * Gets the value of the process property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProcess() {
        return process;
    }

    /**
     * Sets the value of the process property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProcess(JAXBElement<String> value) {
        this.process = value;
    }

    /**
     * Gets the value of the workCenter property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorkCenter() {
        return workCenter;
    }

    /**
     * Sets the value of the workCenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorkCenter(JAXBElement<String> value) {
        this.workCenter = value;
    }

    /**
     * Gets the value of the mandatoryServiceErrorReport property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getMandatoryServiceErrorReport() {
        return mandatoryServiceErrorReport;
    }

    /**
     * Sets the value of the mandatoryServiceErrorReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setMandatoryServiceErrorReport(JAXBElement<BigDecimal> value) {
        this.mandatoryServiceErrorReport = value;
    }

    /**
     * Gets the value of the department property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDepartment() {
        return department;
    }

    /**
     * Sets the value of the department property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDepartment(JAXBElement<String> value) {
        this.department = value;
    }

}
