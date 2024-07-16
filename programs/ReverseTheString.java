package com.chainsys.programs;

import java.util.Scanner;

public class ReverseTheString {

	public static void main(String[] args) {
		/*
		Reverse Words in a StringWrite a Java function to reverse the order of words 
		in a string 
		while preserving whitespace and initial word order.
		Sample Input:"The sky is blue" Sample Output:"blue is sky The"
		 */
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the Sentence:");
		String sentence=input.nextLine();
		
		 String[] words = sentence.split("\\s+");
		 
		StringBuilder sb= new StringBuilder();
		
		for(int i=words.length-1;i>=0;i--) {
			
			sb.append(words[i]);
			 if (i != 0) {
				 sb.append(" ");
	            }
		}
		
		
		System.out.println("reversed String:"+sb.toString());
		
		

	}

}
