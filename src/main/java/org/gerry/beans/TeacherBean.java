package org.gerry.beans;

import java.io.Serializable;
import java.util.List;

public class TeacherBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int teacherId;
	private String name;
	private int age;
	private int sex;
	private List<UserBean> users;

	public List<UserBean> getUsers() {
		return users;
	}

	public void setUsers(List<UserBean> users) {
		this.users = users;
	}

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}


	@Override
	public String toString() {
		return "TeacherBean [teacherId=" + teacherId + ", name=" + name
				+ ", age=" + age + ", sex=" + sex + "]";
	}
}
