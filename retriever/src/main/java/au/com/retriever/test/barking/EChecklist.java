
package au.com.retriever.test.barking;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for EChecklist complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EChecklist">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="checklistId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="checklistText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dateCompleted" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="serialDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="eChecklistCategory" type="{https://test.retriever.com.au/barking}EChecklistCategory" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EChecklist", propOrder = {
    "checklistId",
    "checklistText",
    "dateCompleted",
    "serialDesc",
    "eChecklistCategory"
})
public class EChecklist {

    @XmlElement(required = true)
    protected String checklistId;
    @XmlElement(required = true)
    protected String checklistText;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateCompleted;
    @XmlElement(required = true)
    protected String serialDesc;
    protected List<EChecklistCategory> eChecklistCategory;

    /**
     * Gets the value of the checklistId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChecklistId() {
        return checklistId;
    }

    /**
     * Sets the value of the checklistId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChecklistId(String value) {
        this.checklistId = value;
    }

    /**
     * Gets the value of the checklistText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChecklistText() {
        return checklistText;
    }

    /**
     * Sets the value of the checklistText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChecklistText(String value) {
        this.checklistText = value;
    }

    /**
     * Gets the value of the dateCompleted property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateCompleted() {
        return dateCompleted;
    }

    /**
     * Sets the value of the dateCompleted property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateCompleted(XMLGregorianCalendar value) {
        this.dateCompleted = value;
    }

    /**
     * Gets the value of the serialDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialDesc() {
        return serialDesc;
    }

    /**
     * Sets the value of the serialDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialDesc(String value) {
        this.serialDesc = value;
    }

    /**
     * Gets the value of the eChecklistCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eChecklistCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEChecklistCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EChecklistCategory }
     * 
     * 
     */
    public List<EChecklistCategory> getEChecklistCategory() {
        if (eChecklistCategory == null) {
            eChecklistCategory = new ArrayList<EChecklistCategory>();
        }
        return this.eChecklistCategory;
    }

}
