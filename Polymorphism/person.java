package Polymorphism;

public class person {
	String name;
	int age;
	
	person(){
		
	}
	person(String name, int age){
		this.name=name;
		this.age=age;
		
	}
	public void displayDetails() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}
}
