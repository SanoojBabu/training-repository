package com.te.polymorphism;

class Parent {
	int a = 10;

	public static void test() {
		System.out.println("The Parent method is called");
	}
}

class Child extends Parent{
	int a = 20;

	public static void test() {
		System.out.println("The Child method is called");
	}
}

public class MethodHiding {
	//In complie time polymorphism type of reference has higher priority for binding
	public static void main(String[] args) {
		Parent p = new Child();
		p.test();
		Child c = (Child) p;
		c.test();
	}
}
