package objectPrograms;

public class StaticMembers {
	static  String CollegeName="LPU";
}
class Students{
	String name;
	int age;
	String Aadhar;
	long PhoneNo;
	
	Students(){
		
	}
	
	Students(String name){
		this();
		this.name=name;
		
		
	}
	
	Students(String name, int age){
		this(name);
		this.age=age;
	}
	
	Students(String name, int age, String Aadhar){
		this(name, age);
		this.Aadhar=Aadhar;
		
		
	}
	Students(String name, int age, String Aadhar, long PhoneNo){
		this(name,age,Aadhar);
		this.PhoneNo=PhoneNo;
		
	}
}
