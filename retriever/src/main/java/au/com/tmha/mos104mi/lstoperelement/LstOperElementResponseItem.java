
package au.com.tmha.mos104mi.lstoperelement;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LstOperElementResponseItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LstOperElementResponseItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Description" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="WorkElement" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TaskElementNumber" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OperationElementType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CapabilityType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Name" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="36"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EmployeeNumber" minOccurs="0">
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
 *         &lt;element name="LaborSkill" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MeterValue1" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MeterValue2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MeterValue3" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MeterValue4" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="WorkOrderNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="OperationNumber" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="QuantityOrTime" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RunTime" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ProductNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PlannedNumberOfWorkersRunTime" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Responsible" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SerialNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
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
 *         &lt;element name="StatusMobility" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ToolNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TransactionQuantityBasicUM" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TextIdentity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LstOperElementResponseItem", propOrder = {
    "description",
    "workElement",
    "taskElementNumber",
    "operationElementType",
    "capabilityType",
    "name",
    "employeeNumber",
    "facility",
    "laborSkill",
    "meterValue1",
    "meterValue2",
    "meterValue3",
    "meterValue4",
    "workOrderNumber",
    "operationNumber",
    "quantityOrTime",
    "runTime",
    "productNumber",
    "plannedNumberOfWorkersRunTime",
    "responsible",
    "serialNumber",
    "status",
    "statusMobility",
    "toolNumber",
    "transactionQuantityBasicUM",
    "textIdentity",
    "textLine1",
    "textLine2"
})
public class LstOperElementResponseItem {

