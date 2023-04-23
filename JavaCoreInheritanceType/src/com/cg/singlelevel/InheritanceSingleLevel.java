package com.cg.singlelevel;

public class InheritanceSingleLevel {

	public static void main(String[] args) {
		// Has only one parent and one child.
		// Child can have extra properties that parent cant access, 
		// but all properties of parent can be accessed by child.
		
		BarterSystem b=new BarterSystem(); // Parent
		System.out.println("----------------------------------------------------------");
		MonetarySystem m= new MonetarySystem(); // Child
		System.out.println("----------------------------------------------------------");

		// Output:
//		Goods in exchange for goods and services.
//		----------------------------------------------------------
//		Goods in exchange for goods and services.
//		Exchange is done using a medium of exchange such as currency, rather than direct exchange.
//		----------------------------------------------------------

	}

}
