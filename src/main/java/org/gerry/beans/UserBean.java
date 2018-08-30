package org.gerry.beans;

import java.io.Serializable;
import java.util.List;

public class UserBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2573115477617303865L;

	public UserBean(String username, String password, Double account) {
		super();
		this.username = username;
		this.password = password;
		this.account = account;
	}
	
	public UserBean(){
		super();
	}

	public UserBean(Integer id, String username, String password, Double account) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.account = account;
	}

	private Integer id;
	private String username;
	private String password;
	private Double account;
	private List<PostBean> posts;
	private List<TeacherBean> teachers;

	public List<TeacherBean> getTeachers() {
		return teachers;
	}

	public void setTeachers(List<TeacherBean> teachers) {
		this.teachers = teachers;
	}

	public List<PostBean> getPosts() {
		return posts;
	}

	public void setPosts(List<PostBean> posts) {
		this.posts = posts;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Double getAccount() {
		return account;
	}

	public void setAccount(Double account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "UserBean [id=" + id + ", username=" + username + ", password="
				+ password + ", account=" + account + "]";
	}

}
