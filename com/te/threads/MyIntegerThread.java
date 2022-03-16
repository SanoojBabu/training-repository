package com.te.threads;

public class MyIntegerThread extends Thread {
	MyIntegerThread() {
		for (int i = 1; i <= 30; i++) {
			System.out.println("Integer " + i);
		}
	}
}