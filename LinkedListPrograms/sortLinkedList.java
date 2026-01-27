package LinkedListPrograms;

import java.util.Collections;
import java.util.LinkedList;

public class sortLinkedList {
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
		
		//sorting of linked list
		Collections.sort(l1);
		System.out.println("Linked list after sorting:");
		System.out.print(l1);
		
		
	}
}
