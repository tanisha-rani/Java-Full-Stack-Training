package objectClass;

public class Student {
	String name;
	int id;
	
	Student(String name, int id){
		this.name=name;
		this.id=id;
	}
	public boolean equals(Object o) {
		Student s= (Student)o;
		if( this.name.equals(s.name) && this.id == s.id) {
			return true;
		}
		return false;
	}
	
	public int hashCode() {
		return this.name.hashCode() +id;
	}
}
