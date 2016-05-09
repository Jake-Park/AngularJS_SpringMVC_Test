
package au.com.tmha.mos195mi.selwoelem;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SelWoElemResponseCollection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SelWoElemResponseCollection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SelWoElemResponseItem" type="{http://www.tmha.com.au/MOS195MI/SelWoElem}SelWoElemResponseItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelWoElemResponseCollection", propOrder = {
    "selWoElemResponseItem"
})
public class SelWoElemResponseCollection {

    @XmlElement(name = "SelWoElemResponseItem")
    protected List<SelWoElemResponseItem> selWoElemResponseItem;

    /**
     * Gets the value of the selWoElemResponseItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selWoElemResponseItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelWoElemResponseItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SelWoElemResponseItem }
     * 
     * 
     */
    public List<SelWoElemResponseItem> getSelWoElemResponseItem() {
        if (selWoElemResponseItem == null) {
            selWoElemResponseItem = new ArrayList<SelWoElemResponseItem>();
        }
        return this.selWoElemResponseItem;
    }

}
