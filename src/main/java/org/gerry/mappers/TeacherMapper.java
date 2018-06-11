package org.gerry.mappers;

import org.gerry.beans.TeacherBean;

public interface TeacherMapper {
	public void  insertTeacher(TeacherBean teacherBean) throws Exception;
	
	public void  updateTeacher(TeacherBean teacherBean,int teacher_id) throws Exception;
	
	public void  deleteTeacher(int teacher_id) throws Exception;
	
	public TeacherBean  selectTeacher(int teacher_id) throws Exception;
}
