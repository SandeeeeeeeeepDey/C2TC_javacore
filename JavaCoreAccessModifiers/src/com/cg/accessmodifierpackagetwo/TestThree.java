package com.cg.accessmodifierpackagetwo;

import com.cg.accessmodifierpackageone.TestOne;

public class TestThree extends TestOne {

	public static void main(String[] args) {
		TestThree tOne= new TestThree();
		System.out.println("-----------------------------------------------");
		//System.out.println(tOne.privateVar);
		//tOne.testOnePrivate();
		System.out.println("-----------------------------------------------");
		//System.out.println(tOne.defaultVar);
		//tOne.testOneDefault();
		System.out.println("-----------------------------------------------");
		System.out.println(tOne.protectedVar);
		tOne.testOneProtected();
		System.out.println("-----------------------------------------------");
		System.out.println(tOne.publicVar);
		tOne.testOnePublic();
		System.out.println("-----------------------------------------------");

	}

}
