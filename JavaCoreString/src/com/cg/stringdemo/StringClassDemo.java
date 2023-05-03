package com.cg.stringdemo;

// Program to demonstrate non-primitive data type, String.
public class StringClassDemo {
// String is a default class from java.lang.
	public static void main(String[] args) {
		// String can be said to be an array of characters.
		char stri[]= {'B','A','T'};
		String strin="";
		String str="BAT";
		for(int i=0;i<stri.length; i++) {
		strin+=stri[i];
		}
		System.out.println("As an array of character: "+strin);
		System.out.println("As string: "+str);
		
// String can be created in two ways:-
		// Using string literals:
		String newString="Using string literals"; // String when created in this way,
													//it checks if it has that same string in a special part oh heap memory called continuous string pool.
													// if there is, the string returns the same reference.
													// if not, it makes a new string in the continuous string pool.
		
		// Using new Keyword:
		String newStringnew= new String("Using new Keyword");// Creates a new string each time in the heap memory outside continuous string pool.
		
		// when we compare two string using `==` it compares the referring memory location. 
		// If two strings are same and made using string literals, they come out to be true
		// Demo:
		String one="Batman";
		String two="Batman";
		System.out.println(one==two);// o/p: true
		// however, it wont compare the actual value.
		// Demo:
		String three=new String("Batman");
		System.out.println(one==three);// o/p:false
		// this happens because both are in different location.
		// for that, we use the default method called `.equals()`.
		System.out.println(one.equals(three)); // true.
		
		
	}

}
