package numberPrograms;

import java.util.Scanner;

public class factorialOfDigits {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		
		
		
		while(num !=0) {
			int res= num%10;
			int factorial=1;
			for(int i=res; i>=1; i--) {
				factorial=factorial *i;
			}
			System.out.println("Factorial of "+res +" is " +factorial);
			num= num/10;
		}
	}
}
