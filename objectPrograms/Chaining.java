package objectPrograms;

public class Chaining {
	public static void main(String[] args) {
		constuctorChaining s1= new constuctorChaining();
		
		constuctorChaining s2=new constuctorChaining("XYZ123");
		System.out.println("Student Details "+ s2.PAN);
		
		constuctorChaining s3=new constuctorChaining("XYZ123","123456789");
		System.out.println("Student PAN "+ s3.PAN);
		System.out.println("Student Aadhar "+s3.aadhar);
		
		constuctorChaining s4=new constuctorChaining("XYZ123","123456789","TWO1254");
		System.out.println("Student PAN "+ s4.PAN);
		System.out.println("Student Aadhar "+s4.aadhar);
		System.out.println("Student Voting "+s4.voting);
		
	}
}
