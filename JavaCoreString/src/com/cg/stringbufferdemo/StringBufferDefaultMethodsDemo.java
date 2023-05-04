package com.cg.stringbufferdemo;

public class StringBufferDefaultMethodsDemo {

	public static void main(String[] args) {
		// String buffer has some inbuilt methods, lets see:
		
		//append(`String`):
		StringBuffer str=new StringBuffer();
		System.out.println(str); // Output:
		str.append("The weather is good.");
		System.out.println(str); // Output:The weather is good.
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		
		// insert(`index`, `String`):
		str.insert(14," extremely");
		System.out.println(str); // Output:The weather is extremely good.
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		
		// replace(`start index`, `end index`, `String`):
		str.replace(14,24," very");
		System.out.println(str); // Output:The weather is very good.
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		
		// delete(`start index`, `end index`):
		str.delete(15,20);
		System.out.println(str); // Output:The weather is good.
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		
		// reverse():
		str.reverse();
		System.out.println(str); // Output:.doog si rehtaew ehT
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		str.reverse();
		
		// charAt(`index`):
		System.out.println(str.charAt(0));// Output:T
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		
		// length():
		System.out.println(str.length()); // Output:20
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		
		// substring(`start index`, `end index`):
		System.out.println(str.substring(15,19)); // Output:good
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		
		// substring(`start index`):
		System.out.println(str.substring(15)); // Output:good

	}

}
