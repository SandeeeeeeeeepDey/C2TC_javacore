// This program is to demonstrate implementable classes from Collection: ArrayList.
package com.cg.list;
import java.util.*;
public class CollectionDemo {
		// Arrays have limitations such as fixed size and homogeneous elements. 
		// Collection is in interface that solves this problem.
	
	public static void main(String[] args) {
		// Collection implementable classes can have all primitive, non-primitive type data and also user defined class type inputs.
		Boys b=new Boys(180,76,"Bat Man",true), bOne=new Boys(180,76,"Super Man",true);
		Girls g=new Girls(180,76,"Bat Woman",true), gOne=new Girls(180,76,"Super Woman",true);
		Collection list=new ArrayList();
		list.add("abc");
		list.add(8);
		list.add(3.14);
		list.add(false);
		list.add(gOne);
		list.add(g);
		list.add(b);
		list.add(bOne);
		System.out.println(list);
		System.out.println(list.contains(gOne));
		System.out.println(list.contains("Bat Man"));
	
System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

	// There are 4 ways commonly used to iterate through an array list:
		// for loop:
			for(int i=0;i<list.size(); i++) { // Since the length is not fixed, 
				System.out.println(((ArrayList) list).get(i)); // There is no get method in Collection Interface, so we have to type-cast it to ArrayList.
	}
			System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		// for-each loop:
			for(Object obj:list) 
				System.out.println(obj);
			System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		// Iterator loop:
			Iterator itr=list.iterator();
			while(itr.hasNext()) 
				System.out.println(itr.next());
			System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		// ListIterator:
			ListIterator Litr=((ArrayList) list).listIterator(); // ListIterator is a subclass of ArrayList
			
			while(Litr.hasNext()) 
				System.out.println(Litr.next());
			System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

			while(Litr.hasPrevious()) 
				System.out.println(Litr.previous());
	

	}
}
// Class for user defined Class type Object.
class Boys{
	int height;
	int weight;
	String name;
	boolean read;
	Boys(int height, int weight, String name, boolean read){
		this.height=height;
		this.weight=weight;
		this.name=name;
		this.read=read;
	}
	@Override
	public String toString() {
		return "Boys [height=" + height + ", weight=" + weight + ", name=" + name + ", read=" + read + "]";
	}
	
// One more class for user defined Class type Object.
}
class Girls{
	int height;
	int weight;
	String name;
	boolean read;
	Girls(int height, int weight, String name, boolean read){
		this.height=height;
		this.weight=weight;
		this.name=name;
		this.read=read;
	}
	@Override
	public String toString() {
		return "Boys [height=" + height + ", weight=" + weight + ", name=" + name + ", read=" + read + "]";
	}
}
