// Program to demonstrate final method
package com.cg.finalkeyworddemo;
// Child class
public class FinalChildMethod extends FinalParentMethod {
	// final method cannot be overridden
	//int print() {
	//	return PINNUM;
	//}
	
	//method overloading
	int print(int num) {
		return num;
	}

}
