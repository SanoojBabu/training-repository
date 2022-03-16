package com.te.abstraction;

public class Miui extends Android {
	@Override
	public void security() {
		System.out.println("Security is 2 level");
	}

	public void camera() {
		System.out.println("The camera is 48MP");
	}

	public void battery() {
		System.out.println("The battery capacity is 5000MHz");
	}
}
