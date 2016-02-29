
package au.com.tmha.mos070mi.updoperation;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for UpdOperationItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdOperationItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CONO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MWNO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="OPNO" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="RPDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="RTM1" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RPRE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EMNO" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="UMAS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="UMAT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="UPIT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="USET" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="REND" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MAQA" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SCQA" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SCRE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DPLG" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PCTP" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FCLA" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FCL2" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FCL3" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DOWT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DLY1" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DLY2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TXL1" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="60"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TXL2" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="60"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EQNO" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="STRT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SUFI" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TXID" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CLBL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="INFR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="REMK" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LCDE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdOperationItem", propOrder = {
    "cono",
    "mwno",
    "opno",
    "rpdt",
    "rtm1",
    "rpre",
    "emno",
    "umas",
    "umat",
    "upit",
    "uset",
    "rend",
    "maqa",
    "scqa",
    "scre",
    "dplg",
    "pctp",
    "fcla",
    "fcl2",
    "fcl3",
    "dowt",
    "dly1",
    "dly2",
    "txl1",
    "txl2",
    "eqno",
    "strt",
    "sufi",
    "txid",
    "clbl",
    "infr",
    "remk",
    "lcde"
})
public class UpdOperationItem {

    @XmlElementRef(name = "CONO", namespace = "http://www.tmha.com.au/MOS070MI/UpdOperation", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> cono;
    @XmlElement(name = "MWNO", required = true)
    protected String mwno;
    @XmlElement(name = "OPNO", required = true)
    protected BigDecimal opno;
    @XmlElementRef(name = "RPDT", namespace = "http://www.tmha.com.au/MOS070MI/UpdOperation", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> rpdt;
    @XmlElementRef(name = "RTM1", namespace = "http://www.tmha.com.au/MOS070MI/UpdOperation", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> rtm1;
    @XmlElementRef(name = "RPRE", namespace = "http://www.tmha.com.au/MOS070MI/UpdOperation", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rpre;
    @XmlElementRef(name = "EMNO", namespace = "http://www.tmha.com.au/MOS070MI/UpdOperation", type = JAXBElement.class, required = false)
    protected JAXBElement<String> emno;
    @XmlElementRef(name = "UMAS", namespace = "http://www.tmha.com.au/MOS070MI/UpdOperation", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> umas;
    @XmlElementRef(name = "UMAT", namespace = "http://www.tmha.com.au/MOS070MI/UpdOperation", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> umat;
    @XmlElementRef(name = "UPIT", namespace = "http://www.tmha.com.au/MOS070MI/UpdOperation", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> upit;
    @XmlElementRef(name = "USET", namespace = "http://www.tmha.com.au/MOS070MI/UpdOperation", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> uset;
    @XmlElementRef(name = "REND", namespace = "http://www.tmha.com.au/MOS070MI/UpdOperation", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> rend;
    @XmlElementRef(name = "MAQA", namespace = "http://www.tmha.com.au/MOS070MI/UpdOperation", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> maqa;
    @XmlElementRef(name = "SCQA", namespace = "http://www.tmha.com.au/MOS070MI/UpdOperation", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> scqa;
    @XmlElementRef(name = "SCRE", namespace = "http://www.tmha.com.au/MOS070MI/UpdOperation", type = JAXBElement.class, required = false)
    protected JAXBElement<String> scre;
    @XmlElementRef(name = "DPLG", namespace = "http://www.tmha.com.au/MOS070MI/UpdOperation", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dplg;
    @XmlElementRef(name = "PCTP", namespace = "http://www.tmha.com.au/MOS070MI/UpdOperation", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pctp;
    @XmlElementRef(name = "FCLA", namespace = "http://www.tmha.com.au/MOS070MI/UpdOperation", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fcla;
    @XmlElementRef(name = "FCL2", namespace = "http://www.tmha.com.au/MOS070MI/UpdOperation", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fcl2;
    @XmlElementRef(name = "FCL3", namespace = "http://www.tmha.com.au/MOS070MI/UpdOperation", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fcl3;
    @XmlElementRef(name = "DOWT", namespace = "http://www.tmha.com.au/MOS070MI/UpdOperation", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> dowt;
    @XmlElementRef(name = "DLY1", namespace = "http://www.tmha.com.au/MOS070MI/UpdOperation", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> dly1;
    @XmlElementRef(name = "DLY2", namespace = "http://www.tmha.com.au/MOS070MI/UpdOperation", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> dly2;
    @XmlElementRef(name = "TXL1", namespace = "http://www.tmha.com.au/MOS070MI/UpdOperation", type = JAXBElement.class, required = false)
    protected JAXBElement<String> txl1;
    @XmlElementRef(name = "TXL2", namespace = "http://www.tmha.com.au/MOS070MI/UpdOperation", type = JAXBElement.class, required = false)
    protected JAXBElement<String> txl2;
    @XmlElementRef(name = "EQNO", namespace = "http://www.tmha.com.au/MOS070MI/UpdOperation", type = JAXBElement.class, required = false)
    protected JAXBElement<String> eqno;
    @XmlElementRef(name = "STRT", namespace = "http://www.tmha.com.au/MOS070MI/UpdOperation", type = JAXBElement.class, required = false)
    protected JAXBElement<String> strt;
    @XmlElementRef(name = "SUFI", namespace = "http://www.tmha.com.au/MOS070MI/UpdOperation", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sufi;
    @XmlElementRef(name = "TXID", namespace = "http://www.tmha.com.au/MOS070MI/UpdOperation", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> txid;
    @XmlElementRef(name = "CLBL", namespace = "http://www.tmha.com.au/MOS070MI/UpdOperation", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> clbl;
    @XmlElementRef(name = "INFR", namespace = "http://www.tmha.com.au/MOS070MI/UpdOperation", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> infr;
    @XmlElementRef(name = "REMK", namespace = "http://www.tmha.com.au/MOS070MI/UpdOperation", type = JAXBElement.class, required = false)
    protected JAXBElement<String> remk;
    @XmlElementRef(name = "LCDE", namespace = "http://www.tmha.com.au/MOS070MI/UpdOperation", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lcde;

    /**
     * Gets the value of the cono property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCONO() {
        return cono;
    }

    /**
     * Sets the value of the cono property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCONO(JAXBElement<BigDecimal> value) {
        this.cono = value;
    }

    /**
     * Gets the value of the mwno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMWNO() {
        return mwno;
    }

    /**
     * Sets the value of the mwno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMWNO(String value) {
        this.mwno = value;
    }

    /**
     * Gets the value of the opno property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOPNO() {
        return opno;
    }

    /**
     * Sets the value of the opno property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOPNO(BigDecimal value) {
        this.opno = value;
    }

    /**
     * Gets the value of the rpdt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getRPDT() {
        return rpdt;
    }

    /**
     * Sets the value of the rpdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setRPDT(JAXBElement<XMLGregorianCalendar> value) {
        this.rpdt = value;
    }

    /**
     * Gets the value of the rtm1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getRTM1() {
        return rtm1;
    }

    /**
     * Sets the value of the rtm1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setRTM1(JAXBElement<BigDecimal> value) {
        this.rtm1 = value;
    }

    /**
     * Gets the value of the rpre property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRPRE() {
        return rpre;
    }

    /**
     * Sets the value of the rpre property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRPRE(JAXBElement<String> value) {
        this.rpre = value;
    }

    /**
     * Gets the value of the emno property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEMNO() {
        return emno;
    }

    /**
     * Sets the value of the emno property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEMNO(JAXBElement<String> value) {
        this.emno = value;
    }

    /**
     * Gets the value of the umas property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getUMAS() {
        return umas;
    }

    /**
     * Sets the value of the umas property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setUMAS(JAXBElement<BigDecimal> value) {
        this.umas = value;
    }

    /**
     * Gets the value of the umat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getUMAT() {
        return umat;
    }

    /**
     * Sets the value of the umat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setUMAT(JAXBElement<BigDecimal> value) {
        this.umat = value;
    }

    /**
     * Gets the value of the upit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getUPIT() {
        return upit;
    }

    /**
     * Sets the value of the upit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setUPIT(JAXBElement<BigDecimal> value) {
        this.upit = value;
    }

    /**
     * Gets the value of the uset property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getUSET() {
        return uset;
    }

    /**
     * Sets the value of the uset property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setUSET(JAXBElement<BigDecimal> value) {
        this.uset = value;
    }

    /**
     * Gets the value of the rend property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getREND() {
        return rend;
    }

    /**
     * Sets the value of the rend property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setREND(JAXBElement<BigDecimal> value) {
        this.rend = value;
    }

    /**
     * Gets the value of the maqa property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getMAQA() {
        return maqa;
    }

    /**
     * Sets the value of the maqa property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setMAQA(JAXBElement<BigDecimal> value) {
        this.maqa = value;
    }

    /**
     * Gets the value of the scqa property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getSCQA() {
        return scqa;
    }

    /**
     * Sets the value of the scqa property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setSCQA(JAXBElement<BigDecimal> value) {
        this.scqa = value;
    }

    /**
     * Gets the value of the scre property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCRE() {
        return scre;
    }

    /**
     * Sets the value of the scre property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCRE(JAXBElement<String> value) {
        this.scre = value;
    }

    /**
     * Gets the value of the dplg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDPLG() {
        return dplg;
    }

    /**
     * Sets the value of the dplg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDPLG(JAXBElement<String> value) {
        this.dplg = value;
    }

    /**
     * Gets the value of the pctp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPCTP() {
        return pctp;
    }

    /**
     * Sets the value of the pctp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPCTP(JAXBElement<String> value) {
        this.pctp = value;
    }

    /**
     * Gets the value of the fcla property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFCLA() {
        return fcla;
    }

    /**
     * Sets the value of the fcla property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFCLA(JAXBElement<String> value) {
        this.fcla = value;
    }

    /**
     * Gets the value of the fcl2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFCL2() {
        return fcl2;
    }

    /**
     * Sets the value of the fcl2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFCL2(JAXBElement<String> value) {
        this.fcl2 = value;
    }

    /**
     * Gets the value of the fcl3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFCL3() {
        return fcl3;
    }

    /**
     * Sets the value of the fcl3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFCL3(JAXBElement<String> value) {
        this.fcl3 = value;
    }

    /**
     * Gets the value of the dowt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDOWT() {
        return dowt;
    }

    /**
     * Sets the value of the dowt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDOWT(JAXBElement<BigDecimal> value) {
        this.dowt = value;
    }

    /**
     * Gets the value of the dly1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDLY1() {
        return dly1;
    }

    /**
     * Sets the value of the dly1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDLY1(JAXBElement<BigDecimal> value) {
        this.dly1 = value;
    }

    /**
     * Gets the value of the dly2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDLY2() {
        return dly2;
    }

    /**
     * Sets the value of the dly2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDLY2(JAXBElement<BigDecimal> value) {
        this.dly2 = value;
    }

    /**
     * Gets the value of the txl1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTXL1() {
        return txl1;
    }

    /**
     * Sets the value of the txl1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTXL1(JAXBElement<String> value) {
        this.txl1 = value;
    }

    /**
     * Gets the value of the txl2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTXL2() {
        return txl2;
    }

    /**
     * Sets the value of the txl2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTXL2(JAXBElement<String> value) {
        this.txl2 = value;
    }

    /**
     * Gets the value of the eqno property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEQNO() {
        return eqno;
    }

    /**
     * Sets the value of the eqno property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEQNO(JAXBElement<String> value) {
        this.eqno = value;
    }

    /**
     * Gets the value of the strt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSTRT() {
        return strt;
    }

    /**
     * Sets the value of the strt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSTRT(JAXBElement<String> value) {
        this.strt = value;
    }

    /**
     * Gets the value of the sufi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSUFI() {
        return sufi;
    }

    /**
     * Sets the value of the sufi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSUFI(JAXBElement<String> value) {
        this.sufi = value;
    }

    /**
     * Gets the value of the txid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getTXID() {
        return txid;
    }

    /**
     * Sets the value of the txid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setTXID(JAXBElement<BigDecimal> value) {
        this.txid = value;
    }

    /**
     * Gets the value of the clbl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCLBL() {
        return clbl;
    }

    /**
     * Sets the value of the clbl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCLBL(JAXBElement<BigDecimal> value) {
        this.clbl = value;
    }

    /**
     * Gets the value of the infr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getINFR() {
        return infr;
    }

    /**
     * Sets the value of the infr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setINFR(JAXBElement<BigDecimal> value) {
        this.infr = value;
    }

    /**
     * Gets the value of the remk property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getREMK() {
        return remk;
    }

    /**
     * Sets the value of the remk property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setREMK(JAXBElement<String> value) {
        this.remk = value;
    }

    /**
     * Gets the value of the lcde property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLCDE() {
        return lcde;
    }

    /**
     * Sets the value of the lcde property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLCDE(JAXBElement<String> value) {
        this.lcde = value;
    }

}
