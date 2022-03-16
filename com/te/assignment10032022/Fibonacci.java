package com.te.assignment10032022;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		int n1 = 0;
		int n2 = 1;
		int e;
		int nt = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Fibonacci series");
		System.out.println("Enter the  number:");
		e = sc.nextInt();
		if (e < 0) {
			System.out.println("Entered number is invalid");
		} else if (e == 0) {
			System.out.println(n1);
		} else {
			for (int x = 0; x < e; x++) {
				System.out.print(n1 + " ");
				nt = n1 + n2;
				n1 = n2;
				n2 = nt;
			}
		}
	}
}
