package pe.com.hiveit.eai.ws.factsys.adminproductws.dao;

import pe.com.hiveit.eai.ws.factsys.adminproductws.bean.UpdateCodeBeanRequest;
import pe.com.hiveit.eai.ws.factsys.adminproductws.bean.UpdateCodeBeanResponse;
import pe.com.hiveit.eai.ws.factsys.adminproductws.exception.DBException;

public interface XrootdbDao {
	UpdateCodeBeanResponse updateCode(UpdateCodeBeanRequest requestDao) throws DBException;
}
