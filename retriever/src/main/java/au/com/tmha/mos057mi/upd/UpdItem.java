
package au.com.tmha.mos057mi.upd;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for UpdItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RORC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RORN" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RORL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RORX" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
 *         &lt;element name="SQNR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MAIN" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="STAT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RIDC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RIDN" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RIDL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RIDX" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ITNO" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
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
 *         &lt;element name="BRDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="BRTI" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MRDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="MRTI" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="EQDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="EQTI" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ERQT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="NOEM" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="REPR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MVA1" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MVA2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MVA3" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MVA4" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="FLG1" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="FLG2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CFI1" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CFI2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CFI3" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CFI4" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CFI5" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="WARR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DWPO" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DOID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
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
 *         &lt;element name="TXL3" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="60"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TXL4" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="60"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TXL5" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="60"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TXL6" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="60"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TXL7" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="60"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TXL8" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="60"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TXL9" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="60"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TXL0" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="60"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MES0" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MVA0" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SECP" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
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
@XmlType(name = "UpdItem", propOrder = {
    "rorc",
    "rorn",
    "rorl",
    "rorx",
    "strt",
    "sufi",
    "sqnr",
    "main",
    "stat",
    "ridc",
    "ridn",
    "ridl",
    "ridx",
    "itno",
    "fcla",
    "fcl2",
    "fcl3",
    "brdt",
    "brti",
    "mrdt",
    "mrti",
    "eqdt",
    "eqti",
    "erqt",
    "noem",
    "repr",
    "mva1",
    "mva2",
    "mva3",
    "mva4",
    "flg1",
    "flg2",
    "cfi1",
    "cfi2",
    "cfi3",
    "cfi4",
    "cfi5",
    "warr",
    "dwpo",
    "doid",
    "txl1",
    "txl2",
    "txl3",
    "txl4",
    "txl5",
    "txl6",
    "txl7",
    "txl8",
    "txl9",
    "txl0",
    "mes0",
    "mva0",
    "secp"
})
public class UpdItem {

