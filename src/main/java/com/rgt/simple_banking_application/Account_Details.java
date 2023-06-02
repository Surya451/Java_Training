package com.rgt.simple_banking_application;

import java.util.Scanner;

public class Account_Details {

	
	private String account_Number;
	private String account_Holder_Name;
	private String account_Type;
	private long balance;
	
	Scanner scanner=new Scanner(System.in);
	
	
	//This method is used to open a new account
	public void open_Account(){
		
		System.out.println("Enter the account number: ");
		account_Number=scanner.next();
		
		System.out.println("Enter the account holder name: ");
		account_Holder_Name=scanner.next();
		
		System.out.println("Enter the account type: ");
		account_Type=scanner.next();
		
		System.out.println("Enter the initial balance: ");
		balance=scanner.nextLong();
		
	}
	
	//This method is used to open a diaplay the account details
	public void display_Account_Details() {
		
		System.out.println("Name of the account holder: "+account_Holder_Name);
		System.out.println("Account number: "+account_Number);
		System.out.println("Account Type: "+account_Type);
		System.out.println("Account balance: "+balance);
	}
	
	//This method is used to deposit the amount
	public void deposit() {
		
		long amount;
		System.out.println("Enter the amount to be deposit: ");
        amount=scanner.nextLong();
        balance=balance+amount;
        System.out.println("You account balance is after the deposit: "+balance);							
	}
	
	//This method is used to withdraw the amount from the account
	public void money_Withdraw() {
		long amount;
		System.out.println("Enter the amount to be withdraw: ");
		amount=scanner.nextLong();
		if(balance >= amount) {
			balance = balance-amount;
			System.out.println("You account balance is after withdrawl: "+balance);

		}else {
			System.out.println("Your transaction is cancelled due to insufficient balance");
		}

	}
	
	//This method is used to withdraw search the account
	public boolean search_Account(String number_Of_The_Account) {
		if(account_Number.equals(number_Of_The_Account)) {
			display_Account_Details();
			return true;
		}else {
			return false;
		}

	}
	
}

