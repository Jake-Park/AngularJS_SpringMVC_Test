
package au.com.tmha.cos100mi.getmcohead;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for GetMCOHeadResponseItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetMCOHeadResponseItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Customer" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
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
 *         &lt;element name="Name" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="OrderDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Product" minOccurs="0">
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
 *         &lt;element name="ActualStartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ActualStartTime" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PaymentTerms" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PlannedDeliveryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="PlannedDeliveryTime" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ActualDeliveryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ActualDeliveryTime" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CustomerOrderNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
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
@XmlType(name = "GetMCOHeadResponseItem", propOrder = {
    "customer",
    "facility",
    "name",
    "orderDate",
    "priority",
    "product",
    "responsible",
    "actualStartDate",
    "actualStartTime",
    "paymentTerms",
    "plannedDeliveryDate",
    "plannedDeliveryTime",
    "actualDeliveryDate",
    "actualDeliveryTime",
    "customerOrderNumber"
})
public class GetMCOHeadResponseItem {

    @XmlElementRef(name = "Customer", namespace = "http://www.tmha.com.au/COS100MI/GetMCOHead", type = JAXBElement.class, required = false)
    protected JAXBElement<String> customer;
    @XmlElementRef(name = "Facility", namespace = "http://www.tmha.com.au/COS100MI/GetMCOHead", type = JAXBElement.class, required = false)
    protected JAXBElement<String> facility;
    @XmlElementRef(name = "Name", namespace = "http://www.tmha.com.au/COS100MI/GetMCOHead", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElementRef(name = "OrderDate", namespace = "http://www.tmha.com.au/COS100MI/GetMCOHead", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> orderDate;
    @XmlElementRef(name = "Priority", namespace = "http://www.tmha.com.au/COS100MI/GetMCOHead", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> priority;
    @XmlElementRef(name = "Product", namespace = "http://www.tmha.com.au/COS100MI/GetMCOHead", type = JAXBElement.class, required = false)
    protected JAXBElement<String> product;
    @XmlElementRef(name = "Responsible", namespace = "http://www.tmha.com.au/COS100MI/GetMCOHead", type = JAXBElement.class, required = false)
    protected JAXBElement<String> responsible;
    @XmlElementRef(name = "ActualStartDate", namespace = "http://www.tmha.com.au/COS100MI/GetMCOHead", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> actualStartDate;
    @XmlElementRef(name = "ActualStartTime", namespace = "http://www.tmha.com.au/COS100MI/GetMCOHead", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> actualStartTime;
    @XmlElementRef(name = "PaymentTerms", namespace = "http://www.tmha.com.au/COS100MI/GetMCOHead", type = JAXBElement.class, required = false)
    protected JAXBElement<String> paymentTerms;
    @XmlElementRef(name = "PlannedDeliveryDate", namespace = "http://www.tmha.com.au/COS100MI/GetMCOHead", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> plannedDeliveryDate;
    @XmlElementRef(name = "PlannedDeliveryTime", namespace = "http://www.tmha.com.au/COS100MI/GetMCOHead", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> plannedDeliveryTime;
    @XmlElementRef(name = "ActualDeliveryDate", namespace = "http://www.tmha.com.au/COS100MI/GetMCOHead", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> actualDeliveryDate;
    @XmlElementRef(name = "ActualDeliveryTime", namespace = "http://www.tmha.com.au/COS100MI/GetMCOHead", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> actualDeliveryTime;
    @XmlElementRef(name = "CustomerOrderNumber", namespace = "http://www.tmha.com.au/COS100MI/GetMCOHead", type = JAXBElement.class, required = false)
    protected JAXBElement<String> customerOrderNumber;

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustomer(JAXBElement<String> value) {
        this.customer = value;
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
     * Gets the value of the orderDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getOrderDate() {
        return orderDate;
    }

    /**
     * Sets the value of the orderDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setOrderDate(JAXBElement<XMLGregorianCalendar> value) {
        this.orderDate = value;
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
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProduct(JAXBElement<String> value) {
        this.product = value;
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
     * Gets the value of the paymentTerms property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPaymentTerms() {
        return paymentTerms;
    }

    /**
     * Sets the value of the paymentTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPaymentTerms(JAXBElement<String> value) {
        this.paymentTerms = value;
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
     * Gets the value of the customerOrderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustomerOrderNumber() {
        return customerOrderNumber;
    }

    /**
     * Sets the value of the customerOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustomerOrderNumber(JAXBElement<String> value) {
        this.customerOrderNumber = value;
    }

	@Override
	public String toString() {
		return "GetMCOHeadResponseItem [customer=" + customer.getValue() + ", facility=" + facility.getValue() + ", name=" + name.getValue()
				+ ", orderDate=" + orderDate.getValue() + ", priority=" + priority.getValue() + ", product=" + product.getValue() + ", responsible="
				+ responsible.getValue() + ", actualStartDate=" + actualStartDate.getValue() + ", actualStartTime=" + actualStartTime.getValue()
				+ ", paymentTerms=" + paymentTerms.getValue() + ", plannedDeliveryDate=" + plannedDeliveryDate.getValue()
				+ ", plannedDeliveryTime=" + plannedDeliveryTime.getValue() + ", actualDeliveryDate=" + actualDeliveryDate.getValue()
				+ ", actualDeliveryTime=" + actualDeliveryTime.getValue() + ", customerOrderNumber=" + customerOrderNumber.getValue() + "]";
	}
    
    

}
