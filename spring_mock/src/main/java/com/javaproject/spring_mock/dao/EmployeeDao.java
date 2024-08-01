package com.javaproject.spring_mock.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.batch.BatchProperties.Job;
import org.springframework.stereotype.Repository;

import com.javaproject.spring_mock.dto.Employee;
import com.javaproject.spring_mock.repo.EmployeeRepo;
@Repository
public class EmployeeDao {
	
	@Autowired
	EmployeeRepo employeeRepo;
	
	public Employee saveBoth(Employee employee) {
		return employeeRepo.save(employee);
	}
	public Employee fetchById(int employeeId) {
		return employeeRepo.findById(employeeId).get();
	}
	public Employee deleteBoth(int employeeId) {
		Employee employee=fetchById(employeeId);
		 employeeRepo.delete(employee);
		 return employee;
	}
	public Employee updateBoth(int employeeId,Employee employee1) {
		employee1.setEmployeeId(employeeId);
		employee1.getJob().setJobid(employeeId);
		employeeRepo.save(employee1);
		return employee1;
	}
	public List<Employee> fetchAll() {
		return employeeRepo.findAll();
	}

}
