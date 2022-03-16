package com.te.finalclass;

import com.te.relation.Human;

public class AppNew {

	public static void main(String[] args) {
		Human human1=new Human("San",22,175,83);
		Human human2=new Human("San",22,175,83);
		System.out.println("Is same? "+human1.equals(human2));
	}

}
