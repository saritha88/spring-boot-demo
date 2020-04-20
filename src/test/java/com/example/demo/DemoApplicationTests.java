package com.example.demo;

import com.example.demo.controller.EmployeeController;
import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

@SpringBootTest
class DemoApplicationTests {

	@InjectMocks
	private EmployeeService employeeService;

	@Autowired
	private EmployeeController employeeController;

	@Test
	public void testEmpList(){
		assertNotNull(employeeService.getEmployeeList());
	}


	@Test
	public void testEmpList1(){
		assertNotNull(employeeController.getEmployees());
	}


}
