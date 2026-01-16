package decisionMakingStatements;
import java.util.*;

public class PosNegZero {
	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		int a=sc.nextInt();
		
		 if(a==0) {
			 System.out.println(a+" is Zero");
		 }else if ( a>0) {
			 System.out.println( a +"  is positive");
		 }else {
			 System.out.println(a +" is negative");
		 }
		 sc.close();
	}
}
