package com.te.mock.practice;

import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ReverseTreeMap {

	public static void main(String[] args) {
		int i;
		Comparator<Integer> comparator = (i1, i2) -> {
			Integer int1 = (Integer) i1;
			Integer int2 = (Integer) i2;
			return i1 > i2 ? -1 : i1 < i2 ? 1 : 0;
		};
		TreeMap<Integer, Integer> treeMap = new TreeMap<Integer, Integer>(comparator);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		i = scanner.nextInt();
		System.out.println("Enter the elements:");
		for (int j = 0; j < i; j++) {
			int k = scanner.nextInt();
			int l = scanner.nextInt();
			treeMap.put(k, l);
		}
		System.out.println("The reversed TreeMap is:");
		for (Integer key : treeMap.keySet()) {
//			int value = treeMap.get(key);
//			System.out.println(key + " " + value);
			System.out.println(key);
		}
		for(Map.Entry<Integer, Integer> key: treeMap.entrySet()) {
			System.out.println(key);
		}
//		treeMap.forEach(treeMap< Integer , Integer> System.out.println());
	}
}
