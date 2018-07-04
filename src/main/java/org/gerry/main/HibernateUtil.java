package org.gerry.main;

import java.io.File;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.metamodel.MetadataSources;

public class HibernateUtil {
	public static String HibernateVersion = "3";
	public static SessionFactory sessionFactory;
	public static final ThreadLocal<Session> sessionThreadlocal = new ThreadLocal<Session>();
	static {
		try {
			if ("3".equals(HibernateVersion)) {
				Configuration config = new Configuration().configure(new File(
						"src/main/resources/Hibernate.cfg.xml"));
				sessionFactory = config.buildSessionFactory();
			} else if ("4".equals(HibernateVersion)) {
				Configuration config = new Configuration().configure(new File(
						"src/main/resources/Hibernate.cfg.xml"));
				// 创建服务注册对象（hibernate4.35之后该方法就不能再获取到实体信息了）
				StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
						.applySettings(config.getProperties()).build();
				// 创建会话工厂对象
				sessionFactory = config.buildSessionFactory(serviceRegistry);
			} else if ("5".equals(HibernateVersion)) {
				// 创建配置对象
				StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
						.configure("Hibernate.cfg.xml").build();
				// 2. 根据服务注册类创建一个元数据资源集，同时构建元数据并生成应用一般唯一的的session工厂
				sessionFactory = new MetadataSources(registry).buildMetadata()
						.buildSessionFactory();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public static Session getSession() {
		Session session = sessionThreadlocal.get();
		if (null == session) {
			try {
				session = sessionFactory.openSession();
				sessionThreadlocal.set(session);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return session;
	}

	public static void closeSession() {
		Session session = sessionThreadlocal.get();
		if (null != session) {
			try {
				session.close();
				sessionThreadlocal.set(null);
				if(null!=sessionFactory){
					sessionFactory.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void shutDown() {
		try {
			sessionFactory.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
