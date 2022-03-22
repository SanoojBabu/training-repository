package com.te.mock.practice;

import java.util.Scanner;

public class MaximumElements {

	public static void main(String[] args) {
		int a, max = 0, max2 = 0, max3 = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		a = scanner.nextInt();
		int[] arr = new int[a];
		System.out.println("Enter the elements:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
//		The for loop for Maximum Element
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i])
				max = arr[i];
		}
		System.out.println("The Maximum element is:" + max);

//		The for loop for 2nd Maximum Element		
		for (int i = 0; i < arr.length; i++) {
			if (max2 < arr[i] && arr[i] != max)
				max2 = arr[i];
		}
		System.out.println("The 2nd Maximum Element is:" + max2);

//		The for loop for 3rd Maximum Element		
		for (int i = 0; i < arr.length; i++) {
			if (max3 < arr[i] && arr[i] != max && arr[i] != max2)
				max3 = arr[i];
		}
		System.out.println("The 3rd Maximum Element is:" + max3);
	}
}
