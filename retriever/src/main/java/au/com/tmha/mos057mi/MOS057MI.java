package au.com.tmha.mos057mi;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.18
 * 2016-02-29T11:53:31.462+11:00
 * Generated source version: 2.7.18
 * 
 */
@WebService(targetNamespace = "http://www.tmha.com.au/MOS057MI", name = "MOS057MI")
@XmlSeeAlso({au.com.tmha.mos057mi.upd.ObjectFactory.class, au.com.tmha.mos057mi.add.ObjectFactory.class, com.lawson.ws.credentials.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface MOS057MI {

    @WebResult(name = "UpdResponse", targetNamespace = "http://www.tmha.com.au/MOS057MI/Upd", partName = "UpdResponse")
    @WebMethod(operationName = "Upd")
    public au.com.tmha.mos057mi.upd.UpdResponseCollection upd(
        @WebParam(partName = "Upd", name = "Upd", targetNamespace = "http://www.tmha.com.au/MOS057MI/Upd")
        au.com.tmha.mos057mi.upd.UpdCollection upd
    );

    @WebResult(name = "AddResponse", targetNamespace = "http://www.tmha.com.au/MOS057MI/Add", partName = "AddResponse")
    @WebMethod(operationName = "Add")
    public au.com.tmha.mos057mi.add.AddResponseCollection add(
        @WebParam(partName = "Add", name = "Add", targetNamespace = "http://www.tmha.com.au/MOS057MI/Add")
        au.com.tmha.mos057mi.add.AddCollection add
    );
}
