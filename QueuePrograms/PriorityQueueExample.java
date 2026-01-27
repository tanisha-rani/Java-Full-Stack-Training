package QueuePrograms;
import java.util.*;

public class PriorityQueueExample {
	public static void main(String[] args) {
		PriorityQueue q= new PriorityQueue();
		q.add(10);
		q.add(20);
		q.add(90);
		q.add(80);
		q.add(40);
		q.add(80);
		q.add(40);
		q.add(60);
		q.add(50);
		System.out.println(q);
		PriorityQueue q1= new PriorityQueue();
		q1.offer(10);
		q1.offer(20);
		q1.offer(90);
		q1.offer(80);
		q1.offer(40);
		q1.offer(80);
		q1.offer(40);
		q1.offer(60);
		q1.offer(50);
		System.out.println(q1);
	}
}
