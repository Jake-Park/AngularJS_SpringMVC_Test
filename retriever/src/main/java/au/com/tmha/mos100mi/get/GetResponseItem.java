
package au.com.tmha.mos100mi.get;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for GetResponseItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetResponseItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Lotnumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BreakdownDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
 *         &lt;element name="MainProduct" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ProductDescription" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PlannedFinishTime" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PlannedStartTime" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OrderType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="OrderedQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="EntryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="EntryTime" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ReferenceOrderCategory" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ReferenceOrderLine" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ReferenceOrderNumber" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="LineSuffix" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ReportingDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Requester" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RequestedFinishDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="RequestedFinishTime" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RequestedStartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="RequestedStartTime" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="UserDefinedField1" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="UserDefinedField2" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="UserDefinedField3" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="UserDefinedField4" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="UserDefinedField5" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="UserDefinedField6" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="StructureType" minOccurs="0">
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
 *         &lt;element name="EarliestStartTime" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DueTime" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TextLine" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="60"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TextLineTXT2" minOccurs="0">
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
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ReportingTime" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="WorkCenterResource" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ManufacturedQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PlannedFinishDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="DueDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="BreakDownTime" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AddressNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PlannedStartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ActionMessage" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AddressType" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ConfigurationNumber" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetResponseItem", propOrder = {
    "lotnumber",
    "breakdownDate",
    "userdefinedField1Item",
    "userdefinedField2Item",
    "userdefinedField3Item",
    "userdefinedField4Item",
    "userdefinedField5Item",
    "mainProduct",
    "productDescription",
    "plannedFinishTime",
    "plannedStartTime",
    "orderType",
    "orderedQuantity",
    "priority",
    "entryDate",
    "entryTime",
    "referenceOrderCategory",
    "referenceOrderLine",
    "referenceOrderNumber",
    "lineSuffix",
    "reportingDate",
    "requester",
    "requestedFinishDate",
    "requestedFinishTime",
    "requestedStartDate",
    "requestedStartTime",
    "userDefinedField1",
    "userDefinedField2",
    "userDefinedField3",
    "userDefinedField4",
    "userDefinedField5",
    "userDefinedField6",
    "structureType",
    "service",
    "earliestStartTime",
    "dueTime",
    "textLine",
    "textLineTXT2",
    "warehouse",
    "status",
    "reportingTime",
    "workCenterResource",
    "manufacturedQuantity",
    "plannedFinishDate",
    "dueDate",
    "breakDownTime",
    "addressNumber",
    "plannedStartDate",
    "actionMessage",
    "addressType",
    "configurationNumber"
})
public class GetResponseItem {

