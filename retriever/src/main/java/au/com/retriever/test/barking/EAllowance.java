
package au.com.retriever.test.barking;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for EAllowance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EAllowance">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="allowanceType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="allowanceDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="allowanceUom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="allowanceValue" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="createDatetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="allowanceID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EAllowance", propOrder = {
    "allowanceType",
    "allowanceDesc",
    "allowanceUom",
    "allowanceValue",
    "createDatetime",
    "allowanceID"
})
public class EAllowance {

    @XmlElement(required = true)
    protected String allowanceType;
    @XmlElement(required = true)
    protected String allowanceDesc;
    @XmlElement(required = true)
    protected String allowanceUom;
    protected double allowanceValue;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDatetime;
    @XmlElement(required = true)
    protected String allowanceID;

    /**
     * Gets the value of the allowanceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowanceType() {
        return allowanceType;
    }

    /**
     * Sets the value of the allowanceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowanceType(String value) {
        this.allowanceType = value;
    }

    /**
     * Gets the value of the allowanceDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowanceDesc() {
        return allowanceDesc;
    }

    /**
     * Sets the value of the allowanceDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowanceDesc(String value) {
        this.allowanceDesc = value;
    }

    /**
     * Gets the value of the allowanceUom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowanceUom() {
        return allowanceUom;
    }

    /**
     * Sets the value of the allowanceUom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowanceUom(String value) {
        this.allowanceUom = value;
    }

    /**
     * Gets the value of the allowanceValue property.
     * 
     */
    public double getAllowanceValue() {
        return allowanceValue;
    }

    /**
     * Sets the value of the allowanceValue property.
     * 
     */
    public void setAllowanceValue(double value) {
        this.allowanceValue = value;
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
     * Gets the value of the allowanceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowanceID() {
        return allowanceID;
    }

    /**
     * Sets the value of the allowanceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowanceID(String value) {
        this.allowanceID = value;
    }

	@Override
	public String toString() {
		return "EAllowance [allowanceType=" + allowanceType + ", allowanceDesc=" + allowanceDesc + ", allowanceUom="
				+ allowanceUom + ", allowanceValue=" + allowanceValue + ", createDatetime=" + createDatetime
				+ ", allowanceID=" + allowanceID + "]";
	}

}
