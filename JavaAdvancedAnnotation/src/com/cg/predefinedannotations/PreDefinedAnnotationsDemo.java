package com.cg.predefinedannotations;
import java.util.*;
// Program to demonstrate Predefined Annotations.
public class PreDefinedAnnotationsDemo {

	
	public static void main(String[] args) {
		// There are four Annotations commonly used:
//---------------------------------------------------------------------------------------------------------------------------------------------------
			//Override
		class ExampleCall implements FunctionalInterfaceExample{

			@Override // Used to indicate Overriding to avoid mismatch.
			public void overrideExample() {
				// TODO Auto-generated method stub
				
			}}
//---------------------------------------------------------------------------------------------------------------------------------------------------			
		
		@SuppressWarnings({ "rawtypes", "unused" }) // Used to suppress yellow underlines representing warnings.
		List l=new ArrayList();
//---------------------------------------------------------------------------------------------------------------------------------------------------
	}
	@Deprecated // To indicate that this Function is not recommended to be used
	static void deprecatedExample(){}
//---------------------------------------------------------------------------------------------------------------------------------------------------

	@FunctionalInterface // Used to assure an interface is Functional interface.
	interface FunctionalInterfaceExample{
		void overrideExample();
	}
//---------------------------------------------------------------------------------------------------------------------------------------------------

}
