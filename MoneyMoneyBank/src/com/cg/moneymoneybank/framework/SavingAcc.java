package com.cg.moneymoneybank.framework;

//Abstract class that extends BankAcc
public abstract class SavingAcc extends BankAcc {
	
//-----------------------------------------------isSalaried
private boolean isSalaried;  // Read Only
public boolean isSalaried() {
	return isSalaried;
}

//-----------------------------------------------MINBAL
private static final float MINBAL=20;  // Read Only
public static float getMinbal() {
	return MINBAL;
}

	
//-----------------------------------------------Constructor()
	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
	super(accNo, accNm, accBal);
	this.isSalaried = isSalaried;
}

//-----------------------------------------------withdraw()
	@Override
	public abstract void withdraw(float withdrawalAmount); // Because of lazy binding of methods, JVM will only Work with the child overridden method.
/*	{
		if(getAccBal()>MINBAL) {
			if(withdrawalAmount<getAccBal()) {
				System.out.println("You have withdrawn: Rs"+withdrawalAmount+" Your current balance is: Rs"+(getAccBal()-withdrawalAmount));
				//setAccBal(getAccBal()-withdrawalAmount);
			}else
				System.out.println("Your current balance is lower than your requested withdrawal amount.");
		}else
			System.out.println("You don't have minimum balance in your account, you cannot withdraw any money until you have a minimum balance of "+MINBAL);
	}
*/

//----------------------------------------------toString()
	@Override
	public String toString() {
		return "SavingAcc [isSalaried=" + isSalaried + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
			
			
}
