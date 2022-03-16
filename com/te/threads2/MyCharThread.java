package com.te.threads2;

public class MyCharThread implements Runnable {

	@Override
	public void run() {
		for (char c = 'a'; c <= 'z'; c++) {
			System.out.println("Char " + c);
		}
	}

}
