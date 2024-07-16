package com.chainsys.programs;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {


		String name ;
		String accountNumber;
		String ifsc ;
		float balance = 10000;
		float withdrawal;
		float deposit;
		char action;
		
		ArrayList<String>nameList=new ArrayList<>();
		ArrayList<String>accountNumberList=new ArrayList<>();
		ArrayList<String>ifscList=new ArrayList<>();

		Scanner input = new Scanner(System.in);

		

		String regexName="[a-zA-Z]{5,10}";
		String regexAccountNumber="[1-9]{1}[0-9]{11}";
		String regexIfsc="[A-Z]{4}[0]{1}[0-9]{6}";

	
		System.out.println("Enter the Name:");
		
			name=input.next();
		
		while(!name.matches(regexName)) {
			
			System.out.println("Enter the Name:");
			name=input.next();
		}
		
		nameList.add(name);
		System.out.println("Enter the Account Number:");
		accountNumber=input.next();
		
       while(!accountNumber.matches(regexAccountNumber)) {
			
			System.out.println("Enter the Account Number:");
			accountNumber=input.next();
		}
       
       accountNumberList.add(accountNumber);
       
       System.out.println("Enter the IFSC Code:");
		ifsc=input.next();
		
      while(!ifsc.matches(regexIfsc)) {
			
			System.out.println("Enter the IFSC Code:");
			ifsc=input.next();
			}
		
      ifscList.add(ifsc);
      
      
      System.out.println("LOGIN");
      System.out.println("Enter the name");
      name=input.next();
      while(!name.matches(regexName)) {
			
			System.out.println("Enter the Name:");
			name=input.nextLine();
		}
    
      System.out.println("Enter the accountNumber");
      accountNumber=input.next();
      while(!accountNumber.matches(regexAccountNumber)) {
			
			System.out.println("Enter the Account Number:");
			accountNumber=input.next();
		}
     
      
      System.out.println("Enter the  IFSC Code");
      ifsc=input.next();
      
      while(!ifsc.matches(regexIfsc)) {
			
			System.out.println("Enter the IFSC Code:");
			ifsc=input.next();
			}
      
      
      if(nameList.contains(name) && 
    		  accountNumberList.contains(accountNumber)
    		  && ifscList.contains(ifsc)){
    	  
    	  
    	  
    

		System.out.println("what do you want to do?\nPress w to Withdraw OR\nPress d to deposit\nOR q to quit");

		action = input.next().charAt(0);
      
		switch (action) {

		case ('w'):
			System.out.println("Enter the amount to withdraw:");

			withdrawal = input.nextFloat();
			
			while(withdrawal<0) {
				System.out.println("Enter the amount to withdraw:");

				withdrawal = input.nextFloat();
				
				
			}

			balance = balance - withdrawal;

			System.out.println("Balance amount:" + balance);

			break;
			
		case ('d'):
			System.out.println("Enter the amount to Deposit:");

		  deposit = input.nextFloat();
		  
		  while(deposit<0) {
				System.out.println("Enter the amount to Deposit:");

				deposit = input.nextFloat();
		 }
			
				
			

			balance = balance + deposit;

			System.out.println("Balance amount:" + balance);

			break;	
			
		case('q'):
			System.out.println("You'r Exited");
		    break;
		}
      }else {
			
			System.out.println("You Dont have access");
		}

		}

	}



