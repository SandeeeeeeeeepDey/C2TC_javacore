// Program to demonstrate Hash Set
package com.cg.sets;
import java.util.*;
public class HashSetDemo {
	// We need to check: Order of output and if it accepts duplicates and null value.
	
	public static void hashNumGen(HashSet<Integer> numHashSet) {
		numHashSet.add(35);
		numHashSet.add(25);
		numHashSet.add(27);
		numHashSet.add(56);
		numHashSet.add(20);
		numHashSet.add(77);
		numHashSet.add(21);
		numHashSet.add(40);
		numHashSet.add(21);
		numHashSet.add(22); 
		// offer() method does not work for hash sets.
	}
	public static void main(String[] args) {
		// First Hash Set
		HashSet<Integer> numHashSet = new HashSet<>();
		numHashSet.add(24);
		numHashSet.add(78);
		numHashSet.add(27);
		numHashSet.add(21);
		numHashSet.add(35);
		numHashSet.add(25);
		System.out.println(numHashSet.add(27)); // gives false // Duplicates are simply removed from the set.
		numHashSet.add(56); 
		numHashSet.add(20);
		numHashSet.add(null); // accepts null
		System.out.println("numHashSet: "+numHashSet); // Order of output is random
		
		// Second Hash set
		HashSet<Integer> numHashSetTwo = new HashSet<>();
		numHashSetTwo.add(32);
		numHashSetTwo.add(3);
		numHashSetTwo.add(50);
		numHashSetTwo.add(86);
		numHashSetTwo.add(20);
		numHashSetTwo.add(56);
		numHashSetTwo.add(27);
		numHashSetTwo.add(56);
		numHashSetTwo.add(25);
		numHashSetTwo.add(85);
		System.out.println("---------------------------------------------------------------------------------------------------------------");
		
		// Union of numHashSet and numHashSetTwo in numHashsetTwo
		System.out.println("numHashSetTwo: "+numHashSetTwo+"| numHashSet: "+numHashSet);
		numHashSetTwo.addAll(numHashSet);
		System.out.println("Union of numHashSet and numHashSetTwo in numHashsetTwo: "+numHashSetTwo);
		System.out.println("---------------------------------------------------------------------------------------------------------------");
		
		numHashSetTwo.clear(); // empty numHashSetTwo
		hashNumGen(numHashSetTwo);  // fill it with hashNumGen() method.
		
		// Intersection of numHashSet and numHashSetTwo in numHashsetTwo
		System.out.println("numHashSetTwo: "+numHashSetTwo+"| numHashSet: "+numHashSet);
		numHashSetTwo.retainAll(numHashSet);
		System.out.println("Intersection of numHashSet and numHashSetTwo in numHashsetTwo: "+numHashSetTwo);
		System.out.println("---------------------------------------------------------------------------------------------------------------");
		
		numHashSetTwo.clear(); // empty numHashSetTwo
		hashNumGen(numHashSetTwo);  // fill it with hashNumGen() method.
		
		// Difference between elements of numHashSet and numHashSetTwo in numHashsetTwo
		System.out.println("numHashSetTwo: "+numHashSetTwo+"| numHashSet: "+numHashSet);
		numHashSetTwo.removeAll(numHashSet);
		System.out.println("Difference between elements of numHashSet and numHashSetTwo in numHashsetTwo: "+numHashSetTwo);
		System.out.println("---------------------------------------------------------------------------------------------------------------");
		
		// We can iterate through it using iterator, spliterator, for and for-each loop, as demonstrate in other programs.
		Spliterator<Integer> forEach=numHashSetTwo.spliterator();
		System.out.println("Iteration using forEachRemaining method from Spliterator");
		forEach.forEachRemaining(System.out::println);
		
	}

}
