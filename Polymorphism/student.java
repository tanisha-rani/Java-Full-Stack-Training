package Polymorphism;

public class student extends person {
	int StuID;
	String CollegeName;
	
	student(){
		
	}
	
	student(int StuID, String CollegeName){
		super("Tanisha", 22);
		this.StuID=StuID;
		
		this.CollegeName=CollegeName;
	}
	@Override
	public void displayDetails() {
		// TODO Auto-generated method stub
		super.displayDetails();
		System.out.println("Student ID: "+StuID);
		System.out.println("College Name: "+CollegeName);
	}
	
}
