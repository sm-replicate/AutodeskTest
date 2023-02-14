package com.app.service;

import java.util.List;

import com.app.dto.EmployeeDTO;
import com.app.exception.ApplicationSystemException;
import com.app.vo.EmployeeVO;

public interface EmployeeService {

	List<EmployeeDTO> getAllEmplyee()throws ApplicationSystemException;

	String editOrupdateEmployee(EmployeeVO employeeVO)throws ApplicationSystemException;

	String deleteEmployeeById(Integer empId)throws ApplicationSystemException;

}
