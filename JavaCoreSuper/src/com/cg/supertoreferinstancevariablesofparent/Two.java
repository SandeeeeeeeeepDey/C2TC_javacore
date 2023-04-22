package com.cg.supertoreferinstancevariablesofparent;

public class Two extends One{
	
	private String two;
	public Two(int one, String two) {
		super(one);
		this.two=two;
		System.out.println("One is "+one+" Two is "+two);
	}
}

