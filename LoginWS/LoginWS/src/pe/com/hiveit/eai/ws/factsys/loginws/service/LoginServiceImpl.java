package pe.com.hiveit.eai.ws.factsys.loginws.service;

import pe.com.hiveit.eai.ws.factsys.loginws.bean.ValidateUserBeanRequest;
import pe.com.hiveit.eai.ws.factsys.loginws.bean.ValidateUserBeanResponse;
import pe.com.hiveit.eai.ws.factsys.loginws.dao.SsdbDaoImpl;
import pe.com.hiveit.eai.ws.factsys.loginws.exception.DBException;
import pe.com.hiveit.eai.ws.factsys.loginws.types.ConsultUserRequest;
import pe.com.hiveit.eai.ws.factsys.loginws.types.ConsultUserResponse;

public class LoginServiceImpl implements LoginService {
	SsdbDaoImpl ssdbDaoImpl = new SsdbDaoImpl();
	@Override
	public ConsultUserResponse consultUser(ConsultUserRequest request) {
		ConsultUserResponse response = null;
		ValidateUserBeanResponse validateUserBeanResponse = null;
		
    	long tiempoInicio = System.currentTimeMillis();
    	String idTx ="" ;
    	String nomMetodo ="[consultUser - WS]";
    	String msjTx = "["+nomMetodo+ " idTx=" + idTx + "]";
		
    	try {
			response = new ConsultUserResponse();
			validateUserBeanResponse = new ValidateUserBeanResponse();
			
			ValidateUserBeanRequest validateUserBeanRequest = new ValidateUserBeanRequest();
			validateUserBeanResponse = ssdbDaoImpl.validateUser(validateUserBeanRequest);
			
		} catch (DBException e) {
			// TODO: handle exception
		} catch (Exception e) {
			// TODO: handle exception
		}
		return response;
	}

}
