package com.cg.streamapi;
import java.util.*;
public class ConditionalOperation {
// Program to demonstrate how to put conditions or filter elements of a list.
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(12,23,34,45,56,75,78,95,23,33,54,12,11,75,9);
		
		// Regular method
		int sum=0;
		for(int num:list) {
			if(num%5==0)
				sum+=num;
		}
		System.out.println(sum);
System.out.println("--------------------------------------");
		
		// Using Stream
		System.out.println(list.stream().filter(i->i%5==0).reduce(0,(a,b)->a+b));

	}

}
