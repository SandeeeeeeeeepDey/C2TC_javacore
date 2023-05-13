// Program to demonstrate Priority Queue
package com.cg.queue;
import java.util.*;
public class PriorityQueueDemo {
	// We need to check: Order of output and if it accepts duplicates and null value.
	public static void main(String[] args) {
		// for queue, the rule is first in, first out.
		PriorityQueue<Integer> queue=new PriorityQueue<>();
		queue.add(7);
		queue.offer(75);
		queue.offer(65);
		queue.offer(78);
		queue.offer(95);
		queue.offer(71);
		queue.offer(36);
		queue.offer(3);
		queue.offer(93);
		queue.offer(36); // duplicate value is allowed
		// queue.offer(queue.size()-1,9);  // replace is not allowed
		System.out.println(queue); // Order of output is decided by natural priority of the elements, or it can be decided by implementing comparator interface.
		System.out.println("-----------------------------------------------------------------------------------");
		// queue.offer(null); // null is not allowed because null cant be alloted priority.
		
		queue.remove(); // removes the first index and resets the priority until custom specified.
		System.out.println(queue);
		System.out.println("-----------------------------------------------------------------------------------");

		 System.out.println(queue.add(77)+", 77-->"+queue); // adds the number according to its priority and returns boolean if in print statement.
		 System.out.println(queue.offer(92)+", 92-->"+queue);
		 System.out.println("-----------------------------------------------------------------------------------");

		 System.out.println(queue.remove()); // removes the 0 index number and also returns the removed number
		 System.out.println(queue);
		 System.out.println("-----------------------------------------------------------------------------------");

		 System.out.println(queue.poll()); // removes the 0 index number and also returns the removed number
		 System.out.println(queue);
		 System.out.println("-----------------------------------------------------------------------------------");

		 System.out.println(queue.peek()); // only returns the 0 index number.
		 
		 // Collections.sort(queue); Priority queue cant be sorted.
		 ArrayList<Integer> intermediate=new ArrayList<>(queue);
		 Collections.sort(intermediate);
		 queue.clear();
		 queue.addAll(intermediate);
		 System.out.println(queue); // to do that we must convert it back to sortable collection and convert it back to queue.
		 System.out.println("------------------------------------------------------");
		 
		// To iterate through queue, we can use for, for-each, iterator and spliterator, but not list iterator, because its a method of list interface.
		 // Spliterator:
		 	// trySplit() method:
		 Spliterator<Integer> trySplitFromHalf=queue.spliterator();
		 Spliterator<Integer> trySplitTohalf=trySplitFromHalf.trySplit();
		 trySplitFromHalf.forEachRemaining(System.out::println);
		 System.out.println("------------------------------------------------------");
		 trySplitTohalf.forEachRemaining(System.out::println); //splits the code in two half and performs parallel operation for faster processing.
		 System.out.println("------------------------------------------------------");
		 
		 	// tryAdvance() method:
		 Spliterator<Integer> tryAdvanced=queue.spliterator();
		 while(tryAdvanced.tryAdvance(System.out::println)) { // gives true if there remains more elements, returns it and also removes it 
			 System.out.println("--------------------------");
			 System.out.println(tryAdvanced.tryAdvance(System.out::println)); 
			 System.out.println("--------------------------"); 
		 }
		 	// forEachRemaining() method:
		 Spliterator<Integer> forEachR=queue.spliterator();
		 System.out.println(forEachR.tryAdvance(MethodReference::action)); //User defined method reference that prints, Have removed the integer: `n` From the iterator.
		 forEachR.forEachRemaining(System.out::println); // Prints remaining elements from Spliterator object.
		 	
		 System.out.println("--------------------------");
		 	// to print the side of the iterator, we can use estimateSize():
		 Spliterator<Integer> siztimate= queue.spliterator();
		 System.out.println(siztimate.estimateSize());
		 
		
	}

}
// Class to test Method Reference
class MethodReference{
//	public static String trueOfalse(int n) {
//		return "Have removed the integer: "+n+" From the iterator.";
	public static void action(int n) { // has to be void type to be accepted by tryAdvance() method.
		System.out.println("Have removed the integer: "+n+" From the iterator.");;
			
	}
}
