package com.cg.exceptionhandlingthrowandthrows;

import java.util.Scanner;

// Problem 1:
	//Write a program to split the string based on /(slash) symbol in a string. Perform
	//exception handling and also include finally block which will print "Inside finally
	//block". Get a string from the user.
	//If the length of the string is > 2 then call user defined function splitString() and print the
	//split string along with index.
	//Else use the same method splitString() to print the exception NullPointerException.

// Solution:
	public class ProblemOne{
		public static void main(String[] a) {
			Scanner sc = new Scanner(System.in);
			String str=sc.nextLine();
			if(str.length()>2) splitStr(str);
			else splitStr(null);
		}
		static void splitStr(String s) {
			int i=0;
			try {
				String[] str=s.split("/");
				while(i<str.length) {
					System.out.println(i+" Number index of the string is "+str[i]);
					i++;
				}
			}catch(NullPointerException e) {
				System.out.println(e);
			}finally {
				System.out.println("Inside finally block");
			}
			
		}
	}
	