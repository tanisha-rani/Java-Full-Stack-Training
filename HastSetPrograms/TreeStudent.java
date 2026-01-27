package HastSetPrograms;

import java.util.TreeSet;

public class TreeStudent {
	public static void main(String[] args) {
		TreeSet<Student> set = new TreeSet<Student>(new StudentComparator());
		set.add(new Student("vaibhav",3));
		set.add(new Student("Vishnu",2));
		set.add(new Student("Nikhil",1));
		set.add(new Student("paras",4));
		System.out.println(set);
		
		
	}
}
