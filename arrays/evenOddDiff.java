package arrays;

import java.util.Scanner;

public class evenOddDiff {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size: ");
		int size=sc.nextInt();
		int [] arr=new int[size];
		System.out.println("Enter Elements: ");
		for(int i=0; i<size; i++) {
			arr[i]=sc.nextInt();
		}
		int even=0;
		for(int i=0; i<size; i++) {
			if(arr[i] %2==0) {
				even=even+arr[i];
			}
		}
		System.out.println("the Sum of even No is : "+ even);
		int odd=0;
		for(int i=0; i<size; i++) {
			if(arr[i] %2!=0) {
				odd=odd+arr[i];
			}
		}
		System.out.println("the Sum of odd No is : "+ odd);
		int diff=even-odd;
		System.out.println("the Differnece between odd and even no is: "+ diff);
	}
}
