package com.te.mock.practice;

import java.util.Scanner;

public class Fequency {

	public static void main(String[] args) {
		int x;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of inputs:");
		x = scanner.nextInt();
		int[] freq = new int[x];
		String[] str = new String[x];
		System.out.println("Enter the elements:");
		for (int i = 0; i < x; i++) {
			str[i] = scanner.next();
		}

		for (int i = 0; i < x; i++) {
			int freqn = 0;
			for (int j = i; j < x; j++) {
				if (str[i].equalsIgnoreCase(str[j]))
					freqn++;
			}
			if (freqn > 1)
				System.out.println("The Frequency of " + str[i] + " is " + freqn);
		}
	}

}
