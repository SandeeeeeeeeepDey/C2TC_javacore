// Program to demonstrate generic ArrayList.
package com.cg.list;
import java.util.*;
// We need to check: Order of output and if it accepts duplicates and null value.
public class ArrayListGenericDemo {

	public static void main(String[] args) {
		// ArrayList can have any type of object as element, as demonstrated in the CollectionDemo class.
		// If we want an Array without a fixed size but has homogeneous elements, we can write the ArrayList as generic.
		// it is done by adding a datatype within diamond bracket as type, similar to arrays. and an empty diamond bracket in the initialization side.
		ArrayList<Integer> nums=new ArrayList<>();
		nums.add(3);
		nums.add(6);
		nums.add(4);
		nums.add(1);
		nums.add(49);
		nums.add(0,6); // Accepts Duplication.
		nums.add(null); // Accepts null, but cant perform methods like sort.
		System.out.println(nums); // Order of output is insertion order.
		nums.remove(null); // Remove a value
		nums.remove(3); // When we put an integer in remove method, it take the integer to be an index value instead of value.
		Collections.sort(nums); // Sort in ascending order. // cant sort if has null in it.
		System.out.println(nums);
		
		
	}

}
