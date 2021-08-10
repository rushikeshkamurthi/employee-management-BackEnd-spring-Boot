package com.proejct1.employee.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proejct1.employee.Exception.UserNotFoundException;
import com.proejct1.employee.model.Employee;
import com.proejct1.employee.repo.EmployeeRepo;
@Service
public class EmployeeService extends Exception {
private final EmployeeRepo employeeRepo ;

@Autowired
public EmployeeService(EmployeeRepo employeeRepo) 
{
this.employeeRepo= employeeRepo;
}


public Employee addEmployee(Employee employee) {
	
	employee.setEmpCode(UUID.randomUUID().toString());
	
	return employeeRepo.save(employee);
}


public List<Employee> findAllEmployees(){
	
	return employeeRepo.findAll();
	
}


public Employee updateEmployee(Employee employee) {
	
	
	return employeeRepo.save(employee);
}


public void deleteEmployee(Long id)
{
	
employeeRepo.deleteEmployeeById(id);

}


public Employee findEmployeeById(Long id) {
	return employeeRepo.findEmployeeById(id).orElseThrow(()->new UserNotFoundException("User by id "+id+ "was not found"));
 }


}
