package objectPrograms;

public class staticInitialzers {
	
	static {
		System.out.println("Hii...I am from static block");
	}
	public static void main(String[] args) {
		System.out.println("Hello from main method");
	}
	static {
		System.out.println("hello from 2nd ststic block");
	}
}

