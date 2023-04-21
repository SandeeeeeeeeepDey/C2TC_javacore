package com.cg.thispassesasargumentinmethod;

public class ThisAsAnArgumentInMethod {
	
	// Third way to use "this" is to use it as an argument in a method.
	// we will see the inner working in the other class in this package to understand how it works.
	
	public static void main(String[] args) {
		CarForDemo c=new CarForDemo("Bat Mobile", 7);
		c.startEngine();
	}
	
}
