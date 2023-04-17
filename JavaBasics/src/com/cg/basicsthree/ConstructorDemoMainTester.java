package com.cg.basicsthree;

public class ConstructorDemoMainTester {

	public static void main(String[] args) {
		// Test to demonstrate default type constructor:
		 ConstructorDemoDefaultTypeExample defaultType=new ConstructorDemoDefaultTypeExample();
		 // Output:
//		 defaultObjectSetOne ""
//		 defaultObjectSetTwo "0"
		 System.out.println("----------------------");
		 defaultType.setDefaultObjectSetOne("Object One is changed to what you are reading");
		 System.out.println(defaultType.getDefaultObjectSetOne());
		 defaultType.setDefaultObjectSetTwo(101010);
		 System.out.println(defaultType.getDefaultObjectSetTwo());
		 //Output:
//		 Object One is changed to what you are reading
//		 101010
		 System.out.println("----------------------");
		 
		 //Test to demonstrate user defined constructors:
		 ConstructorDemoUserDefinedTypeExample userDefinedTwo=new ConstructorDemoUserDefinedTypeExample("","",0,0L);
		 System.out.println(userDefinedTwo.getTask());
		 System.out.println(userDefinedTwo.getExample());
		 System.out.println(userDefinedTwo.getNum());
		 System.out.println(userDefinedTwo.getNumber());
		//Output:
//		 Demonstrate Pre-defined objects that change with datatype
//		 two strings, one int and one long constructor activated
//		 1
//		 1
		 System.out.println("----------------------");
		 
		 ConstructorDemoUserDefinedTypeExample userDefinedOne=new ConstructorDemoUserDefinedTypeExample("","",0,0);
		 System.out.println(userDefinedOne.getTask());
		 System.out.println(userDefinedOne.getExample());
		 System.out.println(userDefinedOne.getNum());
		 System.out.println(userDefinedOne.getNumber()); // since the constructor from which it is seeking information of Number doesn't have Number variable, so its providing default value.
		 System.out.println(userDefinedOne.getNumTwo());
		 //Output:
//		 Demonstrate Pre-defined objects that change with datatype
//		 two strings and two int constructor activated
//		 2
//		 0
//		 22
		 System.out.println("----------------------");
		 ConstructorDemoUserDefinedTypeExample userDefinedThree=new ConstructorDemoUserDefinedTypeExample("","",0);
		 System.out.println(userDefinedThree.getTask());
		 System.out.println(userDefinedThree.getExample());
		 System.out.println(userDefinedThree.getNum());
		// Output:
//		 Demonstrate Pre-defined objects that change with number of Parameters
//		 two strings and one int constructor activated
//		 3
		 

	}

}
