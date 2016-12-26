package pe.com.hiveit.eai.ws.factsys.adminproductws.util;

public class PropertiesExterno {

	String path = "../EncryptDecryptProperties/EncryptDecrypt.properties";
	private ReadForeignPropertiesUtil foreignProp = ReadForeignPropertiesUtil.getSingleton(path);
	
	public String getOpcEncryt(){
		String opcEncryt = null;
		opcEncryt = foreignProp.getValor("opcion.encriptar");
		return opcEncryt;
	}	
	public String getOpcDecrypt(){
		String opcDesencriptar = null;
		opcDesencriptar = foreignProp.getValor("opcion.desencriptar");
		return opcDesencriptar;
	}
}
