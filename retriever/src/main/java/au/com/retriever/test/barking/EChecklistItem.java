
package au.com.retriever.test.barking;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EChecklistItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EChecklistItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="checked" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="itemText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="checklistAnswer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="checklistComment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EChecklistItem", propOrder = {
    "checked",
    "itemText",
    "checklistAnswer",
    "checklistComment"
})
public class EChecklistItem {

    @XmlElement(required = true)
    protected String checked;
    @XmlElement(required = true)
    protected String itemText;
    @XmlElement(required = true)
    protected String checklistAnswer;
    @XmlElement(required = true)
    protected String checklistComment;

    /**
     * Gets the value of the checked property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChecked() {
        return checked;
    }

    /**
     * Sets the value of the checked property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChecked(String value) {
        this.checked = value;
    }

    /**
     * Gets the value of the itemText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemText() {
        return itemText;
    }

    /**
     * Sets the value of the itemText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemText(String value) {
        this.itemText = value;
    }

    /**
     * Gets the value of the checklistAnswer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChecklistAnswer() {
        return checklistAnswer;
    }

    /**
     * Sets the value of the checklistAnswer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChecklistAnswer(String value) {
        this.checklistAnswer = value;
    }

    /**
     * Gets the value of the checklistComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChecklistComment() {
        return checklistComment;
    }

    /**
     * Sets the value of the checklistComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChecklistComment(String value) {
        this.checklistComment = value;
    }

}
