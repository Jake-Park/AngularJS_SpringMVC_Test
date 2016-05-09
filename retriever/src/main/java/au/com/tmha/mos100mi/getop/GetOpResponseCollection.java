
package au.com.tmha.mos100mi.getop;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetOpResponseCollection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetOpResponseCollection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetOpResponseItem" type="{http://www.tmha.com.au/MOS100MI/GetOp}GetOpResponseItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetOpResponseCollection", propOrder = {
    "getOpResponseItem"
})
public class GetOpResponseCollection {

    @XmlElement(name = "GetOpResponseItem")
    protected List<GetOpResponseItem> getOpResponseItem;

    /**
     * Gets the value of the getOpResponseItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the getOpResponseItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGetOpResponseItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GetOpResponseItem }
     * 
     * 
     */
    public List<GetOpResponseItem> getGetOpResponseItem() {
        if (getOpResponseItem == null) {
            getOpResponseItem = new ArrayList<GetOpResponseItem>();
        }
        return this.getOpResponseItem;
    }

}
