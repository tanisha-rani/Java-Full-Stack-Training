package Inheritances;
import java.util.*;

public class nonPrimitiveUpCasting {
	public static void main(String[] args) {
		System.out.println("Select Cab");
		System.out.println("1: Mini");
		System.out.println("2: Sedan");
		System.out.println("3: Luxury");
		
		System.out.println("Enter Your choice");
		Scanner sc=new Scanner(System.in);
		
		int choice= sc.nextInt();
		Cab c= null;
		switch(choice) {
		case 1:{
			c=new Mini();
		}
		break;
		case 2 :{
			c=new Sedan();
		}
		break;
		case 3:{
			c=new Luxury();
		}
		break;
		default :{
			System.out.println("Invalid Output");
		}
		}
		System.out.println(c);
		
		
	}
}
