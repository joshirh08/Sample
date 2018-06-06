package com.example;

public class Employee {
	 private static int employeeID;
	 public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		Employee.employeeID = employeeID;
	}
	private String employeeName;
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
}
