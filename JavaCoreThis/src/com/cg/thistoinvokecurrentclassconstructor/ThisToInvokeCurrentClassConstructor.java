package com.cg.thistoinvokecurrentclassconstructor;

public class ThisToInvokeCurrentClassConstructor {
	// Here I am explain the fourth way of using "this" keyword:
	// Using "this" as a class constructor.
	
	private String strOne;
	private String strTwo;
	private String strThree;

	// If an object is made with no fields, it will enter this first constructor and 
	// invoke the constructor with one defined field.
    public ThisToInvokeCurrentClassConstructor() {
        this("calling Second constructor"); 
    }
    
    // If this constructor is invoked, it invokes the constructor with Two defined fields.
    public ThisToInvokeCurrentClassConstructor(String strOne) {
        this("calling Second constructor","calling third constructor"); 
    }

    // If this constructor is invoked, it invokes the constructor with Three defined fields.
    public ThisToInvokeCurrentClassConstructor(String strOne, String strTwo) {
    	this("calling Second constructor","calling third constructor","Classing fourth constructor");
    }
    
    // This constructor can be invoked with user defined fields only.
    public ThisToInvokeCurrentClassConstructor(String strOne, String strTwo, String strThree) {
        this.strOne = strOne;
        this.strTwo = strTwo;
        this.strThree = strThree;
    }

	@Override
	public String toString() {
		return "ThisToInvokeCurrentClassConstructor [strOne=" + strOne + ", strTwo=" + strTwo + ", strThree=" + strThree
				+ "]";
	}
    

	
}


