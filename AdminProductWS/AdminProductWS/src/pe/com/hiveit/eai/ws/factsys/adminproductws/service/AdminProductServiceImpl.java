package pe.com.hiveit.eai.ws.factsys.adminproductws.service;

import pe.com.hiveit.eai.ws.factsys.adminproductws.bean.UpdateCodeBeanRequest;
import pe.com.hiveit.eai.ws.factsys.adminproductws.bean.UpdateCodeBeanResponse;
import pe.com.hiveit.eai.ws.factsys.adminproductws.dao.XrootdbDaoImpl;
import pe.com.hiveit.eai.ws.factsys.adminproductws.exception.DBException;
import pe.com.hiveit.eai.ws.factsys.adminproductws.types.ChangeCodeRequest;
import pe.com.hiveit.eai.ws.factsys.adminproductws.types.ChangeCodeResponse;

public class AdminProductServiceImpl implements AdminProductService {
	XrootdbDaoImpl xrootdbDaoImpl = new XrootdbDaoImpl();
	@Override
	public ChangeCodeResponse changeCode(ChangeCodeRequest request) {
		ChangeCodeResponse response = null;
		UpdateCodeBeanResponse validateUserBeanResponse = null;
		
    	long tiempoInicio = System.currentTimeMillis();
    	String idTx ="" ;
    	String nomMetodo ="[changeCode - WS]";
    	String msjTx = "["+nomMetodo+ " idTx=" + idTx + "]";
		
    	try {
			response = new ChangeCodeResponse();
			validateUserBeanResponse = new UpdateCodeBeanResponse();
			
			UpdateCodeBeanRequest validateUserBeanRequest = new UpdateCodeBeanRequest();
			validateUserBeanResponse = xrootdbDaoImpl.updateCode(validateUserBeanRequest);
			
		} catch (DBException e) {
			// TODO: handle exception
		} catch (Exception e) {
			// TODO: handle exception
		}
		return response;
	}

}
