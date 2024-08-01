package com.javaproject.spring_mock.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaproject.spring_mock.dao.EmployeeDao;
import com.javaproject.spring_mock.dto.Employee;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDao employeeDao;

	public Employee saveBoth(Employee employee) {
		return employeeDao.saveBoth(employee);
	}

	public Employee fetchById(int employeeId) {
		return employeeDao.fetchById(employeeId);
	}

	public Employee deleteBoth(int employeeId) {
		return employeeDao.deleteBoth(employeeId);
	}

	public Employee updateBoth(int employeeId, Employee employee) {
		return employeeDao.updateBoth(employeeId, employee);
	}

	public List<Employee> fetchAll() {
		return employeeDao.fetchAll();
	}

}
