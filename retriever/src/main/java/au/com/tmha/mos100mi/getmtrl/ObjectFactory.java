
package au.com.tmha.mos100mi.getmtrl;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.com.tmha.mos100mi.getmtrl package. 
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

    private final static QName _GetMtrlResponse_QNAME = new QName("http://www.tmha.com.au/MOS100MI/GetMtrl", "GetMtrlResponse");
    private final static QName _GetMtrl_QNAME = new QName("http://www.tmha.com.au/MOS100MI/GetMtrl", "GetMtrl");
    private final static QName _GetMtrlResponseItemWarehouse_QNAME = new QName("http://www.tmha.com.au/MOS100MI/GetMtrl", "Warehouse");
    private final static QName _GetMtrlResponseItemMaterialStatus_QNAME = new QName("http://www.tmha.com.au/MOS100MI/GetMtrl", "MaterialStatus");
    private final static QName _GetMtrlResponseItemLotNumber_QNAME = new QName("http://www.tmha.com.au/MOS100MI/GetMtrl", "LotNumber");
    private final static QName _GetMtrlResponseItemReferenceOrderNumber_QNAME = new QName("http://www.tmha.com.au/MOS100MI/GetMtrl", "ReferenceOrderNumber");
    private final static QName _GetMtrlResponseItemOrderType_QNAME = new QName("http://www.tmha.com.au/MOS100MI/GetMtrl", "OrderType");
    private final static QName _GetMtrlResponseItemReferenceOrderCategory_QNAME = new QName("http://www.tmha.com.au/MOS100MI/GetMtrl", "ReferenceOrderCategory");
    private final static QName _GetMtrlResponseItemPlannedOrder_QNAME = new QName("http://www.tmha.com.au/MOS100MI/GetMtrl", "PlannedOrder");
    private final static QName _GetMtrlResponseItemWorkCenter_QNAME = new QName("http://www.tmha.com.au/MOS100MI/GetMtrl", "WorkCenter");
    private final static QName _GetMtrlResponseItemToLocation_QNAME = new QName("http://www.tmha.com.au/MOS100MI/GetMtrl", "ToLocation");
    private final static QName _GetMtrlResponseItemSalesPrice_QNAME = new QName("http://www.tmha.com.au/MOS100MI/GetMtrl", "SalesPrice");
    private final static QName _GetMtrlResponseItemReportedQuantity_QNAME = new QName("http://www.tmha.com.au/MOS100MI/GetMtrl", "ReportedQuantity");
    private final static QName _GetMtrlResponseItemOperationNumber_QNAME = new QName("http://www.tmha.com.au/MOS100MI/GetMtrl", "OperationNumber");
    private final static QName _GetMtrlResponseItemAddressNumber_QNAME = new QName("http://www.tmha.com.au/MOS100MI/GetMtrl", "AddressNumber");
    private final static QName _GetMtrlResponseItemSupplierNumber_QNAME = new QName("http://www.tmha.com.au/MOS100MI/GetMtrl", "SupplierNumber");
    private final static QName _GetMtrlResponseItemReservedQuantity_QNAME = new QName("http://www.tmha.com.au/MOS100MI/GetMtrl", "ReservedQuantity");
    private final static QName _GetMtrlResponseItemReceivedQuantity_QNAME = new QName("http://www.tmha.com.au/MOS100MI/GetMtrl", "ReceivedQuantity");
    private final static QName _GetMtrlResponseItemQuantity_QNAME = new QName("http://www.tmha.com.au/MOS100MI/GetMtrl", "Quantity");
    private final static QName _GetMtrlResponseItemAllocatedQuantityBasicUM_QNAME = new QName("http://www.tmha.com.au/MOS100MI/GetMtrl", "AllocatedQuantityBasicUM");
    private final static QName _GetMtrlResponseItemReportingNumber_QNAME = new QName("http://www.tmha.com.au/MOS100MI/GetMtrl", "ReportingNumber");
    private final static QName _GetMtrlResponseItemPriority_QNAME = new QName("http://www.tmha.com.au/MOS100MI/GetMtrl", "Priority");
    private final static QName _GetMtrlResponseItemProductNumber_QNAME = new QName("http://www.tmha.com.au/MOS100MI/GetMtrl", "ProductNumber");
    private final static QName _GetMtrlResponseItemFromWarehouse_QNAME = new QName("http://www.tmha.com.au/MOS100MI/GetMtrl", "FromWarehouse");
    private final static QName _GetMtrlResponseItemLocation_QNAME = new QName("http://www.tmha.com.au/MOS100MI/GetMtrl", "Location");
    private final static QName _GetMtrlResponseItemLineType_QNAME = new QName("http://www.tmha.com.au/MOS100MI/GetMtrl", "LineType");
    private final static QName _GetMtrlResponseItemText_QNAME = new QName("http://www.tmha.com.au/MOS100MI/GetMtrl", "Text");
    private final static QName _GetMtrlResponseItemReferenceOrderLine_QNAME = new QName("http://www.tmha.com.au/MOS100MI/GetMtrl", "ReferenceOrderLine");
    private final static QName _GetMtrlResponseItemAddressType_QNAME = new QName("http://www.tmha.com.au/MOS100MI/GetMtrl", "AddressType");
    private final static QName _GetMtrlResponseItemReportingDate_QNAME = new QName("http://www.tmha.com.au/MOS100MI/GetMtrl", "ReportingDate");
    private final static QName _GetMtrlItemYesNo_QNAME = new QName("http://www.tmha.com.au/MOS100MI/GetMtrl", "YesNo");
    private final static QName _GetMtrlItemRetriveCost_QNAME = new QName("http://www.tmha.com.au/MOS100MI/GetMtrl", "RetriveCost");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.com.tmha.mos100mi.getmtrl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetMtrlCollection }
     * 
     */
    public GetMtrlCollection createGetMtrlCollection() {
        return new GetMtrlCollection();
    }

    /**
     * Create an instance of {@link GetMtrlResponseCollection }
     * 
     */
    public GetMtrlResponseCollection createGetMtrlResponseCollection() {
        return new GetMtrlResponseCollection();
    }

    /**
     * Create an instance of {@link GetMtrlResponseItem }
     * 
     */
    public GetMtrlResponseItem createGetMtrlResponseItem() {
        return new GetMtrlResponseItem();
    }

    /**
     * Create an instance of {@link GetMtrlItem }
     * 
     */
    public GetMtrlItem createGetMtrlItem() {
        return new GetMtrlItem();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMtrlResponseCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/GetMtrl", name = "GetMtrlResponse")
    public JAXBElement<GetMtrlResponseCollection> createGetMtrlResponse(GetMtrlResponseCollection value) {
        return new JAXBElement<GetMtrlResponseCollection>(_GetMtrlResponse_QNAME, GetMtrlResponseCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMtrlCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/GetMtrl", name = "GetMtrl")
    public JAXBElement<GetMtrlCollection> createGetMtrl(GetMtrlCollection value) {
        return new JAXBElement<GetMtrlCollection>(_GetMtrl_QNAME, GetMtrlCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/GetMtrl", name = "Warehouse", scope = GetMtrlResponseItem.class)
    public JAXBElement<String> createGetMtrlResponseItemWarehouse(String value) {
        return new JAXBElement<String>(_GetMtrlResponseItemWarehouse_QNAME, String.class, GetMtrlResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/GetMtrl", name = "MaterialStatus", scope = GetMtrlResponseItem.class)
    public JAXBElement<String> createGetMtrlResponseItemMaterialStatus(String value) {
        return new JAXBElement<String>(_GetMtrlResponseItemMaterialStatus_QNAME, String.class, GetMtrlResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/GetMtrl", name = "LotNumber", scope = GetMtrlResponseItem.class)
    public JAXBElement<String> createGetMtrlResponseItemLotNumber(String value) {
        return new JAXBElement<String>(_GetMtrlResponseItemLotNumber_QNAME, String.class, GetMtrlResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/GetMtrl", name = "ReferenceOrderNumber", scope = GetMtrlResponseItem.class)
    public JAXBElement<String> createGetMtrlResponseItemReferenceOrderNumber(String value) {
        return new JAXBElement<String>(_GetMtrlResponseItemReferenceOrderNumber_QNAME, String.class, GetMtrlResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/GetMtrl", name = "OrderType", scope = GetMtrlResponseItem.class)
    public JAXBElement<String> createGetMtrlResponseItemOrderType(String value) {
        return new JAXBElement<String>(_GetMtrlResponseItemOrderType_QNAME, String.class, GetMtrlResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/GetMtrl", name = "ReferenceOrderCategory", scope = GetMtrlResponseItem.class)
    public JAXBElement<BigDecimal> createGetMtrlResponseItemReferenceOrderCategory(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GetMtrlResponseItemReferenceOrderCategory_QNAME, BigDecimal.class, GetMtrlResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/GetMtrl", name = "PlannedOrder", scope = GetMtrlResponseItem.class)
    public JAXBElement<BigDecimal> createGetMtrlResponseItemPlannedOrder(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GetMtrlResponseItemPlannedOrder_QNAME, BigDecimal.class, GetMtrlResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/GetMtrl", name = "WorkCenter", scope = GetMtrlResponseItem.class)
    public JAXBElement<String> createGetMtrlResponseItemWorkCenter(String value) {
        return new JAXBElement<String>(_GetMtrlResponseItemWorkCenter_QNAME, String.class, GetMtrlResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/GetMtrl", name = "ToLocation", scope = GetMtrlResponseItem.class)
    public JAXBElement<String> createGetMtrlResponseItemToLocation(String value) {
        return new JAXBElement<String>(_GetMtrlResponseItemToLocation_QNAME, String.class, GetMtrlResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/GetMtrl", name = "SalesPrice", scope = GetMtrlResponseItem.class)
    public JAXBElement<BigDecimal> createGetMtrlResponseItemSalesPrice(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GetMtrlResponseItemSalesPrice_QNAME, BigDecimal.class, GetMtrlResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/GetMtrl", name = "ReportedQuantity", scope = GetMtrlResponseItem.class)
    public JAXBElement<BigDecimal> createGetMtrlResponseItemReportedQuantity(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GetMtrlResponseItemReportedQuantity_QNAME, BigDecimal.class, GetMtrlResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/GetMtrl", name = "OperationNumber", scope = GetMtrlResponseItem.class)
    public JAXBElement<BigDecimal> createGetMtrlResponseItemOperationNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GetMtrlResponseItemOperationNumber_QNAME, BigDecimal.class, GetMtrlResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/GetMtrl", name = "AddressNumber", scope = GetMtrlResponseItem.class)
    public JAXBElement<String> createGetMtrlResponseItemAddressNumber(String value) {
        return new JAXBElement<String>(_GetMtrlResponseItemAddressNumber_QNAME, String.class, GetMtrlResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/GetMtrl", name = "SupplierNumber", scope = GetMtrlResponseItem.class)
    public JAXBElement<String> createGetMtrlResponseItemSupplierNumber(String value) {
        return new JAXBElement<String>(_GetMtrlResponseItemSupplierNumber_QNAME, String.class, GetMtrlResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/GetMtrl", name = "ReservedQuantity", scope = GetMtrlResponseItem.class)
    public JAXBElement<BigDecimal> createGetMtrlResponseItemReservedQuantity(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GetMtrlResponseItemReservedQuantity_QNAME, BigDecimal.class, GetMtrlResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/GetMtrl", name = "ReceivedQuantity", scope = GetMtrlResponseItem.class)
    public JAXBElement<BigDecimal> createGetMtrlResponseItemReceivedQuantity(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GetMtrlResponseItemReceivedQuantity_QNAME, BigDecimal.class, GetMtrlResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/GetMtrl", name = "Quantity", scope = GetMtrlResponseItem.class)
    public JAXBElement<BigDecimal> createGetMtrlResponseItemQuantity(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GetMtrlResponseItemQuantity_QNAME, BigDecimal.class, GetMtrlResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/GetMtrl", name = "AllocatedQuantityBasicUM", scope = GetMtrlResponseItem.class)
    public JAXBElement<BigDecimal> createGetMtrlResponseItemAllocatedQuantityBasicUM(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GetMtrlResponseItemAllocatedQuantityBasicUM_QNAME, BigDecimal.class, GetMtrlResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/GetMtrl", name = "ReportingNumber", scope = GetMtrlResponseItem.class)
    public JAXBElement<BigDecimal> createGetMtrlResponseItemReportingNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GetMtrlResponseItemReportingNumber_QNAME, BigDecimal.class, GetMtrlResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/GetMtrl", name = "Priority", scope = GetMtrlResponseItem.class)
    public JAXBElement<BigDecimal> createGetMtrlResponseItemPriority(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GetMtrlResponseItemPriority_QNAME, BigDecimal.class, GetMtrlResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/GetMtrl", name = "ProductNumber", scope = GetMtrlResponseItem.class)
    public JAXBElement<String> createGetMtrlResponseItemProductNumber(String value) {
        return new JAXBElement<String>(_GetMtrlResponseItemProductNumber_QNAME, String.class, GetMtrlResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/GetMtrl", name = "FromWarehouse", scope = GetMtrlResponseItem.class)
    public JAXBElement<String> createGetMtrlResponseItemFromWarehouse(String value) {
        return new JAXBElement<String>(_GetMtrlResponseItemFromWarehouse_QNAME, String.class, GetMtrlResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/GetMtrl", name = "Location", scope = GetMtrlResponseItem.class)
    public JAXBElement<String> createGetMtrlResponseItemLocation(String value) {
        return new JAXBElement<String>(_GetMtrlResponseItemLocation_QNAME, String.class, GetMtrlResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/GetMtrl", name = "LineType", scope = GetMtrlResponseItem.class)
    public JAXBElement<String> createGetMtrlResponseItemLineType(String value) {
        return new JAXBElement<String>(_GetMtrlResponseItemLineType_QNAME, String.class, GetMtrlResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/GetMtrl", name = "Text", scope = GetMtrlResponseItem.class)
    public JAXBElement<String> createGetMtrlResponseItemText(String value) {
        return new JAXBElement<String>(_GetMtrlResponseItemText_QNAME, String.class, GetMtrlResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/GetMtrl", name = "ReferenceOrderLine", scope = GetMtrlResponseItem.class)
    public JAXBElement<BigDecimal> createGetMtrlResponseItemReferenceOrderLine(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GetMtrlResponseItemReferenceOrderLine_QNAME, BigDecimal.class, GetMtrlResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/GetMtrl", name = "AddressType", scope = GetMtrlResponseItem.class)
    public JAXBElement<BigDecimal> createGetMtrlResponseItemAddressType(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GetMtrlResponseItemAddressType_QNAME, BigDecimal.class, GetMtrlResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/GetMtrl", name = "ReportingDate", scope = GetMtrlResponseItem.class)
    public JAXBElement<XMLGregorianCalendar> createGetMtrlResponseItemReportingDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GetMtrlResponseItemReportingDate_QNAME, XMLGregorianCalendar.class, GetMtrlResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/GetMtrl", name = "YesNo", scope = GetMtrlItem.class)
    public JAXBElement<BigDecimal> createGetMtrlItemYesNo(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GetMtrlItemYesNo_QNAME, BigDecimal.class, GetMtrlItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/GetMtrl", name = "RetriveCost", scope = GetMtrlItem.class)
    public JAXBElement<BigDecimal> createGetMtrlItemRetriveCost(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GetMtrlItemRetriveCost_QNAME, BigDecimal.class, GetMtrlItem.class, value);
    }

}
