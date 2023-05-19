// Program to demonstrate types of exceptions
package com.cg.exceptionhandling;

import java.io.*;

public class DefiningExceptions extends CommonExceptions {
	// When Exceptions are not handled, they stop the rest of the code to run.
	
// There are two types of exceptions:
	// Checked Exceptions:
	@Override
	void fileNotFoundException() {
		// When we use a file but the file we are looking for in the location is not present, we get this error.
		FileInputStream file= new FileInputStream("CorruptText.txt"); 
		
	}

	@Override
	void iOException() {
		// When we use a file but the file is corrupted or not supported.
		FileReader fileOne=new FileReader("C:\\Users\\acer\\Desktop\\Text file\\CorruptText.txt");
		
	}
	
	// Unchecked Exceptions:
	@Override
	void arithmeticException() {
		// Devision by zero or other arithmetical operation that result in infinity values, give this exception.
		int x=19;
		int y=0;
		System.out.println(x%y);
	}

	@Override
	void arrayIndexOutOfBoundsException() {
		// When an array is defined with a size and the program looks for an index that isnt made, 
		//like negative number or more than defined index number.
		String[] arr= new String[] {"g", "h", " "};
		System.out.println(arr[3]+" "+arr[-1]);
		
	}


	@Override
	void nullPointerException() {
		// When we use a data that isnt there, we get this error.
		String nul=null;
		int str=nul.length();
		
	}

	@Override
	void numberFormatException() {
		// When we try to parse a String value to other primitive datatypes, we get this error.
		String st="number";
		int num= Integer.parseInt(st);
		
	}

}
