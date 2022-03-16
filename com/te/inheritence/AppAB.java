package com.te.inheritence;

public class AppAB {

	public static void main(String[] args) {
		B b = new B();
		System.out.println(b.getA());
		System.out.println(b.getB());
		System.out.println(b.getC());
		System.out.println(b.getD());

		System.out.println("============");

		A a = new B();
		System.out.println(a.getA());
		System.out.println(a.getB());
		// System.out.println(a.getC());
		// System.out.println(a.getD());

		System.out.println("============");

//		B bb = new A();
//		System.out.println(bb.getA());
//		System.out.println(bb.getB());
//		System.out.println(bb.getC());
//		System.out.println(bb.getD());

		System.out.println("============");

		A aa = new B(); // Upcasting
		B bbb = (B) aa; // Downcasting => B bbb = new B();
		System.out.println(b.getA());
		System.out.println(b.getB());
		System.out.println(b.getC());
		System.out.println(b.getD());
		System.out.println("============");
	}
}
