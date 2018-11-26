package com.emp.springbootmysql;

import java.util.List;

public interface EmpServiceInterface {

	public void addEmployee(EmpPojo e);
	public List<EmpPojo> listEmployees();
	
}
