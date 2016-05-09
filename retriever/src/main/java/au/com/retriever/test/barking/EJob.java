
package au.com.retriever.test.barking;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for EJob complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EJob">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="jobId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="phaseId" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="techId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="workDone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="workRecommend" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="officeNotes" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="jobDatetime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="signatureName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="jobStatus" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="customerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="custId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="address1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="address2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="suburb" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="postCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="contact" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="jobDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="createDatetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="techName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="amountOwing" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="serialNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="jobType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="firstOhsCompleted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="accountMgrEmail" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="serviceMgrEmail" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="eOhs" type="{https://test.retriever.com.au/barking}EOhs" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="eNewAsset" type="{https://test.retriever.com.au/barking}ENewAsset" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="eService" type="{https://test.retriever.com.au/barking}EService" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ePart" type="{https://test.retriever.com.au/barking}EPart" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="eSignature" type="{https://test.retriever.com.au/barking}ESignature" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="eChecklist" type="{https://test.retriever.com.au/barking}EChecklist" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="eTime" type="{https://test.retriever.com.au/barking}ETime" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="eAllowance" type="{https://test.retriever.com.au/barking}EAllowance" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ePurchaseOrder" type="{https://test.retriever.com.au/barking}EPurchaseOrder" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="eReport" type="{https://test.retriever.com.au/barking}EReport" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="paymentOption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardExpiry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="referenceNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eAttachment" type="{https://test.retriever.com.au/barking}EAttachment" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EJob", propOrder = {
    "jobId",
    "phaseId",
    "techId",
    "workDone",
    "workRecommend",
    "comments",
    "officeNotes",
    "jobDatetime",
    "signatureName",
    "jobStatus",
    "customerName",
    "custId",
    "address1",
    "address2",
    "suburb",
    "postCode",
    "contact",
    "phone",
    "jobDesc",
    "createDatetime",
    "techName",
    "amountOwing",
    "serialNo",
    "jobType",
    "email",
    "firstOhsCompleted",
    "accountMgrEmail",
    "serviceMgrEmail",
    "eOhs",
    "eNewAsset",
    "eService",
    "ePart",
    "eSignature",
    "eChecklist",
    "eTime",
    "eAllowance",
    "ePurchaseOrder",
    "eReport",
    "paymentOption",
    "cardType",
    "cardNo",
    "cardExpiry",
    "referenceNo",
    "eAttachment"
})
public class EJob {

    @XmlElement(required = true)
    protected String jobId;
    @XmlElement(required = true)
    protected BigInteger phaseId;
    @XmlElement(required = true)
    protected String techId;
    @XmlElement(required = true)
    protected String workDone;
    @XmlElement(required = true)
    protected String workRecommend;
    @XmlElement(required = true)
    protected String comments;
    @XmlElement(required = true)
    protected String officeNotes;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar jobDatetime;
    @XmlElement(required = true)
    protected String signatureName;
    protected BigInteger jobStatus;
    @XmlElement(required = true)
    protected String customerName;
    protected String custId;
    @XmlElement(required = true)
    protected String address1;
    @XmlElement(required = true)
    protected String address2;
    @XmlElement(required = true)
    protected String suburb;
    @XmlElement(required = true)
    protected String postCode;
    @XmlElement(required = true)
    protected String contact;
    @XmlElement(required = true)
    protected String phone;
    @XmlElement(required = true)
    protected String jobDesc;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDatetime;
    @XmlElement(required = true)
    protected String techName;
    protected Double amountOwing;
    @XmlElement(required = true)
    protected String serialNo;
    @XmlElement(required = true)
    protected String jobType;
    @XmlElement(required = true)
    protected String email;
    protected boolean firstOhsCompleted;
    @XmlElement(required = true)
    protected String accountMgrEmail;
    @XmlElement(required = true)
    protected String serviceMgrEmail;
    protected List<EOhs> eOhs;
    protected List<ENewAsset> eNewAsset;
    protected List<EService> eService;
    protected List<EPart> ePart;
    protected List<ESignature> eSignature;
    protected List<EChecklist> eChecklist;
    protected List<ETime> eTime;
    protected List<EAllowance> eAllowance;
    protected List<EPurchaseOrder> ePurchaseOrder;
    protected List<EReport> eReport;
    protected String paymentOption;
    protected String cardType;
    protected String cardNo;
    protected String cardExpiry;
    protected String referenceNo;
    protected List<EAttachment> eAttachment;

