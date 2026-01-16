package methods;

public class methodReturn {
	public static void main(String[] args) {
		int sum= add(5,12);
		System.out.println(sum);
	}
	public static  int add(int a, int b) {
		int sum =a+b;
		return sum;
		
	}
}
