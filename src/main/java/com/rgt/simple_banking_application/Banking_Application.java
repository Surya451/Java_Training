package com.rgt.simple_banking_application;


import java.util.Scanner;



public class Banking_Application {


	public static void main(String[] args) {

		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the Number of accounts to be stored");
		int bank_Accounts=scanner.nextInt();

		Account_Details aD[] =new Account_Details[bank_Accounts];

		for(int i=0;i<aD.length;i++) {
			aD[i]=new Account_Details();
			aD[i].open_Account();
		}
     	int choice;
		do {

			System.out.println("*****Banking Application*****");
			System.out.println("1. Display account details");
			System.out.println("2. Search account");
			System.out.println("3. Deposit the amount");
			System.out.println("4. Withdraw the amount");
			System.out.println("5. Exit");
			choice= scanner.nextInt();	

			switch (choice) {
			case 1: 

				for(int i=0;i < aD.length;i++) {
					aD[i].display_Account_Details();
				}
				break;
			case 2:  
				System.out.print("Enter the account number: ");  
				String account_Number = scanner.next();  
				boolean found = false;  
				for (int i = 0; i < aD.length; i++) {  
					found = aD[i].search_Account(account_Number);  
					if (found) {  
						break;  
					}  
				}  
				if (!found) {  
					System.out.println("Account number is Invalid");  
				}  
				break;
			case 3:  
				System.out.print("Enter Account no. : ");  
				account_Number = scanner.next();  
				found = false;  
				for (int i = 0; i < aD.length; i++) {  
					found = aD[i].search_Account(account_Number);  
					if (found) {  
						aD[i].deposit();  
						break;  
					}  
				}  
				if (!found) {  
					System.out.println("Account number is Invalid");  
				}  
				break; 
			case 4:  
				System.out.print("Enter Account No : ");  
				account_Number = scanner.next();  
				found = false;  
				for (int i = 0; i < aD.length; i++) {  
					found = aD[i].search_Account(account_Number);  
					if (found) {  
						aD[i].money_Withdraw();  
						break;  
					}  
				}  
				if (!found) {  
					System.out.println("Account number is Invalid");  
				}  
				break;

			case 5:  

				System.out.println("Good bye!");  
				break;  

			default:
				System.out.println("Invalid option. Please try again.");

			}
		}while (choice != 5);

		scanner.close();
	}
}












