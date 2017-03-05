package pe.com.hiveit.eai.ws.factsys.adminproductws.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import pe.com.hiveit.eai.ws.factsys.adminproductws.bean.UpdateCodeRequestBean;
import pe.com.hiveit.eai.ws.factsys.adminproductws.bean.UpdateCodeResponseBean;
import pe.com.hiveit.eai.ws.factsys.adminproductws.exception.DBException;
import pe.com.hiveit.eai.ws.factsys.adminproductws.util.PropertiesExterno;

@Repository
public class XrootdbDaoImpl implements XrootdbDao {
	
	@Autowired
	@Qualifier("xrootDS")
	private DataSource xrootDS;
    
    @Autowired
    private PropertiesExterno propertiesExterno;  
    
	@Override
	public UpdateCodeResponseBean updateCode(UpdateCodeRequestBean requestDao) throws DBException {
		UpdateCodeResponseBean responseDao = null;
		Connection accessDB = null;
		CallableStatement cs = null;
		try {
			responseDao = new UpdateCodeResponseBean();
			accessDB = xrootDS.getConnection();
			cs = accessDB.prepareCall("call SP_UPDATE_COD_ARTICULOS(?,?)");
			cs.setString(1, requestDao.getCodArtiOld());
			cs.setString(2, requestDao.getCodArtiNew());
			int numFafectadas = cs.executeUpdate();
			if(numFafectadas==0){
				responseDao.setCodRpta(propertiesExterno.codigoExito);
				responseDao.setMsgRpta("Se actualizo correctamente el producto.");
			}
		} catch (SQLException e) {
			responseDao.setCodRpta("1");
			responseDao.setMsgRpta(e.getMessage());
			throw new DBException( responseDao.getCodRpta(), responseDao.getMsgRpta());
		}
		return responseDao;
	}

}
