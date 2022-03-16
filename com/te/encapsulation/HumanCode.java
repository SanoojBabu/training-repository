package com.te.encapsulation;

public
class HumanCode {

	public static void main(String[] args) {
		Human human=new Human();
		human.setHumanName("Ijoy");
		human.setHumanAge(-22);
		human.setHumanHeight(-180);
		human.setHumanWeight(-345);
		
		System.out.println(human.getHumanName());
		System.out.println(human.getHumanHeight());
		System.out.println(human.getHumanAge());
		System.out.println(human.getHumanWeight());
	}

}
