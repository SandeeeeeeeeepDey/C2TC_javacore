// Program to demonstrate errors and exceptions in java.
package com.cg.exceptionhandling;

public class ErrorExceptionUnderstanding {
	public static void recursiveMethod() {
        recursiveMethod(); 
    }

	public static void main(String[] args) {
		// ERRORS
	// Time of occurrence:
		// Errors are not known to the compiler, it occurs at runtime.
		
	// Recovery:
		// Programs cant be recovered from errors. The program will definitely terminate if it finds an error.
		
	// Package:
		// Errors are defined in java.lang.Errors
		
	// Example of errors:
		// There three types of errors:- 
		// Runtime errors:
		int[] array = new int[Integer.MAX_VALUE]; // OutOfMemoryError
		
		recursiveMethod(); // StackOverflowError
		
		// Logical errors:-
		int x = 5;
        int y = 2;
        int z = x * y + 1; // This will produce the result 11, which is not the expected result
        System.out.println("The value of z is: " + z);
    
		// Syntactical errors:- 
		int x = 5 // This will cause a syntax error and prevent the program from compiling
        System.out.println("The value of x is: " + x; // This will cause a syntax error and prevent the program from compiling
    
//---------------------------------------------------------------------------------------------------------------------------------------------------
		
		//EXCEPTIONS
	// Time of occurrence:
		// Exceptions can occur at both compile time and runtime.
				
	// Recovery:
		// Programs can be recovered from exceptions by handling with appropriately try-catch blocks or throw keywords.
		
	// Package:
		// Errors are defined in java.lang.Exceptions.
				
	// Example of exceptions:
		int x=12/0;
		System.out.println(x); // ArithmeticException 
		
	    
	}

}
