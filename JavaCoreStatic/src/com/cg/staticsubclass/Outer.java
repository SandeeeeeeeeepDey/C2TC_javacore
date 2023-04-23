package com.cg.staticsubclass;

public class Outer {
	int integer;
	String str;
	public Outer(int integer,String str) {
		this.str=str;
		this.integer=integer;
	}
	public void outerMethod() {
		System.out.println("I am an outer non static method called in inner static class");
	}
	public static class Inner{
		 
		public void method(Outer outer) { // by passing instance of outer in a static subclass.
			
			System.out.println(outer.str+" and "+outer.integer+" are data members called from static subclass inner");
			outer.outerMethod();
		}
		public void inner(  ) { // By making an instance of a class in the static class
			//integer=integerr; // cant use any non static data member of method directly
			Outer out=new Outer(84,"This String");
			System.out.println("Setting values internally to demoonstrate indirect way of calling nonstatic data through instance");
			System.out.println(out.integer+", is the integer and "+out.str+", is the string");
			
		}
	}

}
