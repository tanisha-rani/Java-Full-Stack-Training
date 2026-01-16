package objectPrograms;

public class StudentDetails {
	public static void main(String[] args) {
		Student s1=new Student();
		
		Student s2=new Student("XYZ123");
		System.out.println("Student Details "+ s2.PAN);
		
		Student s3=new Student ("XYZ123","123456789");
		System.out.println("Student PAN "+ s3.PAN);
		System.out.println("Student Aadhar "+s3.aadhar);
		
		Student s4=new Student ("XYZ123","123456789","TWO1254");
		System.out.println("Student PAN "+ s4.PAN);
		System.out.println("Student Aadhar "+s4.aadhar);
		System.out.println("Student Voting "+s4.voting);
		
	}
}
