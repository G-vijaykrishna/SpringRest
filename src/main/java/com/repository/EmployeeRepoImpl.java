package com.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.pojo.Employee;

@Repository
public class EmployeeRepoImpl implements EmployeeRepo {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public Employee getEmployee(int empid, String empName) {
		String query="select * from emp where empid=? and empName=?";
		Employee empl=jdbcTemplate.queryForObject(query,new Object[] {empid,empName}, new BeanPropertyRowMapper<Employee>(Employee.class)); 
		
		return empl;
	}

	public List<Employee> getAllEmployees() {
		String query="select * from emp";
		List<Employee> employee=jdbcTemplate.query(query, new BeanPropertyRowMapper<Employee>(Employee.class));
		return employee;
	}

	public int insertemployee(Employee empl) {
		String query="insert into emp values(?,?,?,?,?)";
		int result=jdbcTemplate.update(query,new Object[] {empl.getEmpid(),empl.getEmpName(),empl.getEmpsalary(),empl.getEmpbonus(),empl.getEmpdept()});
		return result;
	}

	public int updateEmployee(Employee empl) {
		String query="update emp set empsalary=?,empbonus=? where empid=?";
		int result=jdbcTemplate.update(query,new Object[] {empl.getEmpsalary(),empl.getEmpbonus(),empl.getEmpid()});
		return result;
	}

	public int deleteEmployee(int empid, String empName) {
		String query="delete from emp where empid=?,empName=?";
		int result=jdbcTemplate.update(query,new Object[] {empid,empName});
		
		return result;
	}

}
