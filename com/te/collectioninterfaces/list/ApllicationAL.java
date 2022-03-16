package com.te.collectioninterfaces.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

import com.sun.org.apache.bcel.internal.generic.LSTORE;

public class ApllicationAL {

	public static void main(String[] args) {
		ArrayList<Student> arrayList = new ArrayList<Student>();
		arrayList.add(new Student(1, "Sanju", 25));
		arrayList.add(new Student(4, "Pooja", 19));
		arrayList.add(new Student(3, "Hrithik", 22));
		arrayList.add(new Student(2, "Farhan", 20));

		System.out.println("1st =============");
		System.out.println(arrayList);

		System.out.println("2nd =============");
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}

		System.out.println("3rd =============");
		for (Student student : arrayList) {
			System.out.println(student);
		}

		System.out.println("4th =============");
		Iterator iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("5th =============");
		Collections.sort(arrayList);
		ListIterator listIterator = arrayList.listIterator();

		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}

		System.out.println("6th =============");

		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}

	}

}
