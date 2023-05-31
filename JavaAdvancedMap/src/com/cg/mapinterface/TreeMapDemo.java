package com.cg.mapinterface;
import java.util.*;
// To demonstrate TreeMaps
public class TreeMapDemo {
//	public static <TreeMap> void main(String[] args) {
//		TreeMap tM=new TreeMap();
//
//	}
	public static void main(String[] args) {
		// TreeMaps sort the keys similar to TreeSets
		SortedMap tM=new TreeMap();
		// for non generic maps, keys must be of same type, but values can be of any type.
		tM.put("Sorting", 44);
		tM.put("4", "First String");
		tM.put("5", 'd');
		tM.put("3", 23.34);
		tM.put(" ", "Second");
		tM.put("=", "Third");
		tM.put("`", "Fourth");
		tM.put("{", "values can be of any type; If not generic");
		tM.put("4", null);
		//tM.put(null, "efsf");// null in key place is not accepted but is accepted as value
		System.out.println(tM);
		Iterator it=tM.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry m=(Map.Entry)it.next();
			System.out.println("`"+m.getValue()+"`, Value belongs to: `"+m.getKey()+"` Key");
		}
		

	}
	
}
