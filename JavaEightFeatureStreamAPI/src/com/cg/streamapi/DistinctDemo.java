package com.cg.streamapi;
import java.util.*;
// Program to demonstrate distinct() function.
public class DistinctDemo {
// Task: To perform an operation on each distinct element and print them one by one.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,5,6,6,7,7));
	
		// Normal Approach
		TreeSet<Integer> set= new TreeSet<>(list);
		list.clear();
		list.addAll(set);
		list.forEach(i->{i*=2; System.out.println(i);});
System.out.println("-----------------------------------------------------------");

		// Stream approach
		list.stream().distinct().map(i->i*2).forEach(System.out::println);

	}

}
