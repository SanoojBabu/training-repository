package com.te.collectioninterfaces.list;

import java.util.HashSet;

public class ApplicationHS {

	public static void main(String[] args) {
		HashSet<Integer> hashSet = new HashSet<Integer>();
		hashSet.add(2);
		hashSet.add(5);
		hashSet.add(6);
		hashSet.add(5);
		hashSet.add(23);

		for (Integer integer : hashSet) {
			System.out.println(integer);
		}
	}

}
