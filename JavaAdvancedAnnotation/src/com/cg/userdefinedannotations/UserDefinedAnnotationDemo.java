package com.cg.userdefinedannotations;
import java.lang.annotation.*;
// Program to demonstrate User Defined Annotation
public class UserDefinedAnnotationDemo {
//--------------------------------------------------------------------------------
// User Defined Annotation are or three types
	
	// Marker Annotation
	@interface Fruit{
	}
	
	// Single Value Annotation
	@interface DefineJuciness{
		String howMuch() default "Very"; // properties can be set by default
	}
	
	// Multi Value Annotation
	@interface JuiceQuality{
		String nutrition(); 
		String sweetness();
	}
//--------------------------------------------------------------------------------
// Usage
	@JuiceQuality(nutrition="",sweetness="") // Properties can be Set while using
	@DefineJuciness
	@Fruit
	class Grape{
		
	}
//--------------------------------------------------------------------------------	
}




