package ExceptionHandling;

import java.util.Scanner;

public class tryCatch {
	public static void mian(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter first no:");
		int a= sc.nextInt();
		System.out.println("Enter Second no:");
		int b= sc.nextInt();
		
//		try {
//			System.out.println(a/b);
//		}
//		catch(ArithmeticException e) {
//			e.printStackTrace();
//			System.out.println("Cannot divide by Zero...Enter another No.");
//		}
		if(b==0) {
			throw new ArithmeticException(" / by 0");
		}else {
			System.out.println(a/b);
		}
		
		
	}
}
