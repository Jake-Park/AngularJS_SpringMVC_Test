
package au.com.tmha.crs610mi.getaddress;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.com.tmha.crs610mi.getaddress package. 
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

    private final static QName _GetAddressResponse_QNAME = new QName("http://www.tmha.com.au/CRS610MI/GetAddress", "GetAddressResponse");
    private final static QName _GetAddress_QNAME = new QName("http://www.tmha.com.au/CRS610MI/GetAddress", "GetAddress");
    private final static QName _GetAddressItemCompany_QNAME = new QName("http://www.tmha.com.au/CRS610MI/GetAddress", "Company");
    private final static QName _GetAddressResponseItemCountry_QNAME = new QName("http://www.tmha.com.au/CRS610MI/GetAddress", "Country");
    private final static QName _GetAddressResponseItemCustomerName_QNAME = new QName("http://www.tmha.com.au/CRS610MI/GetAddress", "CustomerName");
    private final static QName _GetAddressResponseItemCity_QNAME = new QName("http://www.tmha.com.au/CRS610MI/GetAddress", "City");
    private final static QName _GetAddressResponseItemAddressCategory_QNAME = new QName("http://www.tmha.com.au/CRS610MI/GetAddress", "AddressCategory");
    private final static QName _GetAddressResponseItemAreaState_QNAME = new QName("http://www.tmha.com.au/CRS610MI/GetAddress", "AreaState");
    private final static QName _GetAddressResponseItemYourReference_QNAME = new QName("http://www.tmha.com.au/CRS610MI/GetAddress", "YourReference");
    private final static QName _GetAddressResponseItemEANLocationCode_QNAME = new QName("http://www.tmha.com.au/CRS610MI/GetAddress", "EANLocationCode");
    private final static QName _GetAddressResponseItemCustomerAddress1_QNAME = new QName("http://www.tmha.com.au/CRS610MI/GetAddress", "CustomerAddress1");
    private final static QName _GetAddressResponseItemTermsText_QNAME = new QName("http://www.tmha.com.au/CRS610MI/GetAddress", "TermsText");
    private final static QName _GetAddressResponseItemDivision_QNAME = new QName("http://www.tmha.com.au/CRS610MI/GetAddress", "Division");
    private final static QName _GetAddressResponseItemTelephoneNumber1_QNAME = new QName("http://www.tmha.com.au/CRS610MI/GetAddress", "TelephoneNumber1");
    private final static QName _GetAddressResponseItemPlace_QNAME = new QName("http://www.tmha.com.au/CRS610MI/GetAddress", "Place");
    private final static QName _GetAddressResponseItemCustomerAddress4_QNAME = new QName("http://www.tmha.com.au/CRS610MI/GetAddress", "CustomerAddress4");
    private final static QName _GetAddressResponseItemCustomerAddress3_QNAME = new QName("http://www.tmha.com.au/CRS610MI/GetAddress", "CustomerAddress3");
    private final static QName _GetAddressResponseItemPostalCode_QNAME = new QName("http://www.tmha.com.au/CRS610MI/GetAddress", "postalCode");
    private final static QName _GetAddressResponseItemCustomerAddress2_QNAME = new QName("http://www.tmha.com.au/CRS610MI/GetAddress", "CustomerAddress2");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.com.tmha.crs610mi.getaddress
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAddressCollection }
     * 
     */
    public GetAddressCollection createGetAddressCollection() {
        return new GetAddressCollection();
    }

    /**
     * Create an instance of {@link GetAddressResponseCollection }
     * 
     */
    public GetAddressResponseCollection createGetAddressResponseCollection() {
        return new GetAddressResponseCollection();
    }

    /**
     * Create an instance of {@link GetAddressResponseItem }
     * 
     */
    public GetAddressResponseItem createGetAddressResponseItem() {
        return new GetAddressResponseItem();
    }

    /**
     * Create an instance of {@link GetAddressItem }
     * 
     */
    public GetAddressItem createGetAddressItem() {
        return new GetAddressItem();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAddressResponseCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/CRS610MI/GetAddress", name = "GetAddressResponse")
    public JAXBElement<GetAddressResponseCollection> createGetAddressResponse(GetAddressResponseCollection value) {
        return new JAXBElement<GetAddressResponseCollection>(_GetAddressResponse_QNAME, GetAddressResponseCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAddressCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/CRS610MI/GetAddress", name = "GetAddress")
    public JAXBElement<GetAddressCollection> createGetAddress(GetAddressCollection value) {
        return new JAXBElement<GetAddressCollection>(_GetAddress_QNAME, GetAddressCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/CRS610MI/GetAddress", name = "Company", scope = GetAddressItem.class)
    public JAXBElement<BigDecimal> createGetAddressItemCompany(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GetAddressItemCompany_QNAME, BigDecimal.class, GetAddressItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/CRS610MI/GetAddress", name = "Country", scope = GetAddressResponseItem.class)
    public JAXBElement<String> createGetAddressResponseItemCountry(String value) {
        return new JAXBElement<String>(_GetAddressResponseItemCountry_QNAME, String.class, GetAddressResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/CRS610MI/GetAddress", name = "CustomerName", scope = GetAddressResponseItem.class)
    public JAXBElement<String> createGetAddressResponseItemCustomerName(String value) {
        return new JAXBElement<String>(_GetAddressResponseItemCustomerName_QNAME, String.class, GetAddressResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/CRS610MI/GetAddress", name = "City", scope = GetAddressResponseItem.class)
    public JAXBElement<String> createGetAddressResponseItemCity(String value) {
        return new JAXBElement<String>(_GetAddressResponseItemCity_QNAME, String.class, GetAddressResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/CRS610MI/GetAddress", name = "AddressCategory", scope = GetAddressResponseItem.class)
    public JAXBElement<String> createGetAddressResponseItemAddressCategory(String value) {
        return new JAXBElement<String>(_GetAddressResponseItemAddressCategory_QNAME, String.class, GetAddressResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/CRS610MI/GetAddress", name = "AreaState", scope = GetAddressResponseItem.class)
    public JAXBElement<String> createGetAddressResponseItemAreaState(String value) {
        return new JAXBElement<String>(_GetAddressResponseItemAreaState_QNAME, String.class, GetAddressResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/CRS610MI/GetAddress", name = "YourReference", scope = GetAddressResponseItem.class)
    public JAXBElement<String> createGetAddressResponseItemYourReference(String value) {
        return new JAXBElement<String>(_GetAddressResponseItemYourReference_QNAME, String.class, GetAddressResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/CRS610MI/GetAddress", name = "EANLocationCode", scope = GetAddressResponseItem.class)
    public JAXBElement<BigDecimal> createGetAddressResponseItemEANLocationCode(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GetAddressResponseItemEANLocationCode_QNAME, BigDecimal.class, GetAddressResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/CRS610MI/GetAddress", name = "CustomerAddress1", scope = GetAddressResponseItem.class)
    public JAXBElement<String> createGetAddressResponseItemCustomerAddress1(String value) {
        return new JAXBElement<String>(_GetAddressResponseItemCustomerAddress1_QNAME, String.class, GetAddressResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/CRS610MI/GetAddress", name = "TermsText", scope = GetAddressResponseItem.class)
    public JAXBElement<String> createGetAddressResponseItemTermsText(String value) {
        return new JAXBElement<String>(_GetAddressResponseItemTermsText_QNAME, String.class, GetAddressResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/CRS610MI/GetAddress", name = "Division", scope = GetAddressResponseItem.class)
    public JAXBElement<String> createGetAddressResponseItemDivision(String value) {
        return new JAXBElement<String>(_GetAddressResponseItemDivision_QNAME, String.class, GetAddressResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/CRS610MI/GetAddress", name = "TelephoneNumber1", scope = GetAddressResponseItem.class)
    public JAXBElement<String> createGetAddressResponseItemTelephoneNumber1(String value) {
        return new JAXBElement<String>(_GetAddressResponseItemTelephoneNumber1_QNAME, String.class, GetAddressResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/CRS610MI/GetAddress", name = "Place", scope = GetAddressResponseItem.class)
    public JAXBElement<String> createGetAddressResponseItemPlace(String value) {
        return new JAXBElement<String>(_GetAddressResponseItemPlace_QNAME, String.class, GetAddressResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/CRS610MI/GetAddress", name = "CustomerAddress4", scope = GetAddressResponseItem.class)
    public JAXBElement<String> createGetAddressResponseItemCustomerAddress4(String value) {
        return new JAXBElement<String>(_GetAddressResponseItemCustomerAddress4_QNAME, String.class, GetAddressResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/CRS610MI/GetAddress", name = "CustomerAddress3", scope = GetAddressResponseItem.class)
    public JAXBElement<String> createGetAddressResponseItemCustomerAddress3(String value) {
        return new JAXBElement<String>(_GetAddressResponseItemCustomerAddress3_QNAME, String.class, GetAddressResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/CRS610MI/GetAddress", name = "postalCode", scope = GetAddressResponseItem.class)
    public JAXBElement<String> createGetAddressResponseItemPostalCode(String value) {
        return new JAXBElement<String>(_GetAddressResponseItemPostalCode_QNAME, String.class, GetAddressResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/CRS610MI/GetAddress", name = "CustomerAddress2", scope = GetAddressResponseItem.class)
    public JAXBElement<String> createGetAddressResponseItemCustomerAddress2(String value) {
        return new JAXBElement<String>(_GetAddressResponseItemCustomerAddress2_QNAME, String.class, GetAddressResponseItem.class, value);
    }

}
