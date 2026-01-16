package Inheritances;

public class tpyeCasting {
	public static void main(String [] args) {
		Cab c= new CNG();
		System.out.println(c instanceof CNG);
		System.out.println(c  instanceof Sedan);
		System.out.println(c  instanceof Mini);
		System.out.println(c  instanceof Luxury);
		
		if( c instanceof Sedan) {
			Sedan m = (Sedan) c;
			System.out.println("DownCasting done!!");
		}else {
			System.out.println("Don't have the instance of this class");
		}
	}
//	
}
