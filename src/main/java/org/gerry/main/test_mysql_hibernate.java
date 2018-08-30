<<<<<<< HEAD
package org.gerry.main;

import java.util.ArrayList;
import java.util.List;

import org.gerry.beans.HEmployee;
import org.gerry.hibernate.annotation.one2one.beans.Customer;
import org.gerry.hibernate.annotation.one2one.beans.IdCard;
import org.gerry.hibernate.annotation.one2one.beans.Person;
import org.gerry.hibernate.annotation.one2one.beans.Reference;
import org.gerry.hibernateBeans.Depertment;
import org.gerry.hibernateBeans.Staff;
import org.gerry.hibernateBeans.Student;
import org.gerry.hibernateBeans.Superman;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class test_mysql_hibernate {
	
	public static void main(String[] args){
		Session session=HibernateUtil.getSession();
		Transaction transaction=session.beginTransaction();
		try{
			Person p =new Person();
			IdCard i=new IdCard();
			p.setPersonName("gerry1");
			i.setIdCardNo(231231);
			p.setIdCard(i);
			session.persist(p);
			transaction.commit();
		}catch(Exception e ){
			e.printStackTrace();
		}finally{
			HibernateUtil.closeSession();
		}
	}
	public static int Insert(Object emp){
		int i=0;
		Session session=HibernateUtil.getSession();
		Transaction transaction=session.beginTransaction();
		try{
			i=(Integer) session.save(emp);
			transaction.commit();
		}catch(Exception e ){
			e.printStackTrace();
		}finally{
			HibernateUtil.closeSession();
		}
		return i;
	}
	public static void Search(){
		Session session=HibernateUtil.getSession();
		Transaction transaction=session.beginTransaction();
		try{
//		Depertment depert=new Depertment();
//		depert=(Depertment) session.get(Depertment.class, 1);
//		CodeUtils.prt(depert.getDeptName());
//		List<String> employees=depert.getEmployee();
//		for(String str:employees){
//			CodeUtils.prt(str);
//		}
		 Query query = session.createQuery("from Depertment");
		List<Depertment> depert= query.list();
		for(Depertment emp:depert){
			CodeUtils.prt(emp.getDeptName());
			List<String> employees=emp.getEmployee();
			for(String str:employees){
				CodeUtils.prt(str);
			}
		}
		
//		transaction.commit();
		}catch(Exception e ){
			e.printStackTrace();
		}finally{
			HibernateUtil.closeSession();
		}
	}

}
=======
package org.gerry.main;

import java.util.ArrayList;
import java.util.List;

import org.gerry.beans.HEmployee;
import org.gerry.hibernate.annotation.one2one.beans.Customer;
import org.gerry.hibernate.annotation.one2one.beans.IdCard;
import org.gerry.hibernate.annotation.one2one.beans.Person;
import org.gerry.hibernate.annotation.one2one.beans.Reference;
import org.gerry.hibernateBeans.Depertment;
import org.gerry.hibernateBeans.Staff;
import org.gerry.hibernateBeans.Student;
import org.gerry.hibernateBeans.Superman;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class test_mysql_hibernate {
	
	public static void main(String[] args){
		Session session=HibernateUtil.getSession();
		Transaction transaction=session.beginTransaction();
		try{
			Person p =new Person();
			IdCard i=new IdCard();
			p.setPersonName("gerry1");
			i.setIdCardNo(231231);
			p.setIdCard(i);
			session.persist(p);
			transaction.commit();
		}catch(Exception e ){
			e.printStackTrace();
		}finally{
			HibernateUtil.closeSession();
		}
	}
	public static int Insert(HEmployee emp){
		int i=0;
		Session session=HibernateUtil.getSession();
		Transaction transaction=session.beginTransaction();
		try{
			i=(Integer) session.save(emp);
			transaction.commit();
		}catch(Exception e ){
			e.printStackTrace();
		}finally{
			HibernateUtil.closeSession();
		}
		return i;
	}
	public static void Search(){
		Session session=HibernateUtil.getSession();
		Transaction transaction=session.beginTransaction();
		try{
//		Depertment depert=new Depertment();
//		depert=(Depertment) session.get(Depertment.class, 1);
//		CodeUtils.prt(depert.getDeptName());
//		List<String> employees=depert.getEmployee();
//		for(String str:employees){
//			CodeUtils.prt(str);
//		}
		 Query query = session.createQuery("from Depertment");
		List<Depertment> depert= query.list();
		for(Depertment emp:depert){
			CodeUtils.prt(emp.getDeptName());
			List<String> employees=emp.getEmployee();
			for(String str:employees){
				CodeUtils.prt(str);
			}
		}
		
//		transaction.commit();
		}catch(Exception e ){
			e.printStackTrace();
		}finally{
			HibernateUtil.closeSession();
		}
	}

}
>>>>>>> 20180829 commit;
