package com.te.java08features;

import java.util.function.Function;

public class ApplicationFunction {

	public static void main(String[] args) {
		Function<Integer, Integer> function = i -> i * i * i;
		System.out.println("Cube is " + function.apply(43));

		Function<String, Boolean> function2 = s -> {
			String s2 = "";
			for (int i = s.length() - 1; i >= 0; i--) {
				s2 = s2 + s.charAt(i);
			}
			return s.equalsIgnoreCase(s2) ? true : false;
		};
		String str = "Malayalam";
		System.out.println("Is palindrome? " + function2.apply(str));
	}
}