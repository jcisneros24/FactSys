package pe.com.hiveit.eai.ws.factsys.loginws.bean;

public class ValidateUserBeanRequest {
	
	private String user;
	private String password;
	private String typeUser;
	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTypeUser() {
		return typeUser;
	}
	public void setTypeUser(String typeUser) {
		this.typeUser = typeUser;
	}
	
}
