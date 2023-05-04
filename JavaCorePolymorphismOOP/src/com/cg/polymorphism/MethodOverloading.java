package com.cg.polymorphism;
// Program to demonstrating overloading in polymorphism.
public class MethodOverloading {
private int numOne;
private int numTwo;
private String str;
//with zero parameters
	public void method() {
		System.out.println("Method with no Parameter");
		}
	// with one parameter of int type
	public void method(int numOne) {
		System.out.println("Same method with one Parameter "+numOne+", demonstrating we can have different number of parameter");
		}
	// also with one parameter but different datatype
	public void method(String str) {
		System.out.println("Same method with one Parameter "+str+", demonstrating we can have came number of parameter but different datatype");
	}
}
