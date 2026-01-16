package loopingStatements;

import java.util.*;

public class whileLoop {
	public static void main(String [] args) {
		Scanner sc= new Scanner(System.in);
		int num= 1;
		while(num<=4) {
			System.out.println(num);
			num++;
		}
		sc.close();
	}
}
