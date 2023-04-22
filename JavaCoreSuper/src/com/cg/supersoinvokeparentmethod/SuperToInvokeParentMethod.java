package com.cg.supersoinvokeparentmethod;

public class SuperToInvokeParentMethod {
	public static void main(String[] a) {
		// Second is, To invoke a parent Method:
		// For Example:
		Mammals mammal=new Mammals();
		mammal.characterOG();  
		//mammal.characterBoomer();
		//mammal.characterZ();
		// We can't access child class methods from parent
		
		System.out.println("----------------------------------------");
		Wolves wolf=new Wolves();
		wolf.characterOG(); // We can access parent method directly from child
		wolf.primalCharacter();  // We can also use super to use and edit parent method.
								 // Check out primalCharecter(), from Wolves class
		System.out.println("---------");
		wolf.characterBoomer();
		System.out.println("----------------------------------------");
		Dogs dog= new Dogs();
		dog.characterOG();
				//OR
		dog.characterZOG();
				//OR
		dog.characterZPrimalOG(); // using super we can access super method or parent too.
								  // Check out Dogs class for reference.
		System.out.println("---------");
		dog.characterBoomer();
				//OR
		dog.characterZPrimal();
		System.out.println("---------");
		dog.characterZ();
		System.out.println("----------------------------------------");
		
	}
}
