package objectPrograms;

public class Student {
	String PAN;
	String aadhar;
	String voting;
	
	//Constructors
	Student(){   //for the student not having any document
		
	}
	Student(String PAN){ //for the student having only pan card no
		this.PAN=PAN;
		
	}
	Student(String PAN, String aadhar){   //for the student having pan card and aadhar card
		this.PAN=PAN;
		this.aadhar=aadhar;
	}
	Student(String PAN, String aadhar, String voting){    //for the student having all documents
		this.PAN=PAN;
		this.aadhar=aadhar;
		this.voting=voting;
		
	}
	
}
