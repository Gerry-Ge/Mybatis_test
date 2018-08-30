<<<<<<< HEAD
package org.gerry.main;

import org.apache.commons.dbcp.BasicDataSource;
import org.gerry.mappers.UserMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test_mysql_mybatis_spring extends Thread {

	private static ApplicationContext appCon;
	static {
		// System.out.println(System.getProperty("java.class.path"));
		appCon = new ClassPathXmlApplicationContext("applicationContext.xml");
	}

	public static void main(String[] args) throws InterruptedException {
		new test_mysql_mybatis_spring().start();
	}

	public void run() {
		try {
			UserMapper um = (UserMapper) appCon.getBean("userMapper");
			
			int i = 0;
			for (i = 0; i < 5; i++) {
				ThreadCommon th = new ThreadCommon(um);
				th.setName("Thread " + i);
				th.start();
				Thread.sleep(60 * 60);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
=======
package org.gerry.main;

import org.apache.commons.dbcp.BasicDataSource;
import org.gerry.mappers.UserMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test_mysql_mybatis_spring extends Thread {

	private static ApplicationContext appCon;
	static {
		// System.out.println(System.getProperty("java.class.path"));
		appCon = new ClassPathXmlApplicationContext("applicationContext.xml");
	}

	public static void main(String[] args) throws InterruptedException {
		new test_mysql_mybatis_spring().start();
	}

	public void run() {
		try {
			UserMapper um = (UserMapper) appCon.getBean("userMapper");
			
			int i = 0;
			for (i = 0; i < 5; i++) {
				ThreadCommon th = new ThreadCommon(um);
				th.setName("Thread " + i);
				th.start();
				Thread.sleep(60 * 60);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
>>>>>>> 20180829 commit;
