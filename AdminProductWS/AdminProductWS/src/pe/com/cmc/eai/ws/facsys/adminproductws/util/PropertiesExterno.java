package pe.com.cmc.eai.ws.facsys.adminproductws.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PropertiesExterno {

	/**************************************** GENERAL *************************************************/
	/**************************************************************************************************/
	    @Value("${codigo.exito}")
	    public String codigoExito;
}
