// Program to demonstrate Array dequeue
package com.cg.queue;
import java.util.*;
public class ArrayDequeDemo {
	// We need to check: Order of output and if it accepts duplicates and null value.
	public static void main(String[] args) {
	// for Deque or double sided, rule is both first in first out or last out, but not from the middle.
		Deque<Integer> dequeue=new ArrayDeque<>();
		dequeue.add(69);
		dequeue.offer(9);
		dequeue.offer(22);
		dequeue.offer(34);
		dequeue.offer(72);
		dequeue.offer(79);
		dequeue.offer(47);
		dequeue.offer(29);
		dequeue.offer(45);
		dequeue.offer(9); // duplicate value is allowed
		// dequeue.offer(dequeue.size()-1,9);  // replace is not allowed
		// dequeue.offer(null); // null value not allowed
		System.out.println(dequeue); // Order of output is same as insertion.
		System.out.println("----------------------------------------------------------");
		
		dequeue.addFirst(888);
		dequeue.offerLast(777); // can insert value from both first and last.
		System.out.println(dequeue);
		System.out.println("----------------------------------------------------------");
		
		dequeue.remove(); // removes from first
		dequeue.removeFirst(); // removes from first
		dequeue.removeLast(); // removes from last
		System.out.println(dequeue);
		System.out.println("----------------------------------------------------------");
		
	// Collections.sort(dequeue); direct sorting is not allowed for queues and deques.
		 ArrayList<Integer> intermediate=new ArrayList<>(dequeue);
		 Collections.sort(intermediate);
		 dequeue.clear();
		 dequeue.addAll(intermediate);
		 System.out.println(dequeue);
		 System.out.println("----------------------------------------------------------");
		 
	// Can iterate through Dequeue by all methods as Priority queues.
		 
		 
		 

	}

}
