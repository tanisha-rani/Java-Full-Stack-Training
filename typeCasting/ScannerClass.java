package typeCasting;
import java.util.*;

public class ScannerClass {
	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		System.out.println("enter Details");
		int rollNo=sc.nextInt();
		String Name=sc.next();
		sc.nextLine();
		Long PhoneNo=sc.nextLong();
		char sex= sc.next().charAt(0);
		Float Percentage= sc.nextFloat();
		
		System.out.println(rollNo);
		System.out.println(Name);
		System.out.println(PhoneNo);
		System.out.println(sex);
		System.out.println(Percentage);
		
		sc.close();
	}
}
