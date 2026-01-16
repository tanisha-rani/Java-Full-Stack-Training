package encapsulation;

public class LoginCredentials {
	public  String username;
	private String password;
	
	
	
	public  void setUser(String username) {
		this.username=username;
	}
	
	public String getUser() {
		return username;
	}
	
	public  void setPass(String password) {
		this.password=password;
	}
	public String getPass() {
		return password;
	}
	
}
