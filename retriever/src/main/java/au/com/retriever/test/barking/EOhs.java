
package au.com.retriever.test.barking;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for EOhs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EOhs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ohsType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="category" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="questionNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="questionOrderNo" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="questionText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="questionAnswer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="questionComment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="questionRisks" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="questionHazards" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ohsStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EOhs", propOrder = {
    "ohsType",
    "category",
    "questionNo",
    "questionOrderNo",
    "questionText",
    "questionAnswer",
    "questionComment",
    "questionRisks",
    "questionHazards",
    "ohsStartDate"
})
public class EOhs {

    @XmlElement(required = true)
    protected String ohsType;
    @XmlElement(required = true)
    protected String category;
    @XmlElement(required = true)
    protected String questionNo;
    protected BigInteger questionOrderNo;
    @XmlElement(required = true)
    protected String questionText;
    @XmlElement(required = true)
    protected String questionAnswer;
    @XmlElement(required = true)
    protected String questionComment;
    @XmlElement(required = true)
    protected String questionRisks;
    @XmlElement(required = true)
    protected String questionHazards;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ohsStartDate;

    /**
     * Gets the value of the ohsType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOhsType() {
        return ohsType;
    }

    /**
     * Sets the value of the ohsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOhsType(String value) {
        this.ohsType = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Gets the value of the questionNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuestionNo() {
        return questionNo;
    }

    /**
     * Sets the value of the questionNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuestionNo(String value) {
        this.questionNo = value;
    }

    /**
     * Gets the value of the questionOrderNo property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuestionOrderNo() {
        return questionOrderNo;
    }

    /**
     * Sets the value of the questionOrderNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuestionOrderNo(BigInteger value) {
        this.questionOrderNo = value;
    }

    /**
     * Gets the value of the questionText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuestionText() {
        return questionText;
    }

    /**
     * Sets the value of the questionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuestionText(String value) {
        this.questionText = value;
    }

    /**
     * Gets the value of the questionAnswer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuestionAnswer() {
        return questionAnswer;
    }

    /**
     * Sets the value of the questionAnswer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuestionAnswer(String value) {
        this.questionAnswer = value;
    }

    /**
     * Gets the value of the questionComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuestionComment() {
        return questionComment;
    }

    /**
     * Sets the value of the questionComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuestionComment(String value) {
        this.questionComment = value;
    }

    /**
     * Gets the value of the questionRisks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuestionRisks() {
        return questionRisks;
    }

    /**
     * Sets the value of the questionRisks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuestionRisks(String value) {
        this.questionRisks = value;
    }

    /**
     * Gets the value of the questionHazards property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuestionHazards() {
        return questionHazards;
    }

    /**
     * Sets the value of the questionHazards property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuestionHazards(String value) {
        this.questionHazards = value;
    }

    /**
     * Gets the value of the ohsStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOhsStartDate() {
        return ohsStartDate;
    }

    /**
     * Sets the value of the ohsStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOhsStartDate(XMLGregorianCalendar value) {
        this.ohsStartDate = value;
    }

	@Override
	public String toString() {
		return "EOhs [ohsType=" + ohsType + ", category=" + category + ", questionNo=" + questionNo
				+ ", questionOrderNo=" + questionOrderNo + ", questionText=" + questionText + ", questionAnswer="
				+ questionAnswer + ", questionComment=" + questionComment + ", questionRisks=" + questionRisks
				+ ", questionHazards=" + questionHazards + ", ohsStartDate=" + ohsStartDate + "]";
	}

}
