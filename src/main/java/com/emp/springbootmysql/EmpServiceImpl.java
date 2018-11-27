package com.emp.springbootmysql;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

public class EmpServiceImpl implements EmpServiceInterface {
	
	EmpDao d;

	public void setD(EmpDao d) {
		this.d = d;
	}
	@Override
	@Transactional
	public void addEmployee(EmpPojo e)
	{
		this.d.addEmployee(e);
	}
	
	@Override
	@Transactional
	public List<EmpPojo> listEmployees()
	{		
		return this.d.listEmployees();
	}

}
