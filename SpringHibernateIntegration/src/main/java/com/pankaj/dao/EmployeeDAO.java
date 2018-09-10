package com.pankaj.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.pankaj.model.Employee;
/*@Repository("employeeDao")*/
public interface EmployeeDAO {

	public void addEmployee(Employee employee);
	public List<Employee> listEmployees();
	public Employee getEmployee(int empId);
	public void deleteEmployee(Employee employee);
	
}
