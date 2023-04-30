package com.cg.abstractionusinginterface;
// Goldendoodle Concrete class.
class Goldendoodle implements GoldenRetriever , Poodle {
	
	
	int rand= (int) (Math.random()*10);
	
	public Goldendoodle() {
		name();
		breed();
		color();
		tail();
		ears();
		nature();
		legs();
		size();
		groom(); // overridden groom for randomization.
		
	}
	public Goldendoodle(GoldenRetriever g) {
		name();
		GoldenRetriever.super.breed();
		GoldenRetriever.super.color();
		GoldenRetriever.super.tail();
		GoldenRetriever.super.ears();
		GoldenRetriever.super.nature();
		legs();
		GoldenRetriever.super.size();
		GoldenRetriever.groom(); // Static method from GoldenRetriever parent interface, called directly, because we cant instantiate interface.
		
	}
	public Goldendoodle(Poodle p) {
		name();
		Poodle.super.breed();
		Poodle.super.color();
		Poodle.super.tail();
		Poodle.super.ears();
		Poodle.super.nature();
		legs();
		Poodle.super.size();
		Poodle.super.groom(); // Default method from Poodle parent interface.
		
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
			GoldenRetriever.super.tail();
	}

	@Override
	public void ears() {
		// information on ears is implemented in this method from parent 'Dogs'.
		if(rand%2==0)
			Poodle.super.ears();
		else
			GoldenRetriever.super.ears();
		
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
			GoldenRetriever.super.color();
	}

	@Override
	public void size() {
		// information on size is implemented in this method from parent 'Dogs'.
		System.out.println("I'm a big dog, but not gigantic.");
	}


	@Override
	public void nature() {
		// information on nature of breed is implemented in this method from parent 'Dogs'.
		Poodle.super.nature();
		System.out.println("Also,");
		GoldenRetriever.super.nature();  
		
	}

	


	
	@Override
	public void breed() {
		// information on breed is implemented in this method from parent 'Dogs'.
		System.out.println("I'm a Goldendoodle.");
	}

	@Override
	public void groom() {
		// TODO Auto-generated method stub
		if(rand%2==0)
			Poodle.super.groom();
		else {
			 GoldenRetriever.groom(); // calling static method directly using class name.
			System.out.println("Like my dad.");
//			GoldenRetriever.super.groom(); // Static method cant be called in non static method without instantiation. 
//			//But here the parent is also an interface, so cant be instanciated.
			
			
		} // if one of if statement has a compiler error, 
			//the code still compiles and runs the other other correct statement and gives no output for the one with wrong statement.
	}


	
}
