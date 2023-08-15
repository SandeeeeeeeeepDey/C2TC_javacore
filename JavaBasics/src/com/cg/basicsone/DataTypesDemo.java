package com.cg.basicsone;

public class DataTypesDemo {

	public static void main(String[] args) {
		// data types are of 2 types: primitive and non-primitive(or reference)
		// primitive are: byte-1byte, short-2byte, int-4byte, long-8byte,
		// float-4byte, double-8byte, 
		// char-2byte and boolean-1byte. 
		byte myByte=127; //-ve 128 0r 2^(8-1)
		short myShort=32767; //-ve 32768; negative max is one more than positive max Or 2^(32-1)
		int myInt=-2147483648;
		long myLong= 9223372036854775807L; // Default it takes int if l or L is not mentioned, same for float.
		float myFloat= 9999999f; // Default is double; upto 6-6 decimal digits
		double myDouble= 999999999999999D;  //default is int; accepts upto 15 decimal digits
		char myChar=76; // any character, alphabets in upper or lower case, or their corresponding ASCII or UNICODE value is allowed.
		boolean myBoolean=true; // true or false

	}

}
