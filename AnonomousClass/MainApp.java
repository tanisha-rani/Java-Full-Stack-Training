package AnonomousClass;

public class MainApp {
	public static void main(String[] args) {
		Student s1= new Student("kavya") {
			public void display() {
				System.out.println("Hello Everyone");
			}
		};
		s1.display();
	}
}
