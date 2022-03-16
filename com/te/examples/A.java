package com.te.examples;

public abstract class A {
	int a = 10;
	int b = 20;

	public A() {
		System.out.println("A() constructor initiated");
	}

	public A(int a) {
		this();
		this.a = a;
		System.out.println("A(int a) constructor initiated");
	}

	public A(int a, int b) {
		this();
		this.a = a;
		this.b = b;
		System.out.println("A(int a,int b) constructor initiated");
	}

	static {
		System.out.println("A Static initializers executed!");
	}

	{
		System.out.println("A Non-static initializers executed");
	}
}
