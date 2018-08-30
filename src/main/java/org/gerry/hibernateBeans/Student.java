package org.gerry.hibernateBeans;

//@PrimaryKeyJoinColumn(name = "ID")
public class Student extends Person{
	private int sId;

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	private String school;

}

