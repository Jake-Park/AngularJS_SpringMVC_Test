
package au.com.tmha.mos057mi.add;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AddItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReferenceOrderCategory" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ReferenceOrderNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ReferenceOrderLine" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="LineSuffix" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
 *         &lt;element name="SequenceNumber" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MainService" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Status" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ReferenceIdentityCode" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OrderNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="OrderLine" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="LineSuffixRIDX" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ItemNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
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
 *         &lt;element name="BreakdownDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="BreakDownTime" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MachineReadyDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="MachineReadyTime" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="EquipmentInProductionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="EquipmentInProductionTime" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ErrorReportQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="NonOEMPart" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ReportedBy" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MeterValue1" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MeterValue2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MeterValue3" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MeterValue4" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DurabilityFlag" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Inoperable" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="UserdefinedField1Item" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="UserdefinedField2Item" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="UserdefinedField3Item" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="UserdefinedField4Item" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="UserdefinedField5Item" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Warranty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DrawingPosition" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DocumentIdentity" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Text" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="60"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TextTXL2" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="60"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TextTXL3" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="60"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TextTXL4" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="60"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TextTXL5" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="60"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TextTXL6" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="60"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TextTXL7" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="60"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TextTXL8" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="60"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TextTXL9" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="60"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TextTXL0" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="60"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Meter" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SinceNew" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SerialNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
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
@XmlType(name = "AddItem", propOrder = {
    "referenceOrderCategory",
    "referenceOrderNumber",
    "referenceOrderLine",
    "lineSuffix",
    "productStructureType",
    "service",
    "sequenceNumber",
    "mainService",
    "status",
    "referenceIdentityCode",
    "orderNumber",
    "orderLine",
    "lineSuffixRIDX",
    "itemNumber",
    "errorCode1",
    "errorCode2",
    "errorCode3",
    "breakdownDate",
    "breakDownTime",
    "machineReadyDate",
    "machineReadyTime",
    "equipmentInProductionDate",
    "equipmentInProductionTime",
    "errorReportQuantity",
    "nonOEMPart",
    "reportedBy",
    "meterValue1",
    "meterValue2",
    "meterValue3",
    "meterValue4",
    "durabilityFlag",
    "inoperable",
    "userdefinedField1Item",
    "userdefinedField2Item",
    "userdefinedField3Item",
    "userdefinedField4Item",
    "userdefinedField5Item",
    "warranty",
    "drawingPosition",
    "documentIdentity",
    "text",
    "textTXL2",
    "textTXL3",
    "textTXL4",
    "textTXL5",
    "textTXL6",
    "textTXL7",
    "textTXL8",
    "textTXL9",
    "textTXL0",
    "meter",
    "sinceNew",
    "serialNumber"
})
public class AddItem {

