package com.cg.exceptionhandling;

import java.io.*;
import java.lang.*;
import java.util.*;

public class ExceptionHandling extends CommonExceptions {
	// Checked Exceptions:
		@Override
		void fileNotFoundException() {
			// When we use a file but the file we are looking for in the location is not present, we get this error.
			try {
				FileInputStream file= new FileInputStream("CorruptText.txt");
			} catch (FileNotFoundException e) {
				System.out.println(e);
			} 
			
		}

		@Override
		void iOException() {
			// When we use a file but the file is corrupted or not supported.
			try {
				FileReader fileOne=new FileReader("C:\\Users\\acer\\Desktop\\Text file\\CorruptedFile.txt");
				BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\acer\\Desktop\\Text file\\CorruptedFile.txt")); // got this line from the Internet, not familiar with this class yet*
		            writer.write("Hello, World!");
				System.out.println(fileOne);
			} catch (Exception e) { // If we are not sure of the specific Exception class name, we can use a parent class.
				System.out.println(e);
			}
			
		}
		
		// Unchecked Exceptions:
		@Override
		void arithmeticException() {
			// Devision by zero or other arithmetical operation that result in infinity values, give this exception.
			try {
				int x=19;
				int y=0;
				System.out.println(x%y);
			} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) { // Instead of using multiple catch blocks,
																			   // We can use multiple conditions in a single catch block using pipe operator.
																			   // But we can only use subclasses and no parent can be used in the same catch block.
				System.out.println(e);
			} 
	
		}

		@Override
		void arrayIndexOutOfBoundsException() {
			// When an array is defined with a size and the program looks for an index that isnt made, 
			//like negative number or more than defined index number.
			try {
				String[] arr= new String[] {"g", "h", " "};
				System.out.println(arr[3]+" "+arr[-1]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}  catch (Exception e) { // We can use multiple catch blocks if we are not sure which exception we might catch.
									 // But, we should keep in mind, the sequence of block should be first specific child class,
									 // then we can use the parent block or we will get catch block out Of reach error.
				System.out.println(e);
			} 
			
		}


		@Override
		void nullPointerException() {
			// When we use a data that isnt there, we get this error.
			try {
				String nul=null;
				int str=nul.length();
			} catch (NullPointerException e) {
				System.out.println(e);
			} 
			
		}

		@Override
		void numberFormatException() {
			// When we try to parse a String value to other primitive datatypes, we get this error.
			try {
				String st="number";
				int num= Integer.parseInt(st);
			} catch (NumberFormatException e) {
				System.out.println(e);
			} 
			
		}

}
