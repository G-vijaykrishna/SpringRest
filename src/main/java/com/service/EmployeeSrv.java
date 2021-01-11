package com.service;

import java.util.List;

import com.pojo.Employee;

public interface EmployeeSrv {
	Employee getEmployee(int empid,String empName);
	List<Employee> getAllEmployees();
	String insertemployee(Employee empl);
	String updateEmployee(Employee empl);
	String deleteEmployee(int empid,String empName);
	

}
