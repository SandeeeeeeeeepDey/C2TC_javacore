package com.cg.finalkeyworddemo;
// Program to demonstrate final keyword
// Once final keyword is used on a variable, method or class, they cant be modified
// However it doesnt help in memory management, variables are declared in a memory for each instance.

public class FinalExecuter {
// Driver class 
	public static void main(String[] args) {
		// Final Variable
		FinalVariableExample test = new FinalVariableExample();
		test.print("George");
		// Final method
		FinalChildMethod testTwo= new FinalChildMethod();
		testTwo.print();
		System.out.println(testTwo.print(31));
		// Final class
		FinalClassChild tOne= new FinalClassChild();
		tOne.display(31);
		
	}

}
