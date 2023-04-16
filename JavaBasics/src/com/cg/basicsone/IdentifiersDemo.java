package com.cg.basicsone;

public class IdentifiersDemo {

	public static void main(String[] args) {
		// After we learned how to make a project, 
		// basic needs of packages and
		// how to make classes in with right conventions in java,
		// enabling void main option,
		// we explored a little on the meaning of public class and
		// public static void main. And that each project should have a main, and that class runs first.
		// we also discussed of how parameters and arguments are different.
		// learned the eclipse IDE syso ctrl+space shortcut, what IDE is 
		// and the basics of java along with, how java works using jre, jdk and jvm.
		
		//Identifiers---> it is the name by which we identify a class\method\variables\packages
		
		//packages should be named as a website name in reverse, followed .{name} and all must be in lower case.
		// eg: com.cg.packagename
		
		//class name should start with upper case and in camel case with no character or num except underscore.
		// eg: AppropriateNameAndNoAbriviations or IdentifiersDemo
		
		//method naming convention is same as class except that it should start with lower case.
		//eg: methodName
		// same is for name of variables
		//eg: varName
		//---->> Names for variables and methods
		int age;
		String firstName;
		double hourlyRate;
		boolean isEmployee2; // best practice is to not use numbers
		float $percent; // best practice is to not use and characters
		char _grade; // best practice is to not use characters including underscore
		//<<----
		//Although all the above names are accepted, 
		//but we should keep in mind to only use the first three as identifiers for variables and methods
		//It is not allowed to not use pre defined keywords and numbers in the begining,
		// eg: String while; or double 2Times;
	}

}
