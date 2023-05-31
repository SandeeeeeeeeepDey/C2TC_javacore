package com.cg.mapinterface;
import java.util.*;
// Program to demonstrate Navigable TreeMap
public class NavigableTreeMapDemo {
// TreeMap class implements either sorted maps or a child interface of SortedMap called NavigableMap.
	// This Map is ideal when dealing with numerical keys.
	public static void main(String[] args) {
		NavigableMap<Integer, String> nM=new TreeMap<>();
		nM.put(91,"Carrot");
		nM.put(21,"Barrel");
		nM.put(89,"Love");
		nM.put(31,"Oven");
		nM.put(70,"Platinum Blonde");
		nM.put(13,"Condition");
		nM.put(8,"Speaker");
		nM.put(25,"Note");
		nM.put(92,"Fear");
		nM.put(31,"Depersonalization Disorder");
		nM.put(57,"Time and a Half");
		nM.put(79,"Shivering Pink Toenails");
		nM.put(34,"Hovercraft");
		nM.put(93,"Barrel");
		nM.put(79,"Print");
		//nM.put("Barrel","Barrel");
		nM.put(74,"Level");
		nM.put(37,"Speaker");
		nM.put(57,"Field");
		nM.put(56,"Dirt");
		System.out.println(nM);
		System.out.println("=======================================================================================================================================");
		
		// Apart from all the Methods that TreeMaps have, Navigable TreeMaps have a few more methods.
		
		// For example:
		// ceilingKey(key) - Returns the least key >= given key.
		System.out.println("Returns the least key >= given key.");
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println(nM.ceilingKey(67));
		
		//For entries: ceilingEntry(key)
		System.out.println(nM.ceilingEntry(67));
		System.out.println("=======================================================================================================================================");
		
		//descendingKeySet() - Returns keys in a reverse order.
		System.out.println("Returns keys in a reverse order.");
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println(nM.descendingKeySet());
		
		// descendingMap() is for entries.
		System.out.println(nM.descendingMap());
		System.out.println("=======================================================================================================================================");
		//lowerKey(key) - Returns the greatest key < given key.
		System.out.println("Returns the greatest key < given key.");
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println(nM.lowerKey(76));
		
		//lowerEntry(key) - for entries.
		System.out.println(nM.lowerEntry(76));
		System.out.println("=======================================================================================================================================");
		// floorKey(key) - Returns the greatest key <= the given key.
		System.out.println("Returns the greatest key <= the given key.");
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println(nM.floorKey(21));
		// floorEntry(key) for entries.

		System.out.println(nM.floorEntry(21));
		System.out.println("=======================================================================================================================================");
		// higherKey(key) - Returns the least key > given key.
		System.out.println("Returns the least key > given key.");
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println(nM.higherKey(90));
		
		// nM.higherEntry(key) for entries.
		System.out.println(nM.higherEntry(90));
		System.out.println("=======================================================================================================================================");
		// pollFirstEntry() - Removes and returns the first entry.
		System.out.println("poll: "+nM.pollFirstEntry());
		// pollLastEntry() - Removes and returns the last entry.
		System.out.println("=======================================================================================================================================");
		// navigableKeySet() - Returns a navigable set of the keys.
		System.out.println("navigableKeySet(): "+nM.navigableKeySet());
		System.out.println("=======================================================================================================================================");
		// subMap(fromKey, toKey) - Returns a subMap from fromKey to toKey.
		System.out.println("subMap: "+nM.subMap(13, 25));// will not include the last key.
		System.out.println("=======================================================================================================================================");
		// headMap(toKey) - Returns entries whose keys are < given Key.
		System.out.println("Returns entries whose keys are < given Key.");
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println(nM.headMap(31));
		System.out.println("=======================================================================================================================================");
		// tailMap(fromKey) - Returns entries whose keys are > given Key.
		System.out.println("Returns entries whose keys are > given Key.");
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println(nM.tailMap(91));
		System.out.println("=======================================================================================================================================");

	}

}
