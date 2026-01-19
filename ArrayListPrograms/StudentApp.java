package ArrayListPrograms;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class StudentApp {
	public static void main(String[] args) {
		ArrayList students= new ArrayList();
		students.add(new Student("Shraddha",101));
		students.add(new Student("Priyanka",102));
		System.out.println(students);
		
		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter id:");
//		int id=sc.nextInt();
		System.out.println("Enter name:");
		String name= sc.next();
		ListIterator i=students.listIterator();
		boolean notFound=true;
		
//		while(i.hasNext()) {
//			Student temp=(Student)i.next();
//			if(temp.id==id) {
//				notFound=false;
//				System.out.println("Student exists  !!!");
//				System.out.println("Student Name:"+temp.name);
//				
//			}
//			
//		}
//		if( notFound) {
//			System.out.println("Student not in the list");
//		}
		while(i.hasNext()) {
			Student temp=(Student)i.next();
			if(temp.name.equals(name)) {
				notFound=false;
				System.out.println("Student exist");
				System.out.println("Id of Student id:"+temp.id);
			}
			if( notFound) {
				System.out.println("Student not in the list");
			}
		}
	}
}
