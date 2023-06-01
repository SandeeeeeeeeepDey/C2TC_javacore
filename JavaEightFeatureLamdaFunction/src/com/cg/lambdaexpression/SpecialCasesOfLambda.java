package com.cg.lambdaexpression;
import java.util.*;
// To demonstrate two Special use cases of Lambda 
public class SpecialCasesOfLambda {

	public static void main(String[] args) {
		// Case 1: _ForEach_
// Array declaration--------------------------------
		ArrayList<Number> nums=new ArrayList();
		for( int i=0;i<8;i++)
			nums.add(i);
		System.out.println(nums);
//--------------------------------------------------
		// Iteration using forEach:
		nums.forEach((notInitiated)->System.out.println(notInitiated)); // using lambda expression to iterate through a list using an arbitrary undefined variable.
//-------------------------------------------------------------------------------------------------------------------		
		
		// Case 2: _Threads_
		new Thread(()->{System.out.println("Run Method Defined");}).start();
	}

}
