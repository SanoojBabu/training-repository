package com.te.collectioninterfaces.list;

import java.util.HashSet;

public class ApplicatinHS2 {

	public static void main(String[] args) {
		HashSet<Student> hashSet = new HashSet<Student>();
		hashSet.add(new Student(1, "Sanju", 25));
		hashSet.add(new Student(4, "Pooja", 19));
		hashSet.add(new Student(3, "Hrithik", 22));
		hashSet.add(new Student(1, "Sanju", 25));

		for (Student student : hashSet) {
			System.out.println(student);
		}
	}

}
