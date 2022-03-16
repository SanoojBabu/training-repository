package com.te.assignment10032022;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int k,l;
		int sum=1;
		Scanner scn1 = new Scanner(System.in);
		System.out.println("Factorial");
		System.out.println("Enter the number:");
		k = scn1.nextInt();
		System.out.println();
		for(l=1;l<=k;l++) {
			sum=sum*l;
		}
		System.out.println("The factorial of "+k+" is "+sum);
	}
}
