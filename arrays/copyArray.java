package arrays;

import java.util.Scanner;

public class copyArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size: ");
		int size=sc.nextInt();
		int [] arr=new int[size];
		System.out.println("Enter Elements: ");
		for(int i=0; i<size; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("The original array is: ");
		for(int i=0; i<size; i++) {
			
			System.out.print(arr[i] +" ");
		}
		System.out.println();
		System.out.println("Copied array:");
		int arr2[]=new int[size];
		for(int i=0; i<size; i++) {
			arr2[i]=arr[i];
			System.out.print(arr2[i] +" ");
		}
		
	}
}
