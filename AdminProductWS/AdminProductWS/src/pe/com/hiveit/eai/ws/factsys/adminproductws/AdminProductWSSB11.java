package pe.com.hiveit.eai.ws.factsys.adminproductws;

import javax.jws.WebService;

import pe.com.hiveit.eai.ws.factsys.adminproductws.service.AdminProductServiceImpl;
import pe.com.hiveit.eai.ws.factsys.adminproductws.types.ChangeCodeRequest;
import pe.com.hiveit.eai.ws.factsys.adminproductws.types.ChangeCodeResponse;

@WebService(
		portName = "ebsAdminProductSB11", 
		serviceName = "AdminProductWSService", 
		targetNamespace = "http://hiveit.com.pe/eai/ws/factsys/adminproductws", 
		endpointInterface = "pe.com.hiveit.eai.ws.factsys.adminproductws.AdminProductWSPortType")
public class AdminProductWSSB11 implements AdminProductWSPortType {

	AdminProductServiceImpl  adminProductServiceImpl = new AdminProductServiceImpl();
	
	@Override
	public ChangeCodeResponse changeCode(ChangeCodeRequest request){
		return adminProductServiceImpl.changeCode(request);
	}	
	 
}
