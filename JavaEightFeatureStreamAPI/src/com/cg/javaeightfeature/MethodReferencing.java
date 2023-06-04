package com.cg.javaeightfeature;
import java.util.*;
// Program to demonstrate method Referencing, a Java 8 feature.
public class MethodReferencing {
	private static List<Integer> list;
	private static MethodReferencing instanceReference=new MethodReferencing();
	
	public static void main(String[] args) {
		// Arbitrary ArrayList
		 list=Arrays.asList(1,2,3,4,5,6,7);
		
		// Using Method Referencing: a Java 8 feature.
		list.forEach(System.out::println);
System.out.println("--------------------------------");

		// Method referencing using user defined method.
		list.forEach(MethodReferencing.instanceReference::print);
System.out.println("--------------------------------");	

		// Easier way of using user defined method is to use static methods to avoid extra instantiating.
		list.forEach(MethodReferencing::display);
	}
	
	// Normal Printing function
	public void print(Integer num) {
		System.out.println(num);
	}
	
	// Static Printing function
	public static void display(int num) {
		System.out.println(num);
	}

}
