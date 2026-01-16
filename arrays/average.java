package arrays;

import java.util.Scanner;

public class average {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size: ");
		int size=sc.nextInt();
		int [] arr=new int[size];
		System.out.println("Enter Elements: ");
		for(int i=0; i<size; i++) {
			arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0; i<size; i++) {
			 sum=sum+arr[i];
				
			
		}
		System.out.println("The Sum is "+sum);
		int average= sum/size;
		System.out.println("The average of array is "+ average);
	}
}
