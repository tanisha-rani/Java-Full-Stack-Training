package ArrayListPrograms;

import java.util.ArrayList;

public class genericArrayList {
	public static void main(String[] args) {
		ArrayList <Integer>al= new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		al.add(30);
		System.out.println(al);
		int sum=0;
		for(Integer o: al) {
			sum=sum+o;
		}
		System.out.println(sum);
		
		
	}
}
