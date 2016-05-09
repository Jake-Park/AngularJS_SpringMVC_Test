
package au.com.tmha.mos070mi.updoperation;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.com.tmha.mos070mi.updoperation package. 
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

    private final static QName _UpdOperation_QNAME = new QName("http://www.tmha.com.au/MOS070MI/UpdOperation", "UpdOperation");
    private final static QName _UpdOperationResponse_QNAME = new QName("http://www.tmha.com.au/MOS070MI/UpdOperation", "UpdOperationResponse");
    private final static QName _UpdOperationItemPCTP_QNAME = new QName("http://www.tmha.com.au/MOS070MI/UpdOperation", "PCTP");
    private final static QName _UpdOperationItemRTM1_QNAME = new QName("http://www.tmha.com.au/MOS070MI/UpdOperation", "RTM1");
    private final static QName _UpdOperationItemDPLG_QNAME = new QName("http://www.tmha.com.au/MOS070MI/UpdOperation", "DPLG");
    private final static QName _UpdOperationItemMAQA_QNAME = new QName("http://www.tmha.com.au/MOS070MI/UpdOperation", "MAQA");
    private final static QName _UpdOperationItemUSET_QNAME = new QName("http://www.tmha.com.au/MOS070MI/UpdOperation", "USET");
    private final static QName _UpdOperationItemTXID_QNAME = new QName("http://www.tmha.com.au/MOS070MI/UpdOperation", "TXID");
    private final static QName _UpdOperationItemSCQA_QNAME = new QName("http://www.tmha.com.au/MOS070MI/UpdOperation", "SCQA");
    private final static QName _UpdOperationItemSTRT_QNAME = new QName("http://www.tmha.com.au/MOS070MI/UpdOperation", "STRT");
    private final static QName _UpdOperationItemCONO_QNAME = new QName("http://www.tmha.com.au/MOS070MI/UpdOperation", "CONO");
    private final static QName _UpdOperationItemDOWT_QNAME = new QName("http://www.tmha.com.au/MOS070MI/UpdOperation", "DOWT");
    private final static QName _UpdOperationItemREND_QNAME = new QName("http://www.tmha.com.au/MOS070MI/UpdOperation", "REND");
    private final static QName _UpdOperationItemUPIT_QNAME = new QName("http://www.tmha.com.au/MOS070MI/UpdOperation", "UPIT");
    private final static QName _UpdOperationItemCLBL_QNAME = new QName("http://www.tmha.com.au/MOS070MI/UpdOperation", "CLBL");
    private final static QName _UpdOperationItemLCDE_QNAME = new QName("http://www.tmha.com.au/MOS070MI/UpdOperation", "LCDE");
    private final static QName _UpdOperationItemSCRE_QNAME = new QName("http://www.tmha.com.au/MOS070MI/UpdOperation", "SCRE");
    private final static QName _UpdOperationItemRPRE_QNAME = new QName("http://www.tmha.com.au/MOS070MI/UpdOperation", "RPRE");
    private final static QName _UpdOperationItemREMK_QNAME = new QName("http://www.tmha.com.au/MOS070MI/UpdOperation", "REMK");
    private final static QName _UpdOperationItemUMAT_QNAME = new QName("http://www.tmha.com.au/MOS070MI/UpdOperation", "UMAT");
    private final static QName _UpdOperationItemINFR_QNAME = new QName("http://www.tmha.com.au/MOS070MI/UpdOperation", "INFR");
    private final static QName _UpdOperationItemUMAS_QNAME = new QName("http://www.tmha.com.au/MOS070MI/UpdOperation", "UMAS");
    private final static QName _UpdOperationItemFCL3_QNAME = new QName("http://www.tmha.com.au/MOS070MI/UpdOperation", "FCL3");
    private final static QName _UpdOperationItemRPDT_QNAME = new QName("http://www.tmha.com.au/MOS070MI/UpdOperation", "RPDT");
    private final static QName _UpdOperationItemFCL2_QNAME = new QName("http://www.tmha.com.au/MOS070MI/UpdOperation", "FCL2");
    private final static QName _UpdOperationItemEMNO_QNAME = new QName("http://www.tmha.com.au/MOS070MI/UpdOperation", "EMNO");
    private final static QName _UpdOperationItemDLY2_QNAME = new QName("http://www.tmha.com.au/MOS070MI/UpdOperation", "DLY2");
    private final static QName _UpdOperationItemDLY1_QNAME = new QName("http://www.tmha.com.au/MOS070MI/UpdOperation", "DLY1");
    private final static QName _UpdOperationItemTXL2_QNAME = new QName("http://www.tmha.com.au/MOS070MI/UpdOperation", "TXL2");
    private final static QName _UpdOperationItemSUFI_QNAME = new QName("http://www.tmha.com.au/MOS070MI/UpdOperation", "SUFI");
    private final static QName _UpdOperationItemFCLA_QNAME = new QName("http://www.tmha.com.au/MOS070MI/UpdOperation", "FCLA");
    private final static QName _UpdOperationItemTXL1_QNAME = new QName("http://www.tmha.com.au/MOS070MI/UpdOperation", "TXL1");
    private final static QName _UpdOperationItemEQNO_QNAME = new QName("http://www.tmha.com.au/MOS070MI/UpdOperation", "EQNO");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.com.tmha.mos070mi.updoperation
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UpdOperationCollection }
     * 
     */
    public UpdOperationCollection createUpdOperationCollection() {
        return new UpdOperationCollection();
    }

    /**
     * Create an instance of {@link UpdOperationResponseCollection }
     * 
     */
    public UpdOperationResponseCollection createUpdOperationResponseCollection() {
        return new UpdOperationResponseCollection();
    }

    /**
     * Create an instance of {@link UpdOperationItem }
     * 
     */
    public UpdOperationItem createUpdOperationItem() {
        return new UpdOperationItem();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdOperationCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS070MI/UpdOperation", name = "UpdOperation")
    public JAXBElement<UpdOperationCollection> createUpdOperation(UpdOperationCollection value) {
        return new JAXBElement<UpdOperationCollection>(_UpdOperation_QNAME, UpdOperationCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdOperationResponseCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS070MI/UpdOperation", name = "UpdOperationResponse")
    public JAXBElement<UpdOperationResponseCollection> createUpdOperationResponse(UpdOperationResponseCollection value) {
        return new JAXBElement<UpdOperationResponseCollection>(_UpdOperationResponse_QNAME, UpdOperationResponseCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS070MI/UpdOperation", name = "PCTP", scope = UpdOperationItem.class)
    public JAXBElement<String> createUpdOperationItemPCTP(String value) {
        return new JAXBElement<String>(_UpdOperationItemPCTP_QNAME, String.class, UpdOperationItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS070MI/UpdOperation", name = "RTM1", scope = UpdOperationItem.class)
    public JAXBElement<BigDecimal> createUpdOperationItemRTM1(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_UpdOperationItemRTM1_QNAME, BigDecimal.class, UpdOperationItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS070MI/UpdOperation", name = "DPLG", scope = UpdOperationItem.class)
    public JAXBElement<String> createUpdOperationItemDPLG(String value) {
        return new JAXBElement<String>(_UpdOperationItemDPLG_QNAME, String.class, UpdOperationItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS070MI/UpdOperation", name = "MAQA", scope = UpdOperationItem.class)
    public JAXBElement<BigDecimal> createUpdOperationItemMAQA(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_UpdOperationItemMAQA_QNAME, BigDecimal.class, UpdOperationItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS070MI/UpdOperation", name = "USET", scope = UpdOperationItem.class)
    public JAXBElement<BigDecimal> createUpdOperationItemUSET(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_UpdOperationItemUSET_QNAME, BigDecimal.class, UpdOperationItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS070MI/UpdOperation", name = "TXID", scope = UpdOperationItem.class)
    public JAXBElement<BigDecimal> createUpdOperationItemTXID(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_UpdOperationItemTXID_QNAME, BigDecimal.class, UpdOperationItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS070MI/UpdOperation", name = "SCQA", scope = UpdOperationItem.class)
    public JAXBElement<BigDecimal> createUpdOperationItemSCQA(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_UpdOperationItemSCQA_QNAME, BigDecimal.class, UpdOperationItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS070MI/UpdOperation", name = "STRT", scope = UpdOperationItem.class)
    public JAXBElement<String> createUpdOperationItemSTRT(String value) {
        return new JAXBElement<String>(_UpdOperationItemSTRT_QNAME, String.class, UpdOperationItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS070MI/UpdOperation", name = "CONO", scope = UpdOperationItem.class)
    public JAXBElement<BigDecimal> createUpdOperationItemCONO(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_UpdOperationItemCONO_QNAME, BigDecimal.class, UpdOperationItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS070MI/UpdOperation", name = "DOWT", scope = UpdOperationItem.class)
    public JAXBElement<BigDecimal> createUpdOperationItemDOWT(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_UpdOperationItemDOWT_QNAME, BigDecimal.class, UpdOperationItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS070MI/UpdOperation", name = "REND", scope = UpdOperationItem.class)
    public JAXBElement<BigDecimal> createUpdOperationItemREND(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_UpdOperationItemREND_QNAME, BigDecimal.class, UpdOperationItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS070MI/UpdOperation", name = "UPIT", scope = UpdOperationItem.class)
    public JAXBElement<BigDecimal> createUpdOperationItemUPIT(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_UpdOperationItemUPIT_QNAME, BigDecimal.class, UpdOperationItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS070MI/UpdOperation", name = "CLBL", scope = UpdOperationItem.class)
    public JAXBElement<BigDecimal> createUpdOperationItemCLBL(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_UpdOperationItemCLBL_QNAME, BigDecimal.class, UpdOperationItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS070MI/UpdOperation", name = "LCDE", scope = UpdOperationItem.class)
    public JAXBElement<String> createUpdOperationItemLCDE(String value) {
        return new JAXBElement<String>(_UpdOperationItemLCDE_QNAME, String.class, UpdOperationItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS070MI/UpdOperation", name = "SCRE", scope = UpdOperationItem.class)
    public JAXBElement<String> createUpdOperationItemSCRE(String value) {
        return new JAXBElement<String>(_UpdOperationItemSCRE_QNAME, String.class, UpdOperationItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS070MI/UpdOperation", name = "RPRE", scope = UpdOperationItem.class)
    public JAXBElement<String> createUpdOperationItemRPRE(String value) {
        return new JAXBElement<String>(_UpdOperationItemRPRE_QNAME, String.class, UpdOperationItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS070MI/UpdOperation", name = "REMK", scope = UpdOperationItem.class)
    public JAXBElement<String> createUpdOperationItemREMK(String value) {
        return new JAXBElement<String>(_UpdOperationItemREMK_QNAME, String.class, UpdOperationItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS070MI/UpdOperation", name = "UMAT", scope = UpdOperationItem.class)
    public JAXBElement<BigDecimal> createUpdOperationItemUMAT(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_UpdOperationItemUMAT_QNAME, BigDecimal.class, UpdOperationItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS070MI/UpdOperation", name = "INFR", scope = UpdOperationItem.class)
    public JAXBElement<BigDecimal> createUpdOperationItemINFR(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_UpdOperationItemINFR_QNAME, BigDecimal.class, UpdOperationItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS070MI/UpdOperation", name = "UMAS", scope = UpdOperationItem.class)
    public JAXBElement<BigDecimal> createUpdOperationItemUMAS(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_UpdOperationItemUMAS_QNAME, BigDecimal.class, UpdOperationItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS070MI/UpdOperation", name = "FCL3", scope = UpdOperationItem.class)
    public JAXBElement<String> createUpdOperationItemFCL3(String value) {
        return new JAXBElement<String>(_UpdOperationItemFCL3_QNAME, String.class, UpdOperationItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS070MI/UpdOperation", name = "RPDT", scope = UpdOperationItem.class)
    public JAXBElement<XMLGregorianCalendar> createUpdOperationItemRPDT(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_UpdOperationItemRPDT_QNAME, XMLGregorianCalendar.class, UpdOperationItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS070MI/UpdOperation", name = "FCL2", scope = UpdOperationItem.class)
    public JAXBElement<String> createUpdOperationItemFCL2(String value) {
        return new JAXBElement<String>(_UpdOperationItemFCL2_QNAME, String.class, UpdOperationItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS070MI/UpdOperation", name = "EMNO", scope = UpdOperationItem.class)
    public JAXBElement<String> createUpdOperationItemEMNO(String value) {
        return new JAXBElement<String>(_UpdOperationItemEMNO_QNAME, String.class, UpdOperationItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS070MI/UpdOperation", name = "DLY2", scope = UpdOperationItem.class)
    public JAXBElement<BigDecimal> createUpdOperationItemDLY2(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_UpdOperationItemDLY2_QNAME, BigDecimal.class, UpdOperationItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS070MI/UpdOperation", name = "DLY1", scope = UpdOperationItem.class)
    public JAXBElement<BigDecimal> createUpdOperationItemDLY1(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_UpdOperationItemDLY1_QNAME, BigDecimal.class, UpdOperationItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS070MI/UpdOperation", name = "TXL2", scope = UpdOperationItem.class)
    public JAXBElement<String> createUpdOperationItemTXL2(String value) {
        return new JAXBElement<String>(_UpdOperationItemTXL2_QNAME, String.class, UpdOperationItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS070MI/UpdOperation", name = "SUFI", scope = UpdOperationItem.class)
    public JAXBElement<String> createUpdOperationItemSUFI(String value) {
        return new JAXBElement<String>(_UpdOperationItemSUFI_QNAME, String.class, UpdOperationItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS070MI/UpdOperation", name = "FCLA", scope = UpdOperationItem.class)
    public JAXBElement<String> createUpdOperationItemFCLA(String value) {
        return new JAXBElement<String>(_UpdOperationItemFCLA_QNAME, String.class, UpdOperationItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS070MI/UpdOperation", name = "TXL1", scope = UpdOperationItem.class)
    public JAXBElement<String> createUpdOperationItemTXL1(String value) {
        return new JAXBElement<String>(_UpdOperationItemTXL1_QNAME, String.class, UpdOperationItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS070MI/UpdOperation", name = "EQNO", scope = UpdOperationItem.class)
    public JAXBElement<String> createUpdOperationItemEQNO(String value) {
        return new JAXBElement<String>(_UpdOperationItemEQNO_QNAME, String.class, UpdOperationItem.class, value);
    }

}
