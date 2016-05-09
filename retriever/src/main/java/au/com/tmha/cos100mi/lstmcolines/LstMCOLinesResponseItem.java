
package au.com.tmha.cos100mi.lstmcolines;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for LstMCOLinesResponseItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LstMCOLinesResponseItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ActualDeliveryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ActualReceiptDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="PlannedReceiptDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ActualReceiptTime" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ActualDeliveryTime" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TransactionNumber" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PlannedDeliveryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="PlannedDeliveryTime" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PlannedReceiptTime" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Name" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
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
 *         &lt;element name="ErrorCode1" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ActualStartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ActualStartTime" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Service" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Payer" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Supplier" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="OriginalQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OrderLineNumber" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TransactionQuantityBasicUM" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LstMCOLinesResponseItem", propOrder = {
    "actualDeliveryDate",
    "actualReceiptDate",
    "plannedReceiptDate",
    "actualReceiptTime",
    "actualDeliveryTime",
    "transactionNumber",
    "plannedDeliveryDate",
    "plannedDeliveryTime",
    "plannedReceiptTime",
    "name",
    "itemNumber",
    "errorCode1",
    "actualStartDate",
    "actualStartTime",
    "service",
    "payer",
    "supplier",
    "originalQuantity",
    "orderLineNumber",
    "transactionQuantityBasicUM"
})
public class LstMCOLinesResponseItem {

