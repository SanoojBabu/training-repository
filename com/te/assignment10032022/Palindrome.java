package com.te.assignment10032022;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		int i;
		int rev = 0;
		int digit = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Palindrome");
		System.out.println("Enter the number:");
		i = scan.nextInt();
		int temp = i;
		while (temp != 0) {
			digit = temp % 10;
			rev = (rev * 10) + digit;
			temp = temp / 10;
		}
		if (rev == i) {
			System.out.println(i + " is a Palindrome Number");
		} else {
			System.out.println(i + " is not a Palindrome Number");
		}
	}
}