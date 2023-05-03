package com.cg.accessmodifierpackageone;
// Inside class
// private, default, protected and default.
public class TestOne {
	private String privateVar="I am a Private String";
	String defaultVar="I am a Default String";
	protected String protectedVar="I am a Protected String";
	public String publicVar="I am a Public String";
	
	private void testOnePrivate() {
		System.out.println("I am a String inside Private Method");
	}
	void testOneDefault() {
		System.out.println("I am a String inside Default Method");
	}
	protected void testOneProtected() {
		System.out.println("I am a String inside Protected Method");
	}
	public void testOnePublic() {
		System.out.println("I am a String inside Public Method");
	}
	
	
	public static void main(String[] args) {
		TestOne tOne= new TestOne();
		System.out.println("-----------------------------------------------");
		System.out.println(tOne.privateVar);
		tOne.testOnePrivate();
		System.out.println("-----------------------------------------------");
		System.out.println(tOne.defaultVar);
		tOne.testOneDefault();
		System.out.println("-----------------------------------------------");
		System.out.println(tOne.protectedVar);
		tOne.testOneProtected();
		System.out.println("-----------------------------------------------");
		System.out.println(tOne.publicVar);
		tOne.testOnePublic();
		System.out.println("-----------------------------------------------");
	}

}
