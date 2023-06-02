package com.cg.genericupperbounds;
import java.util.*;
// Program to demonstrate UperBound Wild Card.
public class GenericUpperBoundConcept {
	// Upper Bound Wild Card, '?', allows us to accept specific datatypes in generic of Collection instances.
	// The upper bound acts as a place holder for extends keyword, to signify child class of a certain datatype, to be accepted.
	
	// For example, we will use an ArrayList and specify a group of datatype to accept as generic 
	public static void arithmeticOperations(ArrayList<? extends Number> num) {
		// Addition
		num.forEach(n->addition(n));
		System.out.println("-----------------------------------------------");
		// Multiplication
		num.forEach(n->multiplication(n));
		System.out.println("-----------------------------------------------");
		// Subtraction
		num.forEach(n->subtraction(n));
		System.out.println("-----------------------------------------------");
		
	}
//___________________________________________________________________________________________________________________________________	
	public static void main(String[] args) {
		
		ArrayList<String> listS=new ArrayList<>();
		//arithmeticOperations(listS); // does not accept ArrayList with string datatype.
		
		ArrayList<Integer> list=new ArrayList<>(); list.add(2);list.add(3);list.add(4);list.add(5);list.add(2);
		arithmeticOperations(list);
	}
//___________________________________________________________________________________________________________________________________
	static Double sum=0D;
	public static void addition(Number num) {
		Double oldSum=sum;
		sum+=(Integer)num;
		System.out.println("Addition is: "+oldSum+" + "+num+" = "+sum );
	}
	static Double multiple=1D;
	public static void multiplication(Number num) {
		Double oldNum=multiple;
		multiple*=(Integer)num;
		System.out.println("Multiplication is: "+oldNum+" x "+num+" = "+multiple );
	}
	public static void subtraction(Number num) {
		Double oldSum=sum;
		sum-=(Integer)num;
		System.out.println("Subtraction is: "+oldSum+" - "+num+" = "+sum );
	}

}
