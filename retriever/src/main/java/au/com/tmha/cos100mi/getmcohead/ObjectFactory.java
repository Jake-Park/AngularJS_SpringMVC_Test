
package au.com.tmha.cos100mi.getmcohead;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.com.tmha.cos100mi.getmcohead package. 
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

    private final static QName _GetMCOHeadResponse_QNAME = new QName("http://www.tmha.com.au/COS100MI/GetMCOHead", "GetMCOHeadResponse");
    private final static QName _GetMCOHead_QNAME = new QName("http://www.tmha.com.au/COS100MI/GetMCOHead", "GetMCOHead");
    private final static QName _GetMCOHeadItemCompany_QNAME = new QName("http://www.tmha.com.au/COS100MI/GetMCOHead", "Company");
    private final static QName _GetMCOHeadItemCustomerOrderNumber_QNAME = new QName("http://www.tmha.com.au/COS100MI/GetMCOHead", "CustomerOrderNumber");
    private final static QName _GetMCOHeadResponseItemProduct_QNAME = new QName("http://www.tmha.com.au/COS100MI/GetMCOHead", "Product");
    private final static QName _GetMCOHeadResponseItemPlannedDeliveryDate_QNAME = new QName("http://www.tmha.com.au/COS100MI/GetMCOHead", "PlannedDeliveryDate");
    private final static QName _GetMCOHeadResponseItemCustomer_QNAME = new QName("http://www.tmha.com.au/COS100MI/GetMCOHead", "Customer");
    private final static QName _GetMCOHeadResponseItemResponsible_QNAME = new QName("http://www.tmha.com.au/COS100MI/GetMCOHead", "Responsible");
    private final static QName _GetMCOHeadResponseItemOrderDate_QNAME = new QName("http://www.tmha.com.au/COS100MI/GetMCOHead", "OrderDate");
    private final static QName _GetMCOHeadResponseItemActualDeliveryDate_QNAME = new QName("http://www.tmha.com.au/COS100MI/GetMCOHead", "ActualDeliveryDate");
    private final static QName _GetMCOHeadResponseItemPlannedDeliveryTime_QNAME = new QName("http://www.tmha.com.au/COS100MI/GetMCOHead", "PlannedDeliveryTime");
    private final static QName _GetMCOHeadResponseItemPriority_QNAME = new QName("http://www.tmha.com.au/COS100MI/GetMCOHead", "Priority");
    private final static QName _GetMCOHeadResponseItemActualStartDate_QNAME = new QName("http://www.tmha.com.au/COS100MI/GetMCOHead", "ActualStartDate");
    private final static QName _GetMCOHeadResponseItemFacility_QNAME = new QName("http://www.tmha.com.au/COS100MI/GetMCOHead", "Facility");
    private final static QName _GetMCOHeadResponseItemName_QNAME = new QName("http://www.tmha.com.au/COS100MI/GetMCOHead", "Name");
    private final static QName _GetMCOHeadResponseItemPaymentTerms_QNAME = new QName("http://www.tmha.com.au/COS100MI/GetMCOHead", "PaymentTerms");
    private final static QName _GetMCOHeadResponseItemActualDeliveryTime_QNAME = new QName("http://www.tmha.com.au/COS100MI/GetMCOHead", "ActualDeliveryTime");
    private final static QName _GetMCOHeadResponseItemActualStartTime_QNAME = new QName("http://www.tmha.com.au/COS100MI/GetMCOHead", "ActualStartTime");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.com.tmha.cos100mi.getmcohead
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetMCOHeadResponseCollection }
     * 
     */
    public GetMCOHeadResponseCollection createGetMCOHeadResponseCollection() {
        return new GetMCOHeadResponseCollection();
    }

    /**
     * Create an instance of {@link GetMCOHeadCollection }
     * 
     */
    public GetMCOHeadCollection createGetMCOHeadCollection() {
        return new GetMCOHeadCollection();
    }

    /**
     * Create an instance of {@link GetMCOHeadItem }
     * 
     */
    public GetMCOHeadItem createGetMCOHeadItem() {
        return new GetMCOHeadItem();
    }

    /**
     * Create an instance of {@link GetMCOHeadResponseItem }
     * 
     */
    public GetMCOHeadResponseItem createGetMCOHeadResponseItem() {
        return new GetMCOHeadResponseItem();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMCOHeadResponseCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/COS100MI/GetMCOHead", name = "GetMCOHeadResponse")
    public JAXBElement<GetMCOHeadResponseCollection> createGetMCOHeadResponse(GetMCOHeadResponseCollection value) {
        return new JAXBElement<GetMCOHeadResponseCollection>(_GetMCOHeadResponse_QNAME, GetMCOHeadResponseCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMCOHeadCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/COS100MI/GetMCOHead", name = "GetMCOHead")
    public JAXBElement<GetMCOHeadCollection> createGetMCOHead(GetMCOHeadCollection value) {
        return new JAXBElement<GetMCOHeadCollection>(_GetMCOHead_QNAME, GetMCOHeadCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/COS100MI/GetMCOHead", name = "Company", scope = GetMCOHeadItem.class)
    public JAXBElement<BigDecimal> createGetMCOHeadItemCompany(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GetMCOHeadItemCompany_QNAME, BigDecimal.class, GetMCOHeadItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/COS100MI/GetMCOHead", name = "CustomerOrderNumber", scope = GetMCOHeadItem.class)
    public JAXBElement<String> createGetMCOHeadItemCustomerOrderNumber(String value) {
        return new JAXBElement<String>(_GetMCOHeadItemCustomerOrderNumber_QNAME, String.class, GetMCOHeadItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/COS100MI/GetMCOHead", name = "Product", scope = GetMCOHeadResponseItem.class)
    public JAXBElement<String> createGetMCOHeadResponseItemProduct(String value) {
        return new JAXBElement<String>(_GetMCOHeadResponseItemProduct_QNAME, String.class, GetMCOHeadResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/COS100MI/GetMCOHead", name = "PlannedDeliveryDate", scope = GetMCOHeadResponseItem.class)
    public JAXBElement<XMLGregorianCalendar> createGetMCOHeadResponseItemPlannedDeliveryDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GetMCOHeadResponseItemPlannedDeliveryDate_QNAME, XMLGregorianCalendar.class, GetMCOHeadResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/COS100MI/GetMCOHead", name = "Customer", scope = GetMCOHeadResponseItem.class)
    public JAXBElement<String> createGetMCOHeadResponseItemCustomer(String value) {
        return new JAXBElement<String>(_GetMCOHeadResponseItemCustomer_QNAME, String.class, GetMCOHeadResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/COS100MI/GetMCOHead", name = "Responsible", scope = GetMCOHeadResponseItem.class)
    public JAXBElement<String> createGetMCOHeadResponseItemResponsible(String value) {
        return new JAXBElement<String>(_GetMCOHeadResponseItemResponsible_QNAME, String.class, GetMCOHeadResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/COS100MI/GetMCOHead", name = "OrderDate", scope = GetMCOHeadResponseItem.class)
    public JAXBElement<XMLGregorianCalendar> createGetMCOHeadResponseItemOrderDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GetMCOHeadResponseItemOrderDate_QNAME, XMLGregorianCalendar.class, GetMCOHeadResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/COS100MI/GetMCOHead", name = "ActualDeliveryDate", scope = GetMCOHeadResponseItem.class)
    public JAXBElement<XMLGregorianCalendar> createGetMCOHeadResponseItemActualDeliveryDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GetMCOHeadResponseItemActualDeliveryDate_QNAME, XMLGregorianCalendar.class, GetMCOHeadResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/COS100MI/GetMCOHead", name = "PlannedDeliveryTime", scope = GetMCOHeadResponseItem.class)
    public JAXBElement<BigDecimal> createGetMCOHeadResponseItemPlannedDeliveryTime(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GetMCOHeadResponseItemPlannedDeliveryTime_QNAME, BigDecimal.class, GetMCOHeadResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/COS100MI/GetMCOHead", name = "Priority", scope = GetMCOHeadResponseItem.class)
    public JAXBElement<BigDecimal> createGetMCOHeadResponseItemPriority(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GetMCOHeadResponseItemPriority_QNAME, BigDecimal.class, GetMCOHeadResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/COS100MI/GetMCOHead", name = "CustomerOrderNumber", scope = GetMCOHeadResponseItem.class)
    public JAXBElement<String> createGetMCOHeadResponseItemCustomerOrderNumber(String value) {
        return new JAXBElement<String>(_GetMCOHeadItemCustomerOrderNumber_QNAME, String.class, GetMCOHeadResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/COS100MI/GetMCOHead", name = "ActualStartDate", scope = GetMCOHeadResponseItem.class)
    public JAXBElement<XMLGregorianCalendar> createGetMCOHeadResponseItemActualStartDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GetMCOHeadResponseItemActualStartDate_QNAME, XMLGregorianCalendar.class, GetMCOHeadResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/COS100MI/GetMCOHead", name = "Facility", scope = GetMCOHeadResponseItem.class)
    public JAXBElement<String> createGetMCOHeadResponseItemFacility(String value) {
        return new JAXBElement<String>(_GetMCOHeadResponseItemFacility_QNAME, String.class, GetMCOHeadResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/COS100MI/GetMCOHead", name = "Name", scope = GetMCOHeadResponseItem.class)
    public JAXBElement<String> createGetMCOHeadResponseItemName(String value) {
        return new JAXBElement<String>(_GetMCOHeadResponseItemName_QNAME, String.class, GetMCOHeadResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/COS100MI/GetMCOHead", name = "PaymentTerms", scope = GetMCOHeadResponseItem.class)
    public JAXBElement<String> createGetMCOHeadResponseItemPaymentTerms(String value) {
        return new JAXBElement<String>(_GetMCOHeadResponseItemPaymentTerms_QNAME, String.class, GetMCOHeadResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/COS100MI/GetMCOHead", name = "ActualDeliveryTime", scope = GetMCOHeadResponseItem.class)
    public JAXBElement<BigDecimal> createGetMCOHeadResponseItemActualDeliveryTime(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GetMCOHeadResponseItemActualDeliveryTime_QNAME, BigDecimal.class, GetMCOHeadResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/COS100MI/GetMCOHead", name = "ActualStartTime", scope = GetMCOHeadResponseItem.class)
    public JAXBElement<BigDecimal> createGetMCOHeadResponseItemActualStartTime(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GetMCOHeadResponseItemActualStartTime_QNAME, BigDecimal.class, GetMCOHeadResponseItem.class, value);
    }

}
