// This program is to demonstrate abstract method.
package com.cg.abstractclass;
// Abstract methods can only be used in abstract class.
// The implementation of an abstract method need to be done by extending the abstract class.

// Syntax:
	// `access modifier` abstract void `method name`();

 abstract class AbstractMethod extends AbstractClassOOP { // If we dont implement all abstract methods in the extended class, we have to turn it into an abstract class too
//	abstract void m(); ////abstract method is only allowed to be used in abstracted classes.
	
//	private abstract void ChildAbstractMethod();
//	The abstract method ChildAbstractMethod in type AbstractMethod can only set a visibility modifier, 
	//--> one of public or protected or default(unmentioned)
	abstract void ChildAbstractMethod();
}
class ExtentionOfEctendedAbstract extends AbstractMethod{

	@Override
	public void nFour() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void ChildAbstractMethod() {
		// TODO Auto-generated method stub
		
	}
	
}

