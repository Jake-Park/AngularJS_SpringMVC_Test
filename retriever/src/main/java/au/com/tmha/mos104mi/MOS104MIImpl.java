
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package au.com.tmha.mos104mi;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.18
 * 2016-02-10T10:32:10.037+11:00
 * Generated source version: 2.7.18
 * 
 */

@javax.jws.WebService(
                      serviceName = "MOS104MIService",
                      portName = "MOS104MIPort",
                      targetNamespace = "http://www.tmha.com.au/MOS104MI",
                      wsdlLocation = "file:/C:/Users/User/workspace/JAXWSEclipse/WebContent/WEB-INF/MOS104MI.wsdl",
                      endpointInterface = "au.com.tmha.mos104mi.MOS104MI")
                      
public class MOS104MIImpl implements MOS104MI {

    private static final Logger LOG = Logger.getLogger(MOS104MIImpl.class.getName());

    /* (non-Javadoc)
     * @see au.com.tmha.mos104mi.MOS104MI#lstOperElement(au.com.tmha.mos104mi.lstoperelement.LstOperElementCollection  lstOperElement )*
     */
    public au.com.tmha.mos104mi.lstoperelement.LstOperElementResponseCollection lstOperElement(au.com.tmha.mos104mi.lstoperelement.LstOperElementCollection lstOperElement) { 
        LOG.info("Executing operation lstOperElement");
        System.out.println(lstOperElement);
        try {
            au.com.tmha.mos104mi.lstoperelement.LstOperElementResponseCollection _return = new au.com.tmha.mos104mi.lstoperelement.LstOperElementResponseCollection();
            java.util.List<au.com.tmha.mos104mi.lstoperelement.LstOperElementResponseItem> _returnLstOperElementResponseItem = new java.util.ArrayList<au.com.tmha.mos104mi.lstoperelement.LstOperElementResponseItem>();
            au.com.tmha.mos104mi.lstoperelement.LstOperElementResponseItem _returnLstOperElementResponseItemVal1 = new au.com.tmha.mos104mi.lstoperelement.LstOperElementResponseItem();
            javax.xml.bind.JAXBElement<java.lang.String> _returnLstOperElementResponseItemVal1Description = null;
            _returnLstOperElementResponseItemVal1.setDescription(_returnLstOperElementResponseItemVal1Description);
            javax.xml.bind.JAXBElement<java.lang.String> _returnLstOperElementResponseItemVal1WorkElement = null;
            _returnLstOperElementResponseItemVal1.setWorkElement(_returnLstOperElementResponseItemVal1WorkElement);
            javax.xml.bind.JAXBElement<java.math.BigDecimal> _returnLstOperElementResponseItemVal1TaskElementNumber = null;
            _returnLstOperElementResponseItemVal1.setTaskElementNumber(_returnLstOperElementResponseItemVal1TaskElementNumber);
            javax.xml.bind.JAXBElement<java.lang.String> _returnLstOperElementResponseItemVal1OperationElementType = null;
            _returnLstOperElementResponseItemVal1.setOperationElementType(_returnLstOperElementResponseItemVal1OperationElementType);
            javax.xml.bind.JAXBElement<java.lang.String> _returnLstOperElementResponseItemVal1CapabilityType = null;
            _returnLstOperElementResponseItemVal1.setCapabilityType(_returnLstOperElementResponseItemVal1CapabilityType);
            javax.xml.bind.JAXBElement<java.lang.String> _returnLstOperElementResponseItemVal1Name = null;
            _returnLstOperElementResponseItemVal1.setName(_returnLstOperElementResponseItemVal1Name);
            javax.xml.bind.JAXBElement<java.lang.String> _returnLstOperElementResponseItemVal1EmployeeNumber = null;
            _returnLstOperElementResponseItemVal1.setEmployeeNumber(_returnLstOperElementResponseItemVal1EmployeeNumber);
            javax.xml.bind.JAXBElement<java.lang.String> _returnLstOperElementResponseItemVal1Facility = null;
            _returnLstOperElementResponseItemVal1.setFacility(_returnLstOperElementResponseItemVal1Facility);
            javax.xml.bind.JAXBElement<java.lang.String> _returnLstOperElementResponseItemVal1LaborSkill = null;
            _returnLstOperElementResponseItemVal1.setLaborSkill(_returnLstOperElementResponseItemVal1LaborSkill);
            javax.xml.bind.JAXBElement<java.math.BigDecimal> _returnLstOperElementResponseItemVal1MeterValue1 = null;
            _returnLstOperElementResponseItemVal1.setMeterValue1(_returnLstOperElementResponseItemVal1MeterValue1);
            javax.xml.bind.JAXBElement<java.math.BigDecimal> _returnLstOperElementResponseItemVal1MeterValue2 = null;
            _returnLstOperElementResponseItemVal1.setMeterValue2(_returnLstOperElementResponseItemVal1MeterValue2);
            javax.xml.bind.JAXBElement<java.math.BigDecimal> _returnLstOperElementResponseItemVal1MeterValue3 = null;
            _returnLstOperElementResponseItemVal1.setMeterValue3(_returnLstOperElementResponseItemVal1MeterValue3);
            javax.xml.bind.JAXBElement<java.math.BigDecimal> _returnLstOperElementResponseItemVal1MeterValue4 = null;
            _returnLstOperElementResponseItemVal1.setMeterValue4(_returnLstOperElementResponseItemVal1MeterValue4);
            javax.xml.bind.JAXBElement<java.lang.String> _returnLstOperElementResponseItemVal1WorkOrderNumber = null;
            _returnLstOperElementResponseItemVal1.setWorkOrderNumber(_returnLstOperElementResponseItemVal1WorkOrderNumber);
            javax.xml.bind.JAXBElement<java.math.BigDecimal> _returnLstOperElementResponseItemVal1OperationNumber = null;
            _returnLstOperElementResponseItemVal1.setOperationNumber(_returnLstOperElementResponseItemVal1OperationNumber);
            javax.xml.bind.JAXBElement<java.math.BigDecimal> _returnLstOperElementResponseItemVal1QuantityOrTime = null;
            _returnLstOperElementResponseItemVal1.setQuantityOrTime(_returnLstOperElementResponseItemVal1QuantityOrTime);
            javax.xml.bind.JAXBElement<java.math.BigDecimal> _returnLstOperElementResponseItemVal1RunTime = null;
            _returnLstOperElementResponseItemVal1.setRunTime(_returnLstOperElementResponseItemVal1RunTime);
            javax.xml.bind.JAXBElement<java.lang.String> _returnLstOperElementResponseItemVal1ProductNumber = null;
            _returnLstOperElementResponseItemVal1.setProductNumber(_returnLstOperElementResponseItemVal1ProductNumber);
            javax.xml.bind.JAXBElement<java.math.BigDecimal> _returnLstOperElementResponseItemVal1PlannedNumberOfWorkersRunTime = null;
            _returnLstOperElementResponseItemVal1.setPlannedNumberOfWorkersRunTime(_returnLstOperElementResponseItemVal1PlannedNumberOfWorkersRunTime);
            javax.xml.bind.JAXBElement<java.lang.String> _returnLstOperElementResponseItemVal1Responsible = null;
            _returnLstOperElementResponseItemVal1.setResponsible(_returnLstOperElementResponseItemVal1Responsible);
            javax.xml.bind.JAXBElement<java.lang.String> _returnLstOperElementResponseItemVal1SerialNumber = null;
            _returnLstOperElementResponseItemVal1.setSerialNumber(_returnLstOperElementResponseItemVal1SerialNumber);
            javax.xml.bind.JAXBElement<java.lang.String> _returnLstOperElementResponseItemVal1Status = null;
            _returnLstOperElementResponseItemVal1.setStatus(_returnLstOperElementResponseItemVal1Status);
            javax.xml.bind.JAXBElement<java.lang.String> _returnLstOperElementResponseItemVal1StatusMobility = null;
            _returnLstOperElementResponseItemVal1.setStatusMobility(_returnLstOperElementResponseItemVal1StatusMobility);
            javax.xml.bind.JAXBElement<java.lang.String> _returnLstOperElementResponseItemVal1ToolNumber = null;
            _returnLstOperElementResponseItemVal1.setToolNumber(_returnLstOperElementResponseItemVal1ToolNumber);
            javax.xml.bind.JAXBElement<java.math.BigDecimal> _returnLstOperElementResponseItemVal1TransactionQuantityBasicUM = null;
            _returnLstOperElementResponseItemVal1.setTransactionQuantityBasicUM(_returnLstOperElementResponseItemVal1TransactionQuantityBasicUM);
            javax.xml.bind.JAXBElement<java.math.BigDecimal> _returnLstOperElementResponseItemVal1TextIdentity = null;
            _returnLstOperElementResponseItemVal1.setTextIdentity(_returnLstOperElementResponseItemVal1TextIdentity);
            javax.xml.bind.JAXBElement<java.lang.String> _returnLstOperElementResponseItemVal1TextLine1 = null;
            _returnLstOperElementResponseItemVal1.setTextLine1(_returnLstOperElementResponseItemVal1TextLine1);
            javax.xml.bind.JAXBElement<java.lang.String> _returnLstOperElementResponseItemVal1TextLine2 = null;
            _returnLstOperElementResponseItemVal1.setTextLine2(_returnLstOperElementResponseItemVal1TextLine2);
            _returnLstOperElementResponseItem.add(_returnLstOperElementResponseItemVal1);
            _return.getLstOperElementResponseItem().addAll(_returnLstOperElementResponseItem);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
