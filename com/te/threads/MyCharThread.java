package com.te.threads;

public class MyCharThread extends Thread {
	MyCharThread() {
		for (char c = 'a'; c <= 'z'; c++) {
			System.out.println("Char " + c);
		}
	}
}
