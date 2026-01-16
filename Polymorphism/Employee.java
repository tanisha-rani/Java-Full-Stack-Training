package Polymorphism;

public class Employee {
	String name;
	String dept;
	
	public void calculateSalary() {
		if(dept.equals("Developer")) {
			System.out.println("Salary of Developer is : 100000");
		}else if( dept.equals("Intern")) {
			System.out.println("Salary of Intern is: 700000");
		}else if( dept.equals("Manager")) {
			System.out.println("Salary of Manager is : 1200000");
		}
	}
}
public class Developer extends Employee{
	String Dept;
	
	Developer(){
		
	}
	Developer(String Dept){
		this.Dept=Dept;
	}
	public void calculateSalary() {
		super(dept);
	}
}
