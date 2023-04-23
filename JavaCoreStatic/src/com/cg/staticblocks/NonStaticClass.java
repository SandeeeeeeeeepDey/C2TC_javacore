package com.cg.staticblocks;

public class NonStaticClass {
	String str= "non static string";
	String strTwo;
	public String nonStatic(String strTwo) {
		
		return this.strTwo=strTwo;
	}
}
