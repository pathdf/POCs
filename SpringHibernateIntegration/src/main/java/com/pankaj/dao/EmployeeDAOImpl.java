package com.pankaj.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pankaj.model.Employee;

@Repository("employeeDao")
public class EmployeeDAOImpl implements EmployeeDAO{
	
	@Autowired(required=true)
	public SessionFactory sessionFactory;
	
	public void addEmployee(Employee employee)
	{
		sessionFactory.getCurrentSession().saveOrUpdate(employee);
	}
	
	@SuppressWarnings("unchecked")
	public List<Employee> listEmployees()
	{
		System.out.println((List<Employee>)sessionFactory.getCurrentSession().createCriteria(Employee.class).list());
		return (List<Employee>)sessionFactory.getCurrentSession().createCriteria(Employee.class).list();
	}

	public Employee getEmployee(int empId) {
		
		return (Employee) sessionFactory.getCurrentSession().get(Employee.class,empId);
	}

	public void deleteEmployee(Employee employee) {

		sessionFactory.getCurrentSession().delete(employee);
				
	}
	
	
}
