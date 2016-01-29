
package au.com.retriever.test.barking;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="jobId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="phaseId" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="techId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="statusId" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="statusDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="statusTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="rejectReason" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="statusDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EStatus", propOrder = {
    "jobId",
    "phaseId",
    "techId",
    "statusId",
    "statusDate",
    "statusTime",
    "rejectReason",
    "statusDesc"
})
public class EStatus {

    @XmlElement(required = true)
    protected String jobId;
    @XmlElement(required = true)
    protected BigInteger phaseId;
    @XmlElement(required = true)
    protected String techId;
    @XmlElement(required = true)
    protected BigInteger statusId;
    @XmlElement(required = true)
    protected String statusDate;
    @XmlElement(required = true)
    protected String statusTime;
    @XmlElement(required = true)
    protected String rejectReason;
    @XmlElement(required = true)
    protected String statusDesc;

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
     * Gets the value of the statusId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStatusId() {
        return statusId;
    }

    /**
     * Sets the value of the statusId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStatusId(BigInteger value) {
        this.statusId = value;
    }

    /**
     * Gets the value of the statusDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusDate() {
        return statusDate;
    }

    /**
     * Sets the value of the statusDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusDate(String value) {
        this.statusDate = value;
    }

    /**
     * Gets the value of the statusTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusTime() {
        return statusTime;
    }

    /**
     * Sets the value of the statusTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusTime(String value) {
        this.statusTime = value;
    }

    /**
     * Gets the value of the rejectReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRejectReason() {
        return rejectReason;
    }

    /**
     * Sets the value of the rejectReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRejectReason(String value) {
        this.rejectReason = value;
    }

    /**
     * Gets the value of the statusDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusDesc() {
        return statusDesc;
    }

    /**
     * Sets the value of the statusDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusDesc(String value) {
        this.statusDesc = value;
    }

	@Override
	public String toString() {
		return "EStatus [jobId=" + jobId + ", phaseId=" + phaseId + ", techId=" + techId + ", statusId=" + statusId
				+ ", statusDate=" + statusDate + ", statusTime=" + statusTime + ", rejectReason=" + rejectReason
				+ ", statusDesc=" + statusDesc + "]";
	}

}
