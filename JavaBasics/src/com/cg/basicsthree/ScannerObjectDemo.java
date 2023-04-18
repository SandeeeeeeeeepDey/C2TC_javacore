package com.cg.basicsthree;
import java.util.*;
public class ScannerObjectDemo {

	public static void main(String[] args) {
		// Scanner is a class that has methods, which can take types of inputs from the user during runtime.
		
		// If we want to to use Scanner class, we have to make an object System.in as an input source(keyboard).
		Scanner sc=new Scanner(System.in);
		
		// In accordance to the datatype we want, we use different methods.
		// the method's name is in camel case and usually in the form of next.'Datatype'.
		// for integer input:
		int integerInput= sc.nextInt();
		// for float input:
		float floatInput= sc.nextFloat();
		// and so on... for primitive datatypes.
		
		// for string input:
		String str= sc.next();// will stop taking input once it encounters a space.
		// or
		String strLine= sc.nextLine();// will take the whole line as input including spaces.
		
		//------------------------------------------------
		System.out.println(integerInput);
		System.out.println(floatInput);
		System.out.println(str);
		System.out.println(strLine);

	}

}
