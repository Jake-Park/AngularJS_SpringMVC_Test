package au.com.tmha.mos070mi;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.18
 * 2016-02-24T10:22:00.057+11:00
 * Generated source version: 2.7.18
 * 
 */
@WebService(targetNamespace = "http://www.tmha.com.au/MOS070MI", name = "MOS070MI")
@XmlSeeAlso({au.com.tmha.mos070mi.updoperation.ObjectFactory.class, com.lawson.ws.credentials.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface MOS070MI {

    @WebResult(name = "UpdOperationResponse", targetNamespace = "http://www.tmha.com.au/MOS070MI/UpdOperation", partName = "UpdOperationResponse")
    @WebMethod(operationName = "UpdOperation")
    public au.com.tmha.mos070mi.updoperation.UpdOperationResponseCollection updOperation(
        @WebParam(partName = "UpdOperation", name = "UpdOperation", targetNamespace = "http://www.tmha.com.au/MOS070MI/UpdOperation")
        au.com.tmha.mos070mi.updoperation.UpdOperationCollection updOperation
    );
}
