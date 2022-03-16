package com.te.collectioninterfaces.list;

import java.util.ListIterator;
import java.util.LinkedList;

public class ApplicationLL {
	public static void main(String[] args) {
		LinkedList<Student> linkedList = new LinkedList<Student>();
		linkedList.add(new Student(1, "Sanju", 25));
		linkedList.add(new Student(3, "John", 20));
		linkedList.add(new Student(5, "KIngsley", 28));
		linkedList.add(new Student(2, "Parklin", 21));

		System.out.println("============");
		System.out.println(linkedList);

		System.out.println("============");
		for (int i = 0; i < linkedList.size(); i++) {
			System.out.println(linkedList.get(i));
		}

		System.out.println("============");
		for (Student student : linkedList) {
			System.out.println(student);
		}

		System.out.println("============");
		ListIterator listIterator = linkedList.listIterator();
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}

		System.out.println("============");
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
	}
}
