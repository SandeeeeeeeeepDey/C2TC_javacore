package com.cg.abstractionusinginterface;
// Golden Retriever abstract class.
interface GoldenRetriever extends Dogs {
	String[] dogColors = {"Cream", "Light Golden", "Dark Golden", "Golden", "Red", "Cinnamon"};
	
	@Override
	default public void size() {
		// information on size is implemented in this method from parent 'Dogs'.
		System.out.println("I'm a big dog, but not gigantic.");
	}
	
	@Override
	default public void breed() {
		// information on breed is implemented in this method from parent 'Dogs'.
		System.out.println("I'm a Golden Retriever.");
	}
	
	@Override
	default public void color() {
		// information on fur color is implemented in this method from parent 'Dogs'.
		System.out.println("My fur color is "+dogColors[(int) (Math.random()*(dogColors.length))]);
	}
	
	@Override
	default public void ears() {
		// information on ears is implemented in this method from parent 'Dogs'.
		System.out.println("I have V-shaped ears.");
	}
	
	@Override
	default public void tail() {
		// information on tail is implemented in this method from parent 'Dogs'.
		System.out.println("I have feathery tail.");
		
	}
	
	@Override
	default public void nature() {
		// information on nature of breed is implemented in this method from parent 'Dogs'.
		System.out.println("I'm outgoing, trustworthy, eager-to-please, and I learn easily.");
	}
	
	static public void groom() {
		// Own static method, that 
		System.out.println("I have big lush hair, and I love to be groomed.");
	}
}
