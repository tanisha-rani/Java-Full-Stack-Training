package Vectorprogarms;

import java.util.Stack;

public class stackExample {
	public static void main(String[] args) {
		Stack s=new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		System.out.println("The stack is: ");
		System.out.println(s);
		s.pop();
		
		System.out.println("The stack after removing top element "+ s);
		
		System.out.println("The top elemnet of stack is: "+s.peek());
		
	}
}
