package decisionMakingStatements;
 import java.util.*;
 
public class SimpleCalculator {
	 public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 int a=sc.nextInt();
		 int b=sc.nextInt();
		 int choice= sc.nextInt();
		 switch (choice) {
		 case 1:{
			 System.out.println("Addition " +( a+b));
			 break;
		 }
		 case 2:{
			 System.out.println("Subtraction " +( a-b));
			 break;
		 }
		 case 3:{
			 System.out.println("Multiplication " +( a*b));
			 break;
		 }case 4:{
			 System.out.println("Division " +( a/b));
			 break;
		 }
		 }
		 sc.close();
	 }
}
