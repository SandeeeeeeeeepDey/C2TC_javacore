package com.cg.basicstwo;

public class ContinueBreakDemo {

	public static void main(String[] args) {
		// Without "breaks" or "continue", all statements get printed after it gets a hit until default.
		switch("Human") {
		case "Hamster": System.out.println("I'm not human");
		case "Human": 
			switch("Human") {
				case "Human": System.out.println("I'm a human");
				case "human": System.out.println("I'm the uninvited human");
		}
		case "Dog": System.out.println("I'm not human");
		case "Cat": System.out.println("I'm not human");
		case "Chimpanzee": System.out.println("I'm not human");
		case "Monkey": System.out.println("I'm not human");
			default: System.out.println("Is this a Zoo?");
		}
		// Output is
//		I'm a human
//		I'm the uninvited human
//		I'm not human
//		I'm not human
//		I'm not human
//		I'm not human
//		Is this a Zoo?
		System.out.println("-----------------------");
		
		
		// With "break"
		switch("Human") {
		case "Hamster": 
			System.out.println("I'm not human");
			break;
		case "Human": 
			switch("Human") {
				case "Human": System.out.println("I'm a human");
				break;
				case "human": System.out.println("I'm the uninvited human");
				break;
		}
           // break;
		case "Dog": 
			System.out.println("I'm human's dog");
			break;
		case "Cat": 
			System.out.println("I'm not human");
			break;
		case "Chimpanzee": 
			System.out.println("I'm not human");
			break;
		case "Monkey": 
			System.out.println("I'm not human");
			break;
			default: System.out.println("Is this a Zoo?");
		}
		//Output is
//		I'm a human
//		I'm human's dog
		
		// Once the case is true, all statements will be printed until it reaches break or default;
		// regardless of if the next cases are true
		// For example the nested switch ended when reached a break but
		// main switch ended after dog break was found
		System.out.println("-----------------------");
		
		
		// With "continue" 
		for (int i = 1; i <= 10; i++) {
		    if (i % 2 == 0) {
		        continue; // skip the iteration if hits a continue
		    }
		    System.out.println(i);
		}
		//Output is odd numbers between 0 to 10
	}

}
