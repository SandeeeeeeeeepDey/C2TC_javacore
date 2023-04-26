package com.cg.polymorphism;
// Program to demonstrate Polymorphism.
public class OverloadingExecuter {
	// Polymorphism comes from the word: Poly-Multiple and Morph- Forms. Meaning, Many Forms.
	// It is a quality of OOP in which we can change the form of the working of a program,
	// using Overloading and Overriding. 
	// we can have multiple forms of the same constructor or methods and we can also have
	// multiple outcomes of the same method in different child.
	// Lets see how-

	public static void main(String[] args) {
		// Constructor overloading
		// here different number of arguments or different datatypes result in different outcome in constructors.
		ConstructorOverloading cOne = new ConstructorOverloading();
		ConstructorOverloading cTwo = new ConstructorOverloading(41);
		ConstructorOverloading cThree = new ConstructorOverloading("\"One String type arguement\"");
		// Output:
//		Constructor with no Parameter
//		Constructor with one Parameter 41, demonstrating we can have different number of parameter
//		Constructor with one Parameter "One String type arguement", demonstrating we can have came number of parameter but different datatype
//		----------------------------------------------------------------
		System.out.println("----------------------------------------------------------------");
		// Method overloading
		// here different number of arguments or different datatypes result in different outcome in methods.
		MethodOverloading m=new MethodOverloading();
		m.method();
		m.method(51);
		m.method("\"One String type arguement\"");
		//Output
//		Method with no Parameter
//		Same method with one Parameter 51, demonstrating we can have different number of parameter
//		Same method with one Parameter "One String type arguement", demonstrating we can have came number of parameter but different datatype
//		----------------------------------------------------------------
		System.out.println("----------------------------------------------------------------");
		// Method overriding
		// here, same method show different outcomes when called from different class.
		MethodOverridingRBI mOne= new MethodOverridingRBI();
		mOne.interest();
		MethodOverridingSBI mTwo=new MethodOverridingSBI();
		System.out.println(mTwo.interest()); // Parent's Interest() method is overridden in child class.
		System.out.println("----------------------------------------------------------------");
	}
		//Output
//		Parent method that was overridden is 6.0
//		12.0
//	----------------------------------------------------------------

}
