package com.te.stringex;

public class StringExample {
	public static void main(String[] args) {
		StringBuffer str=new StringBuffer("Sanooj");
		System.out.println(str);
		System.out.println(str.capacity());
		str.append(" Babu");
		System.out.println(str);
		System.out.println(str.charAt(7));
		System.out.println(str.length());
		System.out.println(str.replace(0, 5, "Manoj"));
		System.out.println(str);
	}

}
