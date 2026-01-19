package ArrayListPrograms;

import java.util.ArrayList;

public class removeElements {
	public static void main(String[] args) {
		ArrayList<Integer> c1=new ArrayList();
		
		c1.add(10);
		c1.add(20);
		c1.add(30);
		c1.add(40);
		c1.add(50);
		
		ArrayList<Integer> c2=new ArrayList<Integer>();
		c2.add(50);
		c2.add(40);
		c2.add(60);
		c2.add(80);
		
		System.out.println("ArrayList C1 is: "+c1);
		System.out.println("ArrayList c2 is: "+c2);
		
		//to remove element by index;
		c1.remove(0);
		System.out.println("C1 after removing elemnent from index 0:"+c1);
		
		//to remove common elements
		c1.removeAll(c2);
		System.out.println("C1 after removing common elements form c2: "+ c1);
		
		//to remove unique elemnts
		c1.retainAll(c2);
		System.out.println("c1 after removing all unique elements:"+c1);
		
		//to clear full collection
		
		c2.clear();
		System.out.println("C2 after removng all elements: "+c2);
		
	}
}
