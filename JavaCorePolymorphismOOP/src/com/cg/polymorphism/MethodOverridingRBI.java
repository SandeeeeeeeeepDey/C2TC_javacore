package com.cg.polymorphism;
// Program to demonstrate method overriding in polimorphism.
// Constructors cant be overridden in java
// Overriding is only possible using inheritance.
public class MethodOverridingRBI {
	// Parent class
	public float interest() {
		return 6f;
	}

}
// to be able to write another class in the same file as another class, 
// it must not have a public or private or protected access modifier.
 class MethodOverridingSBI extends MethodOverridingRBI{
	// child class
	 @Override
	 public float interest() {
		 System.out.println("Parent method that was overridden is "+super.interest());
		 return 12f;
	 }
}
