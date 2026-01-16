package encapsulation;

public class productApp {
	public static void main(String[] args) {
		product p1=new product();
		p1.setPrice(-100);
		System.out.println(p1.getPrice());
	}
}
