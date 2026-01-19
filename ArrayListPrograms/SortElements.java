package ArrayListPrograms;

import java.util.ArrayList;
import java.util.Collections;

public class SortElements {
	public static void main(String[] args) {
		ArrayList<Integer> c1=new ArrayList();
		
		c1.add(10);
		c1.add(20);
		c1.add(80);
		c1.add(15);
		c1.add(50);
		c1.add(35);
		System.out.println("ArrayList before sorting is : "+c1);
		
		Collections.sort(c1);
		System.out.println("ArrayList after sorting is: "+c1);
		
		
	}
}
