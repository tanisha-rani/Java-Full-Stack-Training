package Abstarction;

public class MainApp{
	public static void main(String [] args) {
		Animal a1=new Dog ();
		Animal a2=new Cat();
		a1.sound();
		a1.walk();
		a2.sound();
		a2.walk();
	}
}
