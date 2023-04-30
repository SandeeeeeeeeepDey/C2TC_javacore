// This program is to demonstrate OOP's abstract concept.

// Abstract Class:
// Abstraction is used to hide the implementation details of the program 
// and only show the functionality.
// eg. Function of the power button: When off- Power button turns on,
								   //When on- Power button turns off.
package com.cg.abstractclass;
// When abstract keyword is introduced in a class:
// The class can not be instantiated.
// The class can have abstract methods, static methods and non-abstract methods.
// It can have constructors and final methods.
// Syntax of abstract class is:
	// `access modifier` abstract class `class name`{}
// However, abstract class need to be extended and the abstract methods need to be implemented,
	// if it can any abstract method.

    abstract class AbstractClassOOP {//  only public, default(not mentioned), abstract & final are permitted
	public AbstractClassOOP() {
		System.out.println("Abstract class can have constructor");
	}
	public void mOne(){
		System.out.println("Abstract class can have non-abstract method");
	}
	public static void mTwo() {
		System.out.println("Abstract class can have static method");
	}
	public static final void mThree() {
		System.out.println("Abstract class can have final method");
	}
	public abstract void nFour(); // Abstract class can have abstract methods.
}
