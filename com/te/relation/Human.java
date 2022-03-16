package com.te.relation;

public class Human {
	private String humanName;
	private int humanAge;
	private int humanHeight;
	private double humanWeight;
	private Address address = new Address();

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

	public Address createAddressObj() {
		return new Address();
	
	}

	@Override
	public String toString() {
		return "Human [humanName=" + humanName + ", humanAge=" + humanAge + ", humanHeight=" + humanHeight
				+ ", humanWeight=" + humanWeight + ", address=" + address + "]";
	}
}
