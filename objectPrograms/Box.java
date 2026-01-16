package objectPrograms;

public class Box {
	//non static variables
	double length;
	double breadth;
	
	//constructor
	Box(double length, double breadth){
		this.length=length;
		this.breadth=breadth;
	}
	
//non ststic method used for acccessing the properties of object
		public double getArea() {
			return length * breadth;
		}
}
