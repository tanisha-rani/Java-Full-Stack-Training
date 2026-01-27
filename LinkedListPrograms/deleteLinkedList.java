package LinkedListPrograms;

import java.util.LinkedList;

public class deleteLinkedList {
	public static void main(String[] args) {
		LinkedList l1= new LinkedList();
		l1.add(40);
		l1.add(80);
		l1.add(60);
		l1.add(20);
		l1.add(10);
		l1.add(450);
		System.out.println("All elemnets of linked list is: ");
		System.out.println(l1);
		
		LinkedList l2= new LinkedList();
		l2.add(40);
		l2.add(80);
		l2.add(600);
		l2.add(250);
		l2.add(1000);
		l2.add(450);
		System.out.println("=========");
		System.out.println("All elements of linked list is: ");
		System.out.println(l2);
		
		//removing elements by index
		l1.remove(1);
		System.out.println("=========");
		System.out.println("Linked list after removing form index 1 is: ");
		System.out.println(l1);
		
		//removing comman elemnets
		l1.removeAll(l2);
//		System.out.println("=========");
//		System.out.println("Linked list after removing comman elements from l1 is:");
//		System.out.println(l1);
		
		//removing unique elemnts
		l2.retainAll(l1);
		System.out.println("=========");
		System.out.println("Linked list after removing all unique elemnets form l1 is:");
		System.out.println(l2);	
		
		//claer all elements
		l1.clear();
		System.out.println("=========");
		System.out.println(l1);
	}
}
