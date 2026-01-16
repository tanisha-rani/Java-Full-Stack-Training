package objectPrograms;

public class constuctorChaining {
	String PAN;
	String aadhar;
	String voting;
	
	//Constructors
	constuctorChaining(){   //for the student not having any document
		
	}
	constuctorChaining(String PAN){ //for the student having only pan card no
		
		this();
		this.PAN=PAN;
		
	}
	constuctorChaining(String PAN, String aadhar){   //for the student having pan card and aadhar card
		this(PAN);
		this.aadhar=aadhar;
	}
	constuctorChaining(String PAN, String aadhar, String voting){    //for the student having all documents
		this(PAN,aadhar);
		this.voting=voting;
		
	}
}
