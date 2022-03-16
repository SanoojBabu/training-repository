package com.te.inheritence;

public class BB extends AA {
	private int c = 50;
	private int d = 40;
	private int e=super.getB();

	public BB() {
		super();
	}

	public BB(int c, int d) {
		this();
		this.c = c;
		this.d = d;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public int getD() {
		return d;
	}

	public void setD(int d) {
		this.d = d;
	}

	public int getE() {
		return e;
	}

	public void setE(int e) {
		this.e = e;
	}

}
