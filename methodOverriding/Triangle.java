package methodOverriding;

public class Triangle extends ShapeArea{
	double base;
	double height;
	
	Triangle(double base, double  height){
		this.base=base;
		this.height=height;
		
	}
	
	@Override
	public void area() {
		// TODO Auto-generated method stub
		double  area= (base * height)/2;
		System.out.println(area);
	}
	
}