    @XmlElementRef(name = "Description", namespace = "http://www.tmha.com.au/MOS104MI/LstOperElement", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "WorkElement", namespace = "http://www.tmha.com.au/MOS104MI/LstOperElement", type = JAXBElement.class, required = false)
    protected JAXBElement<String> workElement;
    @XmlElementRef(name = "TaskElementNumber", namespace = "http://www.tmha.com.au/MOS104MI/LstOperElement", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> taskElementNumber;
    @XmlElementRef(name = "OperationElementType", namespace = "http://www.tmha.com.au/MOS104MI/LstOperElement", type = JAXBElement.class, required = false)
    protected JAXBElement<String> operationElementType;
    @XmlElementRef(name = "CapabilityType", namespace = "http://www.tmha.com.au/MOS104MI/LstOperElement", type = JAXBElement.class, required = false)
    protected JAXBElement<String> capabilityType;
    @XmlElementRef(name = "Name", namespace = "http://www.tmha.com.au/MOS104MI/LstOperElement", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElementRef(name = "EmployeeNumber", namespace = "http://www.tmha.com.au/MOS104MI/LstOperElement", type = JAXBElement.class, required = false)
    protected JAXBElement<String> employeeNumber;
    @XmlElementRef(name = "Facility", namespace = "http://www.tmha.com.au/MOS104MI/LstOperElement", type = JAXBElement.class, required = false)
    protected JAXBElement<String> facility;
    @XmlElementRef(name = "LaborSkill", namespace = "http://www.tmha.com.au/MOS104MI/LstOperElement", type = JAXBElement.class, required = false)
    protected JAXBElement<String> laborSkill;
    @XmlElementRef(name = "MeterValue1", namespace = "http://www.tmha.com.au/MOS104MI/LstOperElement", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> meterValue1;
    @XmlElementRef(name = "MeterValue2", namespace = "http://www.tmha.com.au/MOS104MI/LstOperElement", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> meterValue2;
    @XmlElementRef(name = "MeterValue3", namespace = "http://www.tmha.com.au/MOS104MI/LstOperElement", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> meterValue3;
    @XmlElementRef(name = "MeterValue4", namespace = "http://www.tmha.com.au/MOS104MI/LstOperElement", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> meterValue4;
    @XmlElementRef(name = "WorkOrderNumber", namespace = "http://www.tmha.com.au/MOS104MI/LstOperElement", type = JAXBElement.class, required = false)
    protected JAXBElement<String> workOrderNumber;
    @XmlElementRef(name = "OperationNumber", namespace = "http://www.tmha.com.au/MOS104MI/LstOperElement", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> operationNumber;
    @XmlElementRef(name = "QuantityOrTime", namespace = "http://www.tmha.com.au/MOS104MI/LstOperElement", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> quantityOrTime;
    @XmlElementRef(name = "RunTime", namespace = "http://www.tmha.com.au/MOS104MI/LstOperElement", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> runTime;
    @XmlElementRef(name = "ProductNumber", namespace = "http://www.tmha.com.au/MOS104MI/LstOperElement", type = JAXBElement.class, required = false)
    protected JAXBElement<String> productNumber;
    @XmlElementRef(name = "PlannedNumberOfWorkersRunTime", namespace = "http://www.tmha.com.au/MOS104MI/LstOperElement", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> plannedNumberOfWorkersRunTime;
    @XmlElementRef(name = "Responsible", namespace = "http://www.tmha.com.au/MOS104MI/LstOperElement", type = JAXBElement.class, required = false)
    protected JAXBElement<String> responsible;
    @XmlElementRef(name = "SerialNumber", namespace = "http://www.tmha.com.au/MOS104MI/LstOperElement", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serialNumber;
    @XmlElementRef(name = "Status", namespace = "http://www.tmha.com.au/MOS104MI/LstOperElement", type = JAXBElement.class, required = false)
    protected JAXBElement<String> status;
    @XmlElementRef(name = "StatusMobility", namespace = "http://www.tmha.com.au/MOS104MI/LstOperElement", type = JAXBElement.class, required = false)
    protected JAXBElement<String> statusMobility;
    @XmlElementRef(name = "ToolNumber", namespace = "http://www.tmha.com.au/MOS104MI/LstOperElement", type = JAXBElement.class, required = false)
    protected JAXBElement<String> toolNumber;
    @XmlElementRef(name = "TransactionQuantityBasicUM", namespace = "http://www.tmha.com.au/MOS104MI/LstOperElement", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> transactionQuantityBasicUM;
    @XmlElementRef(name = "TextIdentity", namespace = "http://www.tmha.com.au/MOS104MI/LstOperElement", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> textIdentity;
    @XmlElementRef(name = "TextLine1", namespace = "http://www.tmha.com.au/MOS104MI/LstOperElement", type = JAXBElement.class, required = false)
    protected JAXBElement<String> textLine1;
    @XmlElementRef(name = "TextLine2", namespace = "http://www.tmha.com.au/MOS104MI/LstOperElement", type = JAXBElement.class, required = false)
    protected JAXBElement<String> textLine2;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = value;
    }

    /**
     * Gets the value of the workElement property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorkElement() {
        return workElement;
    }

    /**
     * Sets the value of the workElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorkElement(JAXBElement<String> value) {
        this.workElement = value;
    }

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
     * Gets the value of the capabilityType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCapabilityType() {
        return capabilityType;
    }

    /**
     * Sets the value of the capabilityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCapabilityType(JAXBElement<String> value) {
        this.capabilityType = value;
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
     * Gets the value of the laborSkill property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLaborSkill() {
        return laborSkill;
    }

    /**
     * Sets the value of the laborSkill property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLaborSkill(JAXBElement<String> value) {
        this.laborSkill = value;
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
     * Gets the value of the quantityOrTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getQuantityOrTime() {
        return quantityOrTime;
    }

    /**
     * Sets the value of the quantityOrTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setQuantityOrTime(JAXBElement<BigDecimal> value) {
        this.quantityOrTime = value;
    }

    /**
     * Gets the value of the runTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getRunTime() {
        return runTime;
    }

    /**
     * Sets the value of the runTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setRunTime(JAXBElement<BigDecimal> value) {
        this.runTime = value;
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
     * Gets the value of the plannedNumberOfWorkersRunTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPlannedNumberOfWorkersRunTime() {
        return plannedNumberOfWorkersRunTime;
    }

    /**
     * Sets the value of the plannedNumberOfWorkersRunTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPlannedNumberOfWorkersRunTime(JAXBElement<BigDecimal> value) {
        this.plannedNumberOfWorkersRunTime = value;
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
     * Gets the value of the toolNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getToolNumber() {
        return toolNumber;
    }

    /**
     * Sets the value of the toolNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setToolNumber(JAXBElement<String> value) {
        this.toolNumber = value;
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

}
