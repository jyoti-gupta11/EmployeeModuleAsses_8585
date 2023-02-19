package com.assignment.employee.module.service;


import java.util.List;

import com.assignment.employee.module.dao.Employee;


public interface EmployeeService {
	List<Employee> getAllEmployees();
	void saveEmployee(Employee employee);
	Employee getEmployeeById(long id);
	void deleteEmployeeById(long id);
}
