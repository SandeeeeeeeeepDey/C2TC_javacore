package com.cg.userdefinedannotations;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Program to demonstrate how to display properties of a user defined annotation

public class DisplayAnnotationFields {
	 static void main(String[] args) {
		
		Grape grape=new Grape("Green","Big"); // instance to find class of the object 
		Class c=grape.getClass(); // find class
		Annotation annotation=c.getAnnotation(DefineJuciness.class); // find the specified annotation from class
		DefineJuciness dJ= ( DefineJuciness ) annotation; // Among all annotations the class might have, specific type is taken as data of that type.
		System.out.println(dJ.howMuch()); // Each property of the specific Annotation type can be printed.

	}
   
	
}
// Example UserDefined Annotation

//@Inherited
//@Documented
//@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME) // needed to be able to display properties at runtime
@interface DefineJuciness{
	String howMuch() default "Very";
}

//Example class
@DefineJuciness(howMuch="Even more")
class Grape{
	String color;
	String size;
	Grape(String c,String s){
		color=c;
		size=s;
	}
}
