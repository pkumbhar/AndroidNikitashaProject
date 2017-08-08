package com.model;

import java.io.Serializable;

import java.util.List;


/**
 * The persistent class for the employee_role_mapping database table.
 * 
 */

public class EmployeeRoleMapping implements Serializable {
	private static final long serialVersionUID = 1L;


	private String applicationRoleId;

	private String role;


	private List<Employee> employees;

	public EmployeeRoleMapping() {
	}

	public String getApplicationRoleId() {
		return this.applicationRoleId;
	}

	public void setApplicationRoleId(String applicationRoleId) {
		this.applicationRoleId = applicationRoleId;
	}

	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public List<Employee> getEmployees() {
		return this.employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public Employee addEmployee(Employee employee) {
		getEmployees().add(employee);
		employee.setEmployeeRoleMapping(this);

		return employee;
	}

	public Employee removeEmployee(Employee employee) {
		getEmployees().remove(employee);
		employee.setEmployeeRoleMapping(null);

		return employee;
	}

}