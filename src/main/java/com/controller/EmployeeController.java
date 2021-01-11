package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pojo.Employee;
import com.service.EmployeeSrv;

@Controller
@RequestMapping(value="/employee")
public class EmployeeController {
	@Autowired
	private EmployeeSrv employeeSrv;
	public void setEmployeeSrv(EmployeeSrv employeeSrv) {
		this.employeeSrv = employeeSrv;
	}
	@RequestMapping(value="/get",method=RequestMethod.GET)
	public @ResponseBody Employee getEmployeeInfo(@RequestParam int empid,@RequestParam String empName){
		Employee empl=employeeSrv.getEmployee(empid, empName);
		
		return empl;
		
	}
	@RequestMapping(value="/all",method=RequestMethod.GET)
	public @ResponseBody List<Employee>  getAllEmployees(){
		List<Employee> employees= employeeSrv.getAllEmployees();
		return employees;
		
	}
	@RequestMapping(value="/insert",method=RequestMethod.PUT)
	public @ResponseBody String insertemployee(@RequestBody Employee empl){
		String result=employeeSrv.insertemployee(empl);
		return result;
		
	}
	@RequestMapping(value="/update",method=RequestMethod.POST)
	public @ResponseBody String updateEmployee(@RequestBody Employee empl){
		String result=employeeSrv.updateEmployee(empl);
		return result;
		
	}
	@RequestMapping(value="/delete",method=RequestMethod.DELETE)
	public @ResponseBody String deleteEmployee(@RequestParam int empid,@RequestParam String empName){
		String result=employeeSrv.deleteEmployee(empid, empName);
		return result;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
