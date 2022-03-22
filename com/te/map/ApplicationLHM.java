package com.te.map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class ApplicationLHM {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		linkedHashMap.put(1, "Sanju");
		linkedHashMap.put(3, "KingPin");
		linkedHashMap.put(5, "Peter");
		linkedHashMap.put(2, "Hithin");
		linkedHashMap.put(4, "Nimko");

		for (int i = 1; i <= linkedHashMap.size(); i++) {
			System.out.println(linkedHashMap.get(i));
		}
		
		
	}

}
