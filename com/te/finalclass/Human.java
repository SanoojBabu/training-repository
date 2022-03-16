package com.te.finalclass;

import com.te.relation.Address;

public class Human {
	private String humanName;
	private int humanAge;
	private int humanHeight;
	private double humanWeight;

	public Human() {
		super();
	}

	public Human(String humanName, int humanAge, int humanHeight, int humanWeight) {
		super();
		this.humanName = humanName;
		this.humanAge = humanAge;
		this.humanHeight = humanHeight;
		this.humanWeight = humanWeight;
	}

	public String getHumanName() {
		return humanName;
	}

	public void setHumanName(String humanName) {
		this.humanName = humanName;
	}

	public int getHumanAge() {
		return humanAge;
	}

	public void setHumanAge(int humanAge) {
		if (humanAge <= 0) {
			System.out.println("Age entered is not correct");
		} else {
			this.humanAge = humanAge;
		}
	}

	public int getHumanHeight() {
		return humanHeight;
	}

	public void setHumanHeight(int humanHeight) {
		if (humanHeight <= 0) {
			System.out.println("Age entered is not correct");
		} else {
			this.humanHeight = humanHeight;
		}
	}

	public double getHumanWeight() {
		return humanWeight;
	}

	public void setHumanWeight(double humanWeight) {
		if (humanWeight <= 0) {
			System.out.println("Age entered is not correct");
		} else {
			this.humanWeight = humanWeight;
		}
	}

	@Override
	public boolean equals(Object arg0) {
		Human human = (Human) arg0;
		if(this.humanAge==human.humanAge && this.humanHeight==human.humanHeight 
				&& this.humanWeight==human.humanWeight && this.humanName.equals(human.humanName)) {
			return true;
		}return false;
	}

}
