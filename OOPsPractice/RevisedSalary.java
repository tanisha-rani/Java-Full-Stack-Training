package OOPsPractice;

public class RevisedSalary {
	public static void main(String []args) {
		EmployeeSalary e1= new EmployeeSalary();
		e1.setId(1);
		e1.setName("Tanisha");
		e1.setSalary(20000);
		System.out.println("The Employee details are as: "+e1.getId()+" "+e1.getName()+" "+e1.getSalary());
		
		System.out.println("The Increaes Salary of employee is: "+ e1.increaseSalary(20000));
		

		
	}
}
