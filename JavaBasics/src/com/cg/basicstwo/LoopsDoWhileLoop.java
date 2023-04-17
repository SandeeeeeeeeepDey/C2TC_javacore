package com.cg.basicstwo;

public class LoopsDoWhileLoop {

	public static void main(String[] args) {
		// Do-While loop:
		// *it does a task and 
		// *then compares if the already initiated value in the condition is true
		// if true, it performs the task again then compares and continues as so until comparison is false
		// if false, it breaks, but in every do-while loop, the task is completed at least once.
		// example:
		int i=0;
		do {
			System.out.println(i);
			i++;
		}while(i<10);
		// All integers between 0 to 10 are printed

	}

}
