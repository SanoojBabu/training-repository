package com.te.exceptions;

import java.util.Scanner;

public class ApplicationCE {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a age:");
		int age = scanner.nextInt();
		if (age < 0)
			throw new AgeNotCorrectException("Age entered is not correct");
		System.out.println("Age is: " + age);
	}
}
