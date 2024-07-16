package com.chainsys.programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LongestCommonPrefix {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the Limit:");
		int limit = scanner.nextInt();

		String[] words = new String[limit];

		System.out.println("Enter a string:");

		for (int i = 0; i < limit; i++) {
			words[i] = scanner.next();
		}

		System.out.println("common prefix: " + longestCommonPrefix(words));

	}

	public static String longestCommonPrefix(String[] words) {

		String prefix = words[0];

		for (int i = 1; i < words.length; i++) {

			while (words[i].indexOf(prefix) != 0) {
				prefix = prefix.substring(0, prefix.length() - 1);

				if (prefix.isEmpty()) {
					return commonPrefix(words);
				}
			}
		}

		return prefix;
	}

	public static String commonPrefix(String[] words) {

		String commonPrefix = "";

		for (int i = 0; i < words.length; i++) {

			for (int j = i + 1; j < words.length; j++) {

				String prefix = words[i];

				while (words[j].indexOf(prefix) != 0) {
					prefix = prefix.substring(0, prefix.length() - 1);

					if (prefix.isEmpty()) {
						break;
					}
				}
				if (prefix.length() > commonPrefix.length()) {
					commonPrefix = prefix;
				}
			}
		}
		return commonPrefix;
	}
}