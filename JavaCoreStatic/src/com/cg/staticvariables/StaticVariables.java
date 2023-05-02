package com.cg.staticvariables;

public class StaticVariables {
	public static void main(String g[]) {
		// Static variables takes memory as a class memory of the class at the time of class loading.
		// Therefore they help in memory management.
		
		// They are used to refer to common properties throughout objects/instances of a class.
		
		// Example: 
		// Here the base and sweetener is of ice-cream remains unchanged. 
		// ie. Milk and Sugar respectively, only the flavor changes. Refer to the IceCream class.
		IceCream chocolate=new IceCream("Chocolate");
		IceCream strawberry=new IceCream("Strawberry");
		IceCream vanilla=new IceCream("Vanilla");
		IceCream truffle=new IceCream("Truffle");
		
		// Output:
//		You ordered a Milk based, Sugary Chocolate Icecream
//		-------------------------------------------------
//		You ordered a Milk based, Sugary Strawberry Icecream
//		-------------------------------------------------
//		You ordered a Milk based, Sugary Vanilla Icecream
//		-------------------------------------------------
//		You ordered a Milk based, Sugary Truffle Icecream
//		-------------------------------------------------
	}
	
	
	
}
