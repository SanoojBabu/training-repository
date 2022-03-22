package com.te.asssignment18032022;

import java.util.Scanner;
import java.util.function.Function;

public class AppNumberPalindrome {

	public static void main(String[] args) {
		int i;
		Scanner scanner = new Scanner(System.in);
		Function<Integer, Boolean> function = x -> {
			int temp = x;
			int rev = 0;
			int digit = 0;
			while (temp != 0) {
				digit = temp % 10;
				rev = rev * 10 + digit;
				temp /= 10;
			}
			return (x == rev) ? true : false;
		};
		System.out.println("Enter a number:");
		i = scanner.nextInt();
		System.out.println(i + " is palindrome? " + function.apply(i));
	}

}
