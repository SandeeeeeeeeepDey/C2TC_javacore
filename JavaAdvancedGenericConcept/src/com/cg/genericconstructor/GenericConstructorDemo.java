package com.cg.genericconstructor;
import java.util.*;
// Program to demonstrate generic constructors

class Constructor{
	// This Constructor class will accept all datatype as argument and will perform iteration based on the type of argument.
	public < T > Constructor(T type) {
		
		// For List type argument
		if(type instanceof List) {
			((List) type).forEach(System.out::println);
		}
		// For Array type argument
		if(type instanceof Object[]) {
			for(int i=0;i<((Object[])type).length;i++) {
				System.out.println(((Object[])type)[i]);
			}
		}
		// For map type argument
		if(type instanceof Map) {
			Set m=((Map)type).entrySet();
			Iterator itr=m.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
		}
		// For String type argument
		if(type instanceof String) {
			for(int i=0;i<((String)type).length();i++)
				System.out.println(((String) type).charAt(i));
			}

	}
}

public class GenericConstructorDemo {

	public static void main(String[] args) {
		// Generic constructors are similar to generic class.
		// The point of difference between this and Generic class is, while instantiating the class, Diamond brackets of generic is not required. 
		System.out.println("----------------List type argument-------------------");
		// List type argument
		List<Integer> arr= Arrays.asList(1,2,3);
		Constructor c=new Constructor(arr);
		System.out.println("----------------Array type argument-------------------");
		// Array type argument
		Integer[] i= {7,8,9,0};
		Constructor cc=new Constructor(i);
		System.out.println("----------------String type argument-------------------");
		// String type argument
		String str="String Type";
		Constructor ccc=new Constructor(str);
		System.out.println("----------------Map type argument-------------------");
		// Map type argument
		Map m=new HashMap();
		m.put("One", 1);
		m.put("Two", 2);
		m.put("Three", 3);
		m.put("Four", 4);
		Constructor cccc=new Constructor(m);
		
	}

}
