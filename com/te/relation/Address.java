package com.te.relation;

public class Address {
	private String houseName;
	private String streetName;
	private String city;
	private String state;

	public Address() {
		super();
	}

	public Address(String houseName, String streetName, String city, String state) {
		super();
		this.houseName = houseName;
		this.streetName = streetName;
		this.city = city;
		this.state = state;
	}

	public String getHouseName() {
		return houseName;
	}

	public void setHouseName(String houseName) {
		this.houseName = houseName;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setHumanWeight(String humanWeight) {
		this.state = state;
	}

}
