// Program to demonstrate LinkedList
package com.cg.list;
import java.util.*;
public class LinkedListDemo {
	// We need to check: Order of output and if it accepts duplicates and null value.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list=new LinkedList<>();
		list.add(20);
		list.add(1);
		list.add(36);
		list.add(52);
		list.add(2);
		list.add(35);
		list.add(1); // accepts duplicate.
		list.add(66);
		list.add(40);
		list.add(85);
		list.add(null); // accepts null.
		System.out.println(list); // output is order of insertion.
		System.out.println("---------------------------------------------------------------------");
		
		System.out.println("Index 0 is: "+list.get(0)+"| getFirst() also gives: "+ list.getFirst()+"\n"+"size()-1 index is: "+list.get(list.size()-1)+"| getLast() also gives: "+ list.getLast());
		System.out.println("---------------------------------------------------------------------");
		list.remove();
		System.out.println(list); // first index removed
		System.out.println("---------------------------------------------------------------------");
		list.removeFirst();
		System.out.println(list); // new first index removed
		System.out.println("---------------------------------------------------------------------");
		list.removeLast();
		System.out.println(list); // last index removed
		System.out.println("---------------------------------------------------------------------");
		
		Collections.sort(list);
		System.out.println(list); // to sort the list
		System.out.println("---------------------------------------------------------------------");
		
		//Iteration can be done by for, for-each, Iterator and ListIterator just like ArrayList.
		 ListIterator<Integer> lI=list.listIterator(0);
		  while(lI.hasNext()) {
			 System.out.println(lI.next());
		 }
		 System.out.println("---------------------------------------------------------------------");
		  
		 while(lI.hasPrevious())
			 System.out.println(lI.previous());
		 System.out.println("---------------------------------------------------------------------");
		 
		 lI=list.listIterator(list.size()/2); // we can set index from where to start iterating
		 while(lI.hasNext()) {
			 System.out.println(lI.next());
		 }
		 
}
}
