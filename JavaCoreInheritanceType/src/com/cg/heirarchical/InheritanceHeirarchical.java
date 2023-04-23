package com.cg.heirarchical;

public class InheritanceHeirarchical {
// To have childs with distinct properties and only a common parent is Hierarchical type Inheritance.
	
	public static void main(String[] args) {
		
		Fan fOne=new Fan(); // Parent
		System.out.println("------------------------------------------------------");
		
		CommonElectricFan fTwo=new CommonElectricFan(); // Parent is Fan.
														// Has no connection with DysonFan.
		System.out.println("------------------------------------------------------");
		
		DysonFan fThree=new DysonFan(); // Parent is Fan.
										// Has no connection with CommonElectricFan.
		System.out.println("------------------------------------------------------");
		
	} 
	//Output:
	
//	 Characteristics:-
//	 Pushes or pulls air
//	 ------------------------------------------------------
//	  Characteristics:-
//	 Pushes or pulls air
//	 Has blades shaped in order to push or pull air by rotation
//	 ------------------------------------------------------
//	  Characteristics:-
//	 Pushes or pulls air
//	 Has no blades, but still pushes and pulls air through a thin hollow space
//	 ------------------------------------------------------


}
