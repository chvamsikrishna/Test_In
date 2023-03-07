package com.NewAccountCreation;

public class Checking extends Accounts {
	
	// Own data with Methods
	long debitCardNumber;
	int pin;
	
	public Checking(String name, String ssn, int balance)
	{
	    super(name, ssn, balance);
		account_Number = 2+account_Number;
		checkingAccountBenefits();

	}
	
	public void checkingAccountBenefits()
	{
		debitCardNumber = (long)(Math.random()*Math.pow(10,12));
		pin = (int)(Math.random()*Math.pow(10,4));
	}
	
	// Also gets methods from Accounts
	
	public void showInfo()
	{
		System.out.println(" Account Type: Checking");
		super.showInfo();
		System.out.println(" Account Number:"+ account_Number);
		System.out.println(" Your Checking account also includes below "
				+ "\n Debit Card ID: "+debitCardNumber+""
				+ "\n Pin: "+pin);
		System.out.println("******");
		
	}

}
