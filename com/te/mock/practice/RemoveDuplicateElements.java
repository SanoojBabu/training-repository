package com.te.mock.practice;

import java.util.Scanner;

public class RemoveDuplicateElements {

	public static void main(String[] args) {
		int a;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of inputs:");
		a = scanner.nextInt();
		String[] str = new String[a];
		System.out.println("Enter the strings:");
		for (int i = 0; i < a; i++) {
			str[i] = scanner.next();
		}
		int k = 0;
		String[] newArr = new String[a];
		for (int i = 0; i < a; i++) {
			int state = 0;
			for (int j = 0; j < a; j++) {
				if (str[i].equalsIgnoreCase(newArr[j]))
					state++;
			}
			if (state == 0) {
				newArr[k] = str[i];
				k++;
			}
		}
		System.out.println("The new array with no duplicates is:");
		for (int i = 0; i < newArr.length; i++) {
			if (newArr[i] != null)
				System.out.println(newArr[i]);
		}
	}
}
