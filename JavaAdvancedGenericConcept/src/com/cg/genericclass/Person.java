package com.cg.genericclass;
import java.util.*;

public class Person {
private String name;
private int age;

private ArrayList ownmessege;
private ArrayList othermessege;

public Person(String name,int age) {
	this.name=name;
	this.age=age;
	
}
	public void info() {
		String yob=Integer.toString(2023-age);
		System.out.println(this.name+" was born on "+yob+".");
		System.out.println(this.name+"'s, email ID is: "+yob+String.join("",this.name.split(" ")).toLowerCase()+"@info.com");

	}
	@Override
	public String toString() {
		return "["+ name +"]";
	}
	

}
