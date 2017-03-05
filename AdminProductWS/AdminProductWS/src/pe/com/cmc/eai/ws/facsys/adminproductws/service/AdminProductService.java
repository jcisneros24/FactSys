package pe.com.cmc.eai.ws.facsys.adminproductws.service;

import pe.com.cmc.eai.ws.facsys.adminproductws.types.ChangeRequest;
import pe.com.cmc.eai.ws.facsys.adminproductws.types.ChangeResponse;

public interface AdminProductService {
	ChangeResponse change(ChangeRequest request);
}
