package com.te.functionalinterfaces;

import java.util.Arrays;

public class Application {

	public static void main(String[] args) {
		Student[] stuArray = { new Student(5, "Sanju", 20, 85.09), new Student(1, "Kiran", 22, 79.97),
				new Student(8, "Ganga", 21, 90.15), new Student(2, "Lipi", 24, 87.63) };
		Arrays.sort(stuArray);

		for (Student student : stuArray) {
			System.out.println(student);
		}
	}

}
