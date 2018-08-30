<<<<<<< HEAD
package org.gerry.services;

import java.util.List;

import org.gerry.hibernateBeans.Depertment;
import org.gerry.main.CodeUtils;
import org.gerry.main.HibernateUtil;
import org.hibernate.Session;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

@Service
@ComponentScan
public class UserService {
	public void SearchUsers() {
		try {
			Session session = HibernateUtil.getSession();
			Depertment depert = new Depertment();
			depert = (Depertment) session.get(Depertment.class, 1);
			List<String> employees = depert.getEmployee();
			for (String str : employees) {
				CodeUtils.prt(str);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			HibernateUtil.closeSession();
		}
	}
}
=======
package org.gerry.services;

import java.util.List;

import org.gerry.hibernateBeans.Depertment;
import org.gerry.main.CodeUtils;
import org.gerry.main.HibernateUtil;
import org.hibernate.Session;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

@Service
@ComponentScan
public class UserService {
	public void SearchUsers() {
		try {
			Session session = HibernateUtil.getSession();
			Depertment depert = new Depertment();
			depert = (Depertment) session.get(Depertment.class, 1);
			List<String> employees = depert.getEmployee();
			for (String str : employees) {
				CodeUtils.prt(str);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			HibernateUtil.closeSession();
		}
	}
}
>>>>>>> 20180829 commit;
