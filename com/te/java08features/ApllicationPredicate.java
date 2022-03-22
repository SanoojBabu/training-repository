package com.te.java08features;

import java.util.function.Predicate;

public class ApllicationPredicate {

	public static void main(String[] args) {
		Predicate<Integer> predicate = i -> {
			return (i % 2 == 0) ? true : false;
		};
		int num = 9;
		System.out.println("Is true? " + predicate.test(num));

		Predicate<String> predicate2 = s -> (s.length() <= 5);
		String name = "Jane";
		System.out.println("Is LENGTH BELOW 5? " + predicate2.test(name));
	}
}
