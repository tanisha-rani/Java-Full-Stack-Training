package arrays;

import java.util.Scanner;

public class oddSum {
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
			if(arr[i] %2!=0) {
				sum=sum+arr[i];
			}
		}
		System.out.println("the Sum of odd No is : "+ sum);
	}
}
