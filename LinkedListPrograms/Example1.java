package LinkedListPrograms;

import java.util.LinkedList;

public class Example1 {
	public static void main(String[] args) {
		LinkedList list= new LinkedList();
		list.add(20);
		list.add(50);
		list.add(889);
		list.add(24);
		list.add(null);
		System.out.println(list);
		
		
		System.out.println(list.contains(20));
		System.out.println(list.indexOf(50));
		
		//accessing all elements
		System.out.println("All elements of Linked list is: ");
		for (Object o : list) {
			System.out.print(o+" ");
			
		}
		
	}
}
