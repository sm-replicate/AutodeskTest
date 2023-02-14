package com.app.service.impl;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.app.dto.EmployeeDTO;
import com.app.exception.ApplicationSystemException;
import com.app.repository.EmployeeRepository;
import com.app.service.EmployeeService;
import com.app.vo.EmployeeVO;
@Service
public class EmployeeServiceImpl implements EmployeeService {

//	@Autowired
//	private EmployeeRepository employeeRepository;
	
	@Override
	@ExceptionHandler(ApplicationSystemException.class)
	/**
	 * @description : To get all employee details
	 * @param: N/A
	 * @return List<EmployeeDTO>
	 */
	public List<EmployeeDTO> getAllEmplyee() throws ApplicationSystemException {
		return EmployeeRepository.getAllEmployeeDTOs();
//				.stream()
//				.map(emp->new EmployeeDTO(emp.getEmpId(),emp.getEmpFirstName(), emp.getEmpLastName()))
//				.collect(Collectors.toList());
	}

	@Override
	@ExceptionHandler(ApplicationSystemException.class)
	/**
	 * @description : To get update employee details
	 * @param: employeeVO
	 * @return String
	 */
	public String editOrupdateEmployee(EmployeeVO employeeVO) throws ApplicationSystemException {
		String responseMessage = "Employee Record Update Failed!";
		boolean updateEmployee = EmployeeRepository.updateEmployee(employeeVO);
//		Optional<EmployeeEntity> empOptional = employeeRepository.findById(employeeVO.getEmpId());
		if(updateEmployee) {
//			EmployeeEntity employeeEntity = empOptional.get();
//			employeeEntity.setEmpFirstName(employeeVO.getEmpFirstName());
//			employeeEntity.setEmpLastName(employeeVO.getEmpLastName());
			
			responseMessage = "Employee Record Updated sucessfully!";
		}else {
			throw new ApplicationSystemException("Employee Details not found!", HttpStatus.CONFLICT.value(), new Exception());
		}
		return responseMessage;
	}

	@Override
	@ExceptionHandler(ApplicationSystemException.class)
	/**
	 * @description : To get detele employee details
	 * @param: empId
	 * @return String
	 */
	public String deleteEmployeeById(Integer empId) throws ApplicationSystemException {
		String responseMessage = "Employee Record Deletion Failed!";
//		Optional<EmployeeEntity> empOptional = employeeRepository.findById(empId);
		boolean deleteEmployee = EmployeeRepository.deleteEmployee(empId);
		if(deleteEmployee) {
//			employeeRepository.deleteById(empId);
			responseMessage = "Employee Record Deleted Sucessfully!";
		}
		return responseMessage;
	}

	
	
}
