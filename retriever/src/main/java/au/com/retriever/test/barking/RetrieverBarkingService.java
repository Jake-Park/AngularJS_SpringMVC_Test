package au.com.retriever.test.barking;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;

import com.integrationwizards.common.Constants;

/**
 * This class was generated by Apache CXF 2.7.18
 * 2016-01-27T10:48:01.682+11:00
 * Generated source version: 2.7.18
 * 
 */
@WebServiceClient(name = "RetrieverBarkingService", 
                  wsdlLocation = Constants.localWorkspacePath + "retriever.wsdl",
                  targetNamespace = "https://test.retriever.com.au/barking") 
public class RetrieverBarkingService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("https://test.retriever.com.au/barking", "RetrieverBarkingService");
    public final static QName RetrieverBarkingPort = new QName("https://test.retriever.com.au/barking", "RetrieverBarkingPort");
    static {
        URL url = null;
        try {
            url = new URL(Constants.localWorkspacePath + "retriever.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(RetrieverBarkingService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", Constants.localWorkspacePath + "retriever.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public RetrieverBarkingService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public RetrieverBarkingService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RetrieverBarkingService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public RetrieverBarkingService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public RetrieverBarkingService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public RetrieverBarkingService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns RetrieverBarking
     */
    @WebEndpoint(name = "RetrieverBarkingPort")
    public RetrieverBarking getRetrieverBarkingPort() {
        return super.getPort(RetrieverBarkingPort, RetrieverBarking.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RetrieverBarking
     */
    @WebEndpoint(name = "RetrieverBarkingPort")
    public RetrieverBarking getRetrieverBarkingPort(WebServiceFeature... features) {
        return super.getPort(RetrieverBarkingPort, RetrieverBarking.class, features);
    }

}
