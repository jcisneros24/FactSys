package pe.com.hiveit.eai.ws.factsys.adminproductws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import pe.com.hiveit.eai.ws.factsys.adminproductws.types.ChangeCodeRequest;
import pe.com.hiveit.eai.ws.factsys.adminproductws.types.ChangeCodeResponse;

@WebService(name = "AdminProductWSPortType", targetNamespace = "http://hiveit.com.pe/eai/ws/factsys/adminproductws")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface AdminProductWSPortType {
	@WebMethod
    ChangeCodeResponse changeCode(ChangeCodeRequest request);

}
