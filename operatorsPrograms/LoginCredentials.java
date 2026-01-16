package operatorsPrograms;

public class LoginCredentials {
	public static void main(String [] args) {
		String username="tanisha";
		String password="admin@123";
		int attempts= 3;
		String login= (username=="tanisha" && password =="admin@123") ? "Login Successful!!": "Login failed!!";
		System.out.println(login);
		int chances= (login=="Login failed") ? --attempts: attempts;
		System.out.println(chances);
		
		
	}
}
