package com.codeclan.example.employee;

import com.codeclan.example.employee.modules.Employee;
import com.codeclan.example.employee.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)

@SpringBootTest

class EmployeeApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployee(){
		Employee employee1 = new Employee("Mary", 35, 564, "mary_mary@mary.com");
		Employee employee = new Employee("Bob", 12, 324, "bvabsdb@gmail.com");
		employeeRepository.save(employee);
		employeeRepository.save(employee1);
	}

}
