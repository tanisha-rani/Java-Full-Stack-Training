package objectClass;

public class hashCode {
	public static void main(String[] args) {
		Student s1= new Student("Kavya",1);
		Student s2= new Student("Kavya", 2);
		
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1.hashCode()==s2.hashCode());
		
		
		System.out.println(s1.getClass());
		
		
	}
}
