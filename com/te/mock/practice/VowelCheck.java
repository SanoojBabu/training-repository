package com.te.mock.practice;
import java.util.Scanner;

public class VowelCheck {

	public static void main(String[] args) {
		String str;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string:");
		str = scanner.next();
		char[] cs = str.toCharArray();
		int count = 0;
		for (int i = 0; i < cs.length; i++) {
			if (cs[i] == 'a' || cs[i] == 'e' || cs[i] == 'i' || cs[i] == 'o' || cs[i] == 'u' || cs[i] == 'A'
					|| cs[i] == 'E' || cs[i] == 'I' || cs[i] == 'O' || cs[i] == 'U')
				count++;
		}
		System.out.println("There are " + count + " number of Vowels");
	}
}
