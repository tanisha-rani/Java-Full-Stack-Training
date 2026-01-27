package LamdaExpressions;

public class MainApp {
	public static void main(String[] args) {
		Addition a=(x,y)->{
			return x+y;
		};
		System.out.println("Addition is:");
		System.out.println(a.add(10, 2));
	}
}