    @XmlElementRef(name = "RORC", namespace = "http://www.tmha.com.au/MOS057MI/Upd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> rorc;
    @XmlElementRef(name = "RORN", namespace = "http://www.tmha.com.au/MOS057MI/Upd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rorn;
    @XmlElementRef(name = "RORL", namespace = "http://www.tmha.com.au/MOS057MI/Upd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> rorl;
    @XmlElementRef(name = "RORX", namespace = "http://www.tmha.com.au/MOS057MI/Upd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> rorx;
    @XmlElementRef(name = "STRT", namespace = "http://www.tmha.com.au/MOS057MI/Upd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> strt;
    @XmlElementRef(name = "SUFI", namespace = "http://www.tmha.com.au/MOS057MI/Upd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sufi;
    @XmlElementRef(name = "SQNR", namespace = "http://www.tmha.com.au/MOS057MI/Upd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> sqnr;
    @XmlElementRef(name = "MAIN", namespace = "http://www.tmha.com.au/MOS057MI/Upd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> main;
    @XmlElementRef(name = "STAT", namespace = "http://www.tmha.com.au/MOS057MI/Upd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> stat;
    @XmlElementRef(name = "RIDC", namespace = "http://www.tmha.com.au/MOS057MI/Upd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> ridc;
    @XmlElementRef(name = "RIDN", namespace = "http://www.tmha.com.au/MOS057MI/Upd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ridn;
    @XmlElementRef(name = "RIDL", namespace = "http://www.tmha.com.au/MOS057MI/Upd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> ridl;
    @XmlElementRef(name = "RIDX", namespace = "http://www.tmha.com.au/MOS057MI/Upd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> ridx;
    @XmlElementRef(name = "ITNO", namespace = "http://www.tmha.com.au/MOS057MI/Upd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> itno;
    @XmlElementRef(name = "FCLA", namespace = "http://www.tmha.com.au/MOS057MI/Upd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fcla;
    @XmlElementRef(name = "FCL2", namespace = "http://www.tmha.com.au/MOS057MI/Upd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fcl2;
    @XmlElementRef(name = "FCL3", namespace = "http://www.tmha.com.au/MOS057MI/Upd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fcl3;
    @XmlElementRef(name = "BRDT", namespace = "http://www.tmha.com.au/MOS057MI/Upd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> brdt;
    @XmlElementRef(name = "BRTI", namespace = "http://www.tmha.com.au/MOS057MI/Upd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> brti;
    @XmlElementRef(name = "MRDT", namespace = "http://www.tmha.com.au/MOS057MI/Upd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> mrdt;
    @XmlElementRef(name = "MRTI", namespace = "http://www.tmha.com.au/MOS057MI/Upd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> mrti;
    @XmlElementRef(name = "EQDT", namespace = "http://www.tmha.com.au/MOS057MI/Upd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> eqdt;
    @XmlElementRef(name = "EQTI", namespace = "http://www.tmha.com.au/MOS057MI/Upd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> eqti;
    @XmlElementRef(name = "ERQT", namespace = "http://www.tmha.com.au/MOS057MI/Upd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> erqt;
    @XmlElementRef(name = "NOEM", namespace = "http://www.tmha.com.au/MOS057MI/Upd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> noem;
    @XmlElementRef(name = "REPR", namespace = "http://www.tmha.com.au/MOS057MI/Upd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> repr;
    @XmlElementRef(name = "MVA1", namespace = "http://www.tmha.com.au/MOS057MI/Upd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> mva1;
    @XmlElementRef(name = "MVA2", namespace = "http://www.tmha.com.au/MOS057MI/Upd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> mva2;
    @XmlElementRef(name = "MVA3", namespace = "http://www.tmha.com.au/MOS057MI/Upd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> mva3;
    @XmlElementRef(name = "MVA4", namespace = "http://www.tmha.com.au/MOS057MI/Upd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> mva4;
    @XmlElementRef(name = "FLG1", namespace = "http://www.tmha.com.au/MOS057MI/Upd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> flg1;
    @XmlElementRef(name = "FLG2", namespace = "http://www.tmha.com.au/MOS057MI/Upd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> flg2;
    @XmlElementRef(name = "CFI1", namespace = "http://www.tmha.com.au/MOS057MI/Upd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cfi1;
    @XmlElementRef(name = "CFI2", namespace = "http://www.tmha.com.au/MOS057MI/Upd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> cfi2;
    @XmlElementRef(name = "CFI3", namespace = "http://www.tmha.com.au/MOS057MI/Upd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cfi3;
    @XmlElementRef(name = "CFI4", namespace = "http://www.tmha.com.au/MOS057MI/Upd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cfi4;
    @XmlElementRef(name = "CFI5", namespace = "http://www.tmha.com.au/MOS057MI/Upd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cfi5;
    @XmlElementRef(name = "WARR", namespace = "http://www.tmha.com.au/MOS057MI/Upd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> warr;
    @XmlElementRef(name = "DWPO", namespace = "http://www.tmha.com.au/MOS057MI/Upd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dwpo;
    @XmlElementRef(name = "DOID", namespace = "http://www.tmha.com.au/MOS057MI/Upd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> doid;
    @XmlElementRef(name = "TXL1", namespace = "http://www.tmha.com.au/MOS057MI/Upd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> txl1;
    @XmlElementRef(name = "TXL2", namespace = "http://www.tmha.com.au/MOS057MI/Upd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> txl2;
    @XmlElementRef(name = "TXL3", namespace = "http://www.tmha.com.au/MOS057MI/Upd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> txl3;
    @XmlElementRef(name = "TXL4", namespace = "http://www.tmha.com.au/MOS057MI/Upd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> txl4;
    @XmlElementRef(name = "TXL5", namespace = "http://www.tmha.com.au/MOS057MI/Upd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> txl5;
    @XmlElementRef(name = "TXL6", namespace = "http://www.tmha.com.au/MOS057MI/Upd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> txl6;
    @XmlElementRef(name = "TXL7", namespace = "http://www.tmha.com.au/MOS057MI/Upd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> txl7;
    @XmlElementRef(name = "TXL8", namespace = "http://www.tmha.com.au/MOS057MI/Upd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> txl8;
    @XmlElementRef(name = "TXL9", namespace = "http://www.tmha.com.au/MOS057MI/Upd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> txl9;
    @XmlElementRef(name = "TXL0", namespace = "http://www.tmha.com.au/MOS057MI/Upd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> txl0;
    @XmlElementRef(name = "MES0", namespace = "http://www.tmha.com.au/MOS057MI/Upd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mes0;
    @XmlElementRef(name = "MVA0", namespace = "http://www.tmha.com.au/MOS057MI/Upd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> mva0;
    @XmlElementRef(name = "SECP", namespace = "http://www.tmha.com.au/MOS057MI/Upd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> secp;

    /**
     * Gets the value of the rorc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getRORC() {
        return rorc;
    }

    /**
     * Sets the value of the rorc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setRORC(JAXBElement<BigDecimal> value) {
        this.rorc = value;
    }

    /**
     * Gets the value of the rorn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRORN() {
        return rorn;
    }

    /**
     * Sets the value of the rorn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRORN(JAXBElement<String> value) {
        this.rorn = value;
    }

    /**
     * Gets the value of the rorl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getRORL() {
        return rorl;
    }

    /**
     * Sets the value of the rorl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setRORL(JAXBElement<BigDecimal> value) {
        this.rorl = value;
    }

    /**
     * Gets the value of the rorx property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getRORX() {
        return rorx;
    }

    /**
     * Sets the value of the rorx property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setRORX(JAXBElement<BigDecimal> value) {
        this.rorx = value;
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
     * Gets the value of the sqnr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getSQNR() {
        return sqnr;
    }

    /**
     * Sets the value of the sqnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setSQNR(JAXBElement<BigDecimal> value) {
        this.sqnr = value;
    }

    /**
     * Gets the value of the main property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getMAIN() {
        return main;
    }

    /**
     * Sets the value of the main property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setMAIN(JAXBElement<BigDecimal> value) {
        this.main = value;
    }

    /**
     * Gets the value of the stat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSTAT() {
        return stat;
    }

    /**
     * Sets the value of the stat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSTAT(JAXBElement<String> value) {
        this.stat = value;
    }

    /**
     * Gets the value of the ridc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getRIDC() {
        return ridc;
    }

    /**
     * Sets the value of the ridc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setRIDC(JAXBElement<BigDecimal> value) {
        this.ridc = value;
    }

    /**
     * Gets the value of the ridn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRIDN() {
        return ridn;
    }

    /**
     * Sets the value of the ridn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRIDN(JAXBElement<String> value) {
        this.ridn = value;
    }

    /**
     * Gets the value of the ridl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getRIDL() {
        return ridl;
    }

    /**
     * Sets the value of the ridl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setRIDL(JAXBElement<BigDecimal> value) {
        this.ridl = value;
    }

    /**
     * Gets the value of the ridx property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getRIDX() {
        return ridx;
    }

    /**
     * Sets the value of the ridx property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setRIDX(JAXBElement<BigDecimal> value) {
        this.ridx = value;
    }

    /**
     * Gets the value of the itno property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getITNO() {
        return itno;
    }

    /**
     * Sets the value of the itno property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setITNO(JAXBElement<String> value) {
        this.itno = value;
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
     * Gets the value of the brdt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getBRDT() {
        return brdt;
    }

    /**
     * Sets the value of the brdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setBRDT(JAXBElement<XMLGregorianCalendar> value) {
        this.brdt = value;
    }

    /**
     * Gets the value of the brti property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getBRTI() {
        return brti;
    }

    /**
     * Sets the value of the brti property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setBRTI(JAXBElement<BigDecimal> value) {
        this.brti = value;
    }

    /**
     * Gets the value of the mrdt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getMRDT() {
        return mrdt;
    }

    /**
     * Sets the value of the mrdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setMRDT(JAXBElement<XMLGregorianCalendar> value) {
        this.mrdt = value;
    }

    /**
     * Gets the value of the mrti property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getMRTI() {
        return mrti;
    }

    /**
     * Sets the value of the mrti property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setMRTI(JAXBElement<BigDecimal> value) {
        this.mrti = value;
    }

    /**
     * Gets the value of the eqdt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEQDT() {
        return eqdt;
    }

    /**
     * Sets the value of the eqdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEQDT(JAXBElement<XMLGregorianCalendar> value) {
        this.eqdt = value;
    }

    /**
     * Gets the value of the eqti property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getEQTI() {
        return eqti;
    }

    /**
     * Sets the value of the eqti property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setEQTI(JAXBElement<BigDecimal> value) {
        this.eqti = value;
    }

    /**
     * Gets the value of the erqt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getERQT() {
        return erqt;
    }

    /**
     * Sets the value of the erqt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setERQT(JAXBElement<BigDecimal> value) {
        this.erqt = value;
    }

    /**
     * Gets the value of the noem property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getNOEM() {
        return noem;
    }

    /**
     * Sets the value of the noem property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setNOEM(JAXBElement<BigDecimal> value) {
        this.noem = value;
    }

    /**
     * Gets the value of the repr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getREPR() {
        return repr;
    }

    /**
     * Sets the value of the repr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setREPR(JAXBElement<String> value) {
        this.repr = value;
    }

    /**
     * Gets the value of the mva1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getMVA1() {
        return mva1;
    }

    /**
     * Sets the value of the mva1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setMVA1(JAXBElement<BigDecimal> value) {
        this.mva1 = value;
    }

    /**
     * Gets the value of the mva2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getMVA2() {
        return mva2;
    }

    /**
     * Sets the value of the mva2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setMVA2(JAXBElement<BigDecimal> value) {
        this.mva2 = value;
    }

    /**
     * Gets the value of the mva3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getMVA3() {
        return mva3;
    }

    /**
     * Sets the value of the mva3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setMVA3(JAXBElement<BigDecimal> value) {
        this.mva3 = value;
    }

    /**
     * Gets the value of the mva4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getMVA4() {
        return mva4;
    }

    /**
     * Sets the value of the mva4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setMVA4(JAXBElement<BigDecimal> value) {
        this.mva4 = value;
    }

    /**
     * Gets the value of the flg1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getFLG1() {
        return flg1;
    }

    /**
     * Sets the value of the flg1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setFLG1(JAXBElement<BigDecimal> value) {
        this.flg1 = value;
    }

    /**
     * Gets the value of the flg2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getFLG2() {
        return flg2;
    }

    /**
     * Sets the value of the flg2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setFLG2(JAXBElement<BigDecimal> value) {
        this.flg2 = value;
    }

    /**
     * Gets the value of the cfi1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCFI1() {
        return cfi1;
    }

    /**
     * Sets the value of the cfi1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCFI1(JAXBElement<String> value) {
        this.cfi1 = value;
    }

    /**
     * Gets the value of the cfi2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCFI2() {
        return cfi2;
    }

    /**
     * Sets the value of the cfi2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCFI2(JAXBElement<BigDecimal> value) {
        this.cfi2 = value;
    }

    /**
     * Gets the value of the cfi3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCFI3() {
        return cfi3;
    }

    /**
     * Sets the value of the cfi3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCFI3(JAXBElement<String> value) {
        this.cfi3 = value;
    }

    /**
     * Gets the value of the cfi4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCFI4() {
        return cfi4;
    }

    /**
     * Sets the value of the cfi4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCFI4(JAXBElement<String> value) {
        this.cfi4 = value;
    }

    /**
     * Gets the value of the cfi5 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCFI5() {
        return cfi5;
    }

    /**
     * Sets the value of the cfi5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCFI5(JAXBElement<String> value) {
        this.cfi5 = value;
    }

    /**
     * Gets the value of the warr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getWARR() {
        return warr;
    }

    /**
     * Sets the value of the warr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setWARR(JAXBElement<BigDecimal> value) {
        this.warr = value;
    }

    /**
     * Gets the value of the dwpo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDWPO() {
        return dwpo;
    }

    /**
     * Sets the value of the dwpo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDWPO(JAXBElement<String> value) {
        this.dwpo = value;
    }

    /**
     * Gets the value of the doid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDOID() {
        return doid;
    }

    /**
     * Sets the value of the doid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDOID(JAXBElement<String> value) {
        this.doid = value;
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
     * Gets the value of the txl3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTXL3() {
        return txl3;
    }

    /**
     * Sets the value of the txl3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTXL3(JAXBElement<String> value) {
        this.txl3 = value;
    }

    /**
     * Gets the value of the txl4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTXL4() {
        return txl4;
    }

    /**
     * Sets the value of the txl4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTXL4(JAXBElement<String> value) {
        this.txl4 = value;
    }

    /**
     * Gets the value of the txl5 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTXL5() {
        return txl5;
    }

    /**
     * Sets the value of the txl5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTXL5(JAXBElement<String> value) {
        this.txl5 = value;
    }

    /**
     * Gets the value of the txl6 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTXL6() {
        return txl6;
    }

    /**
     * Sets the value of the txl6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTXL6(JAXBElement<String> value) {
        this.txl6 = value;
    }

    /**
     * Gets the value of the txl7 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTXL7() {
        return txl7;
    }

    /**
     * Sets the value of the txl7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTXL7(JAXBElement<String> value) {
        this.txl7 = value;
    }

    /**
     * Gets the value of the txl8 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTXL8() {
        return txl8;
    }

    /**
     * Sets the value of the txl8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTXL8(JAXBElement<String> value) {
        this.txl8 = value;
    }

    /**
     * Gets the value of the txl9 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTXL9() {
        return txl9;
    }

    /**
     * Sets the value of the txl9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTXL9(JAXBElement<String> value) {
        this.txl9 = value;
    }

    /**
     * Gets the value of the txl0 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTXL0() {
        return txl0;
    }

    /**
     * Sets the value of the txl0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTXL0(JAXBElement<String> value) {
        this.txl0 = value;
    }

    /**
     * Gets the value of the mes0 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMES0() {
        return mes0;
    }

    /**
     * Sets the value of the mes0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMES0(JAXBElement<String> value) {
        this.mes0 = value;
    }

    /**
     * Gets the value of the mva0 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getMVA0() {
        return mva0;
    }

    /**
     * Sets the value of the mva0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setMVA0(JAXBElement<BigDecimal> value) {
        this.mva0 = value;
    }

    /**
     * Gets the value of the secp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSECP() {
        return secp;
    }

    /**
     * Sets the value of the secp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSECP(JAXBElement<String> value) {
        this.secp = value;
    }

}
