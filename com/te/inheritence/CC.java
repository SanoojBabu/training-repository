package com.te.inheritence;

public class CC extends BB {
	private int e = 50;
	private int f = 40;

	public CC() {
		super();
	}

	public CC(int e, int f) {
		super();
		this.e = e;
		this.f = f;
	}

	public int getE() {
		return e;
	}

	public void setE(int e) {
		this.e = e;
	}

	public int getF() {
		return f;
	}

	public void setF(int f) {
		this.f = f;
	}

}
