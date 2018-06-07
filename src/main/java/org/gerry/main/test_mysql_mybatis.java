package org.gerry.main;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.gerry.beans.UserBean;
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
		SqlSession sqlSession = sqlSessionFactory.openSession();
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		UserBean userbean = new UserBean();
		// userbean.setId(1);
		userbean.setUsername("gerry ge");
		userbean.setPassword("123456");
		userbean.setAccount(6224153425D);
		try {
			userMapper.insertUser(userbean);
			userMapper.deleteUser(2);
			sqlSession.commit();
			List<UserBean> userBeans = userMapper.selectAllUser();
			for (UserBean user : userBeans) {
				System.out.println(user.toString());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (sqlSession != null) {
				sqlSession.close();
			}
		}

	}

}
