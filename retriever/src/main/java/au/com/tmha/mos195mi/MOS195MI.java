package au.com.tmha.mos195mi;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.18
 * 2016-02-12T12:42:49.048+11:00
 * Generated source version: 2.7.18
 * 
 */
@WebService(targetNamespace = "http://www.tmha.com.au/MOS195MI", name = "MOS195MI")
@XmlSeeAlso({com.lawson.ws.credentials.ObjectFactory.class, au.com.tmha.mos195mi.selwoelem.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface MOS195MI {

    @WebResult(name = "SelWoElemResponse", targetNamespace = "http://www.tmha.com.au/MOS195MI/SelWoElem", partName = "SelWoElemResponse")
    @WebMethod(operationName = "SelWoElem")
    public au.com.tmha.mos195mi.selwoelem.SelWoElemResponseCollection selWoElem(
        @WebParam(partName = "SelWoElem", name = "SelWoElem", targetNamespace = "http://www.tmha.com.au/MOS195MI/SelWoElem")
        au.com.tmha.mos195mi.selwoelem.SelWoElemCollection selWoElem
    );
}
