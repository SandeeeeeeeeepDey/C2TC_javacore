package com.cg.basicstwo;

public class DecisionMakingInJava {

	public static void main(String[] args) {
		// There are of Two ways to do decision making in Java: if-else and switch statements 
		
		//If-else 
		int numOne= 10;
		int numTwo=20;
		int numThree=30;
		
		if(numOne >numTwo){
			if(numOne >numThree)
				System.out.println(numOne + " is largest");
			else if(numOne<numThree)
				System.out.println(numThree + " is largest");
			else
				System.out.println("Both "+numOne+" and "+numThree+" are equal and larger than "+numTwo);
		}else if(numTwo>numOne)
		{
			if(numTwo >numThree)
				System.out.println(numTwo + " is largest");
			else if(numTwo <numThree)
				System.out.println(numThree + " is largest");
			else
				System.out.println("Both "+numTwo+" and "+numThree+" are equal and larger than "+numOne);
		}else {
			System.out.println("Both "+numOne+" and "+numTwo+" are same" );
			if(numOne>numThree)
				System.out.println(numOne+" and "+numTwo+" are equal and greater than "+ numThree);
			else if(numThree>numOne)
				System.out.println(numOne+" and "+numTwo+" are equal and smaller than "+ numThree);
			else
				System.out.println("All numbers are equal");
		}
	}

}
