package com.cg.staticsubclass;

public class StaticSubClass {
	
	// Like static methods, static subclasses can also not access non static data members
	// and methods directly.
	
	// some of the indirect ways are demonstrated bellow:
	
	public static void main(String g[]) {
		Outer o=new Outer(2121,"String give to outer class");
		Outer.Inner i=new Outer.Inner();
		i.method(o);// by passing instance of outer in a static subclass.
		System.out.println("---------------------------------------");
		i.inner();// By making an instance of a class inside the static class.
	}

}
