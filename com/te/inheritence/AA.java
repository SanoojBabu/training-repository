package com.te.inheritence;

public class AA {
	private int a = 10;
	private int b = 20;

	public AA() {
		super();
	}

	public AA(int a, int b) {
		this();
		this.a = a;
		this.b = b;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
}
