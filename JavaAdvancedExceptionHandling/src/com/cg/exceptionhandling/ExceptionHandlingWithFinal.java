package com.cg.exceptionhandling;

public class ExceptionHandlingWithFinal {

	static void handledFinally() {
		try {
			int num[]= {1,2,3,4};
			System.out.println(num[4]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Caught the ArrayIndexOutOfBoundsException.");
		}finally {
			System.out.println("Consider it handled!");
		}
	}
	static void unhandledFinally() {
		try {
			int num=8;
			int imp=num/0;
			System.out.println(imp);
		}finally { // to complete a try block we can provide it with a correct catch block, 
					//but we can also fuse finally block instead of incorrect catch or no catch block at all. 
					//if there is a try and a final, the final irrespective of exception being handled, will always work at the end.
			System.out.println("Not handled! Im here to atleast give the message.");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		handledFinally();
		System.out.println("--------------------------------------------------------------------------------------------");
		unhandledFinally();
	}

}
