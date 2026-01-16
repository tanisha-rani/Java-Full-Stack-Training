package encapsulation;

public class outerInner {
	public static void main(String[] args) {
		outer.inner.display();
		
		outer.inner d1=new outer.inner();
		d1.test();
	}	
}