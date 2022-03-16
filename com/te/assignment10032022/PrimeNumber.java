package com.te.assignment10032022;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int i;
		int flag = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Prime number");
		System.out.println("Enter the number:");
		i = sc.nextInt();
		if (i == 0 && i == 1) {
			System.out.println(i + " is not a Prime Number");
		} else {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					flag = 1;
					break;
				}
			}
		}
		if (flag == 1) {
			System.out.println(i + " is not a Prime Number");
		} else {
			System.out.println(i + " is a Prime Number");
		}
	}
}