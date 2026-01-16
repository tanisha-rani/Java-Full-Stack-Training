package playingwithNumbers;

class Bottles {

}
class box{
	
}
public class bottle{
	public static void main(String[] args) {
		box b1=new box();
		printref(b1);
		box b2= new box();
		printref(b2);
		
		Bottles a1=new Bottles();
		printref(a1);
		
		
		}
	public static void printref(box b) {
		System.out.println(b);
		
	}
	public static void printref(Bottles b) {
		System.out.println(b);
		
	}
}