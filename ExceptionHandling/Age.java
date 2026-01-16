package ExceptionHandling;
import java.util.*;

public class Age {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter age: ");
		int age=sc.nextInt();
		
		if(age<18) {
			throw new UnderAgeException("Underage");
			
		}else if(age>60) {
			throw new OverAgeException("Overage");
		}else {
			System.out.println("Eligible for Voting..!!");
		}
	}
}
