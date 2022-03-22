package com.te.mock.practice;

import java.util.Scanner;

public class OutDuplicateString {

	public static void main(String[] args) {
		String str, repeated = "";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String:");
		str = scanner.nextLine();
		char[] cs = str.toCharArray();
		System.out.println("The Duplicate elements are:");
		for (int i = 0; i < cs.length; i++) {
			int repeat = 1;
			for (int j = i + 1; j < cs.length; j++) {
				if (cs[i] == cs[j] && i != j && repeated.indexOf(cs[i]) == -1)
					repeated += cs[i];
			}
		}
		System.out.println(repeated);
	}
}