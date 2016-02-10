
package au.com.tmha.cos100mi.lstmcolines;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LstMCOLinesResponseCollection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LstMCOLinesResponseCollection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LstMCOLinesResponseItem" type="{http://www.tmha.com.au/COS100MI/LstMCOLines}LstMCOLinesResponseItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LstMCOLinesResponseCollection", propOrder = {
    "lstMCOLinesResponseItem"
})
public class LstMCOLinesResponseCollection {

    @XmlElement(name = "LstMCOLinesResponseItem")
    protected List<LstMCOLinesResponseItem> lstMCOLinesResponseItem;

    /**
     * Gets the value of the lstMCOLinesResponseItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lstMCOLinesResponseItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLstMCOLinesResponseItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LstMCOLinesResponseItem }
     * 
     * 
     */
    public List<LstMCOLinesResponseItem> getLstMCOLinesResponseItem() {
        if (lstMCOLinesResponseItem == null) {
            lstMCOLinesResponseItem = new ArrayList<LstMCOLinesResponseItem>();
        }
        return this.lstMCOLinesResponseItem;
    }

}
