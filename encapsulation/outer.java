package encapsulation;

public class outer {
	static class inner{
		static void display() {
			System.out.println("Static-Method");
		}
		void test() {
			System.out.print("Non Static method");
		}
	}
}
