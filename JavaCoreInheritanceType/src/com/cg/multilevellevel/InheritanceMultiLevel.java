package com.cg.multilevellevel;

public class InheritanceMultiLevel {

	public static void main(String[] args) {
		// Parent have multiple levels of child and each child is a parent of its child.
		// All childs can invoke properties and methods of multiple levels of parent.
		
		OneDimensional oneD=new OneDimensional(); // Can use properties of only itself.
		System.out.println("-------------------------------------------------------");
		TwoDimensional twoD=new TwoDimensional(); // Can use properties of OneDimensional and itself.
		System.out.println("-------------------------------------------------------");
		ThreeDimensional ThreeD=new ThreeDimensional(); // Can use properties of
														// OneDimensional, TwoDimensional and itself
		System.out.println("-------------------------------------------------------");
		
		// Output:
//		Has one axis and two directions for propagation
//		-------------------------------------------------------
//		Has one axis and two directions for propagation
//		 Has two axis and have 4 directions of propagation. Any direction in between can be expressed in components of two perpendicular axis
//		-------------------------------------------------------
//		Has one axis and two directions for propagation
//		 Has two axis and have 4 directions of propagation. Any direction in between can be expressed in components of two perpendicular axis
//		Has three axis and six primary directions of propagation. Every direction in between can be expressed in terms of three perpendicular axis.
//		-------------------------------------------------------

	}

}
