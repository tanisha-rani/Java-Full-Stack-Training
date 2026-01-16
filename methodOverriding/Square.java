package methodOverriding;

public class Square extends ShapeArea{
	double  side;
	Square(double side){
		this.side=side;
		
	}
	@Override
	public void area() {
		double area= side *side;
		System.out.println(area);
	}
	
}
