
package au.com.tmha.mos057mi.add;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.com.tmha.mos057mi.add package. 
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

    private final static QName _AddResponse_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Add", "AddResponse");
    private final static QName _Add_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Add", "Add");
    private final static QName _AddResponseItemSequenceNumber_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Add", "SequenceNumber");
    private final static QName _AddItemLineSuffixRIDX_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Add", "LineSuffixRIDX");
    private final static QName _AddItemUserdefinedField3Item_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Add", "UserdefinedField3Item");
    private final static QName _AddItemItemNumber_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Add", "ItemNumber");
    private final static QName _AddItemUserdefinedField5Item_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Add", "UserdefinedField5Item");
    private final static QName _AddItemBreakDownTime_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Add", "BreakDownTime");
    private final static QName _AddItemOrderNumber_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Add", "OrderNumber");
    private final static QName _AddItemEquipmentInProductionTime_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Add", "EquipmentInProductionTime");
    private final static QName _AddItemStatus_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Add", "Status");
    private final static QName _AddItemText_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Add", "Text");
    private final static QName _AddItemErrorCode3_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Add", "ErrorCode3");
    private final static QName _AddItemErrorCode2_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Add", "ErrorCode2");
    private final static QName _AddItemErrorCode1_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Add", "ErrorCode1");
    private final static QName _AddItemMachineReadyDate_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Add", "MachineReadyDate");
    private final static QName _AddItemOrderLine_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Add", "OrderLine");
    private final static QName _AddItemTextTXL0_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Add", "TextTXL0");
    private final static QName _AddItemTextTXL2_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Add", "TextTXL2");
    private final static QName _AddItemDocumentIdentity_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Add", "DocumentIdentity");
    private final static QName _AddItemTextTXL8_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Add", "TextTXL8");
    private final static QName _AddItemTextTXL7_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Add", "TextTXL7");
    private final static QName _AddItemTextTXL9_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Add", "TextTXL9");
    private final static QName _AddItemReferenceOrderCategory_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Add", "ReferenceOrderCategory");
    private final static QName _AddItemTextTXL4_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Add", "TextTXL4");
    private final static QName _AddItemTextTXL3_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Add", "TextTXL3");
    private final static QName _AddItemTextTXL6_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Add", "TextTXL6");
    private final static QName _AddItemSinceNew_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Add", "SinceNew");
    private final static QName _AddItemUserdefinedField4Item_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Add", "UserdefinedField4Item");
    private final static QName _AddItemTextTXL5_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Add", "TextTXL5");
    private final static QName _AddItemWarranty_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Add", "Warranty");
    private final static QName _AddItemDurabilityFlag_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Add", "DurabilityFlag");
    private final static QName _AddItemLineSuffix_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Add", "LineSuffix");
    private final static QName _AddItemReferenceIdentityCode_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Add", "ReferenceIdentityCode");
    private final static QName _AddItemMeter_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Add", "Meter");
    private final static QName _AddItemMachineReadyTime_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Add", "MachineReadyTime");
    private final static QName _AddItemReportedBy_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Add", "ReportedBy");
    private final static QName _AddItemUserdefinedField2Item_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Add", "UserdefinedField2Item");
    private final static QName _AddItemUserdefinedField1Item_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Add", "UserdefinedField1Item");
    private final static QName _AddItemReferenceOrderLine_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Add", "ReferenceOrderLine");
    private final static QName _AddItemInoperable_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Add", "Inoperable");
    private final static QName _AddItemMainService_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Add", "MainService");
    private final static QName _AddItemBreakdownDate_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Add", "BreakdownDate");
    private final static QName _AddItemNonOEMPart_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Add", "NonOEMPart");
    private final static QName _AddItemDrawingPosition_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Add", "DrawingPosition");
    private final static QName _AddItemEquipmentInProductionDate_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Add", "EquipmentInProductionDate");
    private final static QName _AddItemProductStructureType_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Add", "ProductStructureType");
    private final static QName _AddItemSerialNumber_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Add", "SerialNumber");
    private final static QName _AddItemErrorReportQuantity_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Add", "ErrorReportQuantity");
    private final static QName _AddItemMeterValue1_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Add", "MeterValue1");
    private final static QName _AddItemMeterValue3_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Add", "MeterValue3");
    private final static QName _AddItemMeterValue2_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Add", "MeterValue2");
    private final static QName _AddItemService_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Add", "Service");
    private final static QName _AddItemMeterValue4_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Add", "MeterValue4");
    private final static QName _AddItemReferenceOrderNumber_QNAME = new QName("http://www.tmha.com.au/MOS057MI/Add", "ReferenceOrderNumber");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.com.tmha.mos057mi.add
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddCollection }
     * 
     */
    public AddCollection createAddCollection() {
        return new AddCollection();
    }

    /**
     * Create an instance of {@link AddResponseCollection }
     * 
     */
    public AddResponseCollection createAddResponseCollection() {
        return new AddResponseCollection();
    }

    /**
     * Create an instance of {@link AddResponseItem }
     * 
     */
    public AddResponseItem createAddResponseItem() {
        return new AddResponseItem();
    }

    /**
     * Create an instance of {@link AddItem }
     * 
     */
    public AddItem createAddItem() {
        return new AddItem();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddResponseCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Add", name = "AddResponse")
    public JAXBElement<AddResponseCollection> createAddResponse(AddResponseCollection value) {
        return new JAXBElement<AddResponseCollection>(_AddResponse_QNAME, AddResponseCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Add", name = "Add")
    public JAXBElement<AddCollection> createAdd(AddCollection value) {
        return new JAXBElement<AddCollection>(_Add_QNAME, AddCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Add", name = "SequenceNumber", scope = AddResponseItem.class)
    public JAXBElement<BigDecimal> createAddResponseItemSequenceNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AddResponseItemSequenceNumber_QNAME, BigDecimal.class, AddResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Add", name = "LineSuffixRIDX", scope = AddItem.class)
    public JAXBElement<BigDecimal> createAddItemLineSuffixRIDX(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AddItemLineSuffixRIDX_QNAME, BigDecimal.class, AddItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Add", name = "UserdefinedField3Item", scope = AddItem.class)
    public JAXBElement<String> createAddItemUserdefinedField3Item(String value) {
        return new JAXBElement<String>(_AddItemUserdefinedField3Item_QNAME, String.class, AddItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Add", name = "ItemNumber", scope = AddItem.class)
    public JAXBElement<String> createAddItemItemNumber(String value) {
        return new JAXBElement<String>(_AddItemItemNumber_QNAME, String.class, AddItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Add", name = "UserdefinedField5Item", scope = AddItem.class)
    public JAXBElement<String> createAddItemUserdefinedField5Item(String value) {
        return new JAXBElement<String>(_AddItemUserdefinedField5Item_QNAME, String.class, AddItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Add", name = "BreakDownTime", scope = AddItem.class)
    public JAXBElement<BigDecimal> createAddItemBreakDownTime(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AddItemBreakDownTime_QNAME, BigDecimal.class, AddItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Add", name = "OrderNumber", scope = AddItem.class)
    public JAXBElement<String> createAddItemOrderNumber(String value) {
        return new JAXBElement<String>(_AddItemOrderNumber_QNAME, String.class, AddItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Add", name = "EquipmentInProductionTime", scope = AddItem.class)
    public JAXBElement<BigDecimal> createAddItemEquipmentInProductionTime(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AddItemEquipmentInProductionTime_QNAME, BigDecimal.class, AddItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Add", name = "Status", scope = AddItem.class)
    public JAXBElement<String> createAddItemStatus(String value) {
        return new JAXBElement<String>(_AddItemStatus_QNAME, String.class, AddItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Add", name = "Text", scope = AddItem.class)
    public JAXBElement<String> createAddItemText(String value) {
        return new JAXBElement<String>(_AddItemText_QNAME, String.class, AddItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Add", name = "ErrorCode3", scope = AddItem.class)
    public JAXBElement<String> createAddItemErrorCode3(String value) {
        return new JAXBElement<String>(_AddItemErrorCode3_QNAME, String.class, AddItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Add", name = "ErrorCode2", scope = AddItem.class)
    public JAXBElement<String> createAddItemErrorCode2(String value) {
        return new JAXBElement<String>(_AddItemErrorCode2_QNAME, String.class, AddItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Add", name = "ErrorCode1", scope = AddItem.class)
    public JAXBElement<String> createAddItemErrorCode1(String value) {
        return new JAXBElement<String>(_AddItemErrorCode1_QNAME, String.class, AddItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Add", name = "MachineReadyDate", scope = AddItem.class)
    public JAXBElement<XMLGregorianCalendar> createAddItemMachineReadyDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AddItemMachineReadyDate_QNAME, XMLGregorianCalendar.class, AddItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Add", name = "OrderLine", scope = AddItem.class)
    public JAXBElement<BigDecimal> createAddItemOrderLine(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AddItemOrderLine_QNAME, BigDecimal.class, AddItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Add", name = "TextTXL0", scope = AddItem.class)
    public JAXBElement<String> createAddItemTextTXL0(String value) {
        return new JAXBElement<String>(_AddItemTextTXL0_QNAME, String.class, AddItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Add", name = "TextTXL2", scope = AddItem.class)
    public JAXBElement<String> createAddItemTextTXL2(String value) {
        return new JAXBElement<String>(_AddItemTextTXL2_QNAME, String.class, AddItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Add", name = "DocumentIdentity", scope = AddItem.class)
    public JAXBElement<String> createAddItemDocumentIdentity(String value) {
        return new JAXBElement<String>(_AddItemDocumentIdentity_QNAME, String.class, AddItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Add", name = "TextTXL8", scope = AddItem.class)
    public JAXBElement<String> createAddItemTextTXL8(String value) {
        return new JAXBElement<String>(_AddItemTextTXL8_QNAME, String.class, AddItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Add", name = "TextTXL7", scope = AddItem.class)
    public JAXBElement<String> createAddItemTextTXL7(String value) {
        return new JAXBElement<String>(_AddItemTextTXL7_QNAME, String.class, AddItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Add", name = "TextTXL9", scope = AddItem.class)
    public JAXBElement<String> createAddItemTextTXL9(String value) {
        return new JAXBElement<String>(_AddItemTextTXL9_QNAME, String.class, AddItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Add", name = "ReferenceOrderCategory", scope = AddItem.class)
    public JAXBElement<BigDecimal> createAddItemReferenceOrderCategory(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AddItemReferenceOrderCategory_QNAME, BigDecimal.class, AddItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Add", name = "TextTXL4", scope = AddItem.class)
    public JAXBElement<String> createAddItemTextTXL4(String value) {
        return new JAXBElement<String>(_AddItemTextTXL4_QNAME, String.class, AddItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Add", name = "TextTXL3", scope = AddItem.class)
    public JAXBElement<String> createAddItemTextTXL3(String value) {
        return new JAXBElement<String>(_AddItemTextTXL3_QNAME, String.class, AddItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Add", name = "TextTXL6", scope = AddItem.class)
    public JAXBElement<String> createAddItemTextTXL6(String value) {
        return new JAXBElement<String>(_AddItemTextTXL6_QNAME, String.class, AddItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Add", name = "SinceNew", scope = AddItem.class)
    public JAXBElement<BigDecimal> createAddItemSinceNew(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AddItemSinceNew_QNAME, BigDecimal.class, AddItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Add", name = "UserdefinedField4Item", scope = AddItem.class)
    public JAXBElement<String> createAddItemUserdefinedField4Item(String value) {
        return new JAXBElement<String>(_AddItemUserdefinedField4Item_QNAME, String.class, AddItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Add", name = "TextTXL5", scope = AddItem.class)
    public JAXBElement<String> createAddItemTextTXL5(String value) {
        return new JAXBElement<String>(_AddItemTextTXL5_QNAME, String.class, AddItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Add", name = "Warranty", scope = AddItem.class)
    public JAXBElement<BigDecimal> createAddItemWarranty(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AddItemWarranty_QNAME, BigDecimal.class, AddItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Add", name = "DurabilityFlag", scope = AddItem.class)
    public JAXBElement<BigDecimal> createAddItemDurabilityFlag(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AddItemDurabilityFlag_QNAME, BigDecimal.class, AddItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Add", name = "LineSuffix", scope = AddItem.class)
    public JAXBElement<BigDecimal> createAddItemLineSuffix(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AddItemLineSuffix_QNAME, BigDecimal.class, AddItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Add", name = "ReferenceIdentityCode", scope = AddItem.class)
    public JAXBElement<BigDecimal> createAddItemReferenceIdentityCode(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AddItemReferenceIdentityCode_QNAME, BigDecimal.class, AddItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Add", name = "Meter", scope = AddItem.class)
    public JAXBElement<String> createAddItemMeter(String value) {
        return new JAXBElement<String>(_AddItemMeter_QNAME, String.class, AddItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Add", name = "MachineReadyTime", scope = AddItem.class)
    public JAXBElement<BigDecimal> createAddItemMachineReadyTime(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AddItemMachineReadyTime_QNAME, BigDecimal.class, AddItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Add", name = "ReportedBy", scope = AddItem.class)
    public JAXBElement<String> createAddItemReportedBy(String value) {
        return new JAXBElement<String>(_AddItemReportedBy_QNAME, String.class, AddItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Add", name = "UserdefinedField2Item", scope = AddItem.class)
    public JAXBElement<BigDecimal> createAddItemUserdefinedField2Item(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AddItemUserdefinedField2Item_QNAME, BigDecimal.class, AddItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Add", name = "UserdefinedField1Item", scope = AddItem.class)
    public JAXBElement<String> createAddItemUserdefinedField1Item(String value) {
        return new JAXBElement<String>(_AddItemUserdefinedField1Item_QNAME, String.class, AddItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Add", name = "ReferenceOrderLine", scope = AddItem.class)
    public JAXBElement<BigDecimal> createAddItemReferenceOrderLine(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AddItemReferenceOrderLine_QNAME, BigDecimal.class, AddItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Add", name = "Inoperable", scope = AddItem.class)
    public JAXBElement<BigDecimal> createAddItemInoperable(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AddItemInoperable_QNAME, BigDecimal.class, AddItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Add", name = "MainService", scope = AddItem.class)
    public JAXBElement<BigDecimal> createAddItemMainService(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AddItemMainService_QNAME, BigDecimal.class, AddItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Add", name = "BreakdownDate", scope = AddItem.class)
    public JAXBElement<XMLGregorianCalendar> createAddItemBreakdownDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AddItemBreakdownDate_QNAME, XMLGregorianCalendar.class, AddItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Add", name = "NonOEMPart", scope = AddItem.class)
    public JAXBElement<BigDecimal> createAddItemNonOEMPart(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AddItemNonOEMPart_QNAME, BigDecimal.class, AddItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Add", name = "DrawingPosition", scope = AddItem.class)
    public JAXBElement<String> createAddItemDrawingPosition(String value) {
        return new JAXBElement<String>(_AddItemDrawingPosition_QNAME, String.class, AddItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Add", name = "EquipmentInProductionDate", scope = AddItem.class)
    public JAXBElement<XMLGregorianCalendar> createAddItemEquipmentInProductionDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AddItemEquipmentInProductionDate_QNAME, XMLGregorianCalendar.class, AddItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Add", name = "ProductStructureType", scope = AddItem.class)
    public JAXBElement<String> createAddItemProductStructureType(String value) {
        return new JAXBElement<String>(_AddItemProductStructureType_QNAME, String.class, AddItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Add", name = "SerialNumber", scope = AddItem.class)
    public JAXBElement<String> createAddItemSerialNumber(String value) {
        return new JAXBElement<String>(_AddItemSerialNumber_QNAME, String.class, AddItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Add", name = "SequenceNumber", scope = AddItem.class)
    public JAXBElement<BigDecimal> createAddItemSequenceNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AddResponseItemSequenceNumber_QNAME, BigDecimal.class, AddItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Add", name = "ErrorReportQuantity", scope = AddItem.class)
    public JAXBElement<BigDecimal> createAddItemErrorReportQuantity(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AddItemErrorReportQuantity_QNAME, BigDecimal.class, AddItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Add", name = "MeterValue1", scope = AddItem.class)
    public JAXBElement<BigDecimal> createAddItemMeterValue1(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AddItemMeterValue1_QNAME, BigDecimal.class, AddItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Add", name = "MeterValue3", scope = AddItem.class)
    public JAXBElement<BigDecimal> createAddItemMeterValue3(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AddItemMeterValue3_QNAME, BigDecimal.class, AddItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Add", name = "MeterValue2", scope = AddItem.class)
    public JAXBElement<BigDecimal> createAddItemMeterValue2(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AddItemMeterValue2_QNAME, BigDecimal.class, AddItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Add", name = "Service", scope = AddItem.class)
    public JAXBElement<String> createAddItemService(String value) {
        return new JAXBElement<String>(_AddItemService_QNAME, String.class, AddItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Add", name = "MeterValue4", scope = AddItem.class)
    public JAXBElement<BigDecimal> createAddItemMeterValue4(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AddItemMeterValue4_QNAME, BigDecimal.class, AddItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS057MI/Add", name = "ReferenceOrderNumber", scope = AddItem.class)
    public JAXBElement<String> createAddItemReferenceOrderNumber(String value) {
        return new JAXBElement<String>(_AddItemReferenceOrderNumber_QNAME, String.class, AddItem.class, value);
    }

}
