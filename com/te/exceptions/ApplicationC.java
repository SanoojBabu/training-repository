package com.te.exceptions;

public class ApplicationC {
	public static void m4() throws InterruptedException {
		Thread.sleep(10000);
	}

	public static void m3() throws InterruptedException {
		m4();
	}

	public static void m2() throws InterruptedException {
		m3();
	}

	public static void m1() throws InterruptedException {
		m2();
	}

	public static void main(String[] args) {
		System.out.println("Main method started");
		try {
			m1();
		} catch (Exception e) {
			System.out.println("Interupption Is done");
		}
		System.out.println("Main method ends");
	}
}
