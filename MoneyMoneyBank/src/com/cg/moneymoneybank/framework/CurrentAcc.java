package com.cg.moneymoneybank.framework;
// Abstract class that extends BankAcc
public abstract class CurrentAcc extends BankAcc {
//-------------------------------------------------------creditLimit
	private final float creditLimit ; // Read Only
	public float getCreditLimit() {
		return creditLimit;
	}

//-------------------------------------------------------Constructor()
	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal); // super in first line.
		this.creditLimit = LazycreditLimitInitializer(creditLimit); // lazy initialization by not directly initializing.
	}
//-----------------------------	
	public abstract float LazycreditLimitInitializer(float amount); // Method to Lazy Initialize.
	
//-------------------------------------------------------withdraw()
	@Override
	public abstract void withdraw(float withdrawalAmount); // Because of lazy binding of methods, JVM will only Work with the child overridden method.
/*	   {
		if(withdrawalAmount<=getAccBal()) {
			System.out.println("You have withdrawn: Rs"+withdrawalAmount+" Your current balance is: Rs"+(getAccBal()-withdrawalAmount));	
		}else {
			float totalBal=(getAccBal()+getCreditLimit());
			if(withdrawalAmount<=totalBal) {
				System.out.println("You have withdrawn: Rs"+withdrawalAmount+". Your current balance is: Rs0 and your credit balance is: Rs"+(totalBal-withdrawalAmount));
			}else {
				System.out.println("The requested amount is exceeding your current account balance and credit limit");
			}
			
		}
		}
*/
	
//------------------------------------------------toString()
	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

	
	
	

}
