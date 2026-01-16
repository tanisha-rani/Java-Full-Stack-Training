package playingwithNumbers;

public class AnimalApp {
	public static void main(String[] args) {
		Animal a1= new Animal("Dog");
		Animal a2=a1;
		System.out.println(a1.name);
		System.out.println(a2.name);
		
		a2.name="Cat";
		System.out.println(a1.name);
		System.out.println(a2.name);
	}
}
