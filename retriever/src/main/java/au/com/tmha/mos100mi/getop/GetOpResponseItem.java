
package au.com.tmha.mos100mi.getop;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for GetOpResponseItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetOpResponseItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LotNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CostCenter" minOccurs="0">
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
 *         &lt;element name="FinishDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ItemNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ManufacturedQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="FinishTime" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OperationDescription" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
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
 *         &lt;element name="PlanningArea" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ReportingDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ReferenceOrderLine" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ReportingTime" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SalesPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Service" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="TextLine1" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="60"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TextLine2" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="60"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TextIdentity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Status" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ReportingNumber" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SupplierNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ActualStartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ActualStartTime" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ActualFinishTime" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="EntryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="EntryTime" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ProductNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="UnitPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OperationStarted" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ActualFinishDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetOpResponseItem", propOrder = {
    "lotNumber",
    "costCenter",
    "errorCode2",
    "errorCode3",
    "errorCode1",
    "finishDate",
    "itemNumber",
    "manufacturedQuantity",
    "startTime",
    "finishTime",
    "operationDescription",
    "workCenter",
    "planningArea",
    "reportingDate",
    "referenceOrderLine",
    "reportingTime",
    "salesPrice",
    "service",
    "startDate",
    "textLine1",
    "textLine2",
    "textIdentity",
    "status",
    "reportingNumber",
    "supplierNumber",
    "actualStartDate",
    "actualStartTime",
    "actualFinishTime",
    "entryDate",
    "entryTime",
    "productNumber",
    "unitPrice",
    "operationStarted",
    "actualFinishDate",
    "priority"
})
public class GetOpResponseItem {

