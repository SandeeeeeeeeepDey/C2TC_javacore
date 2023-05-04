package com.cg.stringbufferdemo;
// This program is to demonstrate the use of Capacity and ensureCapacity methods.
public class StringBuilderCapacity {

	public static void main(String[] args) {
		StringBuilder str=new StringBuilder();// Empty StringBuilders are predefined to hold 16 characters size.
		System.out.println(str.capacity()); // Output: 16
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		
		StringBuilder strOne=new StringBuilder(2); // However, we can define specific higher or lower capacity to it.
		System.out.println("Capacity is: "+strOne.capacity()); // Output:Capacity is: 2
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		
		strOne.append("Bat"); // When the capacity is exceeds, it add 2 to the double of the present value.
		System.out.println("Length of characters: "+strOne.length()); // Output: Length of characters: 3
		System.out.println("Capacity: (old capacity=2)2*2+2="+strOne.capacity()); // Output:Capacity: (old capacity=2)2*2+2=6 
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		
		strOne.append("man "); // It will do the same, each time it exceeds the capacity.
		System.out.println("Length of characters: "+strOne.length()); // Output:Length of characters: 7
		System.out.println("Capacity: (old capacity=6)6*2+2="+strOne.capacity()); // Output:Capacity: (old capacity=6)6*2+2=14
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		
		strOne.append(" is Bruce Wayne, can you believe that"); // When the length is more than the next calculable capacity,
																	// capacity becomes = length.
		System.out.println("Length of characters: "+strOne.length()); // Output:Length of characters: 44
		System.out.println("Capacity is length of string: "+strOne.capacity()); // Output:Capacity is length of string: 44
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		
		StringBuilder strTwo=new StringBuilder();
		strTwo.ensureCapacity(17); // This minimum number of character when exceeds the old capacity, 
									//again 2+2*oldCapacity is performed to calculate new capacity.
		System.out.println(strTwo.capacity()); // Output:34
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		
		strTwo.ensureCapacity(71); // This minimum number of character when exceeds the old capacity and the new calculable capacity, 
									//it takes directly the value as the capacity.
		System.out.println(strTwo.capacity()); // Output:71
		
	}

}
