package com.emp.springbootmysql;

import java.util.List;

public interface EmpDao {
	public List<EmpPojo> listEmployees();
public void addEmployee(EmpPojo e);
}
