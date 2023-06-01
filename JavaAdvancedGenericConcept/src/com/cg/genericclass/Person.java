package com.cg.genericclass;

public class Person {
private String name;
private int age;
private String message;
private String email=String.join("",this.name.split(" ")).toLowerCase()+"@info.com";
public Person(String name,int age) {
	this.name=name;
	this.age=age;
}
	public void info() {
		String yob=Integer.toString(2023-age);
		System.out.println(this.name+" was born on "+yob+".");
		System.out.println(this.name+"'s, email ID is: "+this.email);

	}
	public void message(String message) {
		this.message=message;
	}

}
