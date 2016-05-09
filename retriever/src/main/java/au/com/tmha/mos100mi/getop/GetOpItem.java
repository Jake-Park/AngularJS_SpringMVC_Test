
package au.com.tmha.mos100mi.getop;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetOpItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetOpItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WorkOrderNumber">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="OperationNumber" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="RetriveEstimatedCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="YesNo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetOpItem", propOrder = {
    "workOrderNumber",
    "operationNumber",
    "retriveEstimatedCost",
    "yesNo"
})
public class GetOpItem {

    @XmlElement(name = "WorkOrderNumber", required = true)
    protected String workOrderNumber;
    @XmlElement(name = "OperationNumber", required = true)
    protected BigDecimal operationNumber;
    @XmlElementRef(name = "RetriveEstimatedCost", namespace = "http://www.tmha.com.au/MOS100MI/GetOp", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> retriveEstimatedCost;
    @XmlElementRef(name = "YesNo", namespace = "http://www.tmha.com.au/MOS100MI/GetOp", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> yesNo;

    /**
     * Gets the value of the workOrderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkOrderNumber() {
        return workOrderNumber;
    }

    /**
     * Sets the value of the workOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkOrderNumber(String value) {
        this.workOrderNumber = value;
    }

    /**
     * Gets the value of the operationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOperationNumber() {
        return operationNumber;
    }

    /**
     * Sets the value of the operationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOperationNumber(BigDecimal value) {
        this.operationNumber = value;
    }

    /**
     * Gets the value of the retriveEstimatedCost property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getRetriveEstimatedCost() {
        return retriveEstimatedCost;
    }

    /**
     * Sets the value of the retriveEstimatedCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setRetriveEstimatedCost(JAXBElement<BigDecimal> value) {
        this.retriveEstimatedCost = value;
    }

    /**
     * Gets the value of the yesNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getYesNo() {
        return yesNo;
    }

    /**
     * Sets the value of the yesNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setYesNo(JAXBElement<BigDecimal> value) {
        this.yesNo = value;
    }

}
