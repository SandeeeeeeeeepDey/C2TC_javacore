// Program to demonstrate Throw keyword
package com.cg.exceptionhandlingthrowandthrows;

import java.io.*;

public class HandleUsingThrow {
// simple Coin Toss simulation method, to demonstrate throw keyword.
	static void coinToss(String s) {
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
            throw new IllegalArgumentException("Invalid input: " + s);
		}
	}
	public static void main(String[] args) {
		// Throw Keyword is used to define cases that we want the program to respond by showing exception message.
		// Throw can be used to throw the in-built exceptions, and also user defined. for that, we will see in the Throws keyword demonstration.
		// Throw keyword works only when using inbuilt runtime exception. For inbuilt compile-time exceptions or user defined exceptions,
																					//we will need to use the throws block.
		// Call the coinToss method with valid and invalid inputs
		coinToss("h");
		System.out.println("--------------------------------------------------------------------------------------------------");
		coinToss("j");
		System.out.println("--------------------------------------------------------------------------------------------------");
		
	}

}
