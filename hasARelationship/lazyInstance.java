package hasARelationship;

public class lazyInstance {
	public static void main(String[] args) {
		lazyCAR c=new lazyCAR();
		c.addWheel(new Wheel ("MRF"));
		c.addWheel(new Wheel ("MRF"));
		c.addWheel(new Wheel ("MRF"));
		c.addWheel(new Wheel ("MRF"));
		for(int i=0; i<c.wheels.length; i++) {
			System.out.println(c.wheels[i].getBrand());
		}
	}
}
