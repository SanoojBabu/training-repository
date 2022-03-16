package com.te.exceptions;

public class ApplicationUC {
	public static void m4() {
		int res = 10 / 0;
	}

	public static void m3() {
		m4();
	}

	public static void m2() {
		m3();
	}

	public static void m1() {
		m2();
	}

	public static void main(String[] args) {
		try {
			m1();
		} catch (Exception e) {
			System.out.println("You are trying to divide by zero");
		}
	}
}
