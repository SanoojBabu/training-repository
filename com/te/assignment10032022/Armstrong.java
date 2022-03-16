package com.te.assignment10032022;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		int j;
		int rev = 0;
		int digit = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Armstrong");
		System.out.println("Enter the number:");
		j = scan.nextInt();
		int temp = j;
		while (temp != 0) {
			digit = temp % 10;
			rev = rev + (int) Math.pow(digit, 3);
			temp = temp / 10;
		}
		if (rev == j) {
			System.out.println(j + " is a Armstrong Number");
		} else {
			System.out.println(j + " is not a Armstrong Number");
		}
	}
}