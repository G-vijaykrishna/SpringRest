package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pojo.Employee;
import com.repository.EmployeeRepo;
@Service
public class EmployeeSrvImpl implements EmployeeSrv{
	@Autowired
	private EmployeeRepo employeeRepo;
	public void setEmployeeRepo(EmployeeRepo employeeRepo) {
		this.employeeRepo = employeeRepo;
	}

	public Employee getEmployee(int empid, String empName) {
		Employee empl=employeeRepo.getEmployee(empid, empName);
		return empl;
	}

	public List<Employee> getAllEmployees() {
		List<Employee> employee=employeeRepo.getAllEmployees();
		return employee;
	}

	public String insertemployee(Employee empl) {
		int result=employeeRepo.insertemployee(empl);
		if(result==0) {
			return "employee insertion failed";
		}else {
			return "insertion sucessfull";
		}
	}

	public String updateEmployee(Employee empl) {
		int result=employeeRepo.updateEmployee(empl);
		if(result==0) {
			return "employee updation failed";
		}else {
			return "updation sucessfull";
		}
		
	}

	public String deleteEmployee(int empid, String empName) {
		int result=employeeRepo.deleteEmployee(empid, empName);
		if(result==0) {
			return "employee deletion failed";
		}else {
			return "employee deletion sucessfull";
		}
	}

}
