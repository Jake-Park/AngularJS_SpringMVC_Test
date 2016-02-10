
package au.com.tmha.crs610mi.getaddress;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetAddressResponseCollection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAddressResponseCollection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetAddressResponseItem" type="{http://www.tmha.com.au/CRS610MI/GetAddress}GetAddressResponseItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAddressResponseCollection", propOrder = {
    "getAddressResponseItem"
})
public class GetAddressResponseCollection {

    @XmlElement(name = "GetAddressResponseItem")
    protected List<GetAddressResponseItem> getAddressResponseItem;

    /**
     * Gets the value of the getAddressResponseItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the getAddressResponseItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGetAddressResponseItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GetAddressResponseItem }
     * 
     * 
     */
    public List<GetAddressResponseItem> getGetAddressResponseItem() {
        if (getAddressResponseItem == null) {
            getAddressResponseItem = new ArrayList<GetAddressResponseItem>();
        }
        return this.getAddressResponseItem;
    }

}
