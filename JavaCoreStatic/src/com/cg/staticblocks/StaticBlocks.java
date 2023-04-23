package com.cg.staticblocks;

public class StaticBlocks {
	// Static blocks are used to initialize static members and invoke static methods directly.
	// Static blocks can have print statements.
	// Static blocks execute before that main function.
	
	// Static methods can however create instances of classes, 
	// using which it can also initialize non static data members and invoke non static methods.
	// eg.
	static int integer=76;
	static String string;
	static  {
		System.out.println(integer); // Can print using static variables
		NonStaticClass c=new NonStaticClass();
		string=c.str; // Can initialize static variable through object using non static data members.
		String insideStaticBlock=c.nonStatic("Using a non static method"); // Can invoke
													// non static methods through objects. 
		System.out.println(insideStaticBlock);
	}
	public static void main(String[] k) {
		System.out.println("The main rns now");
		System.out.println(string); // We can use Initialized static variables in static 
									// inside main.
	}
	
	
}
