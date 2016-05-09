
package au.com.tmha.cos100mi.lstmcolines;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LstMCOLinesCollection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LstMCOLinesCollection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LstMCOLinesItem" type="{http://www.tmha.com.au/COS100MI/LstMCOLines}LstMCOLinesItem" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "LstMCOLinesCollection", propOrder = {
    "lstMCOLinesItem"
})
public class LstMCOLinesCollection {

    @XmlElement(name = "LstMCOLinesItem")
    protected List<LstMCOLinesItem> lstMCOLinesItem;
    @XmlAttribute(name = "maxRecords")
    protected Integer maxRecords;

    /**
     * Gets the value of the lstMCOLinesItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lstMCOLinesItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLstMCOLinesItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LstMCOLinesItem }
     * 
     * 
     */
    public List<LstMCOLinesItem> getLstMCOLinesItem() {
        if (lstMCOLinesItem == null) {
            lstMCOLinesItem = new ArrayList<LstMCOLinesItem>();
        }
        return this.lstMCOLinesItem;
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
