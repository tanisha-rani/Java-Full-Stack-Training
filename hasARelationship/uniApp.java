package hasARelationship;

public class uniApp {
	public static void main(String args[]) {
		university u=new university(200);
		System.out.println(u.getDepartment());
		System.out.println(u.getdept().getEmployees());
	}
}
