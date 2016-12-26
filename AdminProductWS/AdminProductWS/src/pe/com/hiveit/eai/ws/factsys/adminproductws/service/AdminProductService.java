package pe.com.hiveit.eai.ws.factsys.adminproductws.service;

import pe.com.hiveit.eai.ws.factsys.adminproductws.types.ChangeCodeRequest;
import pe.com.hiveit.eai.ws.factsys.adminproductws.types.ChangeCodeResponse;

public interface AdminProductService {
	ChangeCodeResponse changeCode(ChangeCodeRequest request);
}
