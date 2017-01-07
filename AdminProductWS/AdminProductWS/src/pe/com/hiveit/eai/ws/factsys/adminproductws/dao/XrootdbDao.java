package pe.com.hiveit.eai.ws.factsys.adminproductws.dao;

import pe.com.hiveit.eai.ws.factsys.adminproductws.bean.UpdateCodeRequestBean;
import pe.com.hiveit.eai.ws.factsys.adminproductws.bean.UpdateCodeResponseBean;
import pe.com.hiveit.eai.ws.factsys.adminproductws.exception.DBException;

public interface XrootdbDao {
	UpdateCodeResponseBean updateCode(UpdateCodeRequestBean requestDao) throws DBException;
}
