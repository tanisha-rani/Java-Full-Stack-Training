package methodOverriding;

public class mainApp {
	public static void main(String[] args) {
//		Animal a1=new Dog();
//		a1.walk();
//		a1.sound();
//		Animal a2= new Cat();
//		a2.walk();
//		a2.sound();
		ShapeArea a1= new Triangle(7,5);        //upcasting 
		a1.area();
		ShapeArea a2=new Square(5);
		a2.area();
	}
}
