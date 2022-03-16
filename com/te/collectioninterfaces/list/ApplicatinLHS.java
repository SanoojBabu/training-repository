package com.te.collectioninterfaces.list;

import java.util.LinkedHashSet;

public class ApplicatinLHS {

	public static void main(String[] args) {
		LinkedHashSet<Student> linkedHashSet = new LinkedHashSet<Student>();
		linkedHashSet.add(new Student(1, "Sanju", 25));
		linkedHashSet.add(new Student(3, "Anil", 22));
		linkedHashSet.add(new Student(2, "Hithesh", 19));
		linkedHashSet.add(new Student(5, "Thileep", 20));
		linkedHashSet.add(new Student(1, "Sanju", 25));

		for (Student student : linkedHashSet) {
			System.out.println(student);
		}
	}

}
