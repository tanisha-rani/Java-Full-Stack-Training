package stringPrograms;

public class stringexample {
	public static void main(String[] args) {
		String s1= "Hello";
		String s2="Hii";
		
//		System.out.println(s1==s2);  //for comparing reference 
		if(s1==s2) {
			System.out.print("true");
		}else {
			System.out.println("false");
		}
		
		
//example 2 string literal
		String s3= new String("Hello");
		String s4= new String ("Hello");
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
	}
}
