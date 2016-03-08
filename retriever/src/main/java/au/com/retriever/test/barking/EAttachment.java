
package au.com.retriever.test.barking;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EAttachment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EAttachment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="attachmentFileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="attachment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="attachmentComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EAttachment", propOrder = {
    "attachmentFileName",
    "attachment",
    "attachmentComments"
})
public class EAttachment {

    @XmlElement(required = true)
    protected String attachmentFileName;
    @XmlElement(required = true)
    protected String attachment;
    protected String attachmentComments;

    /**
     * Gets the value of the attachmentFileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttachmentFileName() {
        return attachmentFileName;
    }

    /**
     * Sets the value of the attachmentFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttachmentFileName(String value) {
        this.attachmentFileName = value;
    }

    /**
     * Gets the value of the attachment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttachment() {
        return attachment;
    }

    /**
     * Sets the value of the attachment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttachment(String value) {
        this.attachment = value;
    }

    /**
     * Gets the value of the attachmentComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttachmentComments() {
        return attachmentComments;
    }

    /**
     * Sets the value of the attachmentComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttachmentComments(String value) {
        this.attachmentComments = value;
    }

	@Override
	public String toString() {
		return "EAttachment [attachmentFileName=" + attachmentFileName + ", attachment=" + attachment
				+ ", attachmentComments=" + attachmentComments + "]";
	}
    
    

}
