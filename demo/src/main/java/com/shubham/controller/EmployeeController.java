package com.shubham.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shubham.bean.EmployeeBean;
import com.shubham.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@GetMapping("/employees")
	public List<EmployeeBean> getAllEmployee(){
		return EmployeeService.getAllEmployee();
	}
	
	@GetMapping("/employee/{employeeId}")
	public EmployeeBean getEmployeeById(Long id) {
		return EmployeeService.getEmployeeDetailsById(id);
	}
	
	@DeleteMapping("/deleteEmployee/{employeeId}")
	public EmployeeBean deleteEmployeeById(Long id) {
		return EmployeeService.deleteEmployeeById(id);
	}
	
	@PostMapping("/addEmployees")
	public EmployeeBean addEmployees(@RequestBody EmployeeBean bean) {
		return EmployeeService.addEmpoyee(bean);
	}
	
	@DeleteMapping("/updateEmployee/{employeeId}")
	public EmployeeBean updateEmployeeById(Long id, @RequestBody EmployeeBean bean) {
		return EmployeeService.updateEmpoyee(id, bean);
	}
}
