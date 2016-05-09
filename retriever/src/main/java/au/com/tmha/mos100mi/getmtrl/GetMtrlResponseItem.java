
package au.com.tmha.mos100mi.getmtrl;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for GetMtrlResponseItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetMtrlResponseItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddressNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AddressType" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="LotNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="FromWarehouse" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LineType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ProductNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ReservedQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SalesPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ReceivedQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OrderType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
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
 *         &lt;element name="MaterialStatus" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ReportingNumber" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ToLocation" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
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
 *         &lt;element name="ReportedQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ReportingDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ReferenceOrderLine" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ReferenceOrderNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ReferenceOrderCategory" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PlannedOrder" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="WorkCenter" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="OperationNumber" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Text" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AllocatedQuantityBasicUM" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetMtrlResponseItem", propOrder = {
    "addressNumber",
    "addressType",
    "lotNumber",
    "quantity",
    "fromWarehouse",
    "lineType",
    "priority",
    "productNumber",
    "reservedQuantity",
    "salesPrice",
    "receivedQuantity",
    "orderType",
    "warehouse",
    "location",
    "materialStatus",
    "reportingNumber",
    "toLocation",
    "supplierNumber",
    "reportedQuantity",
    "reportingDate",
    "referenceOrderLine",
    "referenceOrderNumber",
    "referenceOrderCategory",
    "plannedOrder",
    "workCenter",
    "operationNumber",
    "text",
    "allocatedQuantityBasicUM"
})
public class GetMtrlResponseItem {

