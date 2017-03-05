package pe.com.hiveit.eai.ws.factsys.adminproductws.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.hiveit.eai.ws.factsys.adminproductws.bean.UpdateCodeRequestBean;
import pe.com.hiveit.eai.ws.factsys.adminproductws.bean.UpdateCodeResponseBean;
import pe.com.hiveit.eai.ws.factsys.adminproductws.dao.XrootdbDao;
import pe.com.hiveit.eai.ws.factsys.adminproductws.exception.DBException;
import pe.com.hiveit.eai.ws.factsys.adminproductws.types.ChangeCodeRequest;
import pe.com.hiveit.eai.ws.factsys.adminproductws.types.ChangeCodeResponse;
import pe.com.hiveit.eai.ws.factsys.adminproductws.util.PropertiesExterno;

@Service
public class AdminProductServiceImpl implements AdminProductService {
	
	@Autowired
	private XrootdbDao xrootdbDao;
	
	@Autowired
	private PropertiesExterno propertiesExterno;
	
	@Override
	public ChangeCodeResponse changeCode(ChangeCodeRequest request) {
		ChangeCodeResponse response = null;
		UpdateCodeResponseBean updateCodeResponseBean = null;
		
    	long tiempoInicio = System.currentTimeMillis();
    	String idTx ="" ;
    	String nomMetodo ="[changeCode - WS]";
    	String msjTx = "["+nomMetodo+ " idTx=" + idTx + "]";
    	
    	//REQUEST
    	String codArtiOld = request.getCodArtiOld();
    	String codArtiNew = request.getCodArtiNew();
    	
    	try {
			response = new ChangeCodeResponse();
			updateCodeResponseBean = new UpdateCodeResponseBean();
			
			if((codArtiOld !=null && !codArtiOld.isEmpty()) && (codArtiNew !=null && codArtiNew.isEmpty())){
				UpdateCodeRequestBean updateCodeRequestBean = new UpdateCodeRequestBean();
				updateCodeRequestBean.setCodArtiOld(codArtiOld);
				updateCodeRequestBean.setCodArtiNew(codArtiNew);
				
				updateCodeResponseBean = xrootdbDao.updateCode(updateCodeRequestBean);
				String codRptaUpdateCode = updateCodeResponseBean.getCodRpta();
				String msgRptaUpdateCode = updateCodeResponseBean.getMsgRpta();
				
				if(codRptaUpdateCode.equals(propertiesExterno.codigoExito)){
					System.out.println(codRptaUpdateCode);
					System.out.println(msjTx + msgRptaUpdateCode);
				}else{
					System.out.println(msjTx + msgRptaUpdateCode);
				}
			}else{
				System.out.println("Datos ingresados no validos");
			}						
			
		} catch (DBException e) {
			response.setCodigoRespuesta(e.getCode());
			response.setCodigoRespuesta(e.getMessage());
		} catch (Exception e) {
			response.setCodigoRespuesta(e.getLocalizedMessage());
			response.setCodigoRespuesta(e.getMessage());
		}finally{
			long tiempoFin = System.currentTimeMillis();			
    		System.out.println(tiempoFin-tiempoInicio);
    	}
		return response;
	}

}
