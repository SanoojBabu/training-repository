package com.te.mock.practice;

import java.util.Scanner;

public class DivideToNParts {

	public static void main(String[] args) {
		String str ;
		int a;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the strng:");
		str=scanner.nextLine();
		System.out.println("Enter the number of parts:");
		a=scanner.nextInt();
		str.split(null, a);
	}

}
