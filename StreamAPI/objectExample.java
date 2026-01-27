package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class objectExample {
	public static void main(String[] args) {
		Student s= new Student();
		Student s1= new Student();
		Student s2= new Student();
		
		s.setAge(12);
		s1.setAge(15);
		s2.setAge(42);
		
		s.setName("Tanisha");
		s1.setName("Kavya");
		s2.setName("Shardhha");
		
		List<Student> students = Arrays.asList(s, s1, s2);

        students.stream()
                .map(Student::getName)   
                .sorted()                
                .forEach(System.out::println);
	}
}

