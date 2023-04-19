package com.cg.inheritance;

public class InheritanceDemoStudent extends InheritanceDemoCitizen {

	private String college;
	private int rollNo;
	
	public InheritanceDemoStudent(String name, String aadhaar, String address, int age, String college, int rollNo) {
		super(name, aadhaar, address, age);
		this.college=college;
		this.rollNo=rollNo;
	}
	
	void introduction() {
		System.out.println("-------------------------------------");
		System.out.println("I am "+getName()+" and my age is "+getAge());
		System.out.println("I am a Citizen, my aadhaar number is "+getAadhaar()+" and address is "+getAddress());
		System.out.println("I am also a student from "+this.college+", my roll number is "+ this.rollNo);
		System.out.println("-------------------------------------");
		eligible();
		System.out.println("-------------------------------------");
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	
}
