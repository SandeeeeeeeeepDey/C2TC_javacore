// Driver class to check if catch the exceptions.
package com.cg.exceptionhandling;
public class Driver {

	public static void main(String[] args) {
		// handled exceptions:
				ExceptionHandling handle=new ExceptionHandling();
				handle.arithmeticException();
				handle.arrayIndexOutOfBoundsException();
				handle.fileNotFoundException();
				handle.nullPointerException();
				handle.numberFormatException();
				handle.iOException();
		System.out.println("---------------------------------------------------------------------------------------------------------------");
		// un-handledexceptions:
				DefiningExceptions ex = new DefiningExceptions();
				ex.arithmeticException();
				ex.arrayIndexOutOfBoundsException();
				ex.fileNotFoundException();
				ex.nullPointerException();
				ex.numberFormatException();
				ex.iOException();
		
		
	}

}
