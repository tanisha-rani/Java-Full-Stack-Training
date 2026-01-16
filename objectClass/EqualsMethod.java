package objectClass;

public class EqualsMethod {
	public static void main(String [] args) {
		Student s1= new Student("Kavya",1);
		Student s2= new Student("Kavya", 1);
		
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
	}
}
