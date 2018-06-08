package org.gerry.beans;

import java.io.Serializable;
import java.sql.Date;

public class PostBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PostBean() {
		super();
	}

	private int postId;
	private UserBean userBean;
	private int userid;
	private String title;
	private String content;
	private Date created;

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public int getPostId() {
		return postId;
	}

	public void setPostId(int postId) {
		this.postId = postId;
	}

	public UserBean getUserBean() {
		return userBean;
	}

	public void setUserBean(UserBean userBean) {
		this.userBean = userBean;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	@Override
	public String toString() {
		return "PostBean [postId=" + postId + ", userid=" + userid + ", title="
				+ title + ", content=" + content + ", created=" + created + "]";
	}

	

}
