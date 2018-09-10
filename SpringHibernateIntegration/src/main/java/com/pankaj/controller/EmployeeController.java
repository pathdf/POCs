package com.pankaj.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.method.annotation.ModelAndViewResolverMethodReturnValueHandler;

import com.pankaj.bean.EmployeeBean;
import com.pankaj.model.Employee;
import com.pankaj.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired(required=true)
	public EmployeeService employeeService;
	
	@RequestMapping(value="/save", method = RequestMethod.POST)
	public ModelAndView saveEmployee(@ModelAttribute("command")EmployeeBean employeeBean, BindingResult result)
	{
		Employee employee = prepareModel(employeeBean);
		employeeService.addEmployee(employee);
		return new ModelAndView("redirect:/add.html");
		
	}
	
	
	private Employee prepareModel(EmployeeBean employeeBean)
	{
		 	Employee employee  = new Employee();
		 	employee.setEmpId(employeeBean.getId());
		 	employee.setEmpName(employeeBean.getName());
		 	employee.setEmpAddress(employeeBean.getAddress());
		 	employee.setSalary(employeeBean.getSalary());
		 	employee.setEmpAge(employeeBean.getAge());
		 	employeeBean.setId(null);
		 	return employee;
	}
	
	
	@RequestMapping(value="/employees",method=RequestMethod.GET)
	public ModelAndView listEmployees()
	{
		 Map<String,Object> model = new HashMap<String,Object>();
		  model.put("employees",  prepareListOfBean(employeeService.listEmployees()));
		  return new ModelAndView("employeesList", model);
	}
	
	private List<EmployeeBean> prepareListOfBean(List<Employee> employees)
	{
		List<EmployeeBean> beans = null;
		
		if(employees!=null && !employees.isEmpty())
		{
			beans = new ArrayList<EmployeeBean>();
			EmployeeBean bean = null;
			
			for(Employee employee: employees)
			{
				bean = new EmployeeBean();
				bean.setId(employee.getEmpId());
				bean.setName(employee.getEmpName());
				bean.setAddress(employee.getEmpAddress());
				bean.setSalary(employee.getSalary());
				bean.setAge(employee.getEmpAge());
				beans.add(bean);
			}
		}
		return beans;
	}
	
	@RequestMapping(value="/add", method= RequestMethod.GET)
	public ModelAndView addEmployee(@ModelAttribute("command")EmployeeBean employeeBean, BindingResult result)
	{
		Map<String,Object> model = new HashMap<String,Object>();
		model.put("employees", prepareListOfBean(employeeService.listEmployees()));
		return new ModelAndView("addEmployee",model);
	}
		
	@RequestMapping(value="/index", method=RequestMethod.GET)
	public ModelAndView welcome()
	{
		return new ModelAndView("index");
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public ModelAndView deleteEmployee(@ModelAttribute("command")EmployeeBean employeeBean, BindingResult result)
	{
		employeeService.deleteEmployee(prepareModel(employeeBean));
		Map<String,Object> model = new HashMap<String,Object>();
		model.put("employee", null);
		model.put("employees",prepareListOfBean(employeeService.listEmployees()));
		return new ModelAndView("addEmployee", model);
	}
	
	@RequestMapping(value="/edit", method=RequestMethod.GET)
	public ModelAndView editEmployee(@ModelAttribute("command")EmployeeBean employeeBean, BindingResult result)
	{
		Map<String,Object> model = new HashMap<String,Object>();
		model.put("employee", prepareEmployeeBean(employeeService.getEmployee(employeeBean.getId())));
		model.put("employees",prepareListOfBean(employeeService.listEmployees()));
		return new ModelAndView("addEmployee",model);
	}
	
	private EmployeeBean prepareEmployeeBean(Employee employee)
	{
		EmployeeBean bean = new EmployeeBean();
		bean.setId(employee.getEmpId());
		bean.setName(employee.getEmpName());
		bean.setAddress(employee.getEmpAddress());
		bean.setSalary(employee.getSalary());
		bean.setAge(employee.getEmpAge());
		return bean;
	}
}