    @XmlElementRef(name = "LotNumber", namespace = "http://www.tmha.com.au/MOS100MI/GetOp", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lotNumber;
    @XmlElementRef(name = "CostCenter", namespace = "http://www.tmha.com.au/MOS100MI/GetOp", type = JAXBElement.class, required = false)
    protected JAXBElement<String> costCenter;
    @XmlElementRef(name = "ErrorCode2", namespace = "http://www.tmha.com.au/MOS100MI/GetOp", type = JAXBElement.class, required = false)
    protected JAXBElement<String> errorCode2;
    @XmlElementRef(name = "ErrorCode3", namespace = "http://www.tmha.com.au/MOS100MI/GetOp", type = JAXBElement.class, required = false)
    protected JAXBElement<String> errorCode3;
    @XmlElementRef(name = "ErrorCode1", namespace = "http://www.tmha.com.au/MOS100MI/GetOp", type = JAXBElement.class, required = false)
    protected JAXBElement<String> errorCode1;
    @XmlElementRef(name = "FinishDate", namespace = "http://www.tmha.com.au/MOS100MI/GetOp", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> finishDate;
    @XmlElementRef(name = "ItemNumber", namespace = "http://www.tmha.com.au/MOS100MI/GetOp", type = JAXBElement.class, required = false)
    protected JAXBElement<String> itemNumber;
    @XmlElementRef(name = "ManufacturedQuantity", namespace = "http://www.tmha.com.au/MOS100MI/GetOp", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> manufacturedQuantity;
    @XmlElementRef(name = "StartTime", namespace = "http://www.tmha.com.au/MOS100MI/GetOp", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> startTime;
    @XmlElementRef(name = "FinishTime", namespace = "http://www.tmha.com.au/MOS100MI/GetOp", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> finishTime;
    @XmlElementRef(name = "OperationDescription", namespace = "http://www.tmha.com.au/MOS100MI/GetOp", type = JAXBElement.class, required = false)
    protected JAXBElement<String> operationDescription;
    @XmlElementRef(name = "WorkCenter", namespace = "http://www.tmha.com.au/MOS100MI/GetOp", type = JAXBElement.class, required = false)
    protected JAXBElement<String> workCenter;
    @XmlElementRef(name = "PlanningArea", namespace = "http://www.tmha.com.au/MOS100MI/GetOp", type = JAXBElement.class, required = false)
    protected JAXBElement<String> planningArea;
    @XmlElementRef(name = "ReportingDate", namespace = "http://www.tmha.com.au/MOS100MI/GetOp", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> reportingDate;
    @XmlElementRef(name = "ReferenceOrderLine", namespace = "http://www.tmha.com.au/MOS100MI/GetOp", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> referenceOrderLine;
    @XmlElementRef(name = "ReportingTime", namespace = "http://www.tmha.com.au/MOS100MI/GetOp", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> reportingTime;
    @XmlElementRef(name = "SalesPrice", namespace = "http://www.tmha.com.au/MOS100MI/GetOp", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> salesPrice;
    @XmlElementRef(name = "Service", namespace = "http://www.tmha.com.au/MOS100MI/GetOp", type = JAXBElement.class, required = false)
    protected JAXBElement<String> service;
    @XmlElementRef(name = "StartDate", namespace = "http://www.tmha.com.au/MOS100MI/GetOp", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> startDate;
    @XmlElementRef(name = "TextLine1", namespace = "http://www.tmha.com.au/MOS100MI/GetOp", type = JAXBElement.class, required = false)
    protected JAXBElement<String> textLine1;
    @XmlElementRef(name = "TextLine2", namespace = "http://www.tmha.com.au/MOS100MI/GetOp", type = JAXBElement.class, required = false)
    protected JAXBElement<String> textLine2;
    @XmlElementRef(name = "TextIdentity", namespace = "http://www.tmha.com.au/MOS100MI/GetOp", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> textIdentity;
    @XmlElementRef(name = "Status", namespace = "http://www.tmha.com.au/MOS100MI/GetOp", type = JAXBElement.class, required = false)
    protected JAXBElement<String> status;
    @XmlElementRef(name = "ReportingNumber", namespace = "http://www.tmha.com.au/MOS100MI/GetOp", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> reportingNumber;
    @XmlElementRef(name = "SupplierNumber", namespace = "http://www.tmha.com.au/MOS100MI/GetOp", type = JAXBElement.class, required = false)
    protected JAXBElement<String> supplierNumber;
    @XmlElementRef(name = "ActualStartDate", namespace = "http://www.tmha.com.au/MOS100MI/GetOp", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> actualStartDate;
    @XmlElementRef(name = "ActualStartTime", namespace = "http://www.tmha.com.au/MOS100MI/GetOp", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> actualStartTime;
    @XmlElementRef(name = "ActualFinishTime", namespace = "http://www.tmha.com.au/MOS100MI/GetOp", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> actualFinishTime;
    @XmlElementRef(name = "EntryDate", namespace = "http://www.tmha.com.au/MOS100MI/GetOp", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> entryDate;
    @XmlElementRef(name = "EntryTime", namespace = "http://www.tmha.com.au/MOS100MI/GetOp", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> entryTime;
    @XmlElementRef(name = "ProductNumber", namespace = "http://www.tmha.com.au/MOS100MI/GetOp", type = JAXBElement.class, required = false)
    protected JAXBElement<String> productNumber;
    @XmlElementRef(name = "UnitPrice", namespace = "http://www.tmha.com.au/MOS100MI/GetOp", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> unitPrice;
    @XmlElementRef(name = "OperationStarted", namespace = "http://www.tmha.com.au/MOS100MI/GetOp", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> operationStarted;
    @XmlElementRef(name = "ActualFinishDate", namespace = "http://www.tmha.com.au/MOS100MI/GetOp", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> actualFinishDate;
    @XmlElementRef(name = "Priority", namespace = "http://www.tmha.com.au/MOS100MI/GetOp", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> priority;

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
     * Gets the value of the costCenter property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCostCenter() {
        return costCenter;
    }

    /**
     * Sets the value of the costCenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCostCenter(JAXBElement<String> value) {
        this.costCenter = value;
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
     * Gets the value of the planningArea property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPlanningArea() {
        return planningArea;
    }

    /**
     * Sets the value of the planningArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPlanningArea(JAXBElement<String> value) {
        this.planningArea = value;
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
     * Gets the value of the salesPrice property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getSalesPrice() {
        return salesPrice;
    }

    /**
     * Sets the value of the salesPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setSalesPrice(JAXBElement<BigDecimal> value) {
        this.salesPrice = value;
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
     * Gets the value of the textLine2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTextLine2() {
        return textLine2;
    }

    /**
     * Sets the value of the textLine2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTextLine2(JAXBElement<String> value) {
        this.textLine2 = value;
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
     * Gets the value of the actualStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getActualStartDate() {
        return actualStartDate;
    }

    /**
     * Sets the value of the actualStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setActualStartDate(JAXBElement<XMLGregorianCalendar> value) {
        this.actualStartDate = value;
    }

    /**
     * Gets the value of the actualStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getActualStartTime() {
        return actualStartTime;
    }

    /**
     * Sets the value of the actualStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setActualStartTime(JAXBElement<BigDecimal> value) {
        this.actualStartTime = value;
    }

    /**
     * Gets the value of the actualFinishTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getActualFinishTime() {
        return actualFinishTime;
    }

    /**
     * Sets the value of the actualFinishTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setActualFinishTime(JAXBElement<BigDecimal> value) {
        this.actualFinishTime = value;
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
     * Gets the value of the unitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getUnitPrice() {
        return unitPrice;
    }

    /**
     * Sets the value of the unitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setUnitPrice(JAXBElement<BigDecimal> value) {
        this.unitPrice = value;
    }

    /**
     * Gets the value of the operationStarted property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getOperationStarted() {
        return operationStarted;
    }

    /**
     * Sets the value of the operationStarted property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setOperationStarted(JAXBElement<BigDecimal> value) {
        this.operationStarted = value;
    }

    /**
     * Gets the value of the actualFinishDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getActualFinishDate() {
        return actualFinishDate;
    }

    /**
     * Sets the value of the actualFinishDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setActualFinishDate(JAXBElement<XMLGregorianCalendar> value) {
        this.actualFinishDate = value;
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

}
