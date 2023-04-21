package com.cg.thistoinvokecurrentclassconstructor;

public class ThisToInvokeCurrentClassConstructorTester {

	public static void main(String[] args) {
		ThisToInvokeCurrentClassConstructor tOne=new ThisToInvokeCurrentClassConstructor();
		System.out.println(tOne);
		// Output will be:
//ThisToInvokeCurrentClassConstructor [strOne=calling Second constructor, strTwo=calling third constructor, strThree=Classing fourth constructor]
		// The third predefined constructor will be the final result that will end up working.
		
		ThisToInvokeCurrentClassConstructor tTwo=new ThisToInvokeCurrentClassConstructor("Second");
		System.out.println(tTwo);
		// Output will be:
//ThisToInvokeCurrentClassConstructor [strOne=calling Second constructor, strTwo=calling third constructor, strThree=Classing fourth constructor]
		// The third predefined constructor will be the final result that will end up working.
		
		ThisToInvokeCurrentClassConstructor tThree=new ThisToInvokeCurrentClassConstructor("Third","");
		System.out.println(tThree);
		// Output will be:
//ThisToInvokeCurrentClassConstructor [strOne=calling Second constructor, strTwo=calling third constructor, strThree=Classing fourth constructor]
		// The third predefined constructor will be the final result that will end up working.
		
		ThisToInvokeCurrentClassConstructor tFour=new ThisToInvokeCurrentClassConstructor("Calling","Fourth","Only");
		System.out.println(tFour);
		// Output will be:
// ThisToInvokeCurrentClassConstructor [strOne=Calling, strTwo=Fourth, strThree=Only]
		// The user defined values will only be set.
	}

}
