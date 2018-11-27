package com.emp.springbootmysql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;




public class EmpDaoImpl implements EmpDao{
	
	private SessionFactory sf;
	
	public void addEmployee(EmpPojo e)
	{
		Session s=this.sf.getCurrentSession();
		s.persist(e);
	System.out.println("added successfully"+e);
		
	}
	
	@Override
	public List<EmpPojo> listEmployees() {
		Session session = this.sf.getCurrentSession();
		System.out.println("you");
		List<EmpPojo> Employee = session.createQuery("from employeedb").list();
		for(EmpPojo p : Employee){
			System.out.println("Employee List::"+p.id+p.name);
		}
		return Employee;
	}

}
