
package au.com.tmha.mos104mi.lstoperelement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LstOperElementResponseCollection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LstOperElementResponseCollection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LstOperElementResponseItem" type="{http://www.tmha.com.au/MOS104MI/LstOperElement}LstOperElementResponseItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LstOperElementResponseCollection", propOrder = {
    "lstOperElementResponseItem"
})
public class LstOperElementResponseCollection {

    @XmlElement(name = "LstOperElementResponseItem")
    protected List<LstOperElementResponseItem> lstOperElementResponseItem;

    /**
     * Gets the value of the lstOperElementResponseItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lstOperElementResponseItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLstOperElementResponseItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LstOperElementResponseItem }
     * 
     * 
     */
    public List<LstOperElementResponseItem> getLstOperElementResponseItem() {
        if (lstOperElementResponseItem == null) {
            lstOperElementResponseItem = new ArrayList<LstOperElementResponseItem>();
        }
        return this.lstOperElementResponseItem;
    }

}
