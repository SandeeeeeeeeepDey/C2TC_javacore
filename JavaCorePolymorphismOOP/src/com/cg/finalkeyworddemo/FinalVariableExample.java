// Project to demonstrate on Final Variable
package com.cg.finalkeyworddemo;
public class FinalVariableExample {
	// final int INTEGER:  // wont work
// class variable must be initialized
	
	// When we use final keyword with any variable, we cant change it value.
	final int X=12; // Final variables should be named with all caps
	
	public void print(final String NAME) {
		// we cant change the value of the final variable, 
		// eg. x=13;
		System.out.println("The value of X is "+ X);
		// if method parameters are declared final, then value of parameter cant be changed.
		System.out.println("The final string is "+ NAME);
	}
}
