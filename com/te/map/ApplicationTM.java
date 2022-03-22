package com.te.map;

import java.util.Comparator;
import java.util.Map.Entry;
import java.util.TreeMap;

public class ApplicationTM {

	public static void main(String[] args) {
		TreeMap<Integer, Student> treeMap = new TreeMap<Integer, Student>();
		treeMap.put(1, new Student(1, "Sanju", 20));
		treeMap.put(2, new Student(3, "Kimiki", 19));
		treeMap.put(3, new Student(1, "Tim", 25));
		treeMap.put(4, new Student(1, "George", 23));

		for (Entry<Integer, Student> entry : treeMap.entrySet()) {
			System.out.println(entry);
		}

		System.out.println("=============");
		System.out.println();

		Comparator cmpInt = (o1, o2) -> {
			Integer i1 = (Integer) o1;
			Integer i2 = (Integer) o2;
			return (i1 > i1) ? -1 : (i1 < i2) ? 1 : 0;
		};

		TreeMap<Integer, Student> treeMap1 = new TreeMap<Integer, Student>(cmpInt);
		treeMap1.put(1, new Student(1, "Sanju", 20));
		treeMap1.put(2, new Student(3, "Kimiki", 19));
		treeMap1.put(3, new Student(1, "Tim", 25));
		treeMap1.put(4, new Student(1, "George", 23));

		for (Entry<Integer, Student> entry1 : treeMap1.entrySet()) {
			System.out.println(entry1);
		}

		

		TreeMap<Student, Student> treeMap2 = new TreeMap<Student, Student>(cmpString);
		Comparator cmpString = (o1, o2) -> {
			treeMap2.get(treeMap2);
			Student s1 = (Student) o1;
			Student s2 = (Student) o2;
			return (s1.getsAge() > s2.getsAge()) ? -1 : (s1.getsAge() < s2.getsAge()) ? 1 : 0;
		};
		
		treeMap2.put(new Student(1, "Sanju", 20), new Student(1, "Sanju", 20));
		treeMap2.put(new Student(3, "Kimiki", 19), new Student(3, "Kimiki", 19));
		treeMap2.put(new Student(1, "Tim", 25), new Student(1, "Tim", 25));
		treeMap2.put(new Student(1, "George", 23), new Student(1, "George", 23));

		System.out.println("------------");
		for (Entry<Student, Student> entry2 : treeMap2.entrySet()) {
			System.out.println(entry2.getKey());
		}
	}

}
