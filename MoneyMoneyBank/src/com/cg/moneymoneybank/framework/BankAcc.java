package com.cg.moneymoneybank.framework;

// Abstract class
public abstract class BankAcc {
//-----------------------------------------------accNo
private int accNo; // read only 
public int getAccNo() {
	return accNo;
}

//-----------------------------------------------accNm
private String accNm ; // read-write
public String getAccNm() {
	return accNm;
}
public void setAccNm(String accNm) {
	this.accNm = accNm;
}

//-----------------------------------------------accBal
private float accBal; // read only
public float getAccBal() {
	return accBal;
}

//-----------------------------------------------Constructor
	public BankAcc(int accNo, String accNm, float accBal) { // Initializes all variables
		this.accNo = accNo;
		this.accNm = accNm;
		this.accBal = accBal;
	}
//-----------------------------------------------withdraw()
	public abstract void withdraw(float withdrawAmount); // Implemented in sub class

//-----------------------------------------------deposit()
	public void deposite(float addAmount) { 
		// Since in the scope of this project, it is instructed to keep accBal as Read only, we will not implement this function.
	}
	
	@Override
	public String toString() {
		return "BankAcc [accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal + "]";
	}
	
	
	
	
}