    @XmlElementRef(name = "AddressNumber", namespace = "http://www.tmha.com.au/MOS100MI/GetMtrl", type = JAXBElement.class, required = false)
    protected JAXBElement<String> addressNumber;
    @XmlElementRef(name = "AddressType", namespace = "http://www.tmha.com.au/MOS100MI/GetMtrl", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> addressType;
    @XmlElementRef(name = "LotNumber", namespace = "http://www.tmha.com.au/MOS100MI/GetMtrl", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lotNumber;
    @XmlElementRef(name = "Quantity", namespace = "http://www.tmha.com.au/MOS100MI/GetMtrl", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> quantity;
    @XmlElementRef(name = "FromWarehouse", namespace = "http://www.tmha.com.au/MOS100MI/GetMtrl", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fromWarehouse;
    @XmlElementRef(name = "LineType", namespace = "http://www.tmha.com.au/MOS100MI/GetMtrl", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lineType;
    @XmlElementRef(name = "Priority", namespace = "http://www.tmha.com.au/MOS100MI/GetMtrl", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> priority;
    @XmlElementRef(name = "ProductNumber", namespace = "http://www.tmha.com.au/MOS100MI/GetMtrl", type = JAXBElement.class, required = false)
    protected JAXBElement<String> productNumber;
    @XmlElementRef(name = "ReservedQuantity", namespace = "http://www.tmha.com.au/MOS100MI/GetMtrl", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> reservedQuantity;
    @XmlElementRef(name = "SalesPrice", namespace = "http://www.tmha.com.au/MOS100MI/GetMtrl", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> salesPrice;
    @XmlElementRef(name = "ReceivedQuantity", namespace = "http://www.tmha.com.au/MOS100MI/GetMtrl", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> receivedQuantity;
    @XmlElementRef(name = "OrderType", namespace = "http://www.tmha.com.au/MOS100MI/GetMtrl", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orderType;
    @XmlElementRef(name = "Warehouse", namespace = "http://www.tmha.com.au/MOS100MI/GetMtrl", type = JAXBElement.class, required = false)
    protected JAXBElement<String> warehouse;
    @XmlElementRef(name = "Location", namespace = "http://www.tmha.com.au/MOS100MI/GetMtrl", type = JAXBElement.class, required = false)
    protected JAXBElement<String> location;
    @XmlElementRef(name = "MaterialStatus", namespace = "http://www.tmha.com.au/MOS100MI/GetMtrl", type = JAXBElement.class, required = false)
    protected JAXBElement<String> materialStatus;
    @XmlElementRef(name = "ReportingNumber", namespace = "http://www.tmha.com.au/MOS100MI/GetMtrl", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> reportingNumber;
    @XmlElementRef(name = "ToLocation", namespace = "http://www.tmha.com.au/MOS100MI/GetMtrl", type = JAXBElement.class, required = false)
    protected JAXBElement<String> toLocation;
    @XmlElementRef(name = "SupplierNumber", namespace = "http://www.tmha.com.au/MOS100MI/GetMtrl", type = JAXBElement.class, required = false)
    protected JAXBElement<String> supplierNumber;
    @XmlElementRef(name = "ReportedQuantity", namespace = "http://www.tmha.com.au/MOS100MI/GetMtrl", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> reportedQuantity;
    @XmlElementRef(name = "ReportingDate", namespace = "http://www.tmha.com.au/MOS100MI/GetMtrl", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> reportingDate;
    @XmlElementRef(name = "ReferenceOrderLine", namespace = "http://www.tmha.com.au/MOS100MI/GetMtrl", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> referenceOrderLine;
    @XmlElementRef(name = "ReferenceOrderNumber", namespace = "http://www.tmha.com.au/MOS100MI/GetMtrl", type = JAXBElement.class, required = false)
    protected JAXBElement<String> referenceOrderNumber;
    @XmlElementRef(name = "ReferenceOrderCategory", namespace = "http://www.tmha.com.au/MOS100MI/GetMtrl", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> referenceOrderCategory;
    @XmlElementRef(name = "PlannedOrder", namespace = "http://www.tmha.com.au/MOS100MI/GetMtrl", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> plannedOrder;
    @XmlElementRef(name = "WorkCenter", namespace = "http://www.tmha.com.au/MOS100MI/GetMtrl", type = JAXBElement.class, required = false)
    protected JAXBElement<String> workCenter;
    @XmlElementRef(name = "OperationNumber", namespace = "http://www.tmha.com.au/MOS100MI/GetMtrl", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> operationNumber;
    @XmlElementRef(name = "Text", namespace = "http://www.tmha.com.au/MOS100MI/GetMtrl", type = JAXBElement.class, required = false)
    protected JAXBElement<String> text;
    @XmlElementRef(name = "AllocatedQuantityBasicUM", namespace = "http://www.tmha.com.au/MOS100MI/GetMtrl", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> allocatedQuantityBasicUM;

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
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setQuantity(JAXBElement<BigDecimal> value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the fromWarehouse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFromWarehouse() {
        return fromWarehouse;
    }

    /**
     * Sets the value of the fromWarehouse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFromWarehouse(JAXBElement<String> value) {
        this.fromWarehouse = value;
    }

    /**
     * Gets the value of the lineType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLineType() {
        return lineType;
    }

    /**
     * Sets the value of the lineType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLineType(JAXBElement<String> value) {
        this.lineType = value;
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
     * Gets the value of the reservedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getReservedQuantity() {
        return reservedQuantity;
    }

    /**
     * Sets the value of the reservedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setReservedQuantity(JAXBElement<BigDecimal> value) {
        this.reservedQuantity = value;
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
     * Gets the value of the receivedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getReceivedQuantity() {
        return receivedQuantity;
    }

    /**
     * Sets the value of the receivedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setReceivedQuantity(JAXBElement<BigDecimal> value) {
        this.receivedQuantity = value;
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
     * Gets the value of the toLocation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getToLocation() {
        return toLocation;
    }

    /**
     * Sets the value of the toLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setToLocation(JAXBElement<String> value) {
        this.toLocation = value;
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
     * Gets the value of the reportedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getReportedQuantity() {
        return reportedQuantity;
    }

    /**
     * Sets the value of the reportedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setReportedQuantity(JAXBElement<BigDecimal> value) {
        this.reportedQuantity = value;
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
     * Gets the value of the plannedOrder property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPlannedOrder() {
        return plannedOrder;
    }

    /**
     * Sets the value of the plannedOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPlannedOrder(JAXBElement<BigDecimal> value) {
        this.plannedOrder = value;
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
     * Gets the value of the allocatedQuantityBasicUM property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getAllocatedQuantityBasicUM() {
        return allocatedQuantityBasicUM;
    }

    /**
     * Sets the value of the allocatedQuantityBasicUM property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setAllocatedQuantityBasicUM(JAXBElement<BigDecimal> value) {
        this.allocatedQuantityBasicUM = value;
    }

}
