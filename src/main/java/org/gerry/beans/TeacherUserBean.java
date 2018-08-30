<<<<<<< HEAD
package org.gerry.beans;

import java.io.Serializable;

public class TeacherUserBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int teacherId;
	private int userId;

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "TeacherUserBean [teacherId=" + teacherId + ", userId=" + userId
				+ "]";
	}

}
=======
package org.gerry.beans;

import java.io.Serializable;

public class TeacherUserBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int teacherId;
	private int userId;

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "TeacherUserBean [teacherId=" + teacherId + ", userId=" + userId
				+ "]";
	}

}
>>>>>>> 20180829 commit;
