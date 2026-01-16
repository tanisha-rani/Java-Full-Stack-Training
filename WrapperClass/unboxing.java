package WrapperClass;

public class unboxing {
	public static void main(String[] args) {
		
		//Boxing
		int a=10;
		Integer i=Integer.valueOf(a);
		System.out.println(a);
		
		//Unboxing
		int b= i.intValue();
		System.out.println(b);
		
		//Boxing of Byte data type
		byte x=55;
		Byte y= Byte.valueOf(x);
		System.out.println(y);
		
		//Unboxing of byte data type(auto unboxing)
		byte z=y;
		System.out.println(z);
		
		//autoboxing
		int s=90;
		Integer f=s;
		System.out.println(f);
		
		
		
	}
}
