package pe.com.cmc.eai.ws.facsys.adminproductws.dao;

import pe.com.cmc.eai.ws.facsys.adminproductws.bean.UpdateCodeRequestBean;
import pe.com.cmc.eai.ws.facsys.adminproductws.bean.UpdateCodeResponseBean;
import pe.com.cmc.eai.ws.facsys.adminproductws.exception.DBException;

public interface XrootdbDao {
	
	/**CRUD for Table: Articulos*/
	UpdateCodeResponseBean updateCode(UpdateCodeRequestBean requestDao) throws DBException;
	
}
