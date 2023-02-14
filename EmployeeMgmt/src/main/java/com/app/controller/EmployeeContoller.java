package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.EmployeeDTO;
import com.app.exception.ApplicationSystemException;
import com.app.service.EmployeeService;
import com.app.vo.EmployeeVO;

/**
 * @description:
 * - Get all the Employees
- Update the details of Employee for a given Id
- Delete a Employee record.
You are free to use any public REST API behind your endpoints or build your own Employee
database it could be sqlite or something else.
Define the structure of Employee record.
Clearly document what each endpoint does.
Optional - Host your REST service on any cloud hosting applications Heroku or Dokku.
Submit the project to your Github and share with us.
 * @author rinku
 *
 */

@RequestMapping("/employee")
@RestController
public class EmployeeContoller {

	@Autowired
	private EmployeeService employeeService;
	
	@ExceptionHandler(ApplicationSystemException.class)
	@GetMapping("/get-all-emp")
	public List<EmployeeDTO> getAllEmployee(){
		return employeeService.getAllEmplyee();
	}
	
	@ExceptionHandler(ApplicationSystemException.class)
	@PutMapping("/update-emp")
	public String editOrupdateEmployee(EmployeeVO employeeVO){
		return employeeService.editOrupdateEmployee(employeeVO);
	}
	
	@ExceptionHandler(ApplicationSystemException.class)
	@GetMapping("/delete-emp")
	public String deleteEmployee(@RequestParam("empId")Integer empId){
		return employeeService.deleteEmployeeById(empId);
	}
}
