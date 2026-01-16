package hasARelationship;

public class mainApp {
	public static void main(String[] args) {
		book b=new book();
		for(int i=0; i<b.getPg().length; i++) {
			System.out.println(b.getPg()[i].getPg());
		}
	}
}
