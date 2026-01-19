package ArrayListPrograms;

import java.util.ArrayList;

public class searchData {
	public static void main(String [] args) {
		ArrayList al= new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add("Hello");
		al.add(null);
		al.add(30);
		
		
		System.out.println(al);
		System.out.println(al.contains(30));
		System.out.println(al.indexOf(30));
		
		Object keyElement= new Student("Shradhha",101);
		
//		System.out.println(students.contains(keyElement));
	}
}
