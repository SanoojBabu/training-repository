package com.te.mock.practice;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {

	public static void main(String[] args) {
		String str1, str2;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the 1st String:");
		str1 = scanner.nextLine();
		System.out.println("Enter the 2nd String:");
		str2 = scanner.nextLine();
		char[] c1, c2;
		String strl1 = str1.toLowerCase().replaceAll("\\s", "");
		String strl2 = str2.toLowerCase().replaceAll("\\s", "");

		c1 = strl1.toCharArray();
		c2 = strl2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		System.out.println(Arrays.equals(c1, c2) ? "Is Anagram" : "Not Anagram");
	}

}
