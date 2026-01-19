package ArrayListPrograms;

import java.util.ArrayList;
//
//import FileHandling.Student;

public class addingdata {
	public static void main(String[] args) {
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
		
		ArrayList al1= new ArrayList();
		al1.add(50);
		al1.add(60);
		al1.add(70);
		al1.add(al); //to add whole collection as a whole as a single unit
		al1.addAll(al);  //to add data from another collection
		System.out.println(al1);
		
		//adding custom class in ArrayList
//		Student s=new Student();
//		al1.add(s);
//		System.out.println(al1);
		
		
		//adding custom class to arrayList
		ArrayList students= new ArrayList();
		students.add(new Student("Shraddha",101));
		students.add(new Student("Priyanaka",102));
		System.out.println(students);
		
		
		
		
		
		
		
	}
}