    @XmlElementRef(name = "ReferenceOrderCategory", namespace = "http://www.tmha.com.au/MOS057MI/Add", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> referenceOrderCategory;
    @XmlElementRef(name = "ReferenceOrderNumber", namespace = "http://www.tmha.com.au/MOS057MI/Add", type = JAXBElement.class, required = false)
    protected JAXBElement<String> referenceOrderNumber;
    @XmlElementRef(name = "ReferenceOrderLine", namespace = "http://www.tmha.com.au/MOS057MI/Add", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> referenceOrderLine;
    @XmlElementRef(name = "LineSuffix", namespace = "http://www.tmha.com.au/MOS057MI/Add", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> lineSuffix;
    @XmlElementRef(name = "ProductStructureType", namespace = "http://www.tmha.com.au/MOS057MI/Add", type = JAXBElement.class, required = false)
    protected JAXBElement<String> productStructureType;
    @XmlElementRef(name = "Service", namespace = "http://www.tmha.com.au/MOS057MI/Add", type = JAXBElement.class, required = false)
    protected JAXBElement<String> service;
    @XmlElementRef(name = "SequenceNumber", namespace = "http://www.tmha.com.au/MOS057MI/Add", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> sequenceNumber;
    @XmlElementRef(name = "MainService", namespace = "http://www.tmha.com.au/MOS057MI/Add", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> mainService;
    @XmlElementRef(name = "Status", namespace = "http://www.tmha.com.au/MOS057MI/Add", type = JAXBElement.class, required = false)
    protected JAXBElement<String> status;
    @XmlElementRef(name = "ReferenceIdentityCode", namespace = "http://www.tmha.com.au/MOS057MI/Add", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> referenceIdentityCode;
    @XmlElementRef(name = "OrderNumber", namespace = "http://www.tmha.com.au/MOS057MI/Add", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orderNumber;
    @XmlElementRef(name = "OrderLine", namespace = "http://www.tmha.com.au/MOS057MI/Add", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> orderLine;
    @XmlElementRef(name = "LineSuffixRIDX", namespace = "http://www.tmha.com.au/MOS057MI/Add", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> lineSuffixRIDX;
    @XmlElementRef(name = "ItemNumber", namespace = "http://www.tmha.com.au/MOS057MI/Add", type = JAXBElement.class, required = false)
    protected JAXBElement<String> itemNumber;
    @XmlElementRef(name = "ErrorCode1", namespace = "http://www.tmha.com.au/MOS057MI/Add", type = JAXBElement.class, required = false)
    protected JAXBElement<String> errorCode1;
    @XmlElementRef(name = "ErrorCode2", namespace = "http://www.tmha.com.au/MOS057MI/Add", type = JAXBElement.class, required = false)
    protected JAXBElement<String> errorCode2;
    @XmlElementRef(name = "ErrorCode3", namespace = "http://www.tmha.com.au/MOS057MI/Add", type = JAXBElement.class, required = false)
    protected JAXBElement<String> errorCode3;
    @XmlElementRef(name = "BreakdownDate", namespace = "http://www.tmha.com.au/MOS057MI/Add", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> breakdownDate;
    @XmlElementRef(name = "BreakDownTime", namespace = "http://www.tmha.com.au/MOS057MI/Add", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> breakDownTime;
    @XmlElementRef(name = "MachineReadyDate", namespace = "http://www.tmha.com.au/MOS057MI/Add", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> machineReadyDate;
    @XmlElementRef(name = "MachineReadyTime", namespace = "http://www.tmha.com.au/MOS057MI/Add", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> machineReadyTime;
    @XmlElementRef(name = "EquipmentInProductionDate", namespace = "http://www.tmha.com.au/MOS057MI/Add", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> equipmentInProductionDate;
    @XmlElementRef(name = "EquipmentInProductionTime", namespace = "http://www.tmha.com.au/MOS057MI/Add", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> equipmentInProductionTime;
    @XmlElementRef(name = "ErrorReportQuantity", namespace = "http://www.tmha.com.au/MOS057MI/Add", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> errorReportQuantity;
    @XmlElementRef(name = "NonOEMPart", namespace = "http://www.tmha.com.au/MOS057MI/Add", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> nonOEMPart;
    @XmlElementRef(name = "ReportedBy", namespace = "http://www.tmha.com.au/MOS057MI/Add", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reportedBy;
    @XmlElementRef(name = "MeterValue1", namespace = "http://www.tmha.com.au/MOS057MI/Add", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> meterValue1;
    @XmlElementRef(name = "MeterValue2", namespace = "http://www.tmha.com.au/MOS057MI/Add", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> meterValue2;
    @XmlElementRef(name = "MeterValue3", namespace = "http://www.tmha.com.au/MOS057MI/Add", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> meterValue3;
    @XmlElementRef(name = "MeterValue4", namespace = "http://www.tmha.com.au/MOS057MI/Add", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> meterValue4;
    @XmlElementRef(name = "DurabilityFlag", namespace = "http://www.tmha.com.au/MOS057MI/Add", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> durabilityFlag;
    @XmlElementRef(name = "Inoperable", namespace = "http://www.tmha.com.au/MOS057MI/Add", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> inoperable;
    @XmlElementRef(name = "UserdefinedField1Item", namespace = "http://www.tmha.com.au/MOS057MI/Add", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userdefinedField1Item;
    @XmlElementRef(name = "UserdefinedField2Item", namespace = "http://www.tmha.com.au/MOS057MI/Add", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> userdefinedField2Item;
    @XmlElementRef(name = "UserdefinedField3Item", namespace = "http://www.tmha.com.au/MOS057MI/Add", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userdefinedField3Item;
    @XmlElementRef(name = "UserdefinedField4Item", namespace = "http://www.tmha.com.au/MOS057MI/Add", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userdefinedField4Item;
    @XmlElementRef(name = "UserdefinedField5Item", namespace = "http://www.tmha.com.au/MOS057MI/Add", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userdefinedField5Item;
    @XmlElementRef(name = "Warranty", namespace = "http://www.tmha.com.au/MOS057MI/Add", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> warranty;
    @XmlElementRef(name = "DrawingPosition", namespace = "http://www.tmha.com.au/MOS057MI/Add", type = JAXBElement.class, required = false)
    protected JAXBElement<String> drawingPosition;
    @XmlElementRef(name = "DocumentIdentity", namespace = "http://www.tmha.com.au/MOS057MI/Add", type = JAXBElement.class, required = false)
    protected JAXBElement<String> documentIdentity;
    @XmlElementRef(name = "Text", namespace = "http://www.tmha.com.au/MOS057MI/Add", type = JAXBElement.class, required = false)
    protected JAXBElement<String> text;
    @XmlElementRef(name = "TextTXL2", namespace = "http://www.tmha.com.au/MOS057MI/Add", type = JAXBElement.class, required = false)
    protected JAXBElement<String> textTXL2;
    @XmlElementRef(name = "TextTXL3", namespace = "http://www.tmha.com.au/MOS057MI/Add", type = JAXBElement.class, required = false)
    protected JAXBElement<String> textTXL3;
    @XmlElementRef(name = "TextTXL4", namespace = "http://www.tmha.com.au/MOS057MI/Add", type = JAXBElement.class, required = false)
    protected JAXBElement<String> textTXL4;
    @XmlElementRef(name = "TextTXL5", namespace = "http://www.tmha.com.au/MOS057MI/Add", type = JAXBElement.class, required = false)
    protected JAXBElement<String> textTXL5;
    @XmlElementRef(name = "TextTXL6", namespace = "http://www.tmha.com.au/MOS057MI/Add", type = JAXBElement.class, required = false)
    protected JAXBElement<String> textTXL6;
    @XmlElementRef(name = "TextTXL7", namespace = "http://www.tmha.com.au/MOS057MI/Add", type = JAXBElement.class, required = false)
    protected JAXBElement<String> textTXL7;
    @XmlElementRef(name = "TextTXL8", namespace = "http://www.tmha.com.au/MOS057MI/Add", type = JAXBElement.class, required = false)
    protected JAXBElement<String> textTXL8;
    @XmlElementRef(name = "TextTXL9", namespace = "http://www.tmha.com.au/MOS057MI/Add", type = JAXBElement.class, required = false)
    protected JAXBElement<String> textTXL9;
    @XmlElementRef(name = "TextTXL0", namespace = "http://www.tmha.com.au/MOS057MI/Add", type = JAXBElement.class, required = false)
    protected JAXBElement<String> textTXL0;
    @XmlElementRef(name = "Meter", namespace = "http://www.tmha.com.au/MOS057MI/Add", type = JAXBElement.class, required = false)
    protected JAXBElement<String> meter;
    @XmlElementRef(name = "SinceNew", namespace = "http://www.tmha.com.au/MOS057MI/Add", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> sinceNew;
    @XmlElementRef(name = "SerialNumber", namespace = "http://www.tmha.com.au/MOS057MI/Add", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serialNumber;

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
     * Gets the value of the mainService property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getMainService() {
        return mainService;
    }

    /**
     * Sets the value of the mainService property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setMainService(JAXBElement<BigDecimal> value) {
        this.mainService = value;
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
     * Gets the value of the referenceIdentityCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getReferenceIdentityCode() {
        return referenceIdentityCode;
    }

    /**
     * Sets the value of the referenceIdentityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setReferenceIdentityCode(JAXBElement<BigDecimal> value) {
        this.referenceIdentityCode = value;
    }

    /**
     * Gets the value of the orderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrderNumber() {
        return orderNumber;
    }

    /**
     * Sets the value of the orderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrderNumber(JAXBElement<String> value) {
        this.orderNumber = value;
    }

    /**
     * Gets the value of the orderLine property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getOrderLine() {
        return orderLine;
    }

    /**
     * Sets the value of the orderLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setOrderLine(JAXBElement<BigDecimal> value) {
        this.orderLine = value;
    }

    /**
     * Gets the value of the lineSuffixRIDX property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getLineSuffixRIDX() {
        return lineSuffixRIDX;
    }

    /**
     * Sets the value of the lineSuffixRIDX property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setLineSuffixRIDX(JAXBElement<BigDecimal> value) {
        this.lineSuffixRIDX = value;
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
     * Gets the value of the breakdownDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getBreakdownDate() {
        return breakdownDate;
    }

    /**
     * Sets the value of the breakdownDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setBreakdownDate(JAXBElement<XMLGregorianCalendar> value) {
        this.breakdownDate = value;
    }

    /**
     * Gets the value of the breakDownTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getBreakDownTime() {
        return breakDownTime;
    }

    /**
     * Sets the value of the breakDownTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setBreakDownTime(JAXBElement<BigDecimal> value) {
        this.breakDownTime = value;
    }

    /**
     * Gets the value of the machineReadyDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getMachineReadyDate() {
        return machineReadyDate;
    }

    /**
     * Sets the value of the machineReadyDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setMachineReadyDate(JAXBElement<XMLGregorianCalendar> value) {
        this.machineReadyDate = value;
    }

    /**
     * Gets the value of the machineReadyTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getMachineReadyTime() {
        return machineReadyTime;
    }

    /**
     * Sets the value of the machineReadyTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setMachineReadyTime(JAXBElement<BigDecimal> value) {
        this.machineReadyTime = value;
    }

    /**
     * Gets the value of the equipmentInProductionDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEquipmentInProductionDate() {
        return equipmentInProductionDate;
    }

    /**
     * Sets the value of the equipmentInProductionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEquipmentInProductionDate(JAXBElement<XMLGregorianCalendar> value) {
        this.equipmentInProductionDate = value;
    }

    /**
     * Gets the value of the equipmentInProductionTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getEquipmentInProductionTime() {
        return equipmentInProductionTime;
    }

    /**
     * Sets the value of the equipmentInProductionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setEquipmentInProductionTime(JAXBElement<BigDecimal> value) {
        this.equipmentInProductionTime = value;
    }

    /**
     * Gets the value of the errorReportQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getErrorReportQuantity() {
        return errorReportQuantity;
    }

    /**
     * Sets the value of the errorReportQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setErrorReportQuantity(JAXBElement<BigDecimal> value) {
        this.errorReportQuantity = value;
    }

    /**
     * Gets the value of the nonOEMPart property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getNonOEMPart() {
        return nonOEMPart;
    }

    /**
     * Sets the value of the nonOEMPart property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setNonOEMPart(JAXBElement<BigDecimal> value) {
        this.nonOEMPart = value;
    }

    /**
     * Gets the value of the reportedBy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReportedBy() {
        return reportedBy;
    }

    /**
     * Sets the value of the reportedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReportedBy(JAXBElement<String> value) {
        this.reportedBy = value;
    }

    /**
     * Gets the value of the meterValue1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getMeterValue1() {
        return meterValue1;
    }

    /**
     * Sets the value of the meterValue1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setMeterValue1(JAXBElement<BigDecimal> value) {
        this.meterValue1 = value;
    }

    /**
     * Gets the value of the meterValue2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getMeterValue2() {
        return meterValue2;
    }

    /**
     * Sets the value of the meterValue2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setMeterValue2(JAXBElement<BigDecimal> value) {
        this.meterValue2 = value;
    }

    /**
     * Gets the value of the meterValue3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getMeterValue3() {
        return meterValue3;
    }

    /**
     * Sets the value of the meterValue3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setMeterValue3(JAXBElement<BigDecimal> value) {
        this.meterValue3 = value;
    }

    /**
     * Gets the value of the meterValue4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getMeterValue4() {
        return meterValue4;
    }

    /**
     * Sets the value of the meterValue4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setMeterValue4(JAXBElement<BigDecimal> value) {
        this.meterValue4 = value;
    }

    /**
     * Gets the value of the durabilityFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDurabilityFlag() {
        return durabilityFlag;
    }

    /**
     * Sets the value of the durabilityFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDurabilityFlag(JAXBElement<BigDecimal> value) {
        this.durabilityFlag = value;
    }

    /**
     * Gets the value of the inoperable property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getInoperable() {
        return inoperable;
    }

    /**
     * Sets the value of the inoperable property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setInoperable(JAXBElement<BigDecimal> value) {
        this.inoperable = value;
    }

    /**
     * Gets the value of the userdefinedField1Item property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserdefinedField1Item() {
        return userdefinedField1Item;
    }

    /**
     * Sets the value of the userdefinedField1Item property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserdefinedField1Item(JAXBElement<String> value) {
        this.userdefinedField1Item = value;
    }

    /**
     * Gets the value of the userdefinedField2Item property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getUserdefinedField2Item() {
        return userdefinedField2Item;
    }

    /**
     * Sets the value of the userdefinedField2Item property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setUserdefinedField2Item(JAXBElement<BigDecimal> value) {
        this.userdefinedField2Item = value;
    }

    /**
     * Gets the value of the userdefinedField3Item property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserdefinedField3Item() {
        return userdefinedField3Item;
    }

    /**
     * Sets the value of the userdefinedField3Item property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserdefinedField3Item(JAXBElement<String> value) {
        this.userdefinedField3Item = value;
    }

    /**
     * Gets the value of the userdefinedField4Item property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserdefinedField4Item() {
        return userdefinedField4Item;
    }

    /**
     * Sets the value of the userdefinedField4Item property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserdefinedField4Item(JAXBElement<String> value) {
        this.userdefinedField4Item = value;
    }

    /**
     * Gets the value of the userdefinedField5Item property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserdefinedField5Item() {
        return userdefinedField5Item;
    }

    /**
     * Sets the value of the userdefinedField5Item property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserdefinedField5Item(JAXBElement<String> value) {
        this.userdefinedField5Item = value;
    }

    /**
     * Gets the value of the warranty property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getWarranty() {
        return warranty;
    }

    /**
     * Sets the value of the warranty property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setWarranty(JAXBElement<BigDecimal> value) {
        this.warranty = value;
    }

    /**
     * Gets the value of the drawingPosition property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDrawingPosition() {
        return drawingPosition;
    }

    /**
     * Sets the value of the drawingPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDrawingPosition(JAXBElement<String> value) {
        this.drawingPosition = value;
    }

    /**
     * Gets the value of the documentIdentity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDocumentIdentity() {
        return documentIdentity;
    }

    /**
     * Sets the value of the documentIdentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDocumentIdentity(JAXBElement<String> value) {
        this.documentIdentity = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setText(JAXBElement<String> value) {
        this.text = value;
    }

    /**
     * Gets the value of the textTXL2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTextTXL2() {
        return textTXL2;
    }

    /**
     * Sets the value of the textTXL2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTextTXL2(JAXBElement<String> value) {
        this.textTXL2 = value;
    }

    /**
     * Gets the value of the textTXL3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTextTXL3() {
        return textTXL3;
    }

    /**
     * Sets the value of the textTXL3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTextTXL3(JAXBElement<String> value) {
        this.textTXL3 = value;
    }

    /**
     * Gets the value of the textTXL4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTextTXL4() {
        return textTXL4;
    }

    /**
     * Sets the value of the textTXL4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTextTXL4(JAXBElement<String> value) {
        this.textTXL4 = value;
    }

    /**
     * Gets the value of the textTXL5 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTextTXL5() {
        return textTXL5;
    }

    /**
     * Sets the value of the textTXL5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTextTXL5(JAXBElement<String> value) {
        this.textTXL5 = value;
    }

    /**
     * Gets the value of the textTXL6 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTextTXL6() {
        return textTXL6;
    }

    /**
     * Sets the value of the textTXL6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTextTXL6(JAXBElement<String> value) {
        this.textTXL6 = value;
    }

    /**
     * Gets the value of the textTXL7 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTextTXL7() {
        return textTXL7;
    }

    /**
     * Sets the value of the textTXL7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTextTXL7(JAXBElement<String> value) {
        this.textTXL7 = value;
    }

    /**
     * Gets the value of the textTXL8 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTextTXL8() {
        return textTXL8;
    }

    /**
     * Sets the value of the textTXL8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTextTXL8(JAXBElement<String> value) {
        this.textTXL8 = value;
    }

    /**
     * Gets the value of the textTXL9 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTextTXL9() {
        return textTXL9;
    }

    /**
     * Sets the value of the textTXL9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTextTXL9(JAXBElement<String> value) {
        this.textTXL9 = value;
    }

    /**
     * Gets the value of the textTXL0 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTextTXL0() {
        return textTXL0;
    }

    /**
     * Sets the value of the textTXL0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTextTXL0(JAXBElement<String> value) {
        this.textTXL0 = value;
    }

    /**
     * Gets the value of the meter property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMeter() {
        return meter;
    }

    /**
     * Sets the value of the meter property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMeter(JAXBElement<String> value) {
        this.meter = value;
    }

    /**
     * Gets the value of the sinceNew property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getSinceNew() {
        return sinceNew;
    }

    /**
     * Sets the value of the sinceNew property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setSinceNew(JAXBElement<BigDecimal> value) {
        this.sinceNew = value;
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSerialNumber(JAXBElement<String> value) {
        this.serialNumber = value;
    }

}
