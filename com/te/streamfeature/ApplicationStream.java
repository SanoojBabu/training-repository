package com.te.streamfeature;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class ApplicationStream {

	public static void main(String[] args) {
		ArrayList<Student> arrayList = new ArrayList<Student>();
		arrayList.add(new Student(1, "Sanju", 25));
		arrayList.add(new Student(4, "Pooja", 19));
		arrayList.add(new Student(3, "Hrithik", 22));
		arrayList.add(new Student(2, "Farhan", 20));

		for (Student student1 : arrayList) {
			System.out.println(student1);
		}

		System.out.println("+++++++++++++++++");
		System.out.println();

		List<Student> res = new ArrayList<Student>();
		res = arrayList.stream().filter(student -> student.getsAge() <= 24).collect(Collectors.toList());

		for (Student student2 : res) {
			System.out.println(student2);
		}

		System.out.println("++++++++++++++");
		System.out.println();

		List<Student> res2 = new ArrayList<Student>();
		res2 = arrayList.stream().sorted().collect(Collectors.toList());

		for (Student student2 : res2) {
			System.out.println(student2);
		}
	}
}
