package com.pankaj.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pankaj.model.Employee;


public interface EmployeeService {
	
	 public void addEmployee(Employee employee);

	 public List<Employee> listEmployees();
	 
	 public Employee getEmployee(int empid);
	 
	 public void deleteEmployee(Employee employee);

}
