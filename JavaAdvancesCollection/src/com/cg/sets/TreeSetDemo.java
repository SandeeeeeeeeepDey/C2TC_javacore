// Program to demonstrate Tree Set
package com.cg.sets;
import java.util.SortedSet;
// import java.util.*;
import java.util.TreeSet;
public class TreeSetDemo {
	// We need to check: Order of output and if it accepts duplicates and null value.
	public static void main(String[] args) {
		// TreeSets are implementable class of sorted sets Interface.
		SortedSet<String> treeSet= new TreeSet<>();
		treeSet.add("Edge");
		treeSet.add("Feast");
		treeSet.add("Increment");
		treeSet.add("EGG");
		treeSet.add("Lettuce");
		treeSet.add("Feast"); // does not accept double value
		treeSet.add("Toad");
		treeSet.add("National Security Agency");
		treeSet.add("cake");
		treeSet.add("Tiger");
		treeSet.add("7");
		treeSet.add("@");
		treeSet.add("6");
		// treeSet.add(null); // Does not accept null, returns run time exception
		System.out.println(treeSet); // Order of output is sorted ascending. Sorting order for strings is Number>characters>Upper case>lower case.
									// Alphabetical or numeric order is maintained between each same type of Word Strings or number strings respectively.
		
		System.out.println("-------------------------------------------------------------------");
		// Subsets can be made only for SortedSet or TreeSets:
		// System.out.println(treeSet.subSet("Toad", "6")); // Subset can only be made in one direction.
		System.out.println(treeSet.subSet("Egg", "Lettuce"));
		
		// Iteration can be dome my all tools same as HashSets.
		
	}

}
