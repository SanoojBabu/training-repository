package com.te.learn;

import java.util.Scanner;

public class App02 {

	public static void main(String[] args) {
		int a = 10;
		int b = 11;
		int c = 12;
		int d = 13;
		int e = 14;
		int res = (a > b && a > c && a > d && a > e) ? a
				: (b > c && b > d && b > e) ? b : (c > d && c > e) ? c : (d > e) ? d : e;
		System.out.println("Result=" + res);

		System.out.println("Java" + 20 + 30);
		System.out.println(20 + "Java" + 30);
		System.out.println(20 + 30 + "Java");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		System.out.println();
	}

}
