package pe.com.hiveit.eai.ws.factsys.loginws.dao;

import pe.com.hiveit.eai.ws.factsys.loginws.bean.ValidateUserBeanRequest;
import pe.com.hiveit.eai.ws.factsys.loginws.bean.ValidateUserBeanResponse;
import pe.com.hiveit.eai.ws.factsys.loginws.exception.DBException;

public interface SsdbDao {
	ValidateUserBeanResponse validateUser(ValidateUserBeanRequest requestDao) throws DBException;
}
