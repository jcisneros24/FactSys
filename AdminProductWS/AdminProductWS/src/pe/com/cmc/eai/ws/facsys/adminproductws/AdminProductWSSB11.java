package pe.com.cmc.eai.ws.facsys.adminproductws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;

import pe.com.cmc.eai.ws.facsys.adminproductws.service.AdminProductServiceImpl;
import pe.com.cmc.eai.ws.facsys.adminproductws.types.ChangeRequest;
import pe.com.cmc.eai.ws.facsys.adminproductws.types.ChangeResponse;

@WebService(
		portName = "ebsAdminProductSB11", 
		serviceName = "AdminProductWSService", 
		targetNamespace = "http://hiveit.com.pe/eai/ws/factsys/adminproductws", 
		wsdlLocation = "/WEB-INF/wsdl/AdminProductWS.wsdl",
		endpointInterface = "pe.com.hiveit.eai.ws.factsys.adminproductws.AdminProductWSPortType")

public class AdminProductWSSB11 implements AdminProductWSPortType {
	
	@Autowired
	AdminProductServiceImpl  adminProductServiceImpl;
		
	@Override
    @WebMethod(action = "http://cmc.com.pe/eai/ws/facsys/adminproductws/change")
    @WebResult(name = "changeResponse", 
    targetNamespace = "http://cmc.com.pe/eai/ws/facsys/adminproductws/types", 
    partName = "response")
    public ChangeResponse change(
        @WebParam(name = "changeRequest", 
        targetNamespace = "http://cmc.com.pe/eai/ws/facsys/adminproductws/types", partName = "request")
        ChangeRequest request){
		return adminProductServiceImpl.change(request);
	}	
	 
}
