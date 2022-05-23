package com.codeclan.example.employee.repositories;

import com.codeclan.example.employee.modules.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
