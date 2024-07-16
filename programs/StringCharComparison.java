package com.chainsys.programs;

import java.util.HashSet;
import java.util.Set;

public class StringCharComparison {

	public static void main(String[] args) {

		String a="akash";
		String b="akbar";
		
		int lengthA=a.length();
		int lengthB=b.length();
		StringBuilder sb= new StringBuilder();
		Set<Character> uniqueChars = new HashSet<>();
		
		for(int i=0;i<lengthA;i++) {
			
			for(int j=0;j<lengthB;j++) {
				
				
				if(a.charAt(i)==b.charAt(j)) {
					
					sb.append(a.charAt(i));
					uniqueChars.add(a.charAt(i));
					
				}
				
				
			}
			
		}
		for(char c:uniqueChars) {
			System.out.println(c); //common unique char
		}
System.out.println(sb.toString()); //all common char
		
	}

}
