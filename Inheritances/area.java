package Inheritances;

public class area {
	public static void main(String [] args) {
		Triangle t= new Triangle(5,6);
		circle c=new circle(7);
		square s=new square(9);
		t.area= (t.base * t.height)/2;
		c.area= (3.14 *c.radius * c.radius);
		s.area= s.side *s.side;
		
		
		
		System.out.println("Area of Triangle is: "+t.area);
		System.out.println("Area of Circle is: "+c.area);
		System.out.println("Area of Square is: "+s.area);
	}
}
