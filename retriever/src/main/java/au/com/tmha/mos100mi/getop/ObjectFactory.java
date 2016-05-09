
package au.com.tmha.mos100mi.getop;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.com.tmha.mos100mi.getop package. 
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

    private final static QName _GetOp_QNAME = new QName("http://www.tmha.com.au/MOS100MI/GetOp", "GetOp");
    private final static QName _GetOpResponse_QNAME = new QName("http://www.tmha.com.au/MOS100MI/GetOp", "GetOpResponse");
    private final static QName _GetOpResponseItemReportingNumber_QNAME = new QName("http://www.tmha.com.au/MOS100MI/GetOp", "ReportingNumber");
    private final static QName _GetOpResponseItemFinishDate_QNAME = new QName("http://www.tmha.com.au/MOS100MI/GetOp", "FinishDate");
    private final static QName _GetOpResponseItemProductNumber_QNAME = new QName("http://www.tmha.com.au/MOS100MI/GetOp", "ProductNumber");
    private final static QName _GetOpResponseItemActualFinishDate_QNAME = new QName("http://www.tmha.com.au/MOS100MI/GetOp", "ActualFinishDate");
    private final static QName _GetOpResponseItemOperationStarted_QNAME = new QName("http://www.tmha.com.au/MOS100MI/GetOp", "OperationStarted");
    private final static QName _GetOpResponseItemUnitPrice_QNAME = new QName("http://www.tmha.com.au/MOS100MI/GetOp", "UnitPrice");
    private final static QName _GetOpResponseItemEntryDate_QNAME = new QName("http://www.tmha.com.au/MOS100MI/GetOp", "EntryDate");
    private final static QName _GetOpResponseItemPlanningArea_QNAME = new QName("http://www.tmha.com.au/MOS100MI/GetOp", "PlanningArea");
    private final static QName _GetOpResponseItemManufacturedQuantity_QNAME = new QName("http://www.tmha.com.au/MOS100MI/GetOp", "ManufacturedQuantity");
    private final static QName _GetOpResponseItemErrorCode1_QNAME = new QName("http://www.tmha.com.au/MOS100MI/GetOp", "ErrorCode1");
    private final static QName _GetOpResponseItemErrorCode2_QNAME = new QName("http://www.tmha.com.au/MOS100MI/GetOp", "ErrorCode2");
    private final static QName _GetOpResponseItemErrorCode3_QNAME = new QName("http://www.tmha.com.au/MOS100MI/GetOp", "ErrorCode3");
    private final static QName _GetOpResponseItemPriority_QNAME = new QName("http://www.tmha.com.au/MOS100MI/GetOp", "Priority");
    private final static QName _GetOpResponseItemReferenceOrderLine_QNAME = new QName("http://www.tmha.com.au/MOS100MI/GetOp", "ReferenceOrderLine");
    private final static QName _GetOpResponseItemStatus_QNAME = new QName("http://www.tmha.com.au/MOS100MI/GetOp", "Status");
    private final static QName _GetOpResponseItemCostCenter_QNAME = new QName("http://www.tmha.com.au/MOS100MI/GetOp", "CostCenter");
    private final static QName _GetOpResponseItemActualStartDate_QNAME = new QName("http://www.tmha.com.au/MOS100MI/GetOp", "ActualStartDate");
    private final static QName _GetOpResponseItemReportingDate_QNAME = new QName("http://www.tmha.com.au/MOS100MI/GetOp", "ReportingDate");
    private final static QName _GetOpResponseItemActualStartTime_QNAME = new QName("http://www.tmha.com.au/MOS100MI/GetOp", "ActualStartTime");
    private final static QName _GetOpResponseItemItemNumber_QNAME = new QName("http://www.tmha.com.au/MOS100MI/GetOp", "ItemNumber");
    private final static QName _GetOpResponseItemReportingTime_QNAME = new QName("http://www.tmha.com.au/MOS100MI/GetOp", "ReportingTime");
    private final static QName _GetOpResponseItemTextIdentity_QNAME = new QName("http://www.tmha.com.au/MOS100MI/GetOp", "TextIdentity");
    private final static QName _GetOpResponseItemLotNumber_QNAME = new QName("http://www.tmha.com.au/MOS100MI/GetOp", "LotNumber");
    private final static QName _GetOpResponseItemService_QNAME = new QName("http://www.tmha.com.au/MOS100MI/GetOp", "Service");
    private final static QName _GetOpResponseItemTextLine1_QNAME = new QName("http://www.tmha.com.au/MOS100MI/GetOp", "TextLine1");
    private final static QName _GetOpResponseItemTextLine2_QNAME = new QName("http://www.tmha.com.au/MOS100MI/GetOp", "TextLine2");
    private final static QName _GetOpResponseItemOperationDescription_QNAME = new QName("http://www.tmha.com.au/MOS100MI/GetOp", "OperationDescription");
    private final static QName _GetOpResponseItemSalesPrice_QNAME = new QName("http://www.tmha.com.au/MOS100MI/GetOp", "SalesPrice");
    private final static QName _GetOpResponseItemWorkCenter_QNAME = new QName("http://www.tmha.com.au/MOS100MI/GetOp", "WorkCenter");
    private final static QName _GetOpResponseItemStartDate_QNAME = new QName("http://www.tmha.com.au/MOS100MI/GetOp", "StartDate");
    private final static QName _GetOpResponseItemFinishTime_QNAME = new QName("http://www.tmha.com.au/MOS100MI/GetOp", "FinishTime");
    private final static QName _GetOpResponseItemActualFinishTime_QNAME = new QName("http://www.tmha.com.au/MOS100MI/GetOp", "ActualFinishTime");
    private final static QName _GetOpResponseItemSupplierNumber_QNAME = new QName("http://www.tmha.com.au/MOS100MI/GetOp", "SupplierNumber");
    private final static QName _GetOpResponseItemStartTime_QNAME = new QName("http://www.tmha.com.au/MOS100MI/GetOp", "StartTime");
    private final static QName _GetOpResponseItemEntryTime_QNAME = new QName("http://www.tmha.com.au/MOS100MI/GetOp", "EntryTime");
    private final static QName _GetOpItemRetriveEstimatedCost_QNAME = new QName("http://www.tmha.com.au/MOS100MI/GetOp", "RetriveEstimatedCost");
    private final static QName _GetOpItemYesNo_QNAME = new QName("http://www.tmha.com.au/MOS100MI/GetOp", "YesNo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.com.tmha.mos100mi.getop
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetOpCollection }
     * 
     */
    public GetOpCollection createGetOpCollection() {
        return new GetOpCollection();
    }

    /**
     * Create an instance of {@link GetOpResponseCollection }
     * 
     */
    public GetOpResponseCollection createGetOpResponseCollection() {
        return new GetOpResponseCollection();
    }

    /**
     * Create an instance of {@link GetOpResponseItem }
     * 
     */
    public GetOpResponseItem createGetOpResponseItem() {
        return new GetOpResponseItem();
    }

    /**
     * Create an instance of {@link GetOpItem }
     * 
     */
    public GetOpItem createGetOpItem() {
        return new GetOpItem();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOpCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/GetOp", name = "GetOp")
    public JAXBElement<GetOpCollection> createGetOp(GetOpCollection value) {
        return new JAXBElement<GetOpCollection>(_GetOp_QNAME, GetOpCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOpResponseCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/GetOp", name = "GetOpResponse")
    public JAXBElement<GetOpResponseCollection> createGetOpResponse(GetOpResponseCollection value) {
        return new JAXBElement<GetOpResponseCollection>(_GetOpResponse_QNAME, GetOpResponseCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/GetOp", name = "ReportingNumber", scope = GetOpResponseItem.class)
    public JAXBElement<BigDecimal> createGetOpResponseItemReportingNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GetOpResponseItemReportingNumber_QNAME, BigDecimal.class, GetOpResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/GetOp", name = "FinishDate", scope = GetOpResponseItem.class)
    public JAXBElement<XMLGregorianCalendar> createGetOpResponseItemFinishDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GetOpResponseItemFinishDate_QNAME, XMLGregorianCalendar.class, GetOpResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/GetOp", name = "ProductNumber", scope = GetOpResponseItem.class)
    public JAXBElement<String> createGetOpResponseItemProductNumber(String value) {
        return new JAXBElement<String>(_GetOpResponseItemProductNumber_QNAME, String.class, GetOpResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/GetOp", name = "ActualFinishDate", scope = GetOpResponseItem.class)
    public JAXBElement<XMLGregorianCalendar> createGetOpResponseItemActualFinishDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GetOpResponseItemActualFinishDate_QNAME, XMLGregorianCalendar.class, GetOpResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/GetOp", name = "OperationStarted", scope = GetOpResponseItem.class)
    public JAXBElement<BigDecimal> createGetOpResponseItemOperationStarted(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GetOpResponseItemOperationStarted_QNAME, BigDecimal.class, GetOpResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/GetOp", name = "UnitPrice", scope = GetOpResponseItem.class)
    public JAXBElement<BigDecimal> createGetOpResponseItemUnitPrice(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GetOpResponseItemUnitPrice_QNAME, BigDecimal.class, GetOpResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/GetOp", name = "EntryDate", scope = GetOpResponseItem.class)
    public JAXBElement<XMLGregorianCalendar> createGetOpResponseItemEntryDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GetOpResponseItemEntryDate_QNAME, XMLGregorianCalendar.class, GetOpResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/GetOp", name = "PlanningArea", scope = GetOpResponseItem.class)
    public JAXBElement<String> createGetOpResponseItemPlanningArea(String value) {
        return new JAXBElement<String>(_GetOpResponseItemPlanningArea_QNAME, String.class, GetOpResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/GetOp", name = "ManufacturedQuantity", scope = GetOpResponseItem.class)
    public JAXBElement<BigDecimal> createGetOpResponseItemManufacturedQuantity(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GetOpResponseItemManufacturedQuantity_QNAME, BigDecimal.class, GetOpResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/GetOp", name = "ErrorCode1", scope = GetOpResponseItem.class)
    public JAXBElement<String> createGetOpResponseItemErrorCode1(String value) {
        return new JAXBElement<String>(_GetOpResponseItemErrorCode1_QNAME, String.class, GetOpResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/GetOp", name = "ErrorCode2", scope = GetOpResponseItem.class)
    public JAXBElement<String> createGetOpResponseItemErrorCode2(String value) {
        return new JAXBElement<String>(_GetOpResponseItemErrorCode2_QNAME, String.class, GetOpResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/GetOp", name = "ErrorCode3", scope = GetOpResponseItem.class)
    public JAXBElement<String> createGetOpResponseItemErrorCode3(String value) {
        return new JAXBElement<String>(_GetOpResponseItemErrorCode3_QNAME, String.class, GetOpResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/GetOp", name = "Priority", scope = GetOpResponseItem.class)
    public JAXBElement<BigDecimal> createGetOpResponseItemPriority(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GetOpResponseItemPriority_QNAME, BigDecimal.class, GetOpResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/GetOp", name = "ReferenceOrderLine", scope = GetOpResponseItem.class)
    public JAXBElement<BigDecimal> createGetOpResponseItemReferenceOrderLine(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GetOpResponseItemReferenceOrderLine_QNAME, BigDecimal.class, GetOpResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/GetOp", name = "Status", scope = GetOpResponseItem.class)
    public JAXBElement<String> createGetOpResponseItemStatus(String value) {
        return new JAXBElement<String>(_GetOpResponseItemStatus_QNAME, String.class, GetOpResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/GetOp", name = "CostCenter", scope = GetOpResponseItem.class)
    public JAXBElement<String> createGetOpResponseItemCostCenter(String value) {
        return new JAXBElement<String>(_GetOpResponseItemCostCenter_QNAME, String.class, GetOpResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/GetOp", name = "ActualStartDate", scope = GetOpResponseItem.class)
    public JAXBElement<XMLGregorianCalendar> createGetOpResponseItemActualStartDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GetOpResponseItemActualStartDate_QNAME, XMLGregorianCalendar.class, GetOpResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/GetOp", name = "ReportingDate", scope = GetOpResponseItem.class)
    public JAXBElement<XMLGregorianCalendar> createGetOpResponseItemReportingDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GetOpResponseItemReportingDate_QNAME, XMLGregorianCalendar.class, GetOpResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/GetOp", name = "ActualStartTime", scope = GetOpResponseItem.class)
    public JAXBElement<BigDecimal> createGetOpResponseItemActualStartTime(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GetOpResponseItemActualStartTime_QNAME, BigDecimal.class, GetOpResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/GetOp", name = "ItemNumber", scope = GetOpResponseItem.class)
    public JAXBElement<String> createGetOpResponseItemItemNumber(String value) {
        return new JAXBElement<String>(_GetOpResponseItemItemNumber_QNAME, String.class, GetOpResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/GetOp", name = "ReportingTime", scope = GetOpResponseItem.class)
    public JAXBElement<BigDecimal> createGetOpResponseItemReportingTime(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GetOpResponseItemReportingTime_QNAME, BigDecimal.class, GetOpResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/GetOp", name = "TextIdentity", scope = GetOpResponseItem.class)
    public JAXBElement<BigDecimal> createGetOpResponseItemTextIdentity(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GetOpResponseItemTextIdentity_QNAME, BigDecimal.class, GetOpResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/GetOp", name = "LotNumber", scope = GetOpResponseItem.class)
    public JAXBElement<String> createGetOpResponseItemLotNumber(String value) {
        return new JAXBElement<String>(_GetOpResponseItemLotNumber_QNAME, String.class, GetOpResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/GetOp", name = "Service", scope = GetOpResponseItem.class)
    public JAXBElement<String> createGetOpResponseItemService(String value) {
        return new JAXBElement<String>(_GetOpResponseItemService_QNAME, String.class, GetOpResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/GetOp", name = "TextLine1", scope = GetOpResponseItem.class)
    public JAXBElement<String> createGetOpResponseItemTextLine1(String value) {
        return new JAXBElement<String>(_GetOpResponseItemTextLine1_QNAME, String.class, GetOpResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/GetOp", name = "TextLine2", scope = GetOpResponseItem.class)
    public JAXBElement<String> createGetOpResponseItemTextLine2(String value) {
        return new JAXBElement<String>(_GetOpResponseItemTextLine2_QNAME, String.class, GetOpResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/GetOp", name = "OperationDescription", scope = GetOpResponseItem.class)
    public JAXBElement<String> createGetOpResponseItemOperationDescription(String value) {
        return new JAXBElement<String>(_GetOpResponseItemOperationDescription_QNAME, String.class, GetOpResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/GetOp", name = "SalesPrice", scope = GetOpResponseItem.class)
    public JAXBElement<BigDecimal> createGetOpResponseItemSalesPrice(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GetOpResponseItemSalesPrice_QNAME, BigDecimal.class, GetOpResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/GetOp", name = "WorkCenter", scope = GetOpResponseItem.class)
    public JAXBElement<String> createGetOpResponseItemWorkCenter(String value) {
        return new JAXBElement<String>(_GetOpResponseItemWorkCenter_QNAME, String.class, GetOpResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/GetOp", name = "StartDate", scope = GetOpResponseItem.class)
    public JAXBElement<XMLGregorianCalendar> createGetOpResponseItemStartDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GetOpResponseItemStartDate_QNAME, XMLGregorianCalendar.class, GetOpResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/GetOp", name = "FinishTime", scope = GetOpResponseItem.class)
    public JAXBElement<BigDecimal> createGetOpResponseItemFinishTime(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GetOpResponseItemFinishTime_QNAME, BigDecimal.class, GetOpResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/GetOp", name = "ActualFinishTime", scope = GetOpResponseItem.class)
    public JAXBElement<BigDecimal> createGetOpResponseItemActualFinishTime(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GetOpResponseItemActualFinishTime_QNAME, BigDecimal.class, GetOpResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/GetOp", name = "SupplierNumber", scope = GetOpResponseItem.class)
    public JAXBElement<String> createGetOpResponseItemSupplierNumber(String value) {
        return new JAXBElement<String>(_GetOpResponseItemSupplierNumber_QNAME, String.class, GetOpResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/GetOp", name = "StartTime", scope = GetOpResponseItem.class)
    public JAXBElement<BigDecimal> createGetOpResponseItemStartTime(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GetOpResponseItemStartTime_QNAME, BigDecimal.class, GetOpResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/GetOp", name = "EntryTime", scope = GetOpResponseItem.class)
    public JAXBElement<BigDecimal> createGetOpResponseItemEntryTime(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GetOpResponseItemEntryTime_QNAME, BigDecimal.class, GetOpResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/GetOp", name = "RetriveEstimatedCost", scope = GetOpItem.class)
    public JAXBElement<BigDecimal> createGetOpItemRetriveEstimatedCost(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GetOpItemRetriveEstimatedCost_QNAME, BigDecimal.class, GetOpItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/GetOp", name = "YesNo", scope = GetOpItem.class)
    public JAXBElement<BigDecimal> createGetOpItemYesNo(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GetOpItemYesNo_QNAME, BigDecimal.class, GetOpItem.class, value);
    }

}
