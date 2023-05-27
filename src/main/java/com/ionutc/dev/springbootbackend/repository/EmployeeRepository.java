package com.ionutc.dev.springbootbackend.repository;

import com.ionutc.dev.springbootbackend.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepository extends JpaRepository <Employee, Long> {
}
