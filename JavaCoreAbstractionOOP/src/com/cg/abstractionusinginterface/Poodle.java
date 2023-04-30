package com.cg.abstractionusinginterface;
// Poodle abstract class.
interface Poodle extends Dogs{
	
	String[] colors= {"Apricot", "Black", "Blue", "Brown", "Cafe Au Lait","Cream","Grey","Red","Silver","Silver beige", "White"};
	
	@Override
	default public void breed() {
		// information on breed is implemented in this method from parent 'Dogs'.
		System.out.println("I'm a Poodle.");
	}
	
	@Override
	default public void color() {
		// information on fur color is implemented in this method from parent 'Dogs'.
		System.out.println("My fur color is "+colors[(int) (Math.random()*(colors.length))]);
	}
	
	@Override
	default public void size() {
		// information on size is implemented in this method from parent 'Dogs'.
		System.out.println("I'm a big dog, but not gigantic.");
	}
	@Override
	default public void tail() {
		// information on tail is implemented in this method from parent 'Dogs'.
		System.out.println("I have curled up tail.");
	}
	
	@Override
	default public void ears() {
		// information on ears is implemented in this method from parent 'Dogs'.
		System.out.println("I have long and wide ears.");
	}
	
	@Override
	default public void nature() {
		// information on nature of breed is implemented in this method from parent 'Dogs'.
		System.out.println("I'm a lively, active, fun-loving buddy, with a sense of the ridiculous.");
	}
	
	
	
 default public void groom() {
	 System.out.println("People love to groom me.");
 }

	

	
}
