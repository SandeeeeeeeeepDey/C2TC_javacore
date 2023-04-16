package com.cg.basicstwo;

public class OperatorsDemo {

	public static void main(String[] args) {
		// Arithmetic operators:
		// +,-,*(multiplication),/(division),%(modulo operators outputs the reminders)
		
        // Assignment Operators:
		// =, += (int x +=1 means int x =x+1), -=, *=, /= and %=. All these work the same way.

		// Comparison Operators:
        // == (equal to), != (not equal to), > (greater than), < (less than), 
		// >= (greater than or equal to) and <= (less than or equal to)
		
		// Logical Operators:
        // && (logical AND), || (logical OR) and ! (logical NOT)
		
		//Conditional Operator:
        //eg
		int toCheck=34;
		String ifIs;
		ifIs= (toCheck == 34)? "right": "wrong";
		// this translates to:
		if(toCheck==34)
			ifIs="right";
		else
			ifIs="wrong";

	}

}
