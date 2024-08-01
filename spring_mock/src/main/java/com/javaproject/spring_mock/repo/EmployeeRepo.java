package com.javaproject.spring_mock.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaproject.spring_mock.dto.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
