package com.cg.staticmethods;

public class Shapes {
	int length;
	int height;
	public static void rectangle(int length, int height) {
		// we cant use non-static instance variable directly, but we can use nun static local variables.
		int area= length*height;
		System.out.println(area);
	}
	
	// Methods of using non static data members and methods are demonstrated in he bellow
	// static method:
	public static String Static(int l,int h, ForNonStaticMethod obj) {
		ForNonStaticMethod func=new ForNonStaticMethod();
		func.nonStaticMethod(); // call through instance.
		
		obj.anotherNonStaticMethod(); // use non static data and method from other class type.
		
		System.out.println("By using the instance variable in a print method "+ l); // using
		// inside print methods.
		
		return "By using the instance variable in a in return statement "+ h; // using inside
		// return statements.
		
	}
}
