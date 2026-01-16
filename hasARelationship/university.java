package hasARelationship;

public class university {
	private int department;

	public int getDepartment() {
		return department;
	}

	public void setDepartment(int department) {
		this.department = department;
	}
	
	university(){
		
	}
	university(int department){
		this.department=department;
	}
	private dept d=new dept(150) ;
		dept getdept() {
			return d;
		}
	
}
