package com.app.dto;

public class EmployeeDTO {
	private Integer empId;

	private String empFirstName;

	private String empLastName;

	public EmployeeDTO() {
		// TODO Auto-generated constructor stub
	}
	
	

	public EmployeeDTO(Integer empId, String empFirstName, String empLastName) {
		super();
		this.empId = empId;
		this.empFirstName = empFirstName;
		this.empLastName = empLastName;
	}



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

}
