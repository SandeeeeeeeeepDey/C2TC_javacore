// Program to demonstrate StringBuffer
package com.cg.stringbufferdemo;
public class StringBufferDemo {
	public static void main(String[] args) {
		// Why do we need StringBuffer and/or StringBuilder, when we already have String?
				// Strings are immutable, meaning:
		// 1-
			String sOne="Knowledge";
			sOne.concat(" is very important.");
			System.out.println(sOne); // o/p: Knowledge
			// The main string `sOne remains unchanged.
			// To  store the operation in a variable, we have to store it in another variable.
		// 2-
			String stOne="Knowledge"; // lets location of stOne in continuous string pool is 100.
			String stTwo=stOne; // stTwo is now pointing to 100.
			sOne+=" is very important."; // even though it seems like sOne has changed.
			System.out.println(stTwo); // But we can see that the location 100 still has "Knowledge" in it.
										// Meaning is that stOne is a new string made in a new location in the continuous string pool.
			
			// Lets do the same for StringBuffer:
		// 1-
			StringBuffer str=new StringBuffer();
			StringBuffer strOne=new StringBuffer();
			str.append("String"); // Say, location of str value is in heap is 100.
			strOne=str; // strOne is now pointing to 100.
			str.append("Buffer"); // We changed the value of str. is it still in the same location, 100?
			System.out.println(strOne); // yes! location 100 now, has the new value.
	}

}
