package regExp;

public class regEx1 {
	public static void main(String[] args) {
		String s1= "1234";
		System.out.println(s1.matches("\\d+"));
		System.out.println("------------------");
		
		String s2= "1";
		System.out.println(s2.matches("\\d"));
		System.out.println("------------------");
		
		String s3= "";
		System.out.println(s3.matches("\\d*"));
		System.out.println("------------------");
		
		String s4="123a";
		System.out.println(s4.matches("\\d+"));
		System.out.println("------------------");
		
		String s5= "12345a";
		System.out.println(s5.matches("^\\d+$"));
		System.out.println("------------------");
		
		String s6= "10.5";
		System.out.println(s6.matches("\\d+\\.\\d"));
		System.out.println("------------------");
		
		String s7="1236547890";
		System.out.println(s7.matches("\\d{3,9}"));
		System.out.println("------------------");
		
		String s8= "104143.557";
		System.out.println(s8.matches("\\d{3,9}+\\.\\d{2,7}"));
		System.out.println("------------------");
	}
	
}
