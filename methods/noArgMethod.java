package methods;

public class noArgMethod {
	public static void main(String[] args) {
		areaOfCircle();
		areaOfTriangle();
		areaOfSquare();
		areaOfRectangle();
		}

	public static void areaOfCircle() {
		int radius=7;
		int area= (22*radius*radius)/7;
		System.out.println(area);
		
	}
	
	public static void areaOfRectangle() {
		int length=7;
		int breadth=13;
		int area= length*breadth;
		System.out.println(area);
		
	}
	
	public static void areaOfSquare() {
		int Side=6;
		int area= Side*Side ;
		System.out.println(area);
		areaOfTriangle();
	}
	
	public static void areaOfTriangle() {
		int height=4;
		int base=3;
		int area= (base*height)/2;
		System.out.println(area);
	}
}