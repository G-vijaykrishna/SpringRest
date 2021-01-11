package com.pojo;

public class Employee {
	private int empid;
	private String empName;
	private int empsalary;
	private int empbonus;
	private String empdept;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empid, String empName, int empsalary, int empbonus, String empdept) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.empsalary = empsalary;
		this.empbonus = empbonus;
		this.empdept = empdept;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpsalary() {
		return empsalary;
	}
	public void setEmpsalary(int empsalary) {
		this.empsalary = empsalary;
	}
	public int getEmpbonus() {
		return empbonus;
	}
	public void setEmpbonus(int empbonus) {
		this.empbonus = empbonus;
	}
	public String getEmpdept() {
		return empdept;
	}
	public void setEmpdept(String empdept) {
		this.empdept = empdept;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empName=" + empName + ", empsalary=" + empsalary + ", empbonus="
				+ empbonus + ", empdept=" + empdept + "]";
	}
	

}
