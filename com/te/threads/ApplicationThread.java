package com.te.threads;

public class ApplicationThread {
	public static void main(String[] args) {
		System.out.println("Main method started");

		MyCharThread charThread = new MyCharThread();
		MyIntegerThread integerThread = new MyIntegerThread();

//		charThread.start();
//		integerThread.start();

		charThread.run();
		integerThread.run();

		System.out.println("Main method ends");
	}
}
