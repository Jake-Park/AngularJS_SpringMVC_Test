
package au.com.tmha.mos100mi.get;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.com.tmha.mos100mi.get package. 
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

    private final static QName _Get_QNAME = new QName("http://www.tmha.com.au/MOS100MI/Get", "Get");
    private final static QName _GetResponse_QNAME = new QName("http://www.tmha.com.au/MOS100MI/Get", "GetResponse");
    private final static QName _GetResponseItemConfigurationNumber_QNAME = new QName("http://www.tmha.com.au/MOS100MI/Get", "ConfigurationNumber");
    private final static QName _GetResponseItemLotnumber_QNAME = new QName("http://www.tmha.com.au/MOS100MI/Get", "Lotnumber");
    private final static QName _GetResponseItemRequestedStartDate_QNAME = new QName("http://www.tmha.com.au/MOS100MI/Get", "RequestedStartDate");
    private final static QName _GetResponseItemEarliestStartTime_QNAME = new QName("http://www.tmha.com.au/MOS100MI/Get", "EarliestStartTime");
    private final static QName _GetResponseItemTextLine_QNAME = new QName("http://www.tmha.com.au/MOS100MI/Get", "TextLine");
    private final static QName _GetResponseItemWarehouse_QNAME = new QName("http://www.tmha.com.au/MOS100MI/Get", "Warehouse");
    private final static QName _GetResponseItemRequester_QNAME = new QName("http://www.tmha.com.au/MOS100MI/Get", "Requester");
    private final static QName _GetResponseItemPlannedStartDate_QNAME = new QName("http://www.tmha.com.au/MOS100MI/Get", "PlannedStartDate");
    private final static QName _GetResponseItemLineSuffix_QNAME = new QName("http://www.tmha.com.au/MOS100MI/Get", "LineSuffix");
    private final static QName _GetResponseItemTextLineTXT2_QNAME = new QName("http://www.tmha.com.au/MOS100MI/Get", "TextLineTXT2");
    private final static QName _GetResponseItemPlannedFinishTime_QNAME = new QName("http://www.tmha.com.au/MOS100MI/Get", "PlannedFinishTime");
    private final static QName _GetResponseItemRequestedFinishDate_QNAME = new QName("http://www.tmha.com.au/MOS100MI/Get", "RequestedFinishDate");
    private final static QName _GetResponseItemUserdefinedField4Item_QNAME = new QName("http://www.tmha.com.au/MOS100MI/Get", "UserdefinedField4Item");
    private final static QName _GetResponseItemReferenceOrderCategory_QNAME = new QName("http://www.tmha.com.au/MOS100MI/Get", "ReferenceOrderCategory");
    private final static QName _GetResponseItemWorkCenterResource_QNAME = new QName("http://www.tmha.com.au/MOS100MI/Get", "WorkCenterResource");
    private final static QName _GetResponseItemOrderType_QNAME = new QName("http://www.tmha.com.au/MOS100MI/Get", "OrderType");
    private final static QName _GetResponseItemEntryDate_QNAME = new QName("http://www.tmha.com.au/MOS100MI/Get", "EntryDate");
    private final static QName _GetResponseItemPriority_QNAME = new QName("http://www.tmha.com.au/MOS100MI/Get", "Priority");
    private final static QName _GetResponseItemUserdefinedField5Item_QNAME = new QName("http://www.tmha.com.au/MOS100MI/Get", "UserdefinedField5Item");
    private final static QName _GetResponseItemAddressType_QNAME = new QName("http://www.tmha.com.au/MOS100MI/Get", "AddressType");
    private final static QName _GetResponseItemUserdefinedField3Item_QNAME = new QName("http://www.tmha.com.au/MOS100MI/Get", "UserdefinedField3Item");
    private final static QName _GetResponseItemOrderedQuantity_QNAME = new QName("http://www.tmha.com.au/MOS100MI/Get", "OrderedQuantity");
    private final static QName _GetResponseItemStatus_QNAME = new QName("http://www.tmha.com.au/MOS100MI/Get", "Status");
    private final static QName _GetResponseItemRequestedStartTime_QNAME = new QName("http://www.tmha.com.au/MOS100MI/Get", "RequestedStartTime");
    private final static QName _GetResponseItemActionMessage_QNAME = new QName("http://www.tmha.com.au/MOS100MI/Get", "ActionMessage");
    private final static QName _GetResponseItemBreakDownTime_QNAME = new QName("http://www.tmha.com.au/MOS100MI/Get", "BreakDownTime");
    private final static QName _GetResponseItemReferenceOrderNumber_QNAME = new QName("http://www.tmha.com.au/MOS100MI/Get", "ReferenceOrderNumber");
    private final static QName _GetResponseItemService_QNAME = new QName("http://www.tmha.com.au/MOS100MI/Get", "Service");
    private final static QName _GetResponseItemRequestedFinishTime_QNAME = new QName("http://www.tmha.com.au/MOS100MI/Get", "RequestedFinishTime");
    private final static QName _GetResponseItemDueTime_QNAME = new QName("http://www.tmha.com.au/MOS100MI/Get", "DueTime");
    private final static QName _GetResponseItemProductDescription_QNAME = new QName("http://www.tmha.com.au/MOS100MI/Get", "ProductDescription");
    private final static QName _GetResponseItemAddressNumber_QNAME = new QName("http://www.tmha.com.au/MOS100MI/Get", "AddressNumber");
    private final static QName _GetResponseItemEntryTime_QNAME = new QName("http://www.tmha.com.au/MOS100MI/Get", "EntryTime");
    private final static QName _GetResponseItemBreakdownDate_QNAME = new QName("http://www.tmha.com.au/MOS100MI/Get", "BreakdownDate");
    private final static QName _GetResponseItemManufacturedQuantity_QNAME = new QName("http://www.tmha.com.au/MOS100MI/Get", "ManufacturedQuantity");
    private final static QName _GetResponseItemPlannedFinishDate_QNAME = new QName("http://www.tmha.com.au/MOS100MI/Get", "PlannedFinishDate");
    private final static QName _GetResponseItemDueDate_QNAME = new QName("http://www.tmha.com.au/MOS100MI/Get", "DueDate");
    private final static QName _GetResponseItemReportingDate_QNAME = new QName("http://www.tmha.com.au/MOS100MI/Get", "ReportingDate");
    private final static QName _GetResponseItemUserDefinedField4_QNAME = new QName("http://www.tmha.com.au/MOS100MI/Get", "UserDefinedField4");
    private final static QName _GetResponseItemUserDefinedField5_QNAME = new QName("http://www.tmha.com.au/MOS100MI/Get", "UserDefinedField5");
    private final static QName _GetResponseItemUserDefinedField6_QNAME = new QName("http://www.tmha.com.au/MOS100MI/Get", "UserDefinedField6");
    private final static QName _GetResponseItemUserdefinedField2Item_QNAME = new QName("http://www.tmha.com.au/MOS100MI/Get", "UserdefinedField2Item");
    private final static QName _GetResponseItemReportingTime_QNAME = new QName("http://www.tmha.com.au/MOS100MI/Get", "ReportingTime");
    private final static QName _GetResponseItemPlannedStartTime_QNAME = new QName("http://www.tmha.com.au/MOS100MI/Get", "PlannedStartTime");
    private final static QName _GetResponseItemReferenceOrderLine_QNAME = new QName("http://www.tmha.com.au/MOS100MI/Get", "ReferenceOrderLine");
    private final static QName _GetResponseItemMainProduct_QNAME = new QName("http://www.tmha.com.au/MOS100MI/Get", "MainProduct");
    private final static QName _GetResponseItemUserDefinedField1_QNAME = new QName("http://www.tmha.com.au/MOS100MI/Get", "UserDefinedField1");
    private final static QName _GetResponseItemStructureType_QNAME = new QName("http://www.tmha.com.au/MOS100MI/Get", "StructureType");
    private final static QName _GetResponseItemUserdefinedField1Item_QNAME = new QName("http://www.tmha.com.au/MOS100MI/Get", "UserdefinedField1Item");
    private final static QName _GetResponseItemUserDefinedField2_QNAME = new QName("http://www.tmha.com.au/MOS100MI/Get", "UserDefinedField2");
    private final static QName _GetResponseItemUserDefinedField3_QNAME = new QName("http://www.tmha.com.au/MOS100MI/Get", "UserDefinedField3");
    private final static QName _GetItemPlanningArea_QNAME = new QName("http://www.tmha.com.au/MOS100MI/Get", "PlanningArea");
    private final static QName _GetItemCompany_QNAME = new QName("http://www.tmha.com.au/MOS100MI/Get", "Company");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.com.tmha.mos100mi.get
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetResponseCollection }
     * 
     */
    public GetResponseCollection createGetResponseCollection() {
        return new GetResponseCollection();
    }

    /**
     * Create an instance of {@link GetCollection }
     * 
     */
    public GetCollection createGetCollection() {
        return new GetCollection();
    }

    /**
     * Create an instance of {@link GetResponseItem }
     * 
     */
    public GetResponseItem createGetResponseItem() {
        return new GetResponseItem();
    }

    /**
     * Create an instance of {@link GetItem }
     * 
     */
    public GetItem createGetItem() {
        return new GetItem();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/Get", name = "Get")
    public JAXBElement<GetCollection> createGet(GetCollection value) {
        return new JAXBElement<GetCollection>(_Get_QNAME, GetCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetResponseCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/Get", name = "GetResponse")
    public JAXBElement<GetResponseCollection> createGetResponse(GetResponseCollection value) {
        return new JAXBElement<GetResponseCollection>(_GetResponse_QNAME, GetResponseCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/Get", name = "ConfigurationNumber", scope = GetResponseItem.class)
    public JAXBElement<BigDecimal> createGetResponseItemConfigurationNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GetResponseItemConfigurationNumber_QNAME, BigDecimal.class, GetResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/Get", name = "Lotnumber", scope = GetResponseItem.class)
    public JAXBElement<String> createGetResponseItemLotnumber(String value) {
        return new JAXBElement<String>(_GetResponseItemLotnumber_QNAME, String.class, GetResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/Get", name = "RequestedStartDate", scope = GetResponseItem.class)
    public JAXBElement<XMLGregorianCalendar> createGetResponseItemRequestedStartDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GetResponseItemRequestedStartDate_QNAME, XMLGregorianCalendar.class, GetResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/Get", name = "EarliestStartTime", scope = GetResponseItem.class)
    public JAXBElement<BigDecimal> createGetResponseItemEarliestStartTime(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GetResponseItemEarliestStartTime_QNAME, BigDecimal.class, GetResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/Get", name = "TextLine", scope = GetResponseItem.class)
    public JAXBElement<String> createGetResponseItemTextLine(String value) {
        return new JAXBElement<String>(_GetResponseItemTextLine_QNAME, String.class, GetResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/Get", name = "Warehouse", scope = GetResponseItem.class)
    public JAXBElement<String> createGetResponseItemWarehouse(String value) {
        return new JAXBElement<String>(_GetResponseItemWarehouse_QNAME, String.class, GetResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/Get", name = "Requester", scope = GetResponseItem.class)
    public JAXBElement<String> createGetResponseItemRequester(String value) {
        return new JAXBElement<String>(_GetResponseItemRequester_QNAME, String.class, GetResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/Get", name = "PlannedStartDate", scope = GetResponseItem.class)
    public JAXBElement<XMLGregorianCalendar> createGetResponseItemPlannedStartDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GetResponseItemPlannedStartDate_QNAME, XMLGregorianCalendar.class, GetResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/Get", name = "LineSuffix", scope = GetResponseItem.class)
    public JAXBElement<BigDecimal> createGetResponseItemLineSuffix(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GetResponseItemLineSuffix_QNAME, BigDecimal.class, GetResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/Get", name = "TextLineTXT2", scope = GetResponseItem.class)
    public JAXBElement<String> createGetResponseItemTextLineTXT2(String value) {
        return new JAXBElement<String>(_GetResponseItemTextLineTXT2_QNAME, String.class, GetResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/Get", name = "PlannedFinishTime", scope = GetResponseItem.class)
    public JAXBElement<BigDecimal> createGetResponseItemPlannedFinishTime(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GetResponseItemPlannedFinishTime_QNAME, BigDecimal.class, GetResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/Get", name = "RequestedFinishDate", scope = GetResponseItem.class)
    public JAXBElement<XMLGregorianCalendar> createGetResponseItemRequestedFinishDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GetResponseItemRequestedFinishDate_QNAME, XMLGregorianCalendar.class, GetResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/Get", name = "UserdefinedField4Item", scope = GetResponseItem.class)
    public JAXBElement<String> createGetResponseItemUserdefinedField4Item(String value) {
        return new JAXBElement<String>(_GetResponseItemUserdefinedField4Item_QNAME, String.class, GetResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/Get", name = "ReferenceOrderCategory", scope = GetResponseItem.class)
    public JAXBElement<BigDecimal> createGetResponseItemReferenceOrderCategory(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GetResponseItemReferenceOrderCategory_QNAME, BigDecimal.class, GetResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/Get", name = "WorkCenterResource", scope = GetResponseItem.class)
    public JAXBElement<String> createGetResponseItemWorkCenterResource(String value) {
        return new JAXBElement<String>(_GetResponseItemWorkCenterResource_QNAME, String.class, GetResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/Get", name = "OrderType", scope = GetResponseItem.class)
    public JAXBElement<String> createGetResponseItemOrderType(String value) {
        return new JAXBElement<String>(_GetResponseItemOrderType_QNAME, String.class, GetResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/Get", name = "EntryDate", scope = GetResponseItem.class)
    public JAXBElement<XMLGregorianCalendar> createGetResponseItemEntryDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GetResponseItemEntryDate_QNAME, XMLGregorianCalendar.class, GetResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/Get", name = "Priority", scope = GetResponseItem.class)
    public JAXBElement<BigDecimal> createGetResponseItemPriority(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GetResponseItemPriority_QNAME, BigDecimal.class, GetResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/Get", name = "UserdefinedField5Item", scope = GetResponseItem.class)
    public JAXBElement<String> createGetResponseItemUserdefinedField5Item(String value) {
        return new JAXBElement<String>(_GetResponseItemUserdefinedField5Item_QNAME, String.class, GetResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/Get", name = "AddressType", scope = GetResponseItem.class)
    public JAXBElement<BigDecimal> createGetResponseItemAddressType(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GetResponseItemAddressType_QNAME, BigDecimal.class, GetResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/Get", name = "UserdefinedField3Item", scope = GetResponseItem.class)
    public JAXBElement<String> createGetResponseItemUserdefinedField3Item(String value) {
        return new JAXBElement<String>(_GetResponseItemUserdefinedField3Item_QNAME, String.class, GetResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/Get", name = "OrderedQuantity", scope = GetResponseItem.class)
    public JAXBElement<BigDecimal> createGetResponseItemOrderedQuantity(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GetResponseItemOrderedQuantity_QNAME, BigDecimal.class, GetResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/Get", name = "Status", scope = GetResponseItem.class)
    public JAXBElement<BigDecimal> createGetResponseItemStatus(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GetResponseItemStatus_QNAME, BigDecimal.class, GetResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/Get", name = "RequestedStartTime", scope = GetResponseItem.class)
    public JAXBElement<BigDecimal> createGetResponseItemRequestedStartTime(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GetResponseItemRequestedStartTime_QNAME, BigDecimal.class, GetResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/Get", name = "ActionMessage", scope = GetResponseItem.class)
    public JAXBElement<String> createGetResponseItemActionMessage(String value) {
        return new JAXBElement<String>(_GetResponseItemActionMessage_QNAME, String.class, GetResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/Get", name = "BreakDownTime", scope = GetResponseItem.class)
    public JAXBElement<BigDecimal> createGetResponseItemBreakDownTime(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GetResponseItemBreakDownTime_QNAME, BigDecimal.class, GetResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/Get", name = "ReferenceOrderNumber", scope = GetResponseItem.class)
    public JAXBElement<BigDecimal> createGetResponseItemReferenceOrderNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GetResponseItemReferenceOrderNumber_QNAME, BigDecimal.class, GetResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/Get", name = "Service", scope = GetResponseItem.class)
    public JAXBElement<String> createGetResponseItemService(String value) {
        return new JAXBElement<String>(_GetResponseItemService_QNAME, String.class, GetResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/Get", name = "RequestedFinishTime", scope = GetResponseItem.class)
    public JAXBElement<BigDecimal> createGetResponseItemRequestedFinishTime(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GetResponseItemRequestedFinishTime_QNAME, BigDecimal.class, GetResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/Get", name = "DueTime", scope = GetResponseItem.class)
    public JAXBElement<BigDecimal> createGetResponseItemDueTime(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GetResponseItemDueTime_QNAME, BigDecimal.class, GetResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/Get", name = "ProductDescription", scope = GetResponseItem.class)
    public JAXBElement<String> createGetResponseItemProductDescription(String value) {
        return new JAXBElement<String>(_GetResponseItemProductDescription_QNAME, String.class, GetResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/Get", name = "AddressNumber", scope = GetResponseItem.class)
    public JAXBElement<String> createGetResponseItemAddressNumber(String value) {
        return new JAXBElement<String>(_GetResponseItemAddressNumber_QNAME, String.class, GetResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/Get", name = "EntryTime", scope = GetResponseItem.class)
    public JAXBElement<BigDecimal> createGetResponseItemEntryTime(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GetResponseItemEntryTime_QNAME, BigDecimal.class, GetResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/Get", name = "BreakdownDate", scope = GetResponseItem.class)
    public JAXBElement<XMLGregorianCalendar> createGetResponseItemBreakdownDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GetResponseItemBreakdownDate_QNAME, XMLGregorianCalendar.class, GetResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/Get", name = "ManufacturedQuantity", scope = GetResponseItem.class)
    public JAXBElement<BigDecimal> createGetResponseItemManufacturedQuantity(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GetResponseItemManufacturedQuantity_QNAME, BigDecimal.class, GetResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/Get", name = "PlannedFinishDate", scope = GetResponseItem.class)
    public JAXBElement<XMLGregorianCalendar> createGetResponseItemPlannedFinishDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GetResponseItemPlannedFinishDate_QNAME, XMLGregorianCalendar.class, GetResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/Get", name = "DueDate", scope = GetResponseItem.class)
    public JAXBElement<XMLGregorianCalendar> createGetResponseItemDueDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GetResponseItemDueDate_QNAME, XMLGregorianCalendar.class, GetResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/Get", name = "ReportingDate", scope = GetResponseItem.class)
    public JAXBElement<XMLGregorianCalendar> createGetResponseItemReportingDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GetResponseItemReportingDate_QNAME, XMLGregorianCalendar.class, GetResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/Get", name = "UserDefinedField4", scope = GetResponseItem.class)
    public JAXBElement<String> createGetResponseItemUserDefinedField4(String value) {
        return new JAXBElement<String>(_GetResponseItemUserDefinedField4_QNAME, String.class, GetResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/Get", name = "UserDefinedField5", scope = GetResponseItem.class)
    public JAXBElement<String> createGetResponseItemUserDefinedField5(String value) {
        return new JAXBElement<String>(_GetResponseItemUserDefinedField5_QNAME, String.class, GetResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/Get", name = "UserDefinedField6", scope = GetResponseItem.class)
    public JAXBElement<String> createGetResponseItemUserDefinedField6(String value) {
        return new JAXBElement<String>(_GetResponseItemUserDefinedField6_QNAME, String.class, GetResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/Get", name = "UserdefinedField2Item", scope = GetResponseItem.class)
    public JAXBElement<BigDecimal> createGetResponseItemUserdefinedField2Item(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GetResponseItemUserdefinedField2Item_QNAME, BigDecimal.class, GetResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/Get", name = "ReportingTime", scope = GetResponseItem.class)
    public JAXBElement<BigDecimal> createGetResponseItemReportingTime(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GetResponseItemReportingTime_QNAME, BigDecimal.class, GetResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/Get", name = "PlannedStartTime", scope = GetResponseItem.class)
    public JAXBElement<BigDecimal> createGetResponseItemPlannedStartTime(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GetResponseItemPlannedStartTime_QNAME, BigDecimal.class, GetResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/Get", name = "ReferenceOrderLine", scope = GetResponseItem.class)
    public JAXBElement<BigDecimal> createGetResponseItemReferenceOrderLine(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GetResponseItemReferenceOrderLine_QNAME, BigDecimal.class, GetResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/Get", name = "MainProduct", scope = GetResponseItem.class)
    public JAXBElement<String> createGetResponseItemMainProduct(String value) {
        return new JAXBElement<String>(_GetResponseItemMainProduct_QNAME, String.class, GetResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/Get", name = "UserDefinedField1", scope = GetResponseItem.class)
    public JAXBElement<String> createGetResponseItemUserDefinedField1(String value) {
        return new JAXBElement<String>(_GetResponseItemUserDefinedField1_QNAME, String.class, GetResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/Get", name = "StructureType", scope = GetResponseItem.class)
    public JAXBElement<String> createGetResponseItemStructureType(String value) {
        return new JAXBElement<String>(_GetResponseItemStructureType_QNAME, String.class, GetResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/Get", name = "UserdefinedField1Item", scope = GetResponseItem.class)
    public JAXBElement<String> createGetResponseItemUserdefinedField1Item(String value) {
        return new JAXBElement<String>(_GetResponseItemUserdefinedField1Item_QNAME, String.class, GetResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/Get", name = "UserDefinedField2", scope = GetResponseItem.class)
    public JAXBElement<String> createGetResponseItemUserDefinedField2(String value) {
        return new JAXBElement<String>(_GetResponseItemUserDefinedField2_QNAME, String.class, GetResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/Get", name = "UserDefinedField3", scope = GetResponseItem.class)
    public JAXBElement<String> createGetResponseItemUserDefinedField3(String value) {
        return new JAXBElement<String>(_GetResponseItemUserDefinedField3_QNAME, String.class, GetResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/Get", name = "PlanningArea", scope = GetItem.class)
    public JAXBElement<String> createGetItemPlanningArea(String value) {
        return new JAXBElement<String>(_GetItemPlanningArea_QNAME, String.class, GetItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS100MI/Get", name = "Company", scope = GetItem.class)
    public JAXBElement<BigDecimal> createGetItemCompany(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GetItemCompany_QNAME, BigDecimal.class, GetItem.class, value);
    }

}
