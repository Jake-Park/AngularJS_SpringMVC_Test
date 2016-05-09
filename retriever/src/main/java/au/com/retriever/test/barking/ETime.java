
package au.com.retriever.test.barking;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ETime complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ETime">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="labType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="labQty" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="labQtyOt" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="labQtyDt" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="travelQty" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="statusTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="normalRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="otRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="dtRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="travelRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="fieldWorker" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="endDatetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="startDatetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="apprenticeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ETime", propOrder = {
    "labType",
    "labQty",
    "labQtyOt",
    "labQtyDt",
    "travelQty",
    "statusTime",
    "normalRate",
    "otRate",
    "dtRate",
    "travelRate",
    "fieldWorker",
    "endDatetime",
    "startDatetime",
    "apprenticeId"
})
public class ETime {

    @XmlElement(required = true)
    protected String labType;
    protected double labQty;
    protected double labQtyOt;
    protected double labQtyDt;
    protected Double travelQty;
    @XmlElement(required = true)
    protected String statusTime;
    protected Double normalRate;
    protected Double otRate;
    protected Double dtRate;
    protected Double travelRate;
    @XmlElement(required = true)
    protected String fieldWorker;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDatetime;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDatetime;
    protected String apprenticeId;

    /**
     * Gets the value of the labType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabType() {
        return labType;
    }

    /**
     * Sets the value of the labType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabType(String value) {
        this.labType = value;
    }

    /**
     * Gets the value of the labQty property.
     * 
     */
    public double getLabQty() {
        return labQty;
    }

    /**
     * Sets the value of the labQty property.
     * 
     */
    public void setLabQty(double value) {
        this.labQty = value;
    }

    /**
     * Gets the value of the labQtyOt property.
     * 
     */
    public double getLabQtyOt() {
        return labQtyOt;
    }

    /**
     * Sets the value of the labQtyOt property.
     * 
     */
    public void setLabQtyOt(double value) {
        this.labQtyOt = value;
    }

    /**
     * Gets the value of the labQtyDt property.
     * 
     */
    public double getLabQtyDt() {
        return labQtyDt;
    }

    /**
     * Sets the value of the labQtyDt property.
     * 
     */
    public void setLabQtyDt(double value) {
        this.labQtyDt = value;
    }

    /**
     * Gets the value of the travelQty property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTravelQty() {
        return travelQty;
    }

    /**
     * Sets the value of the travelQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTravelQty(Double value) {
        this.travelQty = value;
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
     * Gets the value of the normalRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNormalRate() {
        return normalRate;
    }

    /**
     * Sets the value of the normalRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNormalRate(Double value) {
        this.normalRate = value;
    }

    /**
     * Gets the value of the otRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOtRate() {
        return otRate;
    }

    /**
     * Sets the value of the otRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOtRate(Double value) {
        this.otRate = value;
    }

    /**
     * Gets the value of the dtRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDtRate() {
        return dtRate;
    }

    /**
     * Sets the value of the dtRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDtRate(Double value) {
        this.dtRate = value;
    }

    /**
     * Gets the value of the travelRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTravelRate() {
        return travelRate;
    }

    /**
     * Sets the value of the travelRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTravelRate(Double value) {
        this.travelRate = value;
    }

    /**
     * Gets the value of the fieldWorker property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldWorker() {
        return fieldWorker;
    }

    /**
     * Sets the value of the fieldWorker property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldWorker(String value) {
        this.fieldWorker = value;
    }

    /**
     * Gets the value of the endDatetime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDatetime() {
        return endDatetime;
    }

    /**
     * Sets the value of the endDatetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDatetime(XMLGregorianCalendar value) {
        this.endDatetime = value;
    }

    /**
     * Gets the value of the startDatetime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDatetime() {
        return startDatetime;
    }

    /**
     * Sets the value of the startDatetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDatetime(XMLGregorianCalendar value) {
        this.startDatetime = value;
    }

    /**
     * Gets the value of the apprenticeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprenticeId() {
        return apprenticeId;
    }

    /**
     * Sets the value of the apprenticeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprenticeId(String value) {
        this.apprenticeId = value;
    }

	@Override
	public String toString() {
		return "ETime [labType=" + labType + ", labQty=" + labQty + ", labQtyOt=" + labQtyOt + ", labQtyDt=" + labQtyDt
				+ ", travelQty=" + travelQty + ", statusTime=" + statusTime + ", normalRate=" + normalRate + ", otRate="
				+ otRate + ", dtRate=" + dtRate + ", travelRate=" + travelRate + ", fieldWorker=" + fieldWorker
				+ ", endDatetime=" + endDatetime + ", startDatetime=" + startDatetime + ", apprenticeId=" + apprenticeId
				+ "]";
	}
    
    

}
