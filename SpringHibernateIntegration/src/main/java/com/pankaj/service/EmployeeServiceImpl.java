package com.pankaj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.pankaj.dao.EmployeeDAO;
import com.pankaj.model.Employee;
@Service("employeeService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired(required=true)
	 public EmployeeDAO employeeDao;
	
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void addEmployee(Employee employee) {
		employeeDao.addEmployee(employee);
		
	}

	public List<Employee> listEmployees() {
		return employeeDao.listEmployees();
	}

	public Employee getEmployee(int empid) {
		return employeeDao.getEmployee(empid);
	}

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void deleteEmployee(Employee employee) {
		employeeDao.deleteEmployee(employee);
		
	}
	
	

}
