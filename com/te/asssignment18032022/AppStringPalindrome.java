package com.te.asssignment18032022;

import java.util.Scanner;
import java.util.function.Function;

public class AppStringPalindrome {

	public static void main(String[] args) {
		String str;
		Scanner scanner = new Scanner(System.in);
		Function<String, Boolean> function2 = s -> {
			String s2 = "";
			for (int i = s.length() - 1; i >= 0; i--) {
				s2 = s2 + s.charAt(i);
			}
			return s.equalsIgnoreCase(s2) ? true : false;
		};

		System.out.println("Enter a String:");
		str = scanner.nextLine();
		System.out.println("Is palindrome? " + function2.apply(str));
	}
}