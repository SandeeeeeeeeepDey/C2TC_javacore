package com.cg.accessmodifierpackagetwo;

import com.cg.accessmodifierpackageone.TestOne;// Need to import package
//Within class inside other package.
//public.
public class TestFour {
	
	
	public static void main(String[] args) {
		TestOne tOne= new TestOne();
		System.out.println("-----------------------------------------------");
		//System.out.println(tOne.privateVar);
		//tOne.testOnePrivate();
		System.out.println("-----------------------------------------------");
		//System.out.println(tOne.defaultVar);
		//tOne.testOneDefault();
		System.out.println("-----------------------------------------------");
		//System.out.println(tOne.protectedVar);
		//tOne.testOneProtected();
		System.out.println("-----------------------------------------------");
		System.out.println(tOne.publicVar);
		tOne.testOnePublic();
		System.out.println("-----------------------------------------------");

	}

}
