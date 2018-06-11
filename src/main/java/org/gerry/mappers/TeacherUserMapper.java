package org.gerry.mappers;

import java.util.List;

import org.gerry.beans.TeacherBean;
import org.gerry.beans.TeacherUserBean;
import org.gerry.beans.UserBean;

public interface TeacherUserMapper {
	
	public void insertTeacherUser(TeacherUserBean teacherUserBean) throws Exception;
	
	public List<UserBean> selectUsersByTeacher(int id) throws Exception;

	public List<TeacherBean> selectTeachersByUser(int id) throws Exception;

	public void deleteTeacherUser(int teacherId,int userId) throws Exception;
}
