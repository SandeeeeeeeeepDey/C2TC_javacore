package com.cg.inheritance;

public class InheritanceDemoCitizen {

	private String name;
	private String aadhaar;
	private String address;
	private int age;
	
	public InheritanceDemoCitizen() {
		
	}
	public InheritanceDemoCitizen(String name, String aadhaar, String address, int age) {
		this.name=name;
		this.aadhaar=aadhaar;
		this.address=address;
		this.age=age;
	}
	
	private void canVote() {
		if(this.aadhaar!=null) {
			if(this.age>=18) {
				System.out.println(this.name+" is Eligible to vote");
			}else if(this.name.equals("Bruce Wayne")) {
				System.out.println("By virtue of Citizen fan base, "+this.name+ " is Eligible for everything, including vote");
			}else {
				System.out.println(this.name+" is Not Eligible to vote");
			}
		}
	}
	public void eligible() {
		canVote();
	}
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getAadhaar() {
		return aadhaar;
	}



	public void setAadhaar(String aadhaar) {
		this.aadhaar = aadhaar;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	

}
