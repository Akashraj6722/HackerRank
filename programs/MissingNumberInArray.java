package com.chainsys.programs;

import java.util.Scanner;

public class MissingNumberInArray {

	public static void main(String[] args) {

		/*find the missing number in an array of integers from 1 to N
		Enter the number of elements in the array: 7
		Enter the elements: 1 2 4 5 6 7
		Missing number: 3*/
		
	       Scanner input = new Scanner(System.in);
		  System.out.print("Enter the limit: ");
	        int limit = input.nextInt();
	        
	        int[] numberArray = new int[limit - 1];  
	        
	        System.out.println("Enter " + (limit - 1) + " numbers:");
	        for (int i = 0; i < limit - 1; i++) {
	            numberArray[i] = input.nextInt();
	        }
	        
	        System.out.println("numberArray:");
	        for (int i = 0; i < limit - 1; i++) {
	            System.out.print(numberArray[i] + " ");
	        }
	        System.out.println();
	        
	       
	        int sumOfNumbers = limit * (limit + 1) / 2;
	        System.out.println("Sum of numbers in an numberArray: " + sumOfNumbers);

	        int sumOfArray = 0;
	        for (int num : numberArray) {
	            sumOfArray += num;
	        }
	        System.out.println("Sum of array elements: " + sumOfArray);

	        int result = sumOfNumbers - sumOfArray;
	        System.out.println("Missing number: " + result); 
		 
		    }
		

		
	}


