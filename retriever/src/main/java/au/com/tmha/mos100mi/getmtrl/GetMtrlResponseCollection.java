
package au.com.tmha.mos100mi.getmtrl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetMtrlResponseCollection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetMtrlResponseCollection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetMtrlResponseItem" type="{http://www.tmha.com.au/MOS100MI/GetMtrl}GetMtrlResponseItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetMtrlResponseCollection", propOrder = {
    "getMtrlResponseItem"
})
public class GetMtrlResponseCollection {

    @XmlElement(name = "GetMtrlResponseItem")
    protected List<GetMtrlResponseItem> getMtrlResponseItem;

    /**
     * Gets the value of the getMtrlResponseItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the getMtrlResponseItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGetMtrlResponseItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GetMtrlResponseItem }
     * 
     * 
     */
    public List<GetMtrlResponseItem> getGetMtrlResponseItem() {
        if (getMtrlResponseItem == null) {
            getMtrlResponseItem = new ArrayList<GetMtrlResponseItem>();
        }
        return this.getMtrlResponseItem;
    }

}
