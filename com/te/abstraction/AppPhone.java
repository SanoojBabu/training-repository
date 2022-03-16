package com.te.abstraction;

public class AppPhone {
	public static void main(String[] args) {
		Android android=new Miui();
		android.security();
		android.battery();
		
		System.out.println();
		
		Miui note10=new Miui();
		note10.battery();
		note10.camera();
		
		System.out.println();
		
		Oxygen oneplus9=new Oxygen();
		oneplus9.battery();
		oneplus9.camera();
	}
}