    @XmlElementRef(name = "ActualDeliveryDate", namespace = "http://www.tmha.com.au/COS100MI/LstMCOLines", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> actualDeliveryDate;
    @XmlElementRef(name = "ActualReceiptDate", namespace = "http://www.tmha.com.au/COS100MI/LstMCOLines", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> actualReceiptDate;
    @XmlElementRef(name = "PlannedReceiptDate", namespace = "http://www.tmha.com.au/COS100MI/LstMCOLines", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> plannedReceiptDate;
    @XmlElementRef(name = "ActualReceiptTime", namespace = "http://www.tmha.com.au/COS100MI/LstMCOLines", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> actualReceiptTime;
    @XmlElementRef(name = "ActualDeliveryTime", namespace = "http://www.tmha.com.au/COS100MI/LstMCOLines", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> actualDeliveryTime;
    @XmlElementRef(name = "TransactionNumber", namespace = "http://www.tmha.com.au/COS100MI/LstMCOLines", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> transactionNumber;
    @XmlElementRef(name = "PlannedDeliveryDate", namespace = "http://www.tmha.com.au/COS100MI/LstMCOLines", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> plannedDeliveryDate;
    @XmlElementRef(name = "PlannedDeliveryTime", namespace = "http://www.tmha.com.au/COS100MI/LstMCOLines", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> plannedDeliveryTime;
    @XmlElementRef(name = "PlannedReceiptTime", namespace = "http://www.tmha.com.au/COS100MI/LstMCOLines", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> plannedReceiptTime;
    @XmlElementRef(name = "Name", namespace = "http://www.tmha.com.au/COS100MI/LstMCOLines", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElementRef(name = "ItemNumber", namespace = "http://www.tmha.com.au/COS100MI/LstMCOLines", type = JAXBElement.class, required = false)
    protected JAXBElement<String> itemNumber;
    @XmlElementRef(name = "ErrorCode1", namespace = "http://www.tmha.com.au/COS100MI/LstMCOLines", type = JAXBElement.class, required = false)
    protected JAXBElement<String> errorCode1;
    @XmlElementRef(name = "ActualStartDate", namespace = "http://www.tmha.com.au/COS100MI/LstMCOLines", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> actualStartDate;
    @XmlElementRef(name = "ActualStartTime", namespace = "http://www.tmha.com.au/COS100MI/LstMCOLines", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> actualStartTime;
    @XmlElementRef(name = "Service", namespace = "http://www.tmha.com.au/COS100MI/LstMCOLines", type = JAXBElement.class, required = false)
    protected JAXBElement<String> service;
    @XmlElementRef(name = "Payer", namespace = "http://www.tmha.com.au/COS100MI/LstMCOLines", type = JAXBElement.class, required = false)
    protected JAXBElement<String> payer;
    @XmlElementRef(name = "Supplier", namespace = "http://www.tmha.com.au/COS100MI/LstMCOLines", type = JAXBElement.class, required = false)
    protected JAXBElement<String> supplier;
    @XmlElementRef(name = "OriginalQuantity", namespace = "http://www.tmha.com.au/COS100MI/LstMCOLines", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> originalQuantity;
    @XmlElementRef(name = "OrderLineNumber", namespace = "http://www.tmha.com.au/COS100MI/LstMCOLines", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> orderLineNumber;
    @XmlElementRef(name = "TransactionQuantityBasicUM", namespace = "http://www.tmha.com.au/COS100MI/LstMCOLines", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> transactionQuantityBasicUM;

    /**
     * Gets the value of the actualDeliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getActualDeliveryDate() {
        return actualDeliveryDate;
    }

    /**
     * Sets the value of the actualDeliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setActualDeliveryDate(JAXBElement<XMLGregorianCalendar> value) {
        this.actualDeliveryDate = value;
    }

    /**
     * Gets the value of the actualReceiptDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getActualReceiptDate() {
        return actualReceiptDate;
    }

    /**
     * Sets the value of the actualReceiptDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setActualReceiptDate(JAXBElement<XMLGregorianCalendar> value) {
        this.actualReceiptDate = value;
    }

    /**
     * Gets the value of the plannedReceiptDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPlannedReceiptDate() {
        return plannedReceiptDate;
    }

    /**
     * Sets the value of the plannedReceiptDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPlannedReceiptDate(JAXBElement<XMLGregorianCalendar> value) {
        this.plannedReceiptDate = value;
    }

    /**
     * Gets the value of the actualReceiptTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getActualReceiptTime() {
        return actualReceiptTime;
    }

    /**
     * Sets the value of the actualReceiptTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setActualReceiptTime(JAXBElement<BigDecimal> value) {
        this.actualReceiptTime = value;
    }

    /**
     * Gets the value of the actualDeliveryTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getActualDeliveryTime() {
        return actualDeliveryTime;
    }

    /**
     * Sets the value of the actualDeliveryTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setActualDeliveryTime(JAXBElement<BigDecimal> value) {
        this.actualDeliveryTime = value;
    }

    /**
     * Gets the value of the transactionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getTransactionNumber() {
        return transactionNumber;
    }

    /**
     * Sets the value of the transactionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setTransactionNumber(JAXBElement<BigDecimal> value) {
        this.transactionNumber = value;
    }

    /**
     * Gets the value of the plannedDeliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPlannedDeliveryDate() {
        return plannedDeliveryDate;
    }

    /**
     * Sets the value of the plannedDeliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPlannedDeliveryDate(JAXBElement<XMLGregorianCalendar> value) {
        this.plannedDeliveryDate = value;
    }

    /**
     * Gets the value of the plannedDeliveryTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPlannedDeliveryTime() {
        return plannedDeliveryTime;
    }

    /**
     * Sets the value of the plannedDeliveryTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPlannedDeliveryTime(JAXBElement<BigDecimal> value) {
        this.plannedDeliveryTime = value;
    }

    /**
     * Gets the value of the plannedReceiptTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPlannedReceiptTime() {
        return plannedReceiptTime;
    }

    /**
     * Sets the value of the plannedReceiptTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPlannedReceiptTime(JAXBElement<BigDecimal> value) {
        this.plannedReceiptTime = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setName(JAXBElement<String> value) {
        this.name = value;
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
     * Gets the value of the payer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPayer() {
        return payer;
    }

    /**
     * Sets the value of the payer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPayer(JAXBElement<String> value) {
        this.payer = value;
    }

    /**
     * Gets the value of the supplier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSupplier() {
        return supplier;
    }

    /**
     * Sets the value of the supplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSupplier(JAXBElement<String> value) {
        this.supplier = value;
    }

    /**
     * Gets the value of the originalQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getOriginalQuantity() {
        return originalQuantity;
    }

    /**
     * Sets the value of the originalQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setOriginalQuantity(JAXBElement<BigDecimal> value) {
        this.originalQuantity = value;
    }

    /**
     * Gets the value of the orderLineNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getOrderLineNumber() {
        return orderLineNumber;
    }

    /**
     * Sets the value of the orderLineNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setOrderLineNumber(JAXBElement<BigDecimal> value) {
        this.orderLineNumber = value;
    }

    /**
     * Gets the value of the transactionQuantityBasicUM property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getTransactionQuantityBasicUM() {
        return transactionQuantityBasicUM;
    }

    /**
     * Sets the value of the transactionQuantityBasicUM property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setTransactionQuantityBasicUM(JAXBElement<BigDecimal> value) {
        this.transactionQuantityBasicUM = value;
    }

	@Override
	public String toString() {
		return "LstMCOLinesResponseItem [actualDeliveryDate=" + actualDeliveryDate.getValue() + ", actualReceiptDate="
				+ actualReceiptDate.getValue() + ", plannedReceiptDate=" + plannedReceiptDate.getValue() + ", actualReceiptTime="
				+ actualReceiptTime.getValue() + ", actualDeliveryTime=" + actualDeliveryTime.getValue() + ", transactionNumber="
				+ transactionNumber.getValue() + ", plannedDeliveryDate=" + plannedDeliveryDate.getValue() + ", plannedDeliveryTime="
				+ plannedDeliveryTime.getValue() + ", plannedReceiptTime=" + plannedReceiptTime.getValue() + ", name=" + name.getValue()
				+ ", itemNumber=" + itemNumber.getValue() + ", errorCode1=" + errorCode1.getValue() + ", actualStartDate=" + actualStartDate.getValue()
				+ ", actualStartTime=" + actualStartTime.getValue() + ", service=" + service.getValue() + ", payer=" + payer.getValue() + ", supplier="
				+ supplier.getValue() + ", originalQuantity=" + originalQuantity.getValue() + ", orderLineNumber=" + orderLineNumber.getValue()
				+ ", transactionQuantityBasicUM=" + transactionQuantityBasicUM.getValue() + "]";
	}

    
}
