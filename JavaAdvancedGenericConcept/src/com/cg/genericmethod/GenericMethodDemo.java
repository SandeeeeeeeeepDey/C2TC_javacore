package com.cg.genericmethod;

import java.util.*;

public class GenericMethodDemo {
	// Generic is similar to generic constructors.
	// Point of difference, The wildcard key for method for method is E instead of T. and it can have a return statement.
	// Priority is given to specific instruction.
	
	public static <E> E GenMeth(E type) {
		if(type instanceof Number) {
			return (E) Integer.valueOf((((Integer) type).intValue()*2));
		}
		return type;
	}
	// Although I have defined what I want to do with in case the datatype in integer above, but when over ridden, it gives more priority to.
	public static  Integer GenMeth(Integer type) {
		return type*8;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Its a string";
		int[] i= {74,4,5,6,9};
		System.out.println(GenMeth(i[2]));
		System.out.println(GenMeth(s));
		System.out.println(Arrays.toString(GenMeth(i)));
		

	}

}
