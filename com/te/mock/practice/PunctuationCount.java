package com.te.mock.practice;
import java.util.Scanner;

public class PunctuationCount {

	public static void main(String[] args) {
		String str;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string:");
		str = scanner.next();
		char[] cs = str.toCharArray();
		int count = 0;
		for (int i = 0; i < cs.length; i++) {
			if (cs[i] == '!' || cs[i] == ',' || cs[i] == '.' || cs[i] == '/' || cs[i] == '\\' || cs[i] == ';'
					|| cs[i] == ':')
				count++;
//			if (cs[i] >= 'a' && cs[i] <= 'z' || cs[i] >= 'A' && cs[i] <= 'Z' || cs[i] >= '0' && cs[i] <= '9')
//				continue;
//			else
//				count++;
		}
		System.out.println("There are " + count + " number of Punctuations");
	}

}
