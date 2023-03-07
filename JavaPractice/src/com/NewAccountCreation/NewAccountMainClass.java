package com.NewAccountCreation;

public class NewAccountMainClass {

	public static void main(String[] args) {

		Checking check = new Checking("vamsi", "12345678912", 2000);
		Savings save = new Savings("sai", "12345678912", 1000);
		
		check.showInfo();
		save.showInfo();
		
	}

}
