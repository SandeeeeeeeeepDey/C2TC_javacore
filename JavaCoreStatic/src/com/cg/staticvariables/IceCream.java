package com.cg.staticvariables;

public class IceCream {
	public static String base="Milk";
	public static String sweetener="Sugar";
	public String flavor;
	
	public IceCream(String flavor) {
		this.flavor=flavor;
		System.out.println("You ordered a "+base+" based, "+sweetener+"y "+ flavor+" Icecream");
		System.out.println("-------------------------------------------------");
	}

	@Override
	public String toString() {
		return "IceCream [flavor=" + flavor + "]";
	}
}
