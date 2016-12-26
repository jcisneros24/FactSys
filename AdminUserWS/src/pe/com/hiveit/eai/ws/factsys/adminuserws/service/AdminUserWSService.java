package pe.com.hiveit.eai.ws.factsys.adminuserws.service;

import pe.com.hiveit.eai.ws.factsys.adminuserws.types.ConsultarUserRequest;
import pe.com.hiveit.eai.ws.factsys.adminuserws.types.ConsultarUserResponse;

public interface AdminUserWSService {
	ConsultarUserResponse consultarUser(ConsultarUserRequest request);
}
