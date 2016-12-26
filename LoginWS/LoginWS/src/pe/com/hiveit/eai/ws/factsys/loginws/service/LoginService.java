package pe.com.hiveit.eai.ws.factsys.loginws.service;

import pe.com.hiveit.eai.ws.factsys.loginws.types.ConsultUserRequest;
import pe.com.hiveit.eai.ws.factsys.loginws.types.ConsultUserResponse;

public interface LoginService {
	ConsultUserResponse consultUser(ConsultUserRequest request);
}
