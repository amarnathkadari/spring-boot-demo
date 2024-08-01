package com.javaproject.spring_mock.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javaproject.spring_mock.dto.Employee;
import com.javaproject.spring_mock.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/saveBoth")
	public Employee saveBoth(@RequestBody Employee employee) {
		return employeeService.saveBoth(employee);
	}

	@GetMapping("/fetchById")
	public Employee fetchById(@RequestParam int employeeId) {
		return employeeService.fetchById(employeeId);
	}

	@DeleteMapping("/deleteBoth")
	public Employee deleteBoth(@RequestParam int employeeId) {
		return employeeService.deleteBoth(employeeId);
	}

	@PutMapping("/updateBoth")
	public Employee updateBoth(@RequestParam int employeeId,@RequestBody Employee employee) {
		return employeeService.updateBoth(employeeId, employee);
	}

	@GetMapping("/fetchAll")
	public List<Employee> fetchAll() {
		return employeeService.fetchAll();
	}


}
