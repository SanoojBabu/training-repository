package com.te.practice;

public class VariableCast {

	public static void main(String[] args) {
		char c = '?';
		short s1 = (short) c;
		byte b = (byte) c;
		System.out.println(s1 + " " + b);

		short s2 = 789;
		char c2 = (char) s2;
		System.out.println(c2);
	}

}
