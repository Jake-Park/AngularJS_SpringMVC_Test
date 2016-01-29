
package au.com.retriever.test.barking;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EPurchaseOrder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EPurchaseOrder">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="poNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="poDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="poValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="poPhoto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EPurchaseOrder", propOrder = {
    "poNumber",
    "poDesc",
    "poValue",
    "poPhoto"
})
public class EPurchaseOrder {

    @XmlElement(required = true)
    protected String poNumber;
    @XmlElement(required = true)
    protected String poDesc;
    protected Double poValue;
    @XmlElement(required = true)
    protected String poPhoto;

    /**
     * Gets the value of the poNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoNumber() {
        return poNumber;
    }

    /**
     * Sets the value of the poNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoNumber(String value) {
        this.poNumber = value;
    }

    /**
     * Gets the value of the poDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoDesc() {
        return poDesc;
    }

    /**
     * Sets the value of the poDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoDesc(String value) {
        this.poDesc = value;
    }

    /**
     * Gets the value of the poValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPoValue() {
        return poValue;
    }

    /**
     * Sets the value of the poValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPoValue(Double value) {
        this.poValue = value;
    }

    /**
     * Gets the value of the poPhoto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoPhoto() {
        return poPhoto;
    }

    /**
     * Sets the value of the poPhoto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoPhoto(String value) {
        this.poPhoto = value;
    }

}
