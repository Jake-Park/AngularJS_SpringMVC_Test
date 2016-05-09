
package au.com.tmha.cos100mi.lstmcolines;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.com.tmha.cos100mi.lstmcolines package. 
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

    private final static QName _LstMCOLines_QNAME = new QName("http://www.tmha.com.au/COS100MI/LstMCOLines", "LstMCOLines");
    private final static QName _LstMCOLinesResponse_QNAME = new QName("http://www.tmha.com.au/COS100MI/LstMCOLines", "LstMCOLinesResponse");
    private final static QName _LstMCOLinesResponseItemPlannedReceiptDate_QNAME = new QName("http://www.tmha.com.au/COS100MI/LstMCOLines", "PlannedReceiptDate");
    private final static QName _LstMCOLinesResponseItemActualDeliveryDate_QNAME = new QName("http://www.tmha.com.au/COS100MI/LstMCOLines", "ActualDeliveryDate");
    private final static QName _LstMCOLinesResponseItemPlannedDeliveryTime_QNAME = new QName("http://www.tmha.com.au/COS100MI/LstMCOLines", "PlannedDeliveryTime");
    private final static QName _LstMCOLinesResponseItemErrorCode1_QNAME = new QName("http://www.tmha.com.au/COS100MI/LstMCOLines", "ErrorCode1");
    private final static QName _LstMCOLinesResponseItemPlannedReceiptTime_QNAME = new QName("http://www.tmha.com.au/COS100MI/LstMCOLines", "PlannedReceiptTime");
    private final static QName _LstMCOLinesResponseItemService_QNAME = new QName("http://www.tmha.com.au/COS100MI/LstMCOLines", "Service");
    private final static QName _LstMCOLinesResponseItemPlannedDeliveryDate_QNAME = new QName("http://www.tmha.com.au/COS100MI/LstMCOLines", "PlannedDeliveryDate");
    private final static QName _LstMCOLinesResponseItemActualStartTime_QNAME = new QName("http://www.tmha.com.au/COS100MI/LstMCOLines", "ActualStartTime");
    private final static QName _LstMCOLinesResponseItemOrderLineNumber_QNAME = new QName("http://www.tmha.com.au/COS100MI/LstMCOLines", "OrderLineNumber");
    private final static QName _LstMCOLinesResponseItemTransactionQuantityBasicUM_QNAME = new QName("http://www.tmha.com.au/COS100MI/LstMCOLines", "TransactionQuantityBasicUM");
    private final static QName _LstMCOLinesResponseItemTransactionNumber_QNAME = new QName("http://www.tmha.com.au/COS100MI/LstMCOLines", "TransactionNumber");
    private final static QName _LstMCOLinesResponseItemItemNumber_QNAME = new QName("http://www.tmha.com.au/COS100MI/LstMCOLines", "ItemNumber");
    private final static QName _LstMCOLinesResponseItemOriginalQuantity_QNAME = new QName("http://www.tmha.com.au/COS100MI/LstMCOLines", "OriginalQuantity");
    private final static QName _LstMCOLinesResponseItemActualReceiptTime_QNAME = new QName("http://www.tmha.com.au/COS100MI/LstMCOLines", "ActualReceiptTime");
    private final static QName _LstMCOLinesResponseItemActualDeliveryTime_QNAME = new QName("http://www.tmha.com.au/COS100MI/LstMCOLines", "ActualDeliveryTime");
    private final static QName _LstMCOLinesResponseItemPayer_QNAME = new QName("http://www.tmha.com.au/COS100MI/LstMCOLines", "Payer");
    private final static QName _LstMCOLinesResponseItemActualReceiptDate_QNAME = new QName("http://www.tmha.com.au/COS100MI/LstMCOLines", "ActualReceiptDate");
    private final static QName _LstMCOLinesResponseItemName_QNAME = new QName("http://www.tmha.com.au/COS100MI/LstMCOLines", "Name");
    private final static QName _LstMCOLinesResponseItemSupplier_QNAME = new QName("http://www.tmha.com.au/COS100MI/LstMCOLines", "Supplier");
    private final static QName _LstMCOLinesResponseItemActualStartDate_QNAME = new QName("http://www.tmha.com.au/COS100MI/LstMCOLines", "ActualStartDate");
    private final static QName _LstMCOLinesItemCustomerOrderNumber_QNAME = new QName("http://www.tmha.com.au/COS100MI/LstMCOLines", "CustomerOrderNumber");
    private final static QName _LstMCOLinesItemCompany_QNAME = new QName("http://www.tmha.com.au/COS100MI/LstMCOLines", "Company");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.com.tmha.cos100mi.lstmcolines
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LstMCOLinesResponseCollection }
     * 
     */
    public LstMCOLinesResponseCollection createLstMCOLinesResponseCollection() {
        return new LstMCOLinesResponseCollection();
    }

    /**
     * Create an instance of {@link LstMCOLinesCollection }
     * 
     */
    public LstMCOLinesCollection createLstMCOLinesCollection() {
        return new LstMCOLinesCollection();
    }

    /**
     * Create an instance of {@link LstMCOLinesResponseItem }
     * 
     */
    public LstMCOLinesResponseItem createLstMCOLinesResponseItem() {
        return new LstMCOLinesResponseItem();
    }

    /**
     * Create an instance of {@link LstMCOLinesItem }
     * 
     */
    public LstMCOLinesItem createLstMCOLinesItem() {
        return new LstMCOLinesItem();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LstMCOLinesCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/COS100MI/LstMCOLines", name = "LstMCOLines")
    public JAXBElement<LstMCOLinesCollection> createLstMCOLines(LstMCOLinesCollection value) {
        return new JAXBElement<LstMCOLinesCollection>(_LstMCOLines_QNAME, LstMCOLinesCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LstMCOLinesResponseCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/COS100MI/LstMCOLines", name = "LstMCOLinesResponse")
    public JAXBElement<LstMCOLinesResponseCollection> createLstMCOLinesResponse(LstMCOLinesResponseCollection value) {
        return new JAXBElement<LstMCOLinesResponseCollection>(_LstMCOLinesResponse_QNAME, LstMCOLinesResponseCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/COS100MI/LstMCOLines", name = "PlannedReceiptDate", scope = LstMCOLinesResponseItem.class)
    public JAXBElement<XMLGregorianCalendar> createLstMCOLinesResponseItemPlannedReceiptDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_LstMCOLinesResponseItemPlannedReceiptDate_QNAME, XMLGregorianCalendar.class, LstMCOLinesResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/COS100MI/LstMCOLines", name = "ActualDeliveryDate", scope = LstMCOLinesResponseItem.class)
    public JAXBElement<XMLGregorianCalendar> createLstMCOLinesResponseItemActualDeliveryDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_LstMCOLinesResponseItemActualDeliveryDate_QNAME, XMLGregorianCalendar.class, LstMCOLinesResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/COS100MI/LstMCOLines", name = "PlannedDeliveryTime", scope = LstMCOLinesResponseItem.class)
    public JAXBElement<BigDecimal> createLstMCOLinesResponseItemPlannedDeliveryTime(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_LstMCOLinesResponseItemPlannedDeliveryTime_QNAME, BigDecimal.class, LstMCOLinesResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/COS100MI/LstMCOLines", name = "ErrorCode1", scope = LstMCOLinesResponseItem.class)
    public JAXBElement<String> createLstMCOLinesResponseItemErrorCode1(String value) {
        return new JAXBElement<String>(_LstMCOLinesResponseItemErrorCode1_QNAME, String.class, LstMCOLinesResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/COS100MI/LstMCOLines", name = "PlannedReceiptTime", scope = LstMCOLinesResponseItem.class)
    public JAXBElement<BigDecimal> createLstMCOLinesResponseItemPlannedReceiptTime(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_LstMCOLinesResponseItemPlannedReceiptTime_QNAME, BigDecimal.class, LstMCOLinesResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/COS100MI/LstMCOLines", name = "Service", scope = LstMCOLinesResponseItem.class)
    public JAXBElement<String> createLstMCOLinesResponseItemService(String value) {
        return new JAXBElement<String>(_LstMCOLinesResponseItemService_QNAME, String.class, LstMCOLinesResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/COS100MI/LstMCOLines", name = "PlannedDeliveryDate", scope = LstMCOLinesResponseItem.class)
    public JAXBElement<XMLGregorianCalendar> createLstMCOLinesResponseItemPlannedDeliveryDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_LstMCOLinesResponseItemPlannedDeliveryDate_QNAME, XMLGregorianCalendar.class, LstMCOLinesResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/COS100MI/LstMCOLines", name = "ActualStartTime", scope = LstMCOLinesResponseItem.class)
    public JAXBElement<BigDecimal> createLstMCOLinesResponseItemActualStartTime(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_LstMCOLinesResponseItemActualStartTime_QNAME, BigDecimal.class, LstMCOLinesResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/COS100MI/LstMCOLines", name = "OrderLineNumber", scope = LstMCOLinesResponseItem.class)
    public JAXBElement<BigDecimal> createLstMCOLinesResponseItemOrderLineNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_LstMCOLinesResponseItemOrderLineNumber_QNAME, BigDecimal.class, LstMCOLinesResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/COS100MI/LstMCOLines", name = "TransactionQuantityBasicUM", scope = LstMCOLinesResponseItem.class)
    public JAXBElement<BigDecimal> createLstMCOLinesResponseItemTransactionQuantityBasicUM(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_LstMCOLinesResponseItemTransactionQuantityBasicUM_QNAME, BigDecimal.class, LstMCOLinesResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/COS100MI/LstMCOLines", name = "TransactionNumber", scope = LstMCOLinesResponseItem.class)
    public JAXBElement<BigDecimal> createLstMCOLinesResponseItemTransactionNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_LstMCOLinesResponseItemTransactionNumber_QNAME, BigDecimal.class, LstMCOLinesResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/COS100MI/LstMCOLines", name = "ItemNumber", scope = LstMCOLinesResponseItem.class)
    public JAXBElement<String> createLstMCOLinesResponseItemItemNumber(String value) {
        return new JAXBElement<String>(_LstMCOLinesResponseItemItemNumber_QNAME, String.class, LstMCOLinesResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/COS100MI/LstMCOLines", name = "OriginalQuantity", scope = LstMCOLinesResponseItem.class)
    public JAXBElement<BigDecimal> createLstMCOLinesResponseItemOriginalQuantity(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_LstMCOLinesResponseItemOriginalQuantity_QNAME, BigDecimal.class, LstMCOLinesResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/COS100MI/LstMCOLines", name = "ActualReceiptTime", scope = LstMCOLinesResponseItem.class)
    public JAXBElement<BigDecimal> createLstMCOLinesResponseItemActualReceiptTime(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_LstMCOLinesResponseItemActualReceiptTime_QNAME, BigDecimal.class, LstMCOLinesResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/COS100MI/LstMCOLines", name = "ActualDeliveryTime", scope = LstMCOLinesResponseItem.class)
    public JAXBElement<BigDecimal> createLstMCOLinesResponseItemActualDeliveryTime(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_LstMCOLinesResponseItemActualDeliveryTime_QNAME, BigDecimal.class, LstMCOLinesResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/COS100MI/LstMCOLines", name = "Payer", scope = LstMCOLinesResponseItem.class)
    public JAXBElement<String> createLstMCOLinesResponseItemPayer(String value) {
        return new JAXBElement<String>(_LstMCOLinesResponseItemPayer_QNAME, String.class, LstMCOLinesResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/COS100MI/LstMCOLines", name = "ActualReceiptDate", scope = LstMCOLinesResponseItem.class)
    public JAXBElement<XMLGregorianCalendar> createLstMCOLinesResponseItemActualReceiptDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_LstMCOLinesResponseItemActualReceiptDate_QNAME, XMLGregorianCalendar.class, LstMCOLinesResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/COS100MI/LstMCOLines", name = "Name", scope = LstMCOLinesResponseItem.class)
    public JAXBElement<String> createLstMCOLinesResponseItemName(String value) {
        return new JAXBElement<String>(_LstMCOLinesResponseItemName_QNAME, String.class, LstMCOLinesResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/COS100MI/LstMCOLines", name = "Supplier", scope = LstMCOLinesResponseItem.class)
    public JAXBElement<String> createLstMCOLinesResponseItemSupplier(String value) {
        return new JAXBElement<String>(_LstMCOLinesResponseItemSupplier_QNAME, String.class, LstMCOLinesResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/COS100MI/LstMCOLines", name = "ActualStartDate", scope = LstMCOLinesResponseItem.class)
    public JAXBElement<XMLGregorianCalendar> createLstMCOLinesResponseItemActualStartDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_LstMCOLinesResponseItemActualStartDate_QNAME, XMLGregorianCalendar.class, LstMCOLinesResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/COS100MI/LstMCOLines", name = "CustomerOrderNumber", scope = LstMCOLinesItem.class)
    public JAXBElement<String> createLstMCOLinesItemCustomerOrderNumber(String value) {
        return new JAXBElement<String>(_LstMCOLinesItemCustomerOrderNumber_QNAME, String.class, LstMCOLinesItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/COS100MI/LstMCOLines", name = "Company", scope = LstMCOLinesItem.class)
    public JAXBElement<BigDecimal> createLstMCOLinesItemCompany(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_LstMCOLinesItemCompany_QNAME, BigDecimal.class, LstMCOLinesItem.class, value);
    }

}
