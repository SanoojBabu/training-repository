package com.te.asssignment18032022;

import java.util.Scanner;
import java.util.function.Function;

public class AppChechArmstrong {

	public static void main(String[] args) {
		int i;
		Scanner scanner = new Scanner(System.in);
		Function<Integer, Boolean> function = x -> {
			int temp = x;
			int value = 0;
			int digit = 0;
			while (temp != 0) {
				digit = temp % 10;
				value = value + (int) Math.pow(digit, 3D);
				temp /= 10;
			}
			return (x == value) ? true : false;
		};
		System.out.println("Enter a number:");
		i = scanner.nextInt();
		System.out.println(i + " is Armstrong? " + function.apply(i));
	}

}
