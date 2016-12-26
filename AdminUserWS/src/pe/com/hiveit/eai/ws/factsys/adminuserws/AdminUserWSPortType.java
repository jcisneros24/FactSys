package pe.com.hiveit.eai.ws.factsys.adminuserws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

import pe.com.hiveit.eai.ws.factsys.adminuserws.types.ConsultarUserRequest;
import pe.com.hiveit.eai.ws.factsys.adminuserws.types.ConsultarUserResponse;
import pe.com.hiveit.eai.ws.factsys.adminuserws.types.ObjectFactory;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "LoginType", targetNamespace = "http://hiveit.com.pe/eai/ws/sisfact/loginws")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AdminUserWSPortType {


    /**
     * 
     * @param request
     * @return
     *     returns pe.com.hiveit.eai.ws.sisfact.loginws.types.ConsultarUserResponse
     */
    @WebMethod(action = "http://hiveit.com.pe/eai/ws/sisfact/loginws/consultarUser")
    @WebResult(name = "consultarUserResponse", targetNamespace = "http://hiveit.com.pe/eai/ws/sisfact/loginws/types", partName = "response")
    public ConsultarUserResponse consultarUser(
        @WebParam(name = "consultarUserRequest", targetNamespace = "http://hiveit.com.pe/eai/ws/sisfact/loginws/types", partName = "request")
        ConsultarUserRequest request);

}
