package com.cg.basicstwo;

public class OperatorsDemo {

	public static void main(String[] args) {
		// Arithmetic operators:
		// +,-,*(multiplication),/(division),%(modulo operators outputs the reminders)
		// Priority is '()' then * and '/' and '%' all have same priority but starts left to right and then '+' then '-'
		
        // Assignment Operators:
		// =, += (int x +=1 means int x =x+1), -=, *=, /= and %=. All these work the same way.

		// Comparison Operators:
        // == (equal to), != (not equal to), > (greater than), < (less than), 
		// >= (greater than or equal to) and <= (less than or equal to)
		
		// Increment and Decrement Operators(++,--)
		// for an int i, i++(post increment) or ++i(pre increment) or i--(post decrement) or --i(pre decrement).
		// 'post' is when we first assign and then increase, 'pre'is when we increment first then assign.
		// This operator can only be used on variables and not directly on numbers nor on result of an operation, like, (++i)++.
		
		// Logical Operators:
        // && (logical AND), || (logical OR) and ! (logical NOT)
		
		//Conditional or ternary Operator:
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
