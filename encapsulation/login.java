package encapsulation;
import java.util.*;
public class login {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		
		LoginCredentials u1=new LoginCredentials();
		
		u1.setUser("tanisha16");
		
		System.out.println(u1.getUser());
		
		u1.setPass("123");
		
		System.out.println("Enter username :");
		LoginCredentials u2=new LoginCredentials();
		u2.setUser(sc.nextLine());
		
		if(u2.username=="tanisha16") {
			System.out.println(u1.getPass());
		}else {
			System.out.println("incorrect username");
		}
		
	}
}
