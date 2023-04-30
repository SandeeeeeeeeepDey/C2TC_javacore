package com.cg.abstractionusinginterface;
// Labrador abstract class
interface Labrador extends Dogs {
	
	String[] dogColors = {"Black", "Red", "Yellow", "White", "Brown", "Silver"};
	
	@Override
	default public void breed() {
		// information on breed is implemented in this method from parent 'Dogs'.
		System.out.println("I'm a Labrador.");
	}
	
	@Override
	default public void color() {
		// information on fur color is implemented in this method from parent 'Dogs'.
		System.out.println("My fur color is "+dogColors[(int) (Math.random()*(dogColors.length))]);
	}
	
	@Override
	default public void nature() {
		// information on nature of breed is implemented in this method from parent 'Dogs'.
		System.out.println("I'm sweet-natured, intelligent, enthusiastic, and loyal.");
	}
	
	@Override
	default public void tail() {
		// information on tail is implemented in this method from parent 'Dogs'.
		System.out.println("I have otter tail.");
	}
	
	@Override
	default public void ears() {
		// information on ears is implemented in this method from parent 'Dogs'.
		System.out.println("I have V-shaped ears.");
	}
	
	@Override
	default public void size() {
		// information on size is implemented in this method from parent 'Dogs'.
		System.out.println("I'm a big dog, but not gigantic.");
	}
}
