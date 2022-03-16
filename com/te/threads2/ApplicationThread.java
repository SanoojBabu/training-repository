package com.te.threads2;

public class ApplicationThread {
	public static void main(String[] args) {
		System.out.println("Main method started");

		Thread thread1 = new Thread(new MyCharThread());
		Thread thread2 = new Thread(new MyIntegerThread());

		thread1.start();
		thread2.start();

		System.out.println("Main method ends");
	}
}
