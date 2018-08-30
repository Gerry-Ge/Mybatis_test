package org.gerry.main;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.gerry.beans.PostBean;
import org.gerry.beans.TeacherBean;
import org.gerry.beans.TeacherUserBean;
import org.gerry.beans.UserBean;
import org.gerry.mappers.PostMapper;
import org.gerry.mappers.TeacherMapper;
import org.gerry.mappers.TeacherUserMapper;
import org.gerry.mappers.UserMapper;

public class test_mysql_mybatis {

	private static SqlSessionFactory sqlSessionFactory;
	private static Reader reader;

	static {
		try {
			reader = Resources.getResourceAsReader("Mybatis.cfg.xml");
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
//		SqlSession sqlSession = sqlSessionFactory.openSession();
//		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//		PostMapper postMapper = sqlSession.getMapper(PostMapper.class);
//		TeacherMapper teacherMapper= sqlSession.getMapper(TeacherMapper.class);
//		TeacherUserMapper teacherUserMapper=sqlSession.getMapper(TeacherUserMapper.class);
		try {
//			TeacherUserBean teacherUserBean=new TeacherUserBean();
//			teacherUserBean.setTeacherId(2);
//			teacherUserBean.setUserId(16);
//			teacherUserMapper.insertTeacherUser(teacherUserBean);
			
//			UserBean userBeanTemp=userMapper.selectUserTeacher(16);
//			List<TeacherBean>  teacherList=userBeanTemp.getTeachers();
//			for(TeacherBean t:teacherList){
//				System.out.println(t.toString());
//			}
//			teacherUserMapper.deleteTeacherUser(2,16);
//			System.out.println("delete");
			
//			teacherList=userBeanTemp.getTeachers();
//			for(TeacherBean t:teacherList){
//				System.out.println(t.toString());
//			}
			
//			userBeanTemp=userMapper.selectUserPostTeacher(17);
//			List<TeacherBean> TeacherBeans= userBeanTemp.getTeachers();
//			for(TeacherBean teacher:TeacherBeans){
//				System.out.println(teacher.toString());
//			}
//			List<PostBean> postBeans= userBeanTemp.getPosts();
//			for(PostBean post:postBeans){
//				System.out.println(post.toString());
//			}
//			sqlSession.commit();
						
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
//			if (sqlSession != null) {
//				sqlSession.close();
//			}
		}

	}

}

