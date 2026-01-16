package objectPrograms;

public class StaticMembersDetails {
	public static void main(String[] args) {
		
		Students s1=new Students();
		Students s2=new Students("Tanisha");
		Students s3=new Students("Tanisha", 22);
		Students s4=new Students("Tanisha",22,"123456987");
		
		System.out.println(s1.name);
		System.out.println(s2.name);
		System.out.println(StaticMembers.CollegeName);
		System.out.println(s3.name);
		System.out.println(s3.age);
		System.out.println(s4.name);
		System.out.println(s4.age);
		System.out.println(s4.Aadhar);
		
		
		
	}
}

	
