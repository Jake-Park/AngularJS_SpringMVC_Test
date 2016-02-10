
package au.com.tmha.cos100mi.getmcohead;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetMCOHeadResponseCollection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetMCOHeadResponseCollection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetMCOHeadResponseItem" type="{http://www.tmha.com.au/COS100MI/GetMCOHead}GetMCOHeadResponseItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetMCOHeadResponseCollection", propOrder = {
    "getMCOHeadResponseItem"
})
public class GetMCOHeadResponseCollection {

    @XmlElement(name = "GetMCOHeadResponseItem")
    protected List<GetMCOHeadResponseItem> getMCOHeadResponseItem;

    /**
     * Gets the value of the getMCOHeadResponseItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the getMCOHeadResponseItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGetMCOHeadResponseItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GetMCOHeadResponseItem }
     * 
     * 
     */
    public List<GetMCOHeadResponseItem> getGetMCOHeadResponseItem() {
        if (getMCOHeadResponseItem == null) {
            getMCOHeadResponseItem = new ArrayList<GetMCOHeadResponseItem>();
        }
        return this.getMCOHeadResponseItem;
    }

}
