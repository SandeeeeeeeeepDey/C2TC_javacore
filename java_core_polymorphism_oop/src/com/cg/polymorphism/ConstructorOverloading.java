package com.cg.polymorphism;
// Program to demonstrate constructor overloading in polymorthism.
public class ConstructorOverloading {
	
	// with zero parameters
		public ConstructorOverloading() {
			System.out.println("Constructor with no Parameter");
			}
		// with one parameter of int type
		public ConstructorOverloading(int numOne) {
			System.out.println("Constructor with one Parameter "+numOne+", demonstrating we can have different number of parameter");
			}
		// also with one parameter but different datatype
		public ConstructorOverloading(String str) {
			System.out.println("Constructor with one Parameter "+str+", demonstrating we can have came number of parameter but different datatype");
			}
}
