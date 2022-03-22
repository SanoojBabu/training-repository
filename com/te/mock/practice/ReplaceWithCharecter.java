package com.te.mock.practice;

import java.util.Scanner;

public class ReplaceWithCharecter {

	public static void main(String[] args) {
		String str;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string");
		str = scanner.nextLine();
		String str1 = str.replaceAll("\\s", "-");
		System.out.println("The new String with new charecter:" + str1);
	}

}
