package com.cg.basicstwo;

public class DecisionMakingInJavaSwitchStatements {

	public static void main(String[] args) {
		// Switch Statements
		int numOne= 10;
		int numTwo=20;
		int numThree=30;
		int caseOne= numOne>numTwo?1:0;
		int caseTwo= numOne>numThree?1:0;
		int caseThree= numTwo>numThree?1:0;
		
		switch(caseOne) {
		case 0: 
			switch(caseThree) {
			case 0: System.out.println(numThree+" is the greatest");
			break;
			case 1: System.out.println(numTwo+" is the greatest");
			break;
			default: System.out.println(numTwo+" and "+numThree+" are equal and greater than "+numOne);
			break;
		}
		case 1: 
			switch(caseTwo) {
			case 0:System.out.println(numThree+" is the greatest");
			break;
			case 1:System.out.println(numOne+" is the greatest");
			break;
			default:System.out.println(numOne+" and "+numThree+" are equal and greater than "+numTwo);
			break;
		}
		default:
			switch(caseTwo) {
			case 0: System.out.println(numThree+" is the greatest");
			break;
			case 1:System.out.println(numOne+" and "+numTwo+" are equal and greater than "+numThree);
			break;
			default:System.out.println(numOne+" , "+numThree+" and "+numTwo+" are equal");
			break;
				
			}
		}

	}

}
