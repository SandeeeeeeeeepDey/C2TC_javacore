// Program to demonstrate Linked Hash Set
package com.cg.sets;
import java.util.*;
public class LinkedHashSetDemo {
	// We need to check: Order of output and if it accepts duplicates and null value.
	public static void main(String[] args) {
		LinkedHashSet<Integer> LHashSet= new LinkedHashSet<>();
		LHashSet.add(6);
		LHashSet.add(59);
		LHashSet.add(86);
		LHashSet.add(97);
		LHashSet.add(61);
		LHashSet.add(17);
		LHashSet.add(null); // Accepts Null
		LHashSet.add(36);
		LHashSet.add(92);
		LHashSet.add(92); // Duplicates not accepted
		LHashSet.add(17);
		System.out.println(LHashSet); // Order of output is same as order of insertion.
		
		// Collections.sort(LHashSet); // compile type error, can be sorted using Collections, have to sort by converting to ArrayLinkedList as demonstrated in queue.
		
		// Can be iterated using using same tools as HashSets.

	}

}
