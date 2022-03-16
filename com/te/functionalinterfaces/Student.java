package com.te.functionalinterfaces;

public class Student implements Comparable {
	private int sId;
	private String sName;
	private int sAge;
	private double sPercentage;

	public Student() {
		super();
	}

	public Student(int sId, String sName, int sAge, double sPercentage) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sAge = sAge;
		this.sPercentage = sPercentage;
	}

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public int getsAge() {
		return sAge;
	}

	public void setsAge(int sAge) {
		this.sAge = sAge;
	}

	public double getsPercentage() {
		return sPercentage;
	}

	public void setsPercentage(double sPercentage) {
		this.sPercentage = sPercentage;
	}

	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", sAge=" + sAge + ", sPercentage=" + sPercentage + "]";
	}

	@Override
	public int compareTo(Object arg0) {
		Student student = (Student) arg0;
		if (this.sId > student.sId)
			return 1;
		else if (this.sId < student.sId)
			return -1;
		return 0;
	}

}
