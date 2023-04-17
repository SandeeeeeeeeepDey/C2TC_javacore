package com.cg.basicsthree;

public class OOPConceptsEncapsulationTester {

	public static void main(String[] args) {
		// call by reference
		OOPConceptsEncapsulation obj=new OOPConceptsEncapsulation();
		obj.myInteger=3;
		obj.myString="call by reference";
		System.out.println(obj.myInteger);
		System.out.println(obj.myString);
		System.out.println("---------------------------");
		
		// call by method
		OOPConceptsEncapsulation object=new OOPConceptsEncapsulation();
		object.setter(3,"call by method");
		object.getter();

	}

}
