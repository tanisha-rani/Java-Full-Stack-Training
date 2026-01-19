package ArrayListPrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class accessElements {
	public static void main(String[] args) {
		ArrayList al= new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add("Hello");
		al.add(null);
		al.add(30);
		System.out.println(al);
//		System.out.println(al.get(0));
		
		//for accessing each elements of arraylist //get method
//		for(int i=0; i<al.size(); i++) {
//			System.out.println(al.get(i));
//		}
//		
		//for each loop method
//		for(Object o: al) {
//			System.out.println(o);
//		}
		
		//Iterator method
//		Iterator i= al.iterator();
//		System.out.println(i.next());
//		System.out.println(i.next());
//		System.out.println(i.next());
//		System.out.println(i.next());
		
		
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
		
		//list iterator for back tracking
		ListIterator i=al.listIterator();
//		while(i.hasNext()) {
//			System.out.println(i.next());
//			
//		}
//		
//		System.out.println("=========");
//		
//		while(i.hasPrevious()) {
//			System.out.println(i.previous());
//		}
		
		
		
		
		
	}
}
