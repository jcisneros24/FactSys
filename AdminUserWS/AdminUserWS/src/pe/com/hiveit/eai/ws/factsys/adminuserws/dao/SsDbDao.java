package pe.com.hiveit.eai.ws.factsys.adminuserws.dao;

import pe.com.hiveit.eai.ws.factsys.adminuserws.bean.UserBeanRequest;
import pe.com.hiveit.eai.ws.factsys.adminuserws.bean.UserBeanResponse;
import pe.com.hiveit.eai.ws.factsys.adminuserws.exception.DBException;

public interface SsDbDao {
	UserBeanResponse createUser(UserBeanRequest request) throws DBException;
	UserBeanResponse readUser(UserBeanRequest request) throws DBException;
	UserBeanResponse updateUser(UserBeanRequest request) throws DBException;
	UserBeanResponse deleteUser(UserBeanRequest request) throws DBException;
}
