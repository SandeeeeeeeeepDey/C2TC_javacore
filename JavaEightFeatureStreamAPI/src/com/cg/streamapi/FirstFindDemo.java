package com.cg.streamapi;
import java.util.*;
// Program to demonstrate 
public class FirstFindDemo {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2,3,5,2,24,5,35,35,3,2,424,9,5,2);
		
		// Achieving limit in regular way
		int i=0;
		while(i<list.size()) {
			if(list.get(i)%4==1) {
				System.out.println(list.get(i));
				break;
			}
		i++;
		}
System.out.println("-------------------------------------------");
		
		// using limit() in stream API
		System.out.println(list.stream().filter(n->n%4==1).findFirst());
System.out.println("-------------------------------------------");
		
		// If desired result is not present, it will return empty. but we can return other output, if we want:
		list = Arrays.asList(2,3,2);
		System.out.println(list.stream().filter(n->n%4==1).findFirst());
		// but we can return custom output, if we want:
		System.out.println(list.stream().filter(n->n%4==1).findFirst().orElse(-999));
	}

}
