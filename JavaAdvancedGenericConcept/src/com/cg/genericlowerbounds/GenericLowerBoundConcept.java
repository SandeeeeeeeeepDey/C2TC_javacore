package com.cg.genericlowerbounds;
import java.math.BigInteger;
import java.util.*;
//Program to demonstrate LowerBound Wild Card.
public class GenericLowerBoundConcept {
	// Lower Bound Wild Card also uses same symbol, '?'. 
	// It allows us to accept specific datatypes in generic of Collection instances, like UpperBound wild card.
	// The Lower bound acts as a place holder for super keyword, to signify that child classes of a provided datatype, will not be accepted.
		
		// For example, We want to accept no Number subclasses as datatype in an ArrayList, Lets see how:
	public static void sentenceToArray(ArrayList<? super Number> str) {
		StringBuilder string=new StringBuilder();
		for(Object s: str) {
		string.append(s);
		}
		System.out.println(string);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> strArr=new ArrayList();strArr.add("J");strArr.add("A");strArr.add("V");strArr.add("A");
		sentenceToArray(strArr);
		strArr.add(8);
		sentenceToArray(strArr);
		
		ArrayList<Integer> subClass=new ArrayList();
		//sentenceToArray(subClass); // Subclasses of Number are not allowed
		ArrayList<String> unrelatedClass=new ArrayList();
		//sentenceToArray(unrelatedClass); // Unrelated classes of Number are also not allowed
			// Only, superclasses of Number like Object is allowed.
	}

}
