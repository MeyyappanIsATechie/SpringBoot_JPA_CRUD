package com.springproject.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springproject.springboot.model.Employee;

//repository and transactional is implicitly annotated
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	
}
