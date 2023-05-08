package com.cg.exceptionhandlingthrowandthrows;
import java.util.*;
public class ProblemTwo {
// Problem 2:
	//	Create your own exception called InvalidDirectionException it should
	//	display an message called “You are going in wrong direction”. Your code
	//	should get two input’s which is HouseDirection and GpsLocation.
	//	If both are equal “You are going in correct direction”.
	//	If both are not equal InvalidDirectionException is Thrown “You are going
	//	in wrong direction”.
	public static void main(String[] args)throws InvalidDirectionException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter GpsLocation direction:");
		String gps=sc.next().toLowerCase();
		System.out.println("Enter HouseDirection direction:");
		String houseD=sc.next().toLowerCase();
		if(gps.equals(houseD)) System.out.println("You are going in correct direction");
		else throw new InvalidDirectionException("You are going in wrong direction");
	}
}
class InvalidDirectionException extends Exception{
	public InvalidDirectionException(String s) {
		super(s);
	}
}
