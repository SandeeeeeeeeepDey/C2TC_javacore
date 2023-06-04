package com.cg.genericclass;
import java.util.*;

public class Person {
	// Person data
private String name;
private int age;

	// Person Info through constructor
public Person(String name,int age) {
	this.name=name;
	this.age=age;
	
}

// just a simple info display method.
	public void info() {
		String yob=Integer.toString(2023-age);
		System.out.println(this.name+" was born on "+yob+".");
		System.out.println(this.name+"'s, email ID is: "+yob+String.join("",this.name.split(" ")).toLowerCase()+"@info.com");
	}
	
	// to String to be able to use the instance in print statement and identify the person instance.
	@Override
	public String toString() {
		return "["+ name +"]";
	}
	

}
