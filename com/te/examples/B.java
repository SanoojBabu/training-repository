package com.te.examples;

public class B extends A {
	int c = 10;
	int d = 20;

	public B() {
		super(30, 40);
		System.out.println("B() constructor initiated");
	}

	public B(int c) {
		this();
		this.c = c;
		System.out.println("B(int a) constructor initiated");
	}

	public B(int c, int d) {
		this();
		this.c = c;
		this.d = d;
		System.out.println("B(int a,int b) constructor initiated");
	}

	static {
		System.out.println("B Static initializers executed!");
	}

	{
		System.out.println("B Non-static initializers executed!");
	}
}
