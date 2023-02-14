package com.app.entity;

import javax.persistence.Column;
import javax.persistence.Id;

public class EmployeeEntity {

	@Id
	@Column(name="EMP_ID")
	private Integer empId;
	
	@Column(name="EMP_FIRSTNAME")
	private String empFirstName;
	
	@Column(name="EMP_LASTNAME")
	private String empLastName;

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpFirstName() {
		return empFirstName;
	}

	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}

	public String getEmpLastName() {
		return empLastName;
	}

	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}
	
	public EmployeeEntity() {
		// TODO Auto-generated constructor stub
	}

	public EmployeeEntity(Integer empId, String empFirstName, String empLastName) {
		super();
		this.empId = empId;
		this.empFirstName = empFirstName;
		this.empLastName = empLastName;
	}
	
	
}
