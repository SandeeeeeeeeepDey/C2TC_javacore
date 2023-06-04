package com.cg.streamapi;

import java.util.*;
import java.util.List;

public class ArithmeticOperations {
	static List<Integer> list= Arrays.asList(1,2,3);
	static class withoutStream {
		static void add() {
			int sum=0;
			for(int n: list)
				sum+=2*n;
			System.out.println(sum);
		}
	}
	static class withStream {
		static void add() {
			System.out.println(list.stream().map((i)->2*i).reduce(0,(a,b)->a+b));
		}
	}
	public static void main(String[] args) {
		withoutStream.add();
		withStream.add();
	}

}
