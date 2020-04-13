package com.example.demo;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

@SpringBootTest
class DemoApplicationTests {

	@InjectMocks
	private EmployeeService employeeService;

	@Test
	public void testEmpList(){
		assertNotNull(employeeService.getEmployeeList());
	}

}
