
package au.com.tmha.mos104mi.lstoperelement;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.com.tmha.mos104mi.lstoperelement package. 
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

    private final static QName _LstOperElementResponse_QNAME = new QName("http://www.tmha.com.au/MOS104MI/LstOperElement", "LstOperElementResponse");
    private final static QName _LstOperElement_QNAME = new QName("http://www.tmha.com.au/MOS104MI/LstOperElement", "LstOperElement");
    private final static QName _LstOperElementItemOperationElementType_QNAME = new QName("http://www.tmha.com.au/MOS104MI/LstOperElement", "OperationElementType");
    private final static QName _LstOperElementItemFacility_QNAME = new QName("http://www.tmha.com.au/MOS104MI/LstOperElement", "Facility");
    private final static QName _LstOperElementItemProductNumber_QNAME = new QName("http://www.tmha.com.au/MOS104MI/LstOperElement", "ProductNumber");
    private final static QName _LstOperElementResponseItemDescription_QNAME = new QName("http://www.tmha.com.au/MOS104MI/LstOperElement", "Description");
    private final static QName _LstOperElementResponseItemResponsible_QNAME = new QName("http://www.tmha.com.au/MOS104MI/LstOperElement", "Responsible");
    private final static QName _LstOperElementResponseItemWorkOrderNumber_QNAME = new QName("http://www.tmha.com.au/MOS104MI/LstOperElement", "WorkOrderNumber");
    private final static QName _LstOperElementResponseItemToolNumber_QNAME = new QName("http://www.tmha.com.au/MOS104MI/LstOperElement", "ToolNumber");
    private final static QName _LstOperElementResponseItemStatus_QNAME = new QName("http://www.tmha.com.au/MOS104MI/LstOperElement", "Status");
    private final static QName _LstOperElementResponseItemName_QNAME = new QName("http://www.tmha.com.au/MOS104MI/LstOperElement", "Name");
    private final static QName _LstOperElementResponseItemTaskElementNumber_QNAME = new QName("http://www.tmha.com.au/MOS104MI/LstOperElement", "TaskElementNumber");
    private final static QName _LstOperElementResponseItemEmployeeNumber_QNAME = new QName("http://www.tmha.com.au/MOS104MI/LstOperElement", "EmployeeNumber");
    private final static QName _LstOperElementResponseItemMeterValue4_QNAME = new QName("http://www.tmha.com.au/MOS104MI/LstOperElement", "MeterValue4");
    private final static QName _LstOperElementResponseItemTextIdentity_QNAME = new QName("http://www.tmha.com.au/MOS104MI/LstOperElement", "TextIdentity");
    private final static QName _LstOperElementResponseItemMeterValue1_QNAME = new QName("http://www.tmha.com.au/MOS104MI/LstOperElement", "MeterValue1");
    private final static QName _LstOperElementResponseItemQuantityOrTime_QNAME = new QName("http://www.tmha.com.au/MOS104MI/LstOperElement", "QuantityOrTime");
    private final static QName _LstOperElementResponseItemTextLine2_QNAME = new QName("http://www.tmha.com.au/MOS104MI/LstOperElement", "TextLine2");
    private final static QName _LstOperElementResponseItemMeterValue3_QNAME = new QName("http://www.tmha.com.au/MOS104MI/LstOperElement", "MeterValue3");
    private final static QName _LstOperElementResponseItemPlannedNumberOfWorkersRunTime_QNAME = new QName("http://www.tmha.com.au/MOS104MI/LstOperElement", "PlannedNumberOfWorkersRunTime");
    private final static QName _LstOperElementResponseItemTextLine1_QNAME = new QName("http://www.tmha.com.au/MOS104MI/LstOperElement", "TextLine1");
    private final static QName _LstOperElementResponseItemMeterValue2_QNAME = new QName("http://www.tmha.com.au/MOS104MI/LstOperElement", "MeterValue2");
    private final static QName _LstOperElementResponseItemWorkElement_QNAME = new QName("http://www.tmha.com.au/MOS104MI/LstOperElement", "WorkElement");
    private final static QName _LstOperElementResponseItemLaborSkill_QNAME = new QName("http://www.tmha.com.au/MOS104MI/LstOperElement", "LaborSkill");
    private final static QName _LstOperElementResponseItemSerialNumber_QNAME = new QName("http://www.tmha.com.au/MOS104MI/LstOperElement", "SerialNumber");
    private final static QName _LstOperElementResponseItemRunTime_QNAME = new QName("http://www.tmha.com.au/MOS104MI/LstOperElement", "RunTime");
    private final static QName _LstOperElementResponseItemTransactionQuantityBasicUM_QNAME = new QName("http://www.tmha.com.au/MOS104MI/LstOperElement", "TransactionQuantityBasicUM");
    private final static QName _LstOperElementResponseItemStatusMobility_QNAME = new QName("http://www.tmha.com.au/MOS104MI/LstOperElement", "StatusMobility");
    private final static QName _LstOperElementResponseItemCapabilityType_QNAME = new QName("http://www.tmha.com.au/MOS104MI/LstOperElement", "CapabilityType");
    private final static QName _LstOperElementResponseItemOperationNumber_QNAME = new QName("http://www.tmha.com.au/MOS104MI/LstOperElement", "OperationNumber");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.com.tmha.mos104mi.lstoperelement
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LstOperElementResponseCollection }
     * 
     */
    public LstOperElementResponseCollection createLstOperElementResponseCollection() {
        return new LstOperElementResponseCollection();
    }

    /**
     * Create an instance of {@link LstOperElementCollection }
     * 
     */
    public LstOperElementCollection createLstOperElementCollection() {
        return new LstOperElementCollection();
    }

    /**
     * Create an instance of {@link LstOperElementResponseItem }
     * 
     */
    public LstOperElementResponseItem createLstOperElementResponseItem() {
        return new LstOperElementResponseItem();
    }

    /**
     * Create an instance of {@link LstOperElementItem }
     * 
     */
    public LstOperElementItem createLstOperElementItem() {
        return new LstOperElementItem();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LstOperElementResponseCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS104MI/LstOperElement", name = "LstOperElementResponse")
    public JAXBElement<LstOperElementResponseCollection> createLstOperElementResponse(LstOperElementResponseCollection value) {
        return new JAXBElement<LstOperElementResponseCollection>(_LstOperElementResponse_QNAME, LstOperElementResponseCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LstOperElementCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS104MI/LstOperElement", name = "LstOperElement")
    public JAXBElement<LstOperElementCollection> createLstOperElement(LstOperElementCollection value) {
        return new JAXBElement<LstOperElementCollection>(_LstOperElement_QNAME, LstOperElementCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS104MI/LstOperElement", name = "OperationElementType", scope = LstOperElementItem.class)
    public JAXBElement<String> createLstOperElementItemOperationElementType(String value) {
        return new JAXBElement<String>(_LstOperElementItemOperationElementType_QNAME, String.class, LstOperElementItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS104MI/LstOperElement", name = "Facility", scope = LstOperElementItem.class)
    public JAXBElement<String> createLstOperElementItemFacility(String value) {
        return new JAXBElement<String>(_LstOperElementItemFacility_QNAME, String.class, LstOperElementItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS104MI/LstOperElement", name = "ProductNumber", scope = LstOperElementItem.class)
    public JAXBElement<String> createLstOperElementItemProductNumber(String value) {
        return new JAXBElement<String>(_LstOperElementItemProductNumber_QNAME, String.class, LstOperElementItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS104MI/LstOperElement", name = "Description", scope = LstOperElementResponseItem.class)
    public JAXBElement<String> createLstOperElementResponseItemDescription(String value) {
        return new JAXBElement<String>(_LstOperElementResponseItemDescription_QNAME, String.class, LstOperElementResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS104MI/LstOperElement", name = "Responsible", scope = LstOperElementResponseItem.class)
    public JAXBElement<String> createLstOperElementResponseItemResponsible(String value) {
        return new JAXBElement<String>(_LstOperElementResponseItemResponsible_QNAME, String.class, LstOperElementResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS104MI/LstOperElement", name = "WorkOrderNumber", scope = LstOperElementResponseItem.class)
    public JAXBElement<String> createLstOperElementResponseItemWorkOrderNumber(String value) {
        return new JAXBElement<String>(_LstOperElementResponseItemWorkOrderNumber_QNAME, String.class, LstOperElementResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS104MI/LstOperElement", name = "ProductNumber", scope = LstOperElementResponseItem.class)
    public JAXBElement<String> createLstOperElementResponseItemProductNumber(String value) {
        return new JAXBElement<String>(_LstOperElementItemProductNumber_QNAME, String.class, LstOperElementResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS104MI/LstOperElement", name = "ToolNumber", scope = LstOperElementResponseItem.class)
    public JAXBElement<String> createLstOperElementResponseItemToolNumber(String value) {
        return new JAXBElement<String>(_LstOperElementResponseItemToolNumber_QNAME, String.class, LstOperElementResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS104MI/LstOperElement", name = "Status", scope = LstOperElementResponseItem.class)
    public JAXBElement<String> createLstOperElementResponseItemStatus(String value) {
        return new JAXBElement<String>(_LstOperElementResponseItemStatus_QNAME, String.class, LstOperElementResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS104MI/LstOperElement", name = "Name", scope = LstOperElementResponseItem.class)
    public JAXBElement<String> createLstOperElementResponseItemName(String value) {
        return new JAXBElement<String>(_LstOperElementResponseItemName_QNAME, String.class, LstOperElementResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS104MI/LstOperElement", name = "OperationElementType", scope = LstOperElementResponseItem.class)
    public JAXBElement<String> createLstOperElementResponseItemOperationElementType(String value) {
        return new JAXBElement<String>(_LstOperElementItemOperationElementType_QNAME, String.class, LstOperElementResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS104MI/LstOperElement", name = "Facility", scope = LstOperElementResponseItem.class)
    public JAXBElement<String> createLstOperElementResponseItemFacility(String value) {
        return new JAXBElement<String>(_LstOperElementItemFacility_QNAME, String.class, LstOperElementResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS104MI/LstOperElement", name = "TaskElementNumber", scope = LstOperElementResponseItem.class)
    public JAXBElement<BigDecimal> createLstOperElementResponseItemTaskElementNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_LstOperElementResponseItemTaskElementNumber_QNAME, BigDecimal.class, LstOperElementResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS104MI/LstOperElement", name = "EmployeeNumber", scope = LstOperElementResponseItem.class)
    public JAXBElement<String> createLstOperElementResponseItemEmployeeNumber(String value) {
        return new JAXBElement<String>(_LstOperElementResponseItemEmployeeNumber_QNAME, String.class, LstOperElementResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS104MI/LstOperElement", name = "MeterValue4", scope = LstOperElementResponseItem.class)
    public JAXBElement<BigDecimal> createLstOperElementResponseItemMeterValue4(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_LstOperElementResponseItemMeterValue4_QNAME, BigDecimal.class, LstOperElementResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS104MI/LstOperElement", name = "TextIdentity", scope = LstOperElementResponseItem.class)
    public JAXBElement<BigDecimal> createLstOperElementResponseItemTextIdentity(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_LstOperElementResponseItemTextIdentity_QNAME, BigDecimal.class, LstOperElementResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS104MI/LstOperElement", name = "MeterValue1", scope = LstOperElementResponseItem.class)
    public JAXBElement<BigDecimal> createLstOperElementResponseItemMeterValue1(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_LstOperElementResponseItemMeterValue1_QNAME, BigDecimal.class, LstOperElementResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS104MI/LstOperElement", name = "QuantityOrTime", scope = LstOperElementResponseItem.class)
    public JAXBElement<BigDecimal> createLstOperElementResponseItemQuantityOrTime(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_LstOperElementResponseItemQuantityOrTime_QNAME, BigDecimal.class, LstOperElementResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS104MI/LstOperElement", name = "TextLine2", scope = LstOperElementResponseItem.class)
    public JAXBElement<String> createLstOperElementResponseItemTextLine2(String value) {
        return new JAXBElement<String>(_LstOperElementResponseItemTextLine2_QNAME, String.class, LstOperElementResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS104MI/LstOperElement", name = "MeterValue3", scope = LstOperElementResponseItem.class)
    public JAXBElement<BigDecimal> createLstOperElementResponseItemMeterValue3(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_LstOperElementResponseItemMeterValue3_QNAME, BigDecimal.class, LstOperElementResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS104MI/LstOperElement", name = "PlannedNumberOfWorkersRunTime", scope = LstOperElementResponseItem.class)
    public JAXBElement<BigDecimal> createLstOperElementResponseItemPlannedNumberOfWorkersRunTime(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_LstOperElementResponseItemPlannedNumberOfWorkersRunTime_QNAME, BigDecimal.class, LstOperElementResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS104MI/LstOperElement", name = "TextLine1", scope = LstOperElementResponseItem.class)
    public JAXBElement<String> createLstOperElementResponseItemTextLine1(String value) {
        return new JAXBElement<String>(_LstOperElementResponseItemTextLine1_QNAME, String.class, LstOperElementResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS104MI/LstOperElement", name = "MeterValue2", scope = LstOperElementResponseItem.class)
    public JAXBElement<BigDecimal> createLstOperElementResponseItemMeterValue2(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_LstOperElementResponseItemMeterValue2_QNAME, BigDecimal.class, LstOperElementResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS104MI/LstOperElement", name = "WorkElement", scope = LstOperElementResponseItem.class)
    public JAXBElement<String> createLstOperElementResponseItemWorkElement(String value) {
        return new JAXBElement<String>(_LstOperElementResponseItemWorkElement_QNAME, String.class, LstOperElementResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS104MI/LstOperElement", name = "LaborSkill", scope = LstOperElementResponseItem.class)
    public JAXBElement<String> createLstOperElementResponseItemLaborSkill(String value) {
        return new JAXBElement<String>(_LstOperElementResponseItemLaborSkill_QNAME, String.class, LstOperElementResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS104MI/LstOperElement", name = "SerialNumber", scope = LstOperElementResponseItem.class)
    public JAXBElement<String> createLstOperElementResponseItemSerialNumber(String value) {
        return new JAXBElement<String>(_LstOperElementResponseItemSerialNumber_QNAME, String.class, LstOperElementResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS104MI/LstOperElement", name = "RunTime", scope = LstOperElementResponseItem.class)
    public JAXBElement<BigDecimal> createLstOperElementResponseItemRunTime(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_LstOperElementResponseItemRunTime_QNAME, BigDecimal.class, LstOperElementResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS104MI/LstOperElement", name = "TransactionQuantityBasicUM", scope = LstOperElementResponseItem.class)
    public JAXBElement<BigDecimal> createLstOperElementResponseItemTransactionQuantityBasicUM(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_LstOperElementResponseItemTransactionQuantityBasicUM_QNAME, BigDecimal.class, LstOperElementResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS104MI/LstOperElement", name = "StatusMobility", scope = LstOperElementResponseItem.class)
    public JAXBElement<String> createLstOperElementResponseItemStatusMobility(String value) {
        return new JAXBElement<String>(_LstOperElementResponseItemStatusMobility_QNAME, String.class, LstOperElementResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS104MI/LstOperElement", name = "CapabilityType", scope = LstOperElementResponseItem.class)
    public JAXBElement<String> createLstOperElementResponseItemCapabilityType(String value) {
        return new JAXBElement<String>(_LstOperElementResponseItemCapabilityType_QNAME, String.class, LstOperElementResponseItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmha.com.au/MOS104MI/LstOperElement", name = "OperationNumber", scope = LstOperElementResponseItem.class)
    public JAXBElement<BigDecimal> createLstOperElementResponseItemOperationNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_LstOperElementResponseItemOperationNumber_QNAME, BigDecimal.class, LstOperElementResponseItem.class, value);
    }

}
