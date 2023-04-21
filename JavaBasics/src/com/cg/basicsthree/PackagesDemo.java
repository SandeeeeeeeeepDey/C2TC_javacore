package com.cg.basicsthree;

public class PackagesDemo {

	public static void main(String[] args) {
		// packages help us organize classes, so that we can identify and use data from classes also 
		// while keeping them organized in a neat, organized way.
		// packages are of two types, default(automatically generated) and user-defined.
		// if we want to work with classes in other packages, we need to import the object from that package,
		// there are three ways of calling it for an object,
		
		// Example using Import Statement:
		
		// import java.util.random;
		
		// if we have multiple classes we need, we will need to import * from that package.
		// Example for Wild Card Statement:
		
		// java.util.*;
		
		// Example for Fully qualified method:
		java.util.Scanner sc= new java.util.Scanner(System.in);
		// We use this method to avoid an extra import statement.

	}

}


