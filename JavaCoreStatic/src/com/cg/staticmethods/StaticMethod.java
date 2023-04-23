package com.cg.staticmethods;

public class StaticMethod {

	public static void main(String[] args) {
		// Static Methods belong to class instead of objects in terms of memory.
		
		// Static Methods can be invoked without creating instances, directly from class.
		// eg.
		
		Shapes.rectangle(21,23);
		//Output:
//		483
		// Warnings:
		// 1- We cant use this and super keywords inside static methods.
		// 2- We cant use non static (instance variables)/(data members) and 
		// non static methods in static methods directly.
		
		// However, the bellow methods from Shapes class show how we can, indirectly.
		// Check out Shapes class and ForNonStaticMethod class for reference.
		ForNonStaticMethod func=new ForNonStaticMethod();
		Shapes s=new Shapes();
		
		System.out.println(s.Static(50, 100, func));
//		Output:
//		I am a print from non static method
//		I am a print from another non static method
//		By using the instance variable in a print method 50
//		By using the instance variable in a in return statement 100
	}

}
