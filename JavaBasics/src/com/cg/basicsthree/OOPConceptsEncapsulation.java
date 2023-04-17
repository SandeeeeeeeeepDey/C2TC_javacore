package com.cg.basicsthree;

public class OOPConceptsEncapsulation {
	// OOPs or object oriented programming deals with four main concepts:
			// Encapsulation, Inheritance, Abstraction and Polymorphism.
		
		// Encapsulation is the process in which 
		// we encapsulate the data in order to protect it from being directly modified or accessed, 
		// to ensure consistent functionality and security.
		// it also makes the code look clean, reusable and easily maintainable.
		// To use an encapsulated class, we can make an instance of that class using their fields in constructors 
		// or methods in order to access them or use them. 
		// there are  ways to use them call by reference and pass by methods
		int myInteger;
		String myString;
		
		public void setter(int integer, String string) {
			myInteger = integer;
			myString = string;
		}
		public void getter() {
			System.out.println(myInteger);
			System.out.println(myString);
		}
		
		
		
}
