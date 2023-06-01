// To demonstrate Lamda Expression
package com.cg.lamdaexpression;
//Lamda Expression is Used to define functional interface in a concise way. This feature is added in java 8.
//Syntax: (Argument) -> {definition}
	//eg:
//---------------------------------------------------------------------------------------------------------------------------
//Functional Interface
	interface Time{
		void simpleText();
	}
//---------------------------------------------------------------------------------------------------------------------------	
	// Implementable class: Conventional method:
	class Conventional implements Time{

		@Override
		public void simpleText() {
			// Method returns a simple text.
			System.out.println("A Simple Text Output");
			// then we call it in main.
		}
		
	}
//---------------------------------------------------------------------------------------------------------------------------
	// Driver class
	public class LamdaExpressionDemo{ // No need to use implements keyword
	public static void main(String[] args) {
		Conventional c=new Conventional();
		c.simpleText(); // We call the implementable class here in the driver main again.
		//-------------------------------------------------------------------------------------------------------------------
		 // Another simple method is: Using Lamda Expression
		Time t= ()->{
			System.out.println("A Simple Text Output");
			};
			t.simpleText();
		//-------------------------------------------------------------------------------------------------------------------

	}

	

}
