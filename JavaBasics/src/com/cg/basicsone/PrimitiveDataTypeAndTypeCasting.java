package com.cg.basicsone;

public class PrimitiveDataTypeAndTypeCasting {

	public static void main(String[] args) {
		// we learned the range and sizes of each primitive datatype and
		// played with them to understand type casting
		
		long integer= -2147483648; // it will take the int value until in int range, 
		// it will consider the value as int unless it's mentioned by ending value with l or L.
		// same goes for Double data type
		
		double integerTwo= -2147483648; // should end with d or D
		// in case of float, it takes the value as double data type unless f or F is mentioned at the end
		
		float integerThree= -2147483648;
		// all the three will however be stored as their respective data type they are initiated with.
		
		// Type Casting--> when we work with more than one data type, 
		// we have to sometimes work with different data types and while doing so, we have to keep the max range of the initiation in mind.
		// That is because, the final stored value will ultimately be the the format and range of the initiated data type.
		// there are two types of type casting: widening(automatic) and narrowing(manual).
		// examples above are also types of widening type casting
		int num = 10;
		long bigNum = num; // Widening type casting from int to long
		
		float smallNum = 3.14f;
		double bigNumm = smallNum; // Widening type casting from float to double
		
		char c = 'a';
		int ascii = c; // Widening type casting from char to int
		
		byte b = 127;
		short s = b; // Widening type casting from byte to short
		
		// For narrowing we can use the type of initiation or
		// smaller space requiring datatype inside a bracket.
		//examples for narrowing is-->>
		
		long bigNumber = 2147483648L;
		int smallNumber = (int) bigNum; // Narrowing type casting from long to int
		
		int integR = 255;
		byte byts = (byte) num; // Narrowing type casting from int to byte
		

// after that we also learned floor, ceil and random methods 
// because we are prone to use type casting while handling them.
		
		// Floor example--->
		double numOne = 3.7;
		double floorNum = Math.floor(num); // floorNum = 3.0
		
		// Ceil example--->
		double numTwo = 3.2;
		double ceilNum = Math.ceil(num); // ceilNum = 4.0
		
		// rANDOM example--->
		int randomNum = (int) (Math.random() * 10) + 1; // randomNum = 1 to 10

		







	}

}
