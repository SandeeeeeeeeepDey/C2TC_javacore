package com.cg.thisasreferencetoinstancevariable;

public class ThisToReferInstanceVariable {
	// "this" keyword can be used in constructors and methods to refer instance variables,
	// Lets see how:-

	private String apple;
	private char axe;
	private int nine;
	private long tall;
	
	// while making a constructor or method with field, the formats bellow are both correct:
	
	// 1-
public ThisToReferInstanceVariable(String appl, char ax, int nin, long tal) {
		
		apple = appl; // But in these 4 examples, we need to find appropriate name 
		axe = ax;     // so that we don't get confused.
		nine = nin;   // If there are many, fields, one might need to up the creative game.
		tall = tal;
	}
	// 2-
public void toReferInstanceVariable(String apple, char axe, int nine, long tall) {
	
	this.apple = apple; // This example is cleaner and self explanatory in terms of naming.
	this.axe = axe;
	this.nine = nine;
	tall = tall; // Without "this" keyword, the variale wont refer to the instance variable.
	             // Error: The assignment to variable tall has no effect.
}
	
	

}
