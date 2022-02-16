package com.demo2Spring.Security.Login.demo2.repository;

import com.demo2Spring.Security.Login.demo2.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
