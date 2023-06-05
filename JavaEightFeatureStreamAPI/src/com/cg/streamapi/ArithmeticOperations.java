package com.cg.streamapi;
import java.util.*;
import java.util.List;
// Program to demonstrate how we can use Stream API to perform certain Arithmetic operations.
	// Characteristics of Stream API:
		// Has two types of functions:
			// Intermediate functions(Lazy)
			// Terminal functions
		// Designed for lambda functions
		// Does not store any values
		// Can parallelize task
		// faster and compact code

// Operations to perform:
interface Operations{
	// Add the double of each element.
	void add(List<Integer> list);
	
	// Multiply each number
	void multiply(List<Integer> list);
	
	// Add product of each adjacent pair
	void addProduct(List<Integer> list);
}

class withoutStream implements Operations{
	
	@Override
	public void add(List<Integer> list) {
		int sum=0;
		for(int n: list)
			sum+=2*n;
		System.out.println(sum);
		
	}

	@Override
	public void multiply(List<Integer> list) {
		int product=1;
		for(int n: list)
			product*=n*2;
		System.out.println(product);
		
	}
	@Override
	public void addProduct(List<Integer> list) {
		int sum=0, tempPrev=1;
		for(int n: list) {
			if(list.indexOf(n)==0)
				tempPrev*=n;
			else {
				sum+=tempPrev*n;
				tempPrev=n;
			}
		}
		System.out.println(sum);
	}

	
}
class withStream implements Operations {

	@Override
	public void add(List<Integer> list) {
		System.out.println(list.stream().map((i)->2*i).reduce(0,(a,b)->a+b));
		list.stream().map((i)->2*i).reduce(0,(a,b)->Integer.sum(a,b)); // same output
		list.stream().map((i)->2*i).reduce(0,Integer::sum); // same output
		
	}

	@Override
	public void multiply(List<Integer> list) {
		System.out.println(list.stream().map((i)->2*i).reduce(1,(a,b)->a*b));
		
	}

	@Override
	public void addProduct(List<Integer> list) {
		System.out.println(list.stream().skip(1).map(i -> list.get(list.indexOf(i) - 1) * i).reduce(0,Integer::sum));
		
	}
}

public class ArithmeticOperations {
	public static void main(String[] args) {
		List<Integer> list= Arrays.asList(9,1,2,3);

System.out.println("# Regular-------------------------------------------");
		withoutStream regular=new withoutStream();
		regular.add(list);
		regular.multiply(list);
		regular.addProduct(list);
		
System.out.println("# Stream-------------------------------------------");
		withStream stream=new withStream();
		stream.add(list);
		stream.multiply(list);
		stream.addProduct(list);
	}

}
