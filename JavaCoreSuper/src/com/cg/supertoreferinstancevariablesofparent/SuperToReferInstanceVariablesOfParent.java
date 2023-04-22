package com.cg.supertoreferinstancevariablesofparent;

public class SuperToReferInstanceVariablesOfParent {
	public static void main(String[] a) {
		// "Super" is a reference variable used to refer to properties, methods and constructors
		// of immediate parent.
			
		// Whenever we invoke an instance of subclass, an instance of parent class implicitly gets invoked.
			
			// First type of usage for "super" is,
			// As reference to instance variables of parent class.
			// Example:
		Three three=new Three(1,"two",3L);
		// Class Three has only one instance variable three, but
			// it's Constructed is taking in three variables, 
			// two of which are from parent Two and One.
		// Class Two has only one instance variable two, but 
			// it takes one more variable from One using super.
		
	// The code run in a sequence; goes to Three's super to Two's super, to One
		// Then completes One, then Two then Three
	// Output:
//		One is 1
//		One is 1 Two is two
//		One is 1 Two is two Three is 3
		
	}
}
