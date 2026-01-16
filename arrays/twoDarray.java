package arrays;

import java.util.Scanner;

public class twoDarray {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Rows: ");
		int rows=sc.nextInt();
		System.out.println("Enter columns: ");
		int col=sc.nextInt();
		
		int[][] arr=new int[rows][col];
		System.out.println("Enter elements: ");
		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<col; j++) {
				arr[i][j]=sc.nextInt();
				
			}
		}
		System.out.println("2D Array is:");
		for(int i=0; i<rows; i++) {
			for(int j=0; j<col; j++) {
				System.out.print (arr[i][j] +" ");
				
				
			}
			System.out.println();
		}
		
	}
}
