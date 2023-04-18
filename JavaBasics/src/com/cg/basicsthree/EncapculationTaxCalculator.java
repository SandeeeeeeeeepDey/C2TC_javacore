package com.cg.basicsthree;
import java.util.*;

public class EncapculationTaxCalculator {
	
EncapsulationTaxCalculatorCustomer customer = new EncapsulationTaxCalculatorCustomer();
Scanner sc=new Scanner(System.in);
String decision;

public EncapculationTaxCalculator() {
	System.out.println("Please enter your name");
	customer.setCustomer(sc.nextLine());
	System.out.println("Please enter your gender(Male or Female)");
	customer.setGender(sc.nextLine());
	String gender=customer.getGender().toUpperCase();
	System.out.println("Please enter your age");
	customer.setAge(sc.nextInt());
	System.out.println("Please enter your yearly income");
	customer.setIncome(sc.nextInt());
	System.out.println("-------------------------------------------------------------------");
	if(gender.equals("MALE") || gender.equals("FEMALE"))
	{
		System.out.println("Your name is: "+customer.getCustomer());
		System.out.println("Your gender is: "+customer.getGender());
		System.out.println("Your age is: "+customer.getAge());
		System.out.println("Your yearly income is: "+customer.getIncome());
		System.out.println("-------------------------------------------------------------------");
		System.out.println("Do you want to know your tax?(Y or N)");
		decision = sc.next().toUpperCase();
		System.out.println("-------------------------------------------------------------------");
		System.out.println("Your name is: "+customer.getCustomer());
		System.out.println("Your gender is: "+customer.getGender());
		System.out.println("Your age is: "+customer.getAge());
		System.out.println("Your yearly income is: "+customer.getIncome());
		taxIs(customer.getAge(), customer.getIncome(), customer.getGender());
	}else System.out.println(" You are requested to enter gender in the defined format; answer with male or female");
}
public void taxIs(int age, int income, String gender) {
	int tax;
	int realIncome;
	if(decision.equals("Y")) {
		if(age<=60) {
			if(income<700000) {
				tax=income*0;
				realIncome=income-tax;
				System.out.println("Your tax is "+ tax);
				System.out.println("Your income after tax payment, is "+ realIncome);
				System.out.println("-------------------------------------------------------------------");
				return;
			}else if(income>700000 && income<1200000) {
				if(gender.equals("FEMALE")) {
					tax=(int) (income*0.08);
					realIncome=income-tax;
					System.out.println("Your tax is "+ tax);
					System.out.println("Your income after tax payment, is "+ realIncome);
					System.out.println("-------------------------------------------------------------------");
					return;
				}else {
					tax=(int) (income*0.15);
					realIncome=income-tax;
					System.out.println("Your tax is "+ tax);
					System.out.println("Your income after tax payment, is "+ realIncome);
					System.out.println("-------------------------------------------------------------------");
					return;
				}
			}else {
				if(gender.equals("FEMALE")) {
					tax=(int) (income*0.08);
					realIncome=income-tax;
					System.out.println("Your tax is "+ tax);
					System.out.println("Your income after tax payment, is "+ realIncome);
					System.out.println("-------------------------------------------------------------------");
					return;
				}	else {
					tax=(int) (income*0.2);
					realIncome=income-tax;
					System.out.println("Your tax is "+ tax);
					System.out.println("Your income after tax payment, is "+ realIncome);
					System.out.println("-------------------------------------------------------------------");
					return;
				}
			}
		}else {
			if(income<700000) {
				tax=income*0;
				realIncome=income-tax;
				System.out.println("Your tax is "+ tax);
				System.out.println("Your income after tax payment, is "+ realIncome);
				System.out.println("-------------------------------------------------------------------");
				return;
			}else if(income>700000 && income<1200000) {
				if(gender.equals("FEMALE")) {
					tax=(int) (income*0.04);
					realIncome=income-tax;
					System.out.println("Your tax is "+ tax);
					System.out.println("Your income after tax payment, is "+ realIncome);
					System.out.println("-------------------------------------------------------------------");
					return;
				}else {
					tax=(int) (income*0.07);
					realIncome=income-tax;
					System.out.println("Your tax is "+ tax);
					System.out.println("Your income after tax payment, is "+ realIncome);
					System.out.println("-------------------------------------------------------------------");
					return;
				}
			}else {
				if(gender.equals("FEMALE")) {
					tax=(int) (income*0.04);
					realIncome=income-tax;
					System.out.println("Your tax is "+ tax);
					System.out.println("Your income after tax payment, is "+ realIncome);
					System.out.println("-------------------------------------------------------------------");
					return;
				}	else {
					tax=(int) (income*0.1);
					realIncome=income-tax;
					System.out.println("Your tax is "+ tax);
					System.out.println("Your income after tax payment, is "+ realIncome);
					System.out.println("-------------------------------------------------------------------");
					return;
				}
			}
		}
		
	}else {
		System.out.println("Have a Good Day!!");
		System.out.println("-------------------------------------------------------------------");
		return;
	}
	
}


}

