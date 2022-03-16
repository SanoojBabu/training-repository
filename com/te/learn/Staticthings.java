package com.te.learn;

public class Staticthings {
	static {
		System.out.println("Static method got executed!");
	}
	static int a = 10;

	public static void demoStaticMethod() {
		System.out.println("demoStaticMethod got executed!");
	}

	public void demoNonStaticMethod() {
		System.out.println("demoNonStaticMethod got executed!");
	}

	public static void main(String[] args) {
		System.out.println("main method got executed!");
		demoStaticMethod();
		Staticthings stat = new Staticthings();
		stat.demoNonStaticMethod();
	}

}
