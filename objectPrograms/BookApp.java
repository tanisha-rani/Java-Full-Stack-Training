package objectPrograms;

public class BookApp {
	public static void main(String[] args) {
		Book b1=new Book( "Java",2000);
		System.out.println("Book title : "+b1.title);
		System.out.println("Book Price : "+b1.price);
	}
}
