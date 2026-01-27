package StreamAPI;

public class Student {
	private int age;
	private String name;
	Student(){
		
	}
	Student(String name, int age){
		this.name=name;
		this.age=age;
		
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
