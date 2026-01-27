package regExp;

public class stringExample {
	public static void main(String[]args) {
		String s1 ="abc";
		System.out.println(s1.matches("[a-z]+"));
		System.out.println("--------------------");
		
		String s2="ABC";
		System.out.println(s2.matches("[A-Z]+"));
		System.out.println("--------------------");
		
		String s3= "ACbdedeWDQW";
		System.out.println(s2.matches("^[a-zA-Z]+$"));
		System.out.println("--------------------");
		
		String s4="2r3rdDWSF";
		System.out.println(s4.matches("[a-zA-Z0-9]+"));
		System.out.println("--------------------");
		
		String s5="tanisha@gmail.com";
		System.out.println(s5.matches("[a-z]+"));
		System.out.println("--------------------");
	}
}
