//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.23 at 11:01:09 AM AEDT 
//


package generated;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}Position"/>
 *         &lt;element ref="{}Name"/>
 *         &lt;element ref="{}Type"/>
 *         &lt;element ref="{}Description"/>
 *         &lt;element ref="{}DataType"/>
 *         &lt;element ref="{}Mandatory"/>
 *         &lt;element ref="{}ID_F"/>
 *         &lt;element ref="{}ID_P"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "position",
    "name",
    "type",
    "description",
    "dataType",
    "mandatory",
    "idf",
    "idp"
})
@XmlRootElement(name = "Parameter")
public class Parameter {

    @XmlElement(name = "Position", required = true)
    protected BigInteger position;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Type", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String type;
    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(name = "DataType", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String dataType;
    @XmlElement(name = "Mandatory", required = true)
    protected Mandatory mandatory;
    @XmlElement(name = "ID_F", required = true)
    protected IDF idf;
    @XmlElement(name = "ID_P", required = true)
    protected IDP idp;

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPosition(BigInteger value) {
        this.position = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the dataType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataType() {
        return dataType;
    }

    /**
     * Sets the value of the dataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataType(String value) {
        this.dataType = value;
    }

    /**
     * Gets the value of the mandatory property.
     * 
     * @return
     *     possible object is
     *     {@link Mandatory }
     *     
     */
    public Mandatory getMandatory() {
        return mandatory;
    }

    /**
     * Sets the value of the mandatory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Mandatory }
     *     
     */
    public void setMandatory(Mandatory value) {
        this.mandatory = value;
    }

    /**
     * Gets the value of the idf property.
     * 
     * @return
     *     possible object is
     *     {@link IDF }
     *     
     */
    public IDF getIDF() {
        return idf;
    }

    /**
     * Sets the value of the idf property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDF }
     *     
     */
    public void setIDF(IDF value) {
        this.idf = value;
    }

    /**
     * Gets the value of the idp property.
     * 
     * @return
     *     possible object is
     *     {@link IDP }
     *     
     */
    public IDP getIDP() {
        return idp;
    }

    /**
     * Sets the value of the idp property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDP }
     *     
     */
    public void setIDP(IDP value) {
        this.idp = value;
    }

}
