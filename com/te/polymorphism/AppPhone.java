package com.te.polymorphism;

public class AppPhone {
	public static void main(String[] args) {
		Android samsungA30=new Android();
		samsungA30.battery();
		samsungA30.camera();
		
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
