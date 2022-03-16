package com.te.learn;

public class Staticthings2 {
	// static multi-line intializer
	static {
		// 1st
		System.out.println("Static method got executed!");
		Staticthings2 stat = new Staticthings2();
		int b = stat.returnMeValue();
		System.out.println("Valuer recieved is " + b);
	}
	// static single-line intializer
	static int a = 10;// 2nd

	// static method
	public static void demoStaticMethod() {
		System.out.println("demoStaticMethod got executed!");
	}

	public void demoNonStaticMethod() {
		System.out.println("demoNonStaticMethod got executed!");
	}

	public int returnMeValue() {
		return 10;
	}

	public static void main(String[] args) {
		System.out.println("main method got executed!");
		demoStaticMethod();
		Staticthings2 stat = new Staticthings2();
		stat.demoNonStaticMethod();
	}

}
