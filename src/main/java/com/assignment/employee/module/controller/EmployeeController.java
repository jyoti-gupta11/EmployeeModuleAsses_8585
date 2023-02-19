package com.assignment.employee.module.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.assignment.employee.module.dao.Employee;
import com.assignment.employee.module.service.EmployeeService;

public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeservice;
	
	@RequestMapping(value = "/saveEmployee", method= RequestMethod.POST)
	@ResponseBody
	public void saveEmployee(@RequestBody Employee employee)
	{
		employeeservice.saveEmployee(employee);
	}
	
	@RequestMapping(value = "/employees", method= RequestMethod.GET)
	@ResponseBody
	public List<Employee> getAllEmployee()   
	{  
	return employeeservice.getAllEmployees();
	}  

	@RequestMapping(value = "/employee/{id}", method= RequestMethod.GET)
	@ResponseBody 
	public Employee getEmployee(@PathVariable("id") int id)   
	{  
		return employeeservice.getEmployeeById(id)  ;
	}  
 
	@RequestMapping(value = "/employee/{id}", method= RequestMethod.DELETE) 
	public void deleteEmployee(@PathVariable("id") int id)   
	{  
		employeeservice.deleteEmployeeById(id);
	}  
	
}