    @XmlElementRef(name = "Lotnumber", namespace = "http://www.tmha.com.au/MOS100MI/Get", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lotnumber;
    @XmlElementRef(name = "BreakdownDate", namespace = "http://www.tmha.com.au/MOS100MI/Get", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> breakdownDate;
    @XmlElementRef(name = "UserdefinedField1Item", namespace = "http://www.tmha.com.au/MOS100MI/Get", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userdefinedField1Item;
    @XmlElementRef(name = "UserdefinedField2Item", namespace = "http://www.tmha.com.au/MOS100MI/Get", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> userdefinedField2Item;
    @XmlElementRef(name = "UserdefinedField3Item", namespace = "http://www.tmha.com.au/MOS100MI/Get", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userdefinedField3Item;
    @XmlElementRef(name = "UserdefinedField4Item", namespace = "http://www.tmha.com.au/MOS100MI/Get", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userdefinedField4Item;
    @XmlElementRef(name = "UserdefinedField5Item", namespace = "http://www.tmha.com.au/MOS100MI/Get", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userdefinedField5Item;
    @XmlElementRef(name = "MainProduct", namespace = "http://www.tmha.com.au/MOS100MI/Get", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mainProduct;
    @XmlElementRef(name = "ProductDescription", namespace = "http://www.tmha.com.au/MOS100MI/Get", type = JAXBElement.class, required = false)
    protected JAXBElement<String> productDescription;
    @XmlElementRef(name = "PlannedFinishTime", namespace = "http://www.tmha.com.au/MOS100MI/Get", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> plannedFinishTime;
    @XmlElementRef(name = "PlannedStartTime", namespace = "http://www.tmha.com.au/MOS100MI/Get", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> plannedStartTime;
    @XmlElementRef(name = "OrderType", namespace = "http://www.tmha.com.au/MOS100MI/Get", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orderType;
    @XmlElementRef(name = "OrderedQuantity", namespace = "http://www.tmha.com.au/MOS100MI/Get", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> orderedQuantity;
    @XmlElementRef(name = "Priority", namespace = "http://www.tmha.com.au/MOS100MI/Get", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> priority;
    @XmlElementRef(name = "EntryDate", namespace = "http://www.tmha.com.au/MOS100MI/Get", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> entryDate;
    @XmlElementRef(name = "EntryTime", namespace = "http://www.tmha.com.au/MOS100MI/Get", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> entryTime;
    @XmlElementRef(name = "ReferenceOrderCategory", namespace = "http://www.tmha.com.au/MOS100MI/Get", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> referenceOrderCategory;
    @XmlElementRef(name = "ReferenceOrderLine", namespace = "http://www.tmha.com.au/MOS100MI/Get", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> referenceOrderLine;
    @XmlElementRef(name = "ReferenceOrderNumber", namespace = "http://www.tmha.com.au/MOS100MI/Get", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> referenceOrderNumber;
    @XmlElementRef(name = "LineSuffix", namespace = "http://www.tmha.com.au/MOS100MI/Get", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> lineSuffix;
    @XmlElementRef(name = "ReportingDate", namespace = "http://www.tmha.com.au/MOS100MI/Get", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> reportingDate;
    @XmlElementRef(name = "Requester", namespace = "http://www.tmha.com.au/MOS100MI/Get", type = JAXBElement.class, required = false)
    protected JAXBElement<String> requester;
    @XmlElementRef(name = "RequestedFinishDate", namespace = "http://www.tmha.com.au/MOS100MI/Get", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> requestedFinishDate;
    @XmlElementRef(name = "RequestedFinishTime", namespace = "http://www.tmha.com.au/MOS100MI/Get", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> requestedFinishTime;
    @XmlElementRef(name = "RequestedStartDate", namespace = "http://www.tmha.com.au/MOS100MI/Get", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> requestedStartDate;
    @XmlElementRef(name = "RequestedStartTime", namespace = "http://www.tmha.com.au/MOS100MI/Get", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> requestedStartTime;
    @XmlElementRef(name = "UserDefinedField1", namespace = "http://www.tmha.com.au/MOS100MI/Get", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userDefinedField1;
    @XmlElementRef(name = "UserDefinedField2", namespace = "http://www.tmha.com.au/MOS100MI/Get", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userDefinedField2;
    @XmlElementRef(name = "UserDefinedField3", namespace = "http://www.tmha.com.au/MOS100MI/Get", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userDefinedField3;
    @XmlElementRef(name = "UserDefinedField4", namespace = "http://www.tmha.com.au/MOS100MI/Get", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userDefinedField4;
    @XmlElementRef(name = "UserDefinedField5", namespace = "http://www.tmha.com.au/MOS100MI/Get", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userDefinedField5;
    @XmlElementRef(name = "UserDefinedField6", namespace = "http://www.tmha.com.au/MOS100MI/Get", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userDefinedField6;
    @XmlElementRef(name = "StructureType", namespace = "http://www.tmha.com.au/MOS100MI/Get", type = JAXBElement.class, required = false)
    protected JAXBElement<String> structureType;
    @XmlElementRef(name = "Service", namespace = "http://www.tmha.com.au/MOS100MI/Get", type = JAXBElement.class, required = false)
    protected JAXBElement<String> service;
    @XmlElementRef(name = "EarliestStartTime", namespace = "http://www.tmha.com.au/MOS100MI/Get", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> earliestStartTime;
    @XmlElementRef(name = "DueTime", namespace = "http://www.tmha.com.au/MOS100MI/Get", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> dueTime;
    @XmlElementRef(name = "TextLine", namespace = "http://www.tmha.com.au/MOS100MI/Get", type = JAXBElement.class, required = false)
    protected JAXBElement<String> textLine;
    @XmlElementRef(name = "TextLineTXT2", namespace = "http://www.tmha.com.au/MOS100MI/Get", type = JAXBElement.class, required = false)
    protected JAXBElement<String> textLineTXT2;
    @XmlElementRef(name = "Warehouse", namespace = "http://www.tmha.com.au/MOS100MI/Get", type = JAXBElement.class, required = false)
    protected JAXBElement<String> warehouse;
    @XmlElementRef(name = "Status", namespace = "http://www.tmha.com.au/MOS100MI/Get", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> status;
    @XmlElementRef(name = "ReportingTime", namespace = "http://www.tmha.com.au/MOS100MI/Get", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> reportingTime;
    @XmlElementRef(name = "WorkCenterResource", namespace = "http://www.tmha.com.au/MOS100MI/Get", type = JAXBElement.class, required = false)
    protected JAXBElement<String> workCenterResource;
    @XmlElementRef(name = "ManufacturedQuantity", namespace = "http://www.tmha.com.au/MOS100MI/Get", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> manufacturedQuantity;
    @XmlElementRef(name = "PlannedFinishDate", namespace = "http://www.tmha.com.au/MOS100MI/Get", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> plannedFinishDate;
    @XmlElementRef(name = "DueDate", namespace = "http://www.tmha.com.au/MOS100MI/Get", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dueDate;
    @XmlElementRef(name = "BreakDownTime", namespace = "http://www.tmha.com.au/MOS100MI/Get", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> breakDownTime;
    @XmlElementRef(name = "AddressNumber", namespace = "http://www.tmha.com.au/MOS100MI/Get", type = JAXBElement.class, required = false)
    protected JAXBElement<String> addressNumber;
    @XmlElementRef(name = "PlannedStartDate", namespace = "http://www.tmha.com.au/MOS100MI/Get", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> plannedStartDate;
    @XmlElementRef(name = "ActionMessage", namespace = "http://www.tmha.com.au/MOS100MI/Get", type = JAXBElement.class, required = false)
    protected JAXBElement<String> actionMessage;
    @XmlElementRef(name = "AddressType", namespace = "http://www.tmha.com.au/MOS100MI/Get", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> addressType;
    @XmlElementRef(name = "ConfigurationNumber", namespace = "http://www.tmha.com.au/MOS100MI/Get", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> configurationNumber;

    /**
     * Gets the value of the lotnumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLotnumber() {
        return lotnumber;
    }

    /**
     * Sets the value of the lotnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLotnumber(JAXBElement<String> value) {
        this.lotnumber = value;
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
     * Gets the value of the mainProduct property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMainProduct() {
        return mainProduct;
    }

    /**
     * Sets the value of the mainProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMainProduct(JAXBElement<String> value) {
        this.mainProduct = value;
    }

    /**
     * Gets the value of the productDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProductDescription() {
        return productDescription;
    }

    /**
     * Sets the value of the productDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProductDescription(JAXBElement<String> value) {
        this.productDescription = value;
    }

    /**
     * Gets the value of the plannedFinishTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPlannedFinishTime() {
        return plannedFinishTime;
    }

    /**
     * Sets the value of the plannedFinishTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPlannedFinishTime(JAXBElement<BigDecimal> value) {
        this.plannedFinishTime = value;
    }

    /**
     * Gets the value of the plannedStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPlannedStartTime() {
        return plannedStartTime;
    }

    /**
     * Sets the value of the plannedStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPlannedStartTime(JAXBElement<BigDecimal> value) {
        this.plannedStartTime = value;
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
     * Gets the value of the orderedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getOrderedQuantity() {
        return orderedQuantity;
    }

    /**
     * Sets the value of the orderedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setOrderedQuantity(JAXBElement<BigDecimal> value) {
        this.orderedQuantity = value;
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
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getReferenceOrderNumber() {
        return referenceOrderNumber;
    }

    /**
     * Sets the value of the referenceOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setReferenceOrderNumber(JAXBElement<BigDecimal> value) {
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
     * Gets the value of the reportingDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getReportingDate() {
        return reportingDate;
    }

    /**
     * Sets the value of the reportingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setReportingDate(JAXBElement<XMLGregorianCalendar> value) {
        this.reportingDate = value;
    }

    /**
     * Gets the value of the requester property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRequester() {
        return requester;
    }

    /**
     * Sets the value of the requester property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRequester(JAXBElement<String> value) {
        this.requester = value;
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
     * Gets the value of the userDefinedField1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserDefinedField1() {
        return userDefinedField1;
    }

    /**
     * Sets the value of the userDefinedField1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserDefinedField1(JAXBElement<String> value) {
        this.userDefinedField1 = value;
    }

    /**
     * Gets the value of the userDefinedField2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserDefinedField2() {
        return userDefinedField2;
    }

    /**
     * Sets the value of the userDefinedField2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserDefinedField2(JAXBElement<String> value) {
        this.userDefinedField2 = value;
    }

    /**
     * Gets the value of the userDefinedField3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserDefinedField3() {
        return userDefinedField3;
    }

    /**
     * Sets the value of the userDefinedField3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserDefinedField3(JAXBElement<String> value) {
        this.userDefinedField3 = value;
    }

    /**
     * Gets the value of the userDefinedField4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserDefinedField4() {
        return userDefinedField4;
    }

    /**
     * Sets the value of the userDefinedField4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserDefinedField4(JAXBElement<String> value) {
        this.userDefinedField4 = value;
    }

    /**
     * Gets the value of the userDefinedField5 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserDefinedField5() {
        return userDefinedField5;
    }

    /**
     * Sets the value of the userDefinedField5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserDefinedField5(JAXBElement<String> value) {
        this.userDefinedField5 = value;
    }

    /**
     * Gets the value of the userDefinedField6 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserDefinedField6() {
        return userDefinedField6;
    }

    /**
     * Sets the value of the userDefinedField6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserDefinedField6(JAXBElement<String> value) {
        this.userDefinedField6 = value;
    }

    /**
     * Gets the value of the structureType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStructureType() {
        return structureType;
    }

    /**
     * Sets the value of the structureType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStructureType(JAXBElement<String> value) {
        this.structureType = value;
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
     * Gets the value of the earliestStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getEarliestStartTime() {
        return earliestStartTime;
    }

    /**
     * Sets the value of the earliestStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setEarliestStartTime(JAXBElement<BigDecimal> value) {
        this.earliestStartTime = value;
    }

    /**
     * Gets the value of the dueTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDueTime() {
        return dueTime;
    }

    /**
     * Sets the value of the dueTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDueTime(JAXBElement<BigDecimal> value) {
        this.dueTime = value;
    }

    /**
     * Gets the value of the textLine property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTextLine() {
        return textLine;
    }

    /**
     * Sets the value of the textLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTextLine(JAXBElement<String> value) {
        this.textLine = value;
    }

    /**
     * Gets the value of the textLineTXT2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTextLineTXT2() {
        return textLineTXT2;
    }

    /**
     * Sets the value of the textLineTXT2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTextLineTXT2(JAXBElement<String> value) {
        this.textLineTXT2 = value;
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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setStatus(JAXBElement<BigDecimal> value) {
        this.status = value;
    }

    /**
     * Gets the value of the reportingTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getReportingTime() {
        return reportingTime;
    }

    /**
     * Sets the value of the reportingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setReportingTime(JAXBElement<BigDecimal> value) {
        this.reportingTime = value;
    }

    /**
     * Gets the value of the workCenterResource property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorkCenterResource() {
        return workCenterResource;
    }

    /**
     * Sets the value of the workCenterResource property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorkCenterResource(JAXBElement<String> value) {
        this.workCenterResource = value;
    }

    /**
     * Gets the value of the manufacturedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getManufacturedQuantity() {
        return manufacturedQuantity;
    }

    /**
     * Sets the value of the manufacturedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setManufacturedQuantity(JAXBElement<BigDecimal> value) {
        this.manufacturedQuantity = value;
    }

    /**
     * Gets the value of the plannedFinishDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPlannedFinishDate() {
        return plannedFinishDate;
    }

    /**
     * Sets the value of the plannedFinishDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPlannedFinishDate(JAXBElement<XMLGregorianCalendar> value) {
        this.plannedFinishDate = value;
    }

    /**
     * Gets the value of the dueDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDueDate() {
        return dueDate;
    }

    /**
     * Sets the value of the dueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDueDate(JAXBElement<XMLGregorianCalendar> value) {
        this.dueDate = value;
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
     * Gets the value of the addressNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddressNumber() {
        return addressNumber;
    }

    /**
     * Sets the value of the addressNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddressNumber(JAXBElement<String> value) {
        this.addressNumber = value;
    }

    /**
     * Gets the value of the plannedStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPlannedStartDate() {
        return plannedStartDate;
    }

    /**
     * Sets the value of the plannedStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPlannedStartDate(JAXBElement<XMLGregorianCalendar> value) {
        this.plannedStartDate = value;
    }

    /**
     * Gets the value of the actionMessage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getActionMessage() {
        return actionMessage;
    }

    /**
     * Sets the value of the actionMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setActionMessage(JAXBElement<String> value) {
        this.actionMessage = value;
    }

    /**
     * Gets the value of the addressType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getAddressType() {
        return addressType;
    }

    /**
     * Sets the value of the addressType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setAddressType(JAXBElement<BigDecimal> value) {
        this.addressType = value;
    }

    /**
     * Gets the value of the configurationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getConfigurationNumber() {
        return configurationNumber;
    }

    /**
     * Sets the value of the configurationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setConfigurationNumber(JAXBElement<BigDecimal> value) {
        this.configurationNumber = value;
    }

	@Override
	public String toString() {
		return "GetResponseItem [lotnumber=" + lotnumber.getValue() + ", breakdownDate=" + breakdownDate.getValue()
				+ ", userdefinedField1Item=" + userdefinedField1Item.getValue() + ", userdefinedField2Item="
				+ userdefinedField2Item.getValue() + ", userdefinedField3Item=" + userdefinedField3Item.getValue()
				+ ", userdefinedField4Item=" + userdefinedField4Item.getValue() + ", userdefinedField5Item="
				+ userdefinedField5Item.getValue() + ", mainProduct=" + mainProduct.getValue() + ", productDescription=" + productDescription.getValue()
				+ ", plannedFinishTime=" + plannedFinishTime.getValue() + ", plannedStartTime=" + plannedStartTime.getValue() + ", orderType="
				+ orderType.getValue() + ", orderedQuantity=" + orderedQuantity.getValue() + ", priority=" + priority.getValue() + ", entryDate="
				+ entryDate.getValue() + ", entryTime=" + entryTime.getValue() + ", referenceOrderCategory=" + referenceOrderCategory.getValue()
				+ ", referenceOrderLine=" + referenceOrderLine.getValue() + ", referenceOrderNumber=" + referenceOrderNumber.getValue()
				+ ", lineSuffix=" + lineSuffix.getValue() + ", reportingDate=" + reportingDate.getValue() + ", requester=" + requester.getValue()
				+ ", requestedFinishDate=" + requestedFinishDate.getValue() + ", requestedFinishTime=" + requestedFinishTime.getValue()
				+ ", requestedStartDate=" + requestedStartDate.getValue() + ", requestedStartTime=" + requestedStartTime.getValue()
				+ ", userDefinedField1=" + userDefinedField1.getValue() + ", userDefinedField2=" + userDefinedField2.getValue()
				+ ", userDefinedField3=" + userDefinedField3.getValue() + ", userDefinedField4=" + userDefinedField4.getValue()
				+ ", userDefinedField5=" + userDefinedField5.getValue() + ", userDefinedField6=" + userDefinedField6.getValue()
				+ ", structureType=" + structureType.getValue() + ", service=" + service.getValue() + ", earliestStartTime="
				+ earliestStartTime.getValue() + ", dueTime=" + dueTime.getValue() + ", textLine=" + textLine.getValue() + ", textLineTXT2="
				+ textLineTXT2.getValue() + ", warehouse=" + warehouse.getValue() + ", status=" + status.getValue() + ", reportingTime=" + reportingTime.getValue()
				+ ", workCenterResource=" + workCenterResource.getValue() + ", manufacturedQuantity=" + manufacturedQuantity.getValue()
				+ ", plannedFinishDate=" + plannedFinishDate.getValue() + ", dueDate=" + dueDate.getValue() + ", breakDownTime="
				+ breakDownTime.getValue() + ", addressNumber=" + addressNumber.getValue() + ", plannedStartDate=" + plannedStartDate.getValue()
				+ ", actionMessage=" + actionMessage.getValue() + ", addressType=" + addressType.getValue() + ", configurationNumber="
				+ configurationNumber.getValue() + "]";
	}
    
    

}
