package com.cg.abstractionusinginterface;
// Labradoodle Concrete class.
public class Labradoodle implements Labrador, Poodle {
	
	int rand= (int) (Math.random()*10);
	
	public Labradoodle() {
		name();
		breed();
		color();
		tail();
		ears();
		nature();
		legs();
		size();
		groom();
		
	}
	public Labradoodle(Poodle p) {
		name();
		Poodle.super.breed();
		Poodle.super.color();
		Poodle.super.tail();
		Poodle.super.ears();
		Poodle.super.nature();
		legs();
		Poodle.super.size();
		Poodle.super.groom();
		
	}
	public Labradoodle(Labrador g) {
		name();
		Labrador.super.breed();
		Labrador.super.color();
		Labrador.super.tail();
		Labrador.super.ears();
		Labrador.super.nature();
		legs();
		Labrador.super.size();
		
		
	}
	
	@Override
	public void legs() {
		// information on legs is implemented in this method from parent 'Dogs'.
		System.out.println("I have four Legs.");
	}

	@Override
	public void tail() {
		// information on tail is implemented in this method from parent 'Dogs'.
		if(rand%2==0)
			Poodle.super.tail();
		else
			Labrador.super.tail();
	}

	@Override
	public void ears() {
		// information on ears is implemented in this method from parent 'Dogs'.
		if(rand%2==0)
			Poodle.super.ears();
		else
			Labrador.super.ears();
		
	}

	@Override
	public void name() {
		// information on name is implemented in this method from parent 'Dogs'.
		System.out.println("Hey! I'm "+Dogs.dogNames[(int)(Math.random()*Dogs.dogNames.length)]+".");
	}

	@Override
	public void color() {
		// information on fur color is implemented in this method from parent 'Dogs'.
		if(rand%2==0)
			Poodle.super.color();
		else
			Labrador.super.color();
	}

	@Override
	public void size() {
		// information on size is implemented in this method from parent 'Dogs'.
		System.out.println("I'm a big dog, but not gigantic.");
	}

	@Override
	public void breed() {
		// information on breed is implemented in this method from parent 'Dogs'.
		System.out.println("I'm a Labradoodle.");
	}

	@Override
	public void nature() {
		// information on nature of breed is implemented in this method from parent 'Dogs'.
		Poodle.super.nature();
		System.out.println("Also,");
		Labrador.super.nature();  
		
	}
	

	

}
