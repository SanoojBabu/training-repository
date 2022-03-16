package com.te.pattern;

import java.util.Scanner;

public class StarPyramid2 {

	public static void main(String[] args) {
		int i, j, x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		x = sc.nextInt();
		for (i = 0; i < x; i++) {
			for (j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (i = x - 1; i >= 0; i--) {
			for (j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
