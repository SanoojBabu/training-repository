package com.te.mock.practice;
import java.util.HashSet;
import java.util.Scanner;

public class PrintDuplicateHashSet {

	public static void main(String[] args) {
		HashSet<String> hashSet1 = new HashSet<String>();
		HashSet<Character> hashSet2 = new HashSet<Character>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String");
		String str=scanner.nextLine();
		char[] cs = str.toCharArray();
		char[] duplicate = new char[cs.length];
		hashSet1.add(str);
		for (int i = 0; i < cs.length; i++) {
			hashSet2.add(cs[i]);
		}
	}

}
