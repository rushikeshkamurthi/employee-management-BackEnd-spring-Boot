package com.proejct1.employee.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proejct1.employee.model.Employee;
import com.proejct1.employee.service.EmployeeService;
@RestController
@RequestMapping("/employee")
public class EmployeeController {

	public final EmployeeService employeeService;
	
	
	public EmployeeController(EmployeeService employeeService) {
		this.employeeService=employeeService;
	}
	
	@GetMapping("/all")
	public ResponseEntity<List< Employee>> getAllEmployee(){
		
		List<Employee> employees= employeeService.findAllEmployees();
		
		return  new ResponseEntity<>(employees,HttpStatus.OK) ;	
	}
	
	@GetMapping("find/{id}")
	public ResponseEntity< Employee> getEmployeeById(@PathVariable("id") Long id){
		
		Employee employees= employeeService.findEmployeeById(id);
		
		return  new ResponseEntity<>(employees,HttpStatus.OK) ;	
	
	}



@PostMapping("/add")

public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
	
	
	Employee newEmployee = employeeService.addEmployee(employee);
	
	return  new ResponseEntity<>(newEmployee,HttpStatus.CREATED) ;
}

@PutMapping("/update")
public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee){

	Employee newEmployee = employeeService.updateEmployee(employee);
	
	return  new ResponseEntity<>(newEmployee,HttpStatus.OK) ;

}


@Transactional
@DeleteMapping("/delete/{id}")
public ResponseEntity<?> deleteEmployee(@PathVariable("id") Long id){

	employeeService.deleteEmployee(id);
	
	return  new ResponseEntity<>(HttpStatus.OK) ;

}



}
