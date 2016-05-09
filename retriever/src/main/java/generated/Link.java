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
 *         &lt;element ref="{}InFrom"/>
 *         &lt;element ref="{}OutTo"/>
 *         &lt;element ref="{}SequenceIn"/>
 *         &lt;element ref="{}SequenceOut"/>
 *         &lt;element ref="{}Type"/>
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
    "inFrom",
    "outTo",
    "sequenceIn",
    "sequenceOut",
    "type"
})
@XmlRootElement(name = "Link")
public class Link {

    @XmlElement(name = "InFrom", required = true)
    protected InFrom inFrom;
    @XmlElement(name = "OutTo", required = true)
    protected OutTo outTo;
    @XmlElement(name = "SequenceIn", required = true)
    protected BigInteger sequenceIn;
    @XmlElement(name = "SequenceOut", required = true)
    protected BigInteger sequenceOut;
    @XmlElement(name = "Type", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String type;

    /**
     * Gets the value of the inFrom property.
     * 
     * @return
     *     possible object is
     *     {@link InFrom }
     *     
     */
    public InFrom getInFrom() {
        return inFrom;
    }

    /**
     * Sets the value of the inFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link InFrom }
     *     
     */
    public void setInFrom(InFrom value) {
        this.inFrom = value;
    }

    /**
     * Gets the value of the outTo property.
     * 
     * @return
     *     possible object is
     *     {@link OutTo }
     *     
     */
    public OutTo getOutTo() {
        return outTo;
    }

    /**
     * Sets the value of the outTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutTo }
     *     
     */
    public void setOutTo(OutTo value) {
        this.outTo = value;
    }

    /**
     * Gets the value of the sequenceIn property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequenceIn() {
        return sequenceIn;
    }

    /**
     * Sets the value of the sequenceIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSequenceIn(BigInteger value) {
        this.sequenceIn = value;
    }

    /**
     * Gets the value of the sequenceOut property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequenceOut() {
        return sequenceOut;
    }

    /**
     * Sets the value of the sequenceOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSequenceOut(BigInteger value) {
        this.sequenceOut = value;
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

}