    /**
     * Gets the value of the jobId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobId() {
        return jobId;
    }

    /**
     * Sets the value of the jobId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobId(String value) {
        this.jobId = value;
    }

    /**
     * Gets the value of the phaseId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPhaseId() {
        return phaseId;
    }

    /**
     * Sets the value of the phaseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPhaseId(BigInteger value) {
        this.phaseId = value;
    }

    /**
     * Gets the value of the techId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechId() {
        return techId;
    }

    /**
     * Sets the value of the techId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechId(String value) {
        this.techId = value;
    }

    /**
     * Gets the value of the workDone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkDone() {
        return workDone;
    }

    /**
     * Sets the value of the workDone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkDone(String value) {
        this.workDone = value;
    }

    /**
     * Gets the value of the workRecommend property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkRecommend() {
        return workRecommend;
    }

    /**
     * Sets the value of the workRecommend property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkRecommend(String value) {
        this.workRecommend = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * Gets the value of the officeNotes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficeNotes() {
        return officeNotes;
    }

    /**
     * Sets the value of the officeNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficeNotes(String value) {
        this.officeNotes = value;
    }

    /**
     * Gets the value of the jobDatetime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getJobDatetime() {
        return jobDatetime;
    }

    /**
     * Sets the value of the jobDatetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setJobDatetime(XMLGregorianCalendar value) {
        this.jobDatetime = value;
    }

    /**
     * Gets the value of the signatureName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignatureName() {
        return signatureName;
    }

    /**
     * Sets the value of the signatureName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignatureName(String value) {
        this.signatureName = value;
    }

    /**
     * Gets the value of the jobStatus property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getJobStatus() {
        return jobStatus;
    }

    /**
     * Sets the value of the jobStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setJobStatus(BigInteger value) {
        this.jobStatus = value;
    }

    /**
     * Gets the value of the customerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Sets the value of the customerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerName(String value) {
        this.customerName = value;
    }

    /**
     * Gets the value of the custId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustId() {
        return custId;
    }

    /**
     * Sets the value of the custId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustId(String value) {
        this.custId = value;
    }

    /**
     * Gets the value of the address1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress1() {
        return address1;
    }

    /**
     * Sets the value of the address1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress1(String value) {
        this.address1 = value;
    }

    /**
     * Gets the value of the address2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress2() {
        return address2;
    }

    /**
     * Sets the value of the address2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress2(String value) {
        this.address2 = value;
    }

    /**
     * Gets the value of the suburb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuburb() {
        return suburb;
    }

    /**
     * Sets the value of the suburb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuburb(String value) {
        this.suburb = value;
    }

    /**
     * Gets the value of the postCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostCode() {
        return postCode;
    }

    /**
     * Sets the value of the postCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostCode(String value) {
        this.postCode = value;
    }

    /**
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContact(String value) {
        this.contact = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Gets the value of the jobDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobDesc() {
        return jobDesc;
    }

    /**
     * Sets the value of the jobDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobDesc(String value) {
        this.jobDesc = value;
    }

    /**
     * Gets the value of the createDatetime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDatetime() {
        return createDatetime;
    }

    /**
     * Sets the value of the createDatetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateDatetime(XMLGregorianCalendar value) {
        this.createDatetime = value;
    }

    /**
     * Gets the value of the techName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechName() {
        return techName;
    }

    /**
     * Sets the value of the techName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechName(String value) {
        this.techName = value;
    }

    /**
     * Gets the value of the amountOwing property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAmountOwing() {
        return amountOwing;
    }

    /**
     * Sets the value of the amountOwing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAmountOwing(Double value) {
        this.amountOwing = value;
    }

    /**
     * Gets the value of the serialNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNo() {
        return serialNo;
    }

    /**
     * Sets the value of the serialNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNo(String value) {
        this.serialNo = value;
    }

    /**
     * Gets the value of the jobType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobType() {
        return jobType;
    }

    /**
     * Sets the value of the jobType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobType(String value) {
        this.jobType = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the firstOhsCompleted property.
     * 
     */
    public boolean isFirstOhsCompleted() {
        return firstOhsCompleted;
    }

    /**
     * Sets the value of the firstOhsCompleted property.
     * 
     */
    public void setFirstOhsCompleted(boolean value) {
        this.firstOhsCompleted = value;
    }

    /**
     * Gets the value of the accountMgrEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountMgrEmail() {
        return accountMgrEmail;
    }

    /**
     * Sets the value of the accountMgrEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountMgrEmail(String value) {
        this.accountMgrEmail = value;
    }

    /**
     * Gets the value of the serviceMgrEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceMgrEmail() {
        return serviceMgrEmail;
    }

    /**
     * Sets the value of the serviceMgrEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceMgrEmail(String value) {
        this.serviceMgrEmail = value;
    }

    /**
     * Gets the value of the eOhs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eOhs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEOhs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EOhs }
     * 
     * 
     */
    public List<EOhs> getEOhs() {
        if (eOhs == null) {
            eOhs = new ArrayList<EOhs>();
        }
        return this.eOhs;
    }

    /**
     * Gets the value of the eNewAsset property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eNewAsset property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getENewAsset().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ENewAsset }
     * 
     * 
     */
    public List<ENewAsset> getENewAsset() {
        if (eNewAsset == null) {
            eNewAsset = new ArrayList<ENewAsset>();
        }
        return this.eNewAsset;
    }

    /**
     * Gets the value of the eService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EService }
     * 
     * 
     */
    public List<EService> getEService() {
        if (eService == null) {
            eService = new ArrayList<EService>();
        }
        return this.eService;
    }

