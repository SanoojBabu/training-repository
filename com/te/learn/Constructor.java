package com.te.learn;

public class Constructor {
	int b = 10;

	Constructor() {
		System.out.println("Programmer defined instruction");
	}

	{
		System.out.println("NonStatic multiline initiaizer got executed!");
	}

	public void demoNonStaticMethod() {
		System.out.println("demoNonStaticMethod got executed!");
	}

	public static void main(String[] args) {
		System.out.println("main method is executed");
		Constructor cons = new Constructor();
	}

}