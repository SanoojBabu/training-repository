package com.te.threads2;

public class MyIntegerThread implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 30; i++) {
			System.out.println("Integer " + i);
		}
	}

}