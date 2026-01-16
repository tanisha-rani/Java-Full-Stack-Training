package numberPrograms;

import java.util.Scanner;

public class primeNo {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num= sc.nextInt();
		
		 if(num <=2) {
			 System.out.println("Not Prime");
		 }
		for( int i=2; i<=num/2; i++) {
			if( num % i ==0) {
				System.out.println("Not Prime");
				break;
			}else {
				System.out.println("Prime");
				break;
			}
			
		}
		sc.close();
	}
}