    /**
     * Gets the value of the ePart property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ePart property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEPart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EPart }
     * 
     * 
     */
    public List<EPart> getEPart() {
        if (ePart == null) {
            ePart = new ArrayList<EPart>();
        }
        return this.ePart;
    }

    /**
     * Gets the value of the eSignature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eSignature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getESignature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ESignature }
     * 
     * 
     */
    public List<ESignature> getESignature() {
        if (eSignature == null) {
            eSignature = new ArrayList<ESignature>();
        }
        return this.eSignature;
    }

    /**
     * Gets the value of the eChecklist property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eChecklist property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEChecklist().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EChecklist }
     * 
     * 
     */
    public List<EChecklist> getEChecklist() {
        if (eChecklist == null) {
            eChecklist = new ArrayList<EChecklist>();
        }
        return this.eChecklist;
    }

    /**
     * Gets the value of the eTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getETime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ETime }
     * 
     * 
     */
    public List<ETime> getETime() {
        if (eTime == null) {
            eTime = new ArrayList<ETime>();
        }
        return this.eTime;
    }

    /**
     * Gets the value of the eAllowance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eAllowance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEAllowance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EAllowance }
     * 
     * 
     */
    public List<EAllowance> getEAllowance() {
        if (eAllowance == null) {
            eAllowance = new ArrayList<EAllowance>();
        }
        return this.eAllowance;
    }

    /**
     * Gets the value of the ePurchaseOrder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ePurchaseOrder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEPurchaseOrder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EPurchaseOrder }
     * 
     * 
     */
    public List<EPurchaseOrder> getEPurchaseOrder() {
        if (ePurchaseOrder == null) {
            ePurchaseOrder = new ArrayList<EPurchaseOrder>();
        }
        return this.ePurchaseOrder;
    }

    /**
     * Gets the value of the eReport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eReport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEReport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EReport }
     * 
     * 
     */
    public List<EReport> getEReport() {
        if (eReport == null) {
            eReport = new ArrayList<EReport>();
        }
        return this.eReport;
    }

    /**
     * Gets the value of the paymentOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentOption() {
        return paymentOption;
    }

    /**
     * Sets the value of the paymentOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentOption(String value) {
        this.paymentOption = value;
    }

    /**
     * Gets the value of the cardType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardType() {
        return cardType;
    }

    /**
     * Sets the value of the cardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardType(String value) {
        this.cardType = value;
    }

    /**
     * Gets the value of the cardNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNo() {
        return cardNo;
    }

    /**
     * Sets the value of the cardNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNo(String value) {
        this.cardNo = value;
    }

    /**
     * Gets the value of the cardExpiry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardExpiry() {
        return cardExpiry;
    }

    /**
     * Sets the value of the cardExpiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardExpiry(String value) {
        this.cardExpiry = value;
    }

    /**
     * Gets the value of the referenceNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceNo() {
        return referenceNo;
    }

    /**
     * Sets the value of the referenceNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceNo(String value) {
        this.referenceNo = value;
    }

    /**
     * Gets the value of the eAttachment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eAttachment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEAttachment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EAttachment }
     * 
     * 
     */
    public List<EAttachment> getEAttachment() {
        if (eAttachment == null) {
            eAttachment = new ArrayList<EAttachment>();
        }
        return this.eAttachment;
    }

	@Override
	public String toString() {
		return "EJob [jobId=" + jobId + ", phaseId=" + phaseId + ", techId=" + techId + ", workDone=" + workDone
				+ ", workRecommend=" + workRecommend + ", comments=" + comments + ", officeNotes=" + officeNotes
				+ ", jobDatetime=" + jobDatetime + ", signatureName=" + signatureName + ", jobStatus=" + jobStatus
				+ ", customerName=" + customerName + ", custId=" + custId + ", address1=" + address1 + ", address2="
				+ address2 + ", suburb=" + suburb + ", postCode=" + postCode + ", contact=" + contact + ", phone="
				+ phone + ", jobDesc=" + jobDesc + ", createDatetime=" + createDatetime + ", techName=" + techName
				+ ", amountOwing=" + amountOwing + ", serialNo=" + serialNo + ", jobType=" + jobType + ", email="
				+ email + ", firstOhsCompleted=" + firstOhsCompleted + ", accountMgrEmail=" + accountMgrEmail
				+ ", serviceMgrEmail=" + serviceMgrEmail + ", eOhs=" + eOhs + ", eNewAsset=" + eNewAsset + ", eService="
				+ eService + ", ePart=" + ePart + ", eChecklist=" + eChecklist
				+ ", eTime=" + eTime + ", eAllowance=" + eAllowance + ", ePurchaseOrder=" + ePurchaseOrder
				+ ", eReport=" + eReport + ", paymentOption=" + paymentOption + ", cardType=" + cardType + ", cardNo="
				+ cardNo + ", cardExpiry=" + cardExpiry + ", referenceNo=" + referenceNo + ", eAttachment="
				+ eAttachment + "]";
	}

}
