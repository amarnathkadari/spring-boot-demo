package com.javaproject.spring_mock.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaproject.spring_mock.dto.Job;

public interface JobRepo extends JpaRepository<Job, Integer>{

}
