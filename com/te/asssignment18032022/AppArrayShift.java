package com.te.asssignment18032022;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.function.Function;

public class AppArrayShift {

	public static void main(String[] args) {
		int len;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length:");
		len = scanner.nextInt();

		int[] arr = new int[len];

		System.out.println("Enter the elements:");
		for (int i = 0; i < len; i++) {
			arr[i] = scanner.nextInt();
		}

		System.out.println("The original array is: ");
		for (int i = 0; i < len; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("++++++++++++");

		System.out.println("The LEFT shifted Array is:");
		leftShift(arr, 2);
		System.out.println();
		System.out.println("The RIGHT shifted Array is:");
		System.out.println("---------------------");
		rightShift(arr, 2);
	}

	public static void leftShift(int[] a, int x) {
		int[] b = new int[a.length];
		for (int i = a.length - 1; i >= 0; i--) {
			int newPosition = (i + (a.length - x)) % a.length;
			b[newPosition] = a[i];
		}
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
	}

	public static void rightShift(int[] a, int x) {
		int[] c = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			int newPosition = ((i + x) % a.length);
			c[newPosition] = a[i];
		}
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}
	}
}
