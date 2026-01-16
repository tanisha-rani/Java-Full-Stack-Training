package operatorsPrograms;

public class DivisibleBy5 {
	public static void main(String [] args) {
		int a=9;
		int b=10;
		String result = (a % 5==0 ) ? "Divisible by 5" : "Not divisible by 5";
		String answer = (b % 5==0 ) ? "Divisible by 5" : "Not divisible by 5";
		
		System.out.println(result);
		System.out.println(answer);
		
	}
}
