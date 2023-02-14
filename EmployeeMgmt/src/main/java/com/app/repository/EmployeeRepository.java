package com.app.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.app.dto.EmployeeDTO;
import com.app.vo.EmployeeVO;
//@Repository
@Repository
public interface EmployeeRepository {
//extends JpaRepository<EmployeeEntity, Integer>{
	List<EmployeeDTO> empDummyData = new ArrayList<>();

	
	public static List<EmployeeDTO> getInitailaData() {

		empDummyData.add(new EmployeeDTO(1, "susman", "maharana"));
		empDummyData.add(new EmployeeDTO(2, "susman2", "maharana"));
		empDummyData.add(new EmployeeDTO(3, "susman3", "maharana"));
		return empDummyData;
	}
	
	public static List<EmployeeDTO> getAllEmployeeDTOs(){
		List<EmployeeDTO> initailaData = getInitailaData();
		if(initailaData!=null || !initailaData.isEmpty()) {
			return initailaData;
		}else {
			return  null;
		}

	}
	
	public static boolean updateEmployee(EmployeeVO vo){
		
		List<EmployeeDTO> initailaData = getInitailaData();
		Optional<EmployeeDTO> empOptiinal = initailaData.stream().filter(e->e.getEmpId().equals(vo.getEmpId())).findAny();
		if(empOptiinal.isPresent()) {
			empDummyData.remove(empOptiinal.get());
			EmployeeDTO employeeDTO = empOptiinal.get();
			employeeDTO.setEmpFirstName(vo.getEmpFirstName());
			employeeDTO.setEmpLastName(vo.getEmpLastName());
			empDummyData.add(employeeDTO);
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean deleteEmployee(Integer id){
		List<EmployeeDTO> initailaData = getInitailaData();
		Optional<EmployeeDTO> empOptiinal = initailaData.stream().filter(e->e.getEmpId().equals(id)).findAny();
		if(empOptiinal.isPresent()) {
			empDummyData.remove(empOptiinal.get());
			return true;
		}else {
			return false;
		}
	}
	
}
