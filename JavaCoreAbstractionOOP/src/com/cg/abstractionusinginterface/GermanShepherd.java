package com.cg.abstractionusinginterface;
// German Shepherd Implementation class
class GermanShepherd implements Dogs  {
String colors[]= {"Black and Tan", "Clack and Cream", "Black and Silver", "Red and Black", "Black and Red", "Solid-Black"};

public GermanShepherd() {
	
	name();
	breed();
	color();
	tail();
	ears();
	nature();
	legs();
	size();
	
	
}
	@Override
	public void legs() {
		// information on legs is implemented in this method from parent 'Dogs'.
		System.out.println("I have four Legs.");
	}

	@Override
	public void tail() {
		// information on tail is implemented in this method from parent 'Dogs'.
		System.out.println("I have a bushy tail.");
	}

	@Override
	public void ears() {
		// information on ears is implemented in this method from parent 'Dogs'.
		System.out.println("I have pricked ears.");
	}

	@Override
	public void name() {
		// information on name is implemented in this method from parent 'Dogs'.
		System.out.println("Heyoo! I'm "+Dogs.dogNames[(int)(Math.random()*Dogs.dogNames.length)]+".");
	}

	@Override
	public void color() {
		// information on fur color is implemented in this method from parent 'Dogs'.
		System.out.println("I'm "+colors[(int) (Math.random()*(colors.length))]+" in color.");
	}

	@Override
	public void size() {
		// information on size is implemented in this method from parent 'Dogs'.
		System.out.println("I'm big, but not gigantic.");
	}

	@Override
	public void breed() {
		// information on breed is implemented in this method from parent 'Dogs'.
		System.out.println("I'm a German Shepherd.");
	}

	@Override
	public void nature() {
		// information on nature of breed is implemented in this method from parent 'Dogs'.
		System.out.println("I'm confident, courageous, intelligent and gentle. I'll be your best buddy.");
	}

	
	 
	
}
