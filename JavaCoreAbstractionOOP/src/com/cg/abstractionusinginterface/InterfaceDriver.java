// Program to demonstrate interface and how diamond inheritance is possible in java using interface.
package com.cg.abstractionusinginterface;
// More about instances is bellow this InterfaceDriver class.
public class InterfaceDriver{ 
	static Poodle p;
	static Labrador l;
	static GoldenRetriever g;
	 public static void main(String arg[]) {
		 // All breeds have their unique breed name.
		 // All breeds have random 'color' and 'name'.
		 // Cross breeds inherit random 'tail', 'ear' and 'nature' from either of the parent.
		 // Golden retriever and Poodle have extra property called 'groom'. 
		 
		 System.out.println("###################German Shepherd################"); // Two instances for German Shepherd to show multiple random answer generation in this program.
		 System.out.println("---------------------------------------------------------------------");
		 GermanShepherd germanShepherd=new GermanShepherd(); 
		 System.out.println("---------------------------------------------------------------------");
		 GermanShepherd germanShepherdTwo=new GermanShepherd(); 
		 System.out.println("---------------------------------------------------------------------");
		 
		 
		 System.out.println("###################Goldendoodle################"); // Instances of both parents and child using overloaded constructors in child.
		 System.out.println("---------------------------------------------------------------------");
		 Goldendoodle goldendoodle=new Goldendoodle(); // Goldendoodle, is the cross child of Golden retriever and Poodle. It inherits qualities of one parent in random.
		 													// Inherits 'groom' from either poodle or golden retriever.
		 System.out.println("---------------------------------------------------------------------");
		 Poodle poodleG=new Goldendoodle(p); // Poodle from Goldendoodle. // Has extra 'groom' property.
		 poodleG.breed();
		 System.out.println("---------------------------------------------------------------------");
		 GoldenRetriever goldenRetriever=new Goldendoodle(g); // Golden Retriever. // Has extra 'groom' property.
		 System.out.println("---------------------------------------------------------------------");
		 
		 
		 System.out.println("###################Labradoodle################"); // Instances of both parents and child using overloaded constructors in child.
		 System.out.println("---------------------------------------------------------------------");
		 Labradoodle labradoodle=new Labradoodle(); // Labradoodle, is the cross child of Labrador and Poodle. It inherits qualities of one parent in random.
		 												// Have permanent 'groom' property from Poodle.
		 System.out.println("---------------------------------------------------------------------");
		 Labrador labrador=new Labradoodle(l); // Labrador.
		 System.out.println("---------------------------------------------------------------------");
		 Poodle poodleL=new Labradoodle(p); // Poodle from Labradoodle. // Has extra 'groom' property.
		 System.out.println("---------------------------------------------------------------------");
		 System.out.println("---------------------------------------------------------------------");
		 
	 }
}

//*******************************************************************************************************************************************************************************


// Interface is like class and is defined like class.
// Interface cant be instantiated.
// Interfaces cant have initializers like static blocks and constructors.

 interface InterfaceDriverInterface { // It is always public access and abstract by default
	 
	int integer=10; // variables initiated in implicitly final and static.
	
	void methods(); // Methods are implicitly public and abstract.
	
	static  void g() {// allowed	
	}
	private void h() {// allowed	
	}
	default  void i() { // allowed
	}

}// only public, private, abstract, default, static and strictfp are permitted

 // abstract -> abstract => extends.
 // Interface -> Interface => extends.
 // Interface -> abstract => implements.
 // abstract -> Interface => Not Allowed by java.
 
