package com.cg.streamapi;
import java.util.*;
public class LimitDemo {
// Program to demonstrate intermediate method limit(), using terminal method forEach
	public static void main(String[] args) {
		List<String> list = Arrays.asList("a","b","c","d","e","f");
		// using limits normally
		int i=0;
		while(i<4) {
			System.out.println(list.get(i));
		i++;
		}
		System.out.println("-------------------------------------------");
		// using limits in stream API
		list.stream().limit(4).forEach(System.out::println);

	}

}
