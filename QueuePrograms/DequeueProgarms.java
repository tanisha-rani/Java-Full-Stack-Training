package QueuePrograms;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueProgarms {
	public static void main(String[] args) {
		ArrayDeque a= new ArrayDeque();
		
		a.offer(10);
		a.offer(20);
		a.offer(30);
		a.offer(40);
		a.offer(50);
		a.offer(60);
		a.offer(70);
		a.offer(80);
		a.offerFirst(5);
		a.offerLast(65);
		System.out.println(a);
		
		a.poll();
		a.pollFirst();
		a.pollLast();
		System.out.println(a);
		
	}
}
