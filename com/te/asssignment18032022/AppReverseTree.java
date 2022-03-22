package com.te.asssignment18032022;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

import com.te.collectioninterfaces.list.Student;

public class AppReverseTree {

	public static void main(String[] args) {
		Comparator byId = (o1, o2) -> {
			Student student1 = (Student) o1;
			Student student2 = (Student) o2;
			if (student1.getsId() > student2.getsId())
				return 1;
			else if (student1.getsId() < student2.getsId())
				return -1;
			return 0;
		};
		TreeSet<Student> treeSet = new TreeSet<Student>(byId);
		treeSet.add(new Student(1, "Sanju", 25));
		treeSet.add(new Student(4, "Lipi", 20));
		treeSet.add(new Student(3, "Fazeen", 24));
		treeSet.add(new Student(2, "Ivan", 19));
		treeSet.add(new Student(1, "Sanju", 25));

		for (Student student : treeSet) {
			System.out.println(student);
		}

		Comparator byRevId = (o1, o2) -> {
			Student student1 = (Student) o1;
			Student student2 = (Student) o2;
			if (student1.getsId() > student2.getsId())
				return -1;
			else if (student1.getsId() < student2.getsId())
				return 1;
			return 0;
		};

		List<Student> revLinkedList = new LinkedList();

		revLinkedList = (List<Student>) treeSet.stream().sorted(byRevId).collect(Collectors.toList());
		System.out.println("++++++++++++++++");

		for (Student student : revLinkedList) {
			System.out.println(student);
		}

		System.out.println("--------");
		TreeSet<Student> revTreeSet = new TreeSet<Student>(revLinkedList);
		// revTreeSet=revLinkedList.stream().collect(Collectors.toList());
		System.out.println(revTreeSet);
	}

}
