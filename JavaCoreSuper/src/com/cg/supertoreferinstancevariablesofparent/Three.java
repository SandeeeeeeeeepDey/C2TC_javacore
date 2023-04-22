package com.cg.supertoreferinstancevariablesofparent;

public class Three extends Two{
	private long three;
	public Three(int one, String two, long three) {
		super(one,two);
		this.three=three;
		System.out.println("One is "+one+" Two is "+two+" Three is "+three);
	}
	
}
