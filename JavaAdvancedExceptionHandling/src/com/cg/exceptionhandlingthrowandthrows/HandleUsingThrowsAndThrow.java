package com.cg.exceptionhandlingthrowandthrows;
import java.io.*;
public class HandleUsingThrowsAndThrow {
	// simple Coin Toss simulation method, to demonstrate throw keyword for compile-time exception.
		static void coinToss(String s) throws FileNotFoundException { // throws block tells the program to expect an exception of given type.
																	// For compile-time exceptions, throws block is necessary. 
			int ran= (int)(Math.random()*10);
			
			// Use a switch statement to handle the input cases
			switch(s){
				case "TAIL":
				case "Tail":
				case "tail":
				case "t":
				case "T":System.out.println(ran%2==1?"YOU WON, TAIL IT IS! :)":"The coin says Head, SORRY :("); break;
				case "head":
				case "h":
				case "HEAD": 
				case "Head": 
				case "H":System.out.println(ran%2==0?"YOU WON, HEAD IT IS! :)":"The coin says tail, SORRY :("); break;
				default: 
				// If an invalid input is provided, throw an IllegalArgumentException
	            throw new FileNotFoundException("Invalid input: " + s);
			}
		}
		static void exceptionGenerator(String s) throws FileNotFoundException, ArithmeticException, UserDefinedExceptionDemo, Exception {
			
			if(s.equals("Ct-Exception")) {
				throw new FileNotFoundException("Compile-time exception");
			}
			else if(s.equals("Rt-Exception")) {
				throw new ArithmeticException();
			}
			else if(s.equals("P-exception")) {
				throw new Exception("Parent type Exception");
			}
			else if(s.equals("UD-exception")) {
				throw new UserDefinedExceptionDemo("This is a user defined Exception");
			}else {
				throw new UserDefinedExceptionDemoOne("This is a user defined Exception");
			}
		}
		
		
	public static void main(String[] args) throws ArithmeticException, IOException, Exception {
		// here Im using a valid and invalid value to test the code for exception.
		try{
			coinToss("h");
			coinToss("j");
		}catch(Exception e) {
			System.out.println(e);
		}
		// Output:
//		YOU WON, HEAD IT IS! :)
//		java.io.FileNotFoundException: Invalid input: j
		
		System.out.println("--------------------------------------------------------------------------------------------");
	
	
		try {
			exceptionGenerator("Ct-Exception"); // Compilation-time exception
		}catch(Exception e) {
			System.out.println(e);
		} // Output:
//		java.io.FileNotFoundException: Compile-time exception
		System.out.println("--------------------------------------------------------------------------------------------");
		try {
			exceptionGenerator("Rt-Exception"); // Run-time exception
		}catch(Exception e) {
			System.out.println(e);
		} // Output:
//		java.lang.ArithmeticException
		System.out.println("--------------------------------------------------------------------------------------------");
		try {
			exceptionGenerator("P-exception"); // Parent type exception
		}catch(Exception e) {
			System.out.println(e);
		} // Output:
//		java.lang.Exception: Parent type Exception
		System.out.println("--------------------------------------------------------------------------------------------");
		try {
			exceptionGenerator("UD-exception"); // User defined type exception with super() in constructor
		}catch(Exception e) {
			System.out.println(e);
		} // Output:
//		com.cg.exceptionhandlingthrowandthrows.UserDefinedExceptionDemo: This is a user defined Exception
		System.out.println("--------------------------------------------------------------------------------------------");
		try {
			exceptionGenerator("Else-exception");// User defined type exception with print statement in constructor
		}catch(Exception e) {
			System.out.println(e);
		}
		// Output:
//		There is a print statement in user defined exception: This is a user defined Exception // gets printed when exception thrown/
//		com.cg.exceptionhandlingthrowandthrows.UserDefinedExceptionDemoOne // Constructor provides no argument to super(), 
		// hence only exception info and no String argument.
	}
}

class UserDefinedExceptionDemo extends Exception{
	UserDefinedExceptionDemo(String s){
		super(s);
	}
	UserDefinedExceptionDemo(){
		super();
	}
}

class UserDefinedExceptionDemoOne extends Exception{
	UserDefinedExceptionDemoOne(String s){
		System.out.println("There is a print statement in user defined exception: "+ s);
	}
	UserDefinedExceptionDemoOne(){
		super();
	}
}
