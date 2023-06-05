package com.cg.streamapi;
import java.util.*;
// Program to demonstrate why intermediate Functions in Stream are called lazy.
public class WhyLazyDemo {
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2,3,5,2,24,5,35,35,3,2,424,9,5,2);
		System.out.println(list.stream()
										.filter(n->n%4==1) // the intermediate functions will not start work until there is a terminal function.
										.map(i->i*2) // Performs operation only to what they will receive.
										.findFirst()); // if terminal function stops asking for more, all intermediate operations will stop.
		

	}

}
