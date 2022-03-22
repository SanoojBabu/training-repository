package com.te.collectioninterfaces.list;

import java.util.Comparator;
import java.util.TreeSet;

public class ApplicationTS {

	public static void main(String[] args) {
		TreeSet<Student> treeSet = new TreeSet<Student>();
		treeSet.add(new Student(1, "Sanju", 25));
		treeSet.add(new Student(4, "Lipi", 20));
		treeSet.add(new Student(3, "Fazeen", 24));
		treeSet.add(new Student(2, "Ivan", 19));
		treeSet.add(new Student(1, "Sanju", 25));

		System.out.println("Comparable Result");
		for (Student student : treeSet) {
			System.out.println(student);
		}

		Comparator byAge = (o1, o2) -> {
			Student student1 = (Student) o1;
			Student student2 = (Student) o2;
			if (student1.getsAge() > student2.getsAge())
				return 1;
			else if (student1.getsAge() < student2.getsAge())
				return -1;
			return 0;
		};

		TreeSet<Student> treeSet2 = new TreeSet<Student>(byAge);
		treeSet2.add(new Student(1, "Sanju", 25));
		treeSet2.add(new Student(4, "Lipi", 20));
		treeSet2.add(new Student(3, "Fazeen", 24));
		treeSet2.add(new Student(2, "Ivan", 19));
		treeSet2.add(new Student(1, "Sanju", 25));

		System.out.println("Comparator Result");
		for (Student student : treeSet2) {
			System.out.println(student);
		}

		Comparator byAgeRev = (o1, o2) -> {
			Student student1 = (Student) o1;
			Student student2 = (Student) o2;
			if (student1.getsAge() > student2.getsAge())
				return -1;
			else if (student1.getsAge() < student2.getsAge())
				return 1;
			return 0;
		};

		TreeSet<Student> treeSet3 = new TreeSet<Student>(byAgeRev);
		treeSet3.add(new Student(1, "Sanju", 25));
		treeSet3.add(new Student(4, "Lipi", 20));
		treeSet3.add(new Student(3, "Fazeen", 24));
		treeSet3.add(new Student(2, "Ivan", 19));
		treeSet3.add(new Student(1, "Sanju", 25));

		System.out.println("Comparator Reverse Result");
		for (Student student : treeSet3) {
			System.out.println(student);
		}
	}

}
