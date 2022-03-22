package com.te.mock.practice;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class ReverseTreeSet {

	public static void main(String[] args) {
		int i;
		Comparator<Integer> comparator = (i1, i2) -> {
			Integer int1 = (Integer) i1;
			Integer int2 = (Integer) i2;
			return i1 > i2 ? -1 : i1 < i2 ? 1 : 0;
		};
		TreeSet<Integer> integers = new TreeSet<Integer>(comparator);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		i = scanner.nextInt();
		System.out.println("Enter the elements:");
		for (int j = 0; j < i; j++) {
			int k = scanner.nextInt();
			integers.add(k);
		}
		System.out.println("The reversed order of the TreeSet is:");
		integers.forEach(System.out::println);
	}

}
