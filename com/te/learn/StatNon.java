package com.te.learn;

public class StatNon {
	{
		System.out.println("NonStatic multiline initiaizer got executed!");
	}
	int b = 10;

	public void demoNonStaticMethod() {
		System.out.println("demoNonStaticMethod got executed!");
	}

	static {
		System.out.println("Static multiline initiaizer got executed!");
	}
	static int a = 10;

	public static void demoStaticMethod() {
		System.out.println("demoStaticMethod got executed!");
	}

	public static void main(String[] args) {
		System.out.println("main method got executed!");
		demoStaticMethod();
		System.out.println("Now i am creating an object");
		StatNon statnon = new StatNon();
		System.out.println("End");
	}

}
