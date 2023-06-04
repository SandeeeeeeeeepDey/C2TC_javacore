package com.cg.javaeightfeature;
import java.util.*;
// Program to demonsrate Java 8 feature: forEach
public class ForEachDemo {

	public static void main(String[] args) {
		List<Integer> list= Arrays.asList(2,3,4,5,6,7,8);
	// This list can be iterated using either 
		// External Interpreters:
			// for or while or do while loops-
			for(int i=0;i<list.size();i++)
				System.out.println(list.get(i));
System.out.println("-----------------------------------------------------------------------------");			
			// Enhanced for loops-
			for( int x: list)
				System.out.println(x);
System.out.println("-----------------------------------------------------------------------------");		
			// Iterators, listIterators and Spliterators-
			Spliterator<Integer> s=list.spliterator(); // Java 8 feature
			s.forEachRemaining(System.out::println);
System.out.println("=============================================================================");
		// Internal Interpreter:
			// forEach:
			list.forEach(System.out::println);

	}

}
