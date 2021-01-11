package com.repository;

import java.util.List;

import com.pojo.Employee;

public interface EmployeeRepo {
	Employee getEmployee(int empid, String empName);
	List<Employee> getAllEmployees();
	int insertemployee(Employee empl);
	int updateEmployee(Employee empl);
	int deleteEmployee(int empid,String empName);

}
