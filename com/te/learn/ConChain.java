package com.te.learn;

public class ConChain {
	int a = 20;
	int b = 10;

	ConChain() {
		System.out.println("ConChain no reference got executed");
	}
//	Constructor Chaining
	ConChain(int a) {
		this();//chaining
		System.out.println("ConChain 1 reference got executed");
	}

	ConChain(int a, int b) {
		this(a);//chaining
		this.b = b;
		System.out.println("ConChain 2 reference got executed");
	}

	public static void main(String[] args) {
		System.out.println("Mian method got executed");
		ConChain conChain = new ConChain(30, 40);
		System.out.println(conChain.a);
		System.out.println(conChain.b);
	}
}