package com.cg.mapinterface;
import java.util.*;
public class HashMapDemo {
// Program to demonstrate HashMap
	public static void main(String[] args) {
		// Maps store data as keys and values pair.
		// Keys are always unique, values may be same.
		// Both keys and values can be of any datatype.

		Map<Integer,String> numberCoder= new HashMap<>();
		numberCoder.put(76,"Hood");
		numberCoder.put(null,"Depersonalization Disorder"); // key can also be null
		numberCoder.put(68,"Vegetable");
		numberCoder.put(86,null); // value can also be null
		numberCoder.put(42,"null");
		numberCoder.put(6,"Effulgent");
		numberCoder.put(40,"Hood");
		numberCoder.put(null,"National Security Agency"); // for two same keys, even if its null, the newer key value pair will be considered.
		numberCoder.put(2,"Effulgent"); 
		numberCoder.put(5,"Nerve");
		numberCoder.put(37,"Oranges");
		numberCoder.put(54,"Spiral Cake");
		numberCoder.put(38,"Loaf");
		numberCoder.put(2,"Bomb");
		
		System.out.println("Normal representaton of a map:-");
		System.out.println(numberCoder); // difference from other Collection classes or arrays if {} brackets instead of [].
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("Iteration using iterator for map:-");
		Set forIteration=numberCoder.entrySet();
		Iterator i=forIteration.iterator();
		
		while(i.hasNext()) {
			
			System.out.println("This will be of set type, means we wont be able to use it as key value pairs: "+i.next());
		}
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
		i=forIteration.iterator();
		while(i.hasNext()) {
			Map.Entry reConstruct=(Map.Entry<Integer,String>)i.next(); // in map type, we can use each element as keys and values pair.
			System.out.println("This will be of map type: "+reConstruct.getKey()+"-->"+reConstruct.getValue()); // Map.entry is used to define map type
		}
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
		try {
			Map.Entry<Integer,String> entry = null;
			numberCoder.put(entry.getKey(), entry.getValue());
			System.out.println(entry.getKey());
		}catch(NullPointerException e) {
			System.out.println("!!!");
		}
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
		for(Map.Entry<Integer,String> entry: numberCoder.entrySet()){
			System.out.println(entry.getKey()+" -> "+entry.getValue());
		}
		
		
	}

}
