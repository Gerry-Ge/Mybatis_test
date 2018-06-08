package org.gerry.main;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.gerry.beans.PostBean;
import org.gerry.beans.UserBean;
import org.gerry.mappers.PostMapper;
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
		PostMapper postMapper = sqlSession.getMapper(PostMapper.class);

		try {
			UserBean userBean=userMapper.selectUserPost(16);
			System.out.println(userBean.getUsername());
			List<PostBean> posts=userBean.getPosts();
			for(PostBean post:posts){
				System.out.println(post.getTitle());	
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (sqlSession != null) {
				sqlSession.close();
			}
		}

	}

}
