
package au.com.tmha.mos070mi.updoperation;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdOperationCollection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdOperationCollection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UpdOperationItem" type="{http://www.tmha.com.au/MOS070MI/UpdOperation}UpdOperationItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="maxRecords" type="{http://www.w3.org/2001/XMLSchema}int" default="100" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdOperationCollection", propOrder = {
    "updOperationItem"
})
public class UpdOperationCollection {

    @XmlElement(name = "UpdOperationItem")
    protected List<UpdOperationItem> updOperationItem;
    @XmlAttribute(name = "maxRecords")
    protected Integer maxRecords;

    /**
     * Gets the value of the updOperationItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the updOperationItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUpdOperationItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UpdOperationItem }
     * 
     * 
     */
    public List<UpdOperationItem> getUpdOperationItem() {
        if (updOperationItem == null) {
            updOperationItem = new ArrayList<UpdOperationItem>();
        }
        return this.updOperationItem;
    }

    /**
     * Gets the value of the maxRecords property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getMaxRecords() {
        if (maxRecords == null) {
            return  100;
        } else {
            return maxRecords;
        }
    }

    /**
     * Sets the value of the maxRecords property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxRecords(Integer value) {
        this.maxRecords = value;
    }

}
