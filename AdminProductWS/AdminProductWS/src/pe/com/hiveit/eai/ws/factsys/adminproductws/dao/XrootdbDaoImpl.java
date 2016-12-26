package pe.com.hiveit.eai.ws.factsys.adminproductws.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import pe.com.hiveit.eai.ws.factsys.adminproductws.ConnectionDB;
import pe.com.hiveit.eai.ws.factsys.adminproductws.bean.UpdateCodeBeanRequest;
import pe.com.hiveit.eai.ws.factsys.adminproductws.bean.UpdateCodeBeanResponse;
import pe.com.hiveit.eai.ws.factsys.adminproductws.exception.DBException;

public class XrootdbDaoImpl implements XrootdbDao {
	ConnectionDB cn;
	public XrootdbDaoImpl() {
		cn = new ConnectionDB();
	}
	@Override
	public UpdateCodeBeanResponse updateCode(UpdateCodeBeanRequest requestDao) throws DBException {
		UpdateCodeBeanResponse responseDao = null;
		Connection accessDB = null;
		CallableStatement cs = null;
		try {
			responseDao = new UpdateCodeBeanResponse();
			accessDB = cn.getConnection();
			cs = accessDB.prepareCall("call SP_UPDATE_ARTICULOS(?,?)");
			cs.setString(1, requestDao.getCodArtiOld());
			cs.setString(2, requestDao.getCodArtiNew());
			int numFafectadas = cs.executeUpdate();
			if(numFafectadas==0){
				responseDao.setCodRpta("0");
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