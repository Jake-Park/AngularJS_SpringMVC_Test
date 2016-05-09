
package au.com.tmha.mos057mi.upd;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.com.tmha.mos057mi.upd package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Upd_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Upd", "Upd");
    private final static QName _UpdResponse_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Upd", "UpdResponse");
    private final static QName _UpdItemSQNR_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Upd", "SQNR");
    private final static QName _UpdItemFLG1_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Upd", "FLG1");
    private final static QName _UpdItemFLG2_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Upd", "FLG2");
    private final static QName _UpdItemEQDT_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Upd", "EQDT");
    private final static QName _UpdItemDOID_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Upd", "DOID");
    private final static QName _UpdItemSUFI_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Upd", "SUFI");
    private final static QName _UpdItemNOEM_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Upd", "NOEM");
    private final static QName _UpdItemRORX_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Upd", "RORX");
    private final static QName _UpdItemRIDC_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Upd", "RIDC");
    private final static QName _UpdItemRIDL_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Upd", "RIDL");
    private final static QName _UpdItemMES0_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Upd", "MES0");
    private final static QName _UpdItemFCL3_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Upd", "FCL3");
    private final static QName _UpdItemCFI1_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Upd", "CFI1");
    private final static QName _UpdItemCFI4_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Upd", "CFI4");
    private final static QName _UpdItemRORC_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Upd", "RORC");
    private final static QName _UpdItemCFI5_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Upd", "CFI5");
    private final static QName _UpdItemCFI2_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Upd", "CFI2");
    private final static QName _UpdItemFCL2_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Upd", "FCL2");
    private final static QName _UpdItemCFI3_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Upd", "CFI3");
    private final static QName _UpdItemITNO_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Upd", "ITNO");
    private final static QName _UpdItemTXL9_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Upd", "TXL9");
    private final static QName _UpdItemSTAT_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Upd", "STAT");
    private final static QName _UpdItemMAIN_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Upd", "MAIN");
    private final static QName _UpdItemTXL8_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Upd", "TXL8");
    private final static QName _UpdItemSECP_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Upd", "SECP");
    private final static QName _UpdItemTXL6_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Upd", "TXL6");
    private final static QName _UpdItemTXL7_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Upd", "TXL7");
    private final static QName _UpdItemTXL4_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Upd", "TXL4");
    private final static QName _UpdItemRIDX_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Upd", "RIDX");
    private final static QName _UpdItemRORN_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Upd", "RORN");
    private final static QName _UpdItemTXL5_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Upd", "TXL5");
    private final static QName _UpdItemTXL2_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Upd", "TXL2");
    private final static QName _UpdItemDWPO_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Upd", "DWPO");
    private final static QName _UpdItemTXL3_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Upd", "TXL3");
    private final static QName _UpdItemTXL0_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Upd", "TXL0");
    private final static QName _UpdItemFCLA_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Upd", "FCLA");
    private final static QName _UpdItemTXL1_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Upd", "TXL1");
    private final static QName _UpdItemRIDN_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Upd", "RIDN");
    private final static QName _UpdItemWARR_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Upd", "WARR");
    private final static QName _UpdItemRORL_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Upd", "RORL");
    private final static QName _UpdItemMRTI_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Upd", "MRTI");
    private final static QName _UpdItemREPR_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Upd", "REPR");
    private final static QName _UpdItemMRDT_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Upd", "MRDT");
    private final static QName _UpdItemEQTI_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Upd", "EQTI");
    private final static QName _UpdItemMVA3_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Upd", "MVA3");
    private final static QName _UpdItemMVA2_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Upd", "MVA2");
    private final static QName _UpdItemMVA1_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Upd", "MVA1");
    private final static QName _UpdItemMVA0_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Upd", "MVA0");
    private final static QName _UpdItemBRDT_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Upd", "BRDT");
    private final static QName _UpdItemBRTI_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Upd", "BRTI");
    private final static QName _UpdItemMVA4_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Upd", "MVA4");
    private final static QName _UpdItemSTRT_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Upd", "STRT");
    private final static QName _UpdItemERQT_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Upd", "ERQT");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.com.tmha.mos057mi.upd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UpdResponseCollection }
     * 
     */
    public UpdResponseCollection createUpdResponseCollection() {
        return new UpdResponseCollection();
    }

    /**
     * Create an instance of {@link UpdCollection }
     * 
     */
    public UpdCollection createUpdCollection() {
        return new UpdCollection();
    }

    /**
     * Create an instance of {@link UpdItem }
     * 
     */
    public UpdItem createUpdItem() {
        return new UpdItem();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Upd", name = "Upd")
    public JAXBElement<UpdCollection> createUpd(UpdCollection value) {
        return new JAXBElement<UpdCollection>(_Upd_QNAME, UpdCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdResponseCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Upd", name = "UpdResponse")
    public JAXBElement<UpdResponseCollection> createUpdResponse(UpdResponseCollection value) {
        return new JAXBElement<UpdResponseCollection>(_UpdResponse_QNAME, UpdResponseCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Upd", name = "SQNR", scope = UpdItem.class)
    public JAXBElement<BigDecimal> createUpdItemSQNR(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_UpdItemSQNR_QNAME, BigDecimal.class, UpdItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Upd", name = "FLG1", scope = UpdItem.class)
    public JAXBElement<BigDecimal> createUpdItemFLG1(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_UpdItemFLG1_QNAME, BigDecimal.class, UpdItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Upd", name = "FLG2", scope = UpdItem.class)
    public JAXBElement<BigDecimal> createUpdItemFLG2(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_UpdItemFLG2_QNAME, BigDecimal.class, UpdItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Upd", name = "EQDT", scope = UpdItem.class)
    public JAXBElement<XMLGregorianCalendar> createUpdItemEQDT(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_UpdItemEQDT_QNAME, XMLGregorianCalendar.class, UpdItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Upd", name = "DOID", scope = UpdItem.class)
    public JAXBElement<String> createUpdItemDOID(String value) {
        return new JAXBElement<String>(_UpdItemDOID_QNAME, String.class, UpdItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Upd", name = "SUFI", scope = UpdItem.class)
    public JAXBElement<String> createUpdItemSUFI(String value) {
        return new JAXBElement<String>(_UpdItemSUFI_QNAME, String.class, UpdItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Upd", name = "NOEM", scope = UpdItem.class)
    public JAXBElement<BigDecimal> createUpdItemNOEM(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_UpdItemNOEM_QNAME, BigDecimal.class, UpdItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Upd", name = "RORX", scope = UpdItem.class)
    public JAXBElement<BigDecimal> createUpdItemRORX(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_UpdItemRORX_QNAME, BigDecimal.class, UpdItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Upd", name = "RIDC", scope = UpdItem.class)
    public JAXBElement<BigDecimal> createUpdItemRIDC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_UpdItemRIDC_QNAME, BigDecimal.class, UpdItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Upd", name = "RIDL", scope = UpdItem.class)
    public JAXBElement<BigDecimal> createUpdItemRIDL(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_UpdItemRIDL_QNAME, BigDecimal.class, UpdItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Upd", name = "MES0", scope = UpdItem.class)
    public JAXBElement<String> createUpdItemMES0(String value) {
        return new JAXBElement<String>(_UpdItemMES0_QNAME, String.class, UpdItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Upd", name = "FCL3", scope = UpdItem.class)
    public JAXBElement<String> createUpdItemFCL3(String value) {
        return new JAXBElement<String>(_UpdItemFCL3_QNAME, String.class, UpdItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Upd", name = "CFI1", scope = UpdItem.class)
    public JAXBElement<String> createUpdItemCFI1(String value) {
        return new JAXBElement<String>(_UpdItemCFI1_QNAME, String.class, UpdItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Upd", name = "CFI4", scope = UpdItem.class)
    public JAXBElement<String> createUpdItemCFI4(String value) {
        return new JAXBElement<String>(_UpdItemCFI4_QNAME, String.class, UpdItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Upd", name = "RORC", scope = UpdItem.class)
    public JAXBElement<BigDecimal> createUpdItemRORC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_UpdItemRORC_QNAME, BigDecimal.class, UpdItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Upd", name = "CFI5", scope = UpdItem.class)
    public JAXBElement<String> createUpdItemCFI5(String value) {
        return new JAXBElement<String>(_UpdItemCFI5_QNAME, String.class, UpdItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Upd", name = "CFI2", scope = UpdItem.class)
    public JAXBElement<BigDecimal> createUpdItemCFI2(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_UpdItemCFI2_QNAME, BigDecimal.class, UpdItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Upd", name = "FCL2", scope = UpdItem.class)
    public JAXBElement<String> createUpdItemFCL2(String value) {
        return new JAXBElement<String>(_UpdItemFCL2_QNAME, String.class, UpdItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Upd", name = "CFI3", scope = UpdItem.class)
    public JAXBElement<String> createUpdItemCFI3(String value) {
        return new JAXBElement<String>(_UpdItemCFI3_QNAME, String.class, UpdItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Upd", name = "ITNO", scope = UpdItem.class)
    public JAXBElement<String> createUpdItemITNO(String value) {
        return new JAXBElement<String>(_UpdItemITNO_QNAME, String.class, UpdItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Upd", name = "TXL9", scope = UpdItem.class)
    public JAXBElement<String> createUpdItemTXL9(String value) {
        return new JAXBElement<String>(_UpdItemTXL9_QNAME, String.class, UpdItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Upd", name = "STAT", scope = UpdItem.class)
    public JAXBElement<String> createUpdItemSTAT(String value) {
        return new JAXBElement<String>(_UpdItemSTAT_QNAME, String.class, UpdItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Upd", name = "MAIN", scope = UpdItem.class)
    public JAXBElement<BigDecimal> createUpdItemMAIN(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_UpdItemMAIN_QNAME, BigDecimal.class, UpdItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Upd", name = "TXL8", scope = UpdItem.class)
    public JAXBElement<String> createUpdItemTXL8(String value) {
        return new JAXBElement<String>(_UpdItemTXL8_QNAME, String.class, UpdItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Upd", name = "SECP", scope = UpdItem.class)
    public JAXBElement<String> createUpdItemSECP(String value) {
        return new JAXBElement<String>(_UpdItemSECP_QNAME, String.class, UpdItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Upd", name = "TXL6", scope = UpdItem.class)
    public JAXBElement<String> createUpdItemTXL6(String value) {
        return new JAXBElement<String>(_UpdItemTXL6_QNAME, String.class, UpdItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Upd", name = "TXL7", scope = UpdItem.class)
    public JAXBElement<String> createUpdItemTXL7(String value) {
        return new JAXBElement<String>(_UpdItemTXL7_QNAME, String.class, UpdItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Upd", name = "TXL4", scope = UpdItem.class)
    public JAXBElement<String> createUpdItemTXL4(String value) {
        return new JAXBElement<String>(_UpdItemTXL4_QNAME, String.class, UpdItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Upd", name = "RIDX", scope = UpdItem.class)
    public JAXBElement<BigDecimal> createUpdItemRIDX(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_UpdItemRIDX_QNAME, BigDecimal.class, UpdItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Upd", name = "RORN", scope = UpdItem.class)
    public JAXBElement<String> createUpdItemRORN(String value) {
        return new JAXBElement<String>(_UpdItemRORN_QNAME, String.class, UpdItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Upd", name = "TXL5", scope = UpdItem.class)
    public JAXBElement<String> createUpdItemTXL5(String value) {
        return new JAXBElement<String>(_UpdItemTXL5_QNAME, String.class, UpdItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Upd", name = "TXL2", scope = UpdItem.class)
    public JAXBElement<String> createUpdItemTXL2(String value) {
        return new JAXBElement<String>(_UpdItemTXL2_QNAME, String.class, UpdItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Upd", name = "DWPO", scope = UpdItem.class)
    public JAXBElement<String> createUpdItemDWPO(String value) {
        return new JAXBElement<String>(_UpdItemDWPO_QNAME, String.class, UpdItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Upd", name = "TXL3", scope = UpdItem.class)
    public JAXBElement<String> createUpdItemTXL3(String value) {
        return new JAXBElement<String>(_UpdItemTXL3_QNAME, String.class, UpdItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Upd", name = "TXL0", scope = UpdItem.class)
    public JAXBElement<String> createUpdItemTXL0(String value) {
        return new JAXBElement<String>(_UpdItemTXL0_QNAME, String.class, UpdItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Upd", name = "FCLA", scope = UpdItem.class)
    public JAXBElement<String> createUpdItemFCLA(String value) {
        return new JAXBElement<String>(_UpdItemFCLA_QNAME, String.class, UpdItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Upd", name = "TXL1", scope = UpdItem.class)
    public JAXBElement<String> createUpdItemTXL1(String value) {
        return new JAXBElement<String>(_UpdItemTXL1_QNAME, String.class, UpdItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Upd", name = "RIDN", scope = UpdItem.class)
    public JAXBElement<String> createUpdItemRIDN(String value) {
        return new JAXBElement<String>(_UpdItemRIDN_QNAME, String.class, UpdItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Upd", name = "WARR", scope = UpdItem.class)
    public JAXBElement<BigDecimal> createUpdItemWARR(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_UpdItemWARR_QNAME, BigDecimal.class, UpdItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Upd", name = "RORL", scope = UpdItem.class)
    public JAXBElement<BigDecimal> createUpdItemRORL(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_UpdItemRORL_QNAME, BigDecimal.class, UpdItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Upd", name = "MRTI", scope = UpdItem.class)
    public JAXBElement<BigDecimal> createUpdItemMRTI(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_UpdItemMRTI_QNAME, BigDecimal.class, UpdItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Upd", name = "REPR", scope = UpdItem.class)
    public JAXBElement<String> createUpdItemREPR(String value) {
        return new JAXBElement<String>(_UpdItemREPR_QNAME, String.class, UpdItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Upd", name = "MRDT", scope = UpdItem.class)
    public JAXBElement<XMLGregorianCalendar> createUpdItemMRDT(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_UpdItemMRDT_QNAME, XMLGregorianCalendar.class, UpdItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Upd", name = "EQTI", scope = UpdItem.class)
    public JAXBElement<BigDecimal> createUpdItemEQTI(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_UpdItemEQTI_QNAME, BigDecimal.class, UpdItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Upd", name = "MVA3", scope = UpdItem.class)
    public JAXBElement<BigDecimal> createUpdItemMVA3(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_UpdItemMVA3_QNAME, BigDecimal.class, UpdItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Upd", name = "MVA2", scope = UpdItem.class)
    public JAXBElement<BigDecimal> createUpdItemMVA2(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_UpdItemMVA2_QNAME, BigDecimal.class, UpdItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Upd", name = "MVA1", scope = UpdItem.class)
    public JAXBElement<BigDecimal> createUpdItemMVA1(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_UpdItemMVA1_QNAME, BigDecimal.class, UpdItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Upd", name = "MVA0", scope = UpdItem.class)
    public JAXBElement<BigDecimal> createUpdItemMVA0(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_UpdItemMVA0_QNAME, BigDecimal.class, UpdItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Upd", name = "BRDT", scope = UpdItem.class)
    public JAXBElement<XMLGregorianCalendar> createUpdItemBRDT(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_UpdItemBRDT_QNAME, XMLGregorianCalendar.class, UpdItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Upd", name = "BRTI", scope = UpdItem.class)
    public JAXBElement<BigDecimal> createUpdItemBRTI(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_UpdItemBRTI_QNAME, BigDecimal.class, UpdItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Upd", name = "MVA4", scope = UpdItem.class)
    public JAXBElement<BigDecimal> createUpdItemMVA4(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_UpdItemMVA4_QNAME, BigDecimal.class, UpdItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Upd", name = "STRT", scope = UpdItem.class)
    public JAXBElement<String> createUpdItemSTRT(String value) {
        return new JAXBElement<String>(_UpdItemSTRT_QNAME, String.class, UpdItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Upd", name = "ERQT", scope = UpdItem.class)
    public JAXBElement<BigDecimal> createUpdItemERQT(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_UpdItemERQT_QNAME, BigDecimal.class, UpdItem.class, value);
    }

}
