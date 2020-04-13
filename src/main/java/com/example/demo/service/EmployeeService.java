package com.example.demo.service;

import com.example.demo.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author saritha created on 13/04/20
 */
@Service
public class EmployeeService {

    public List<Employee> getEmployeeList(){
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1,"Saritha"));
        list.add(new Employee(2,"Kranthi"));
        list.add(new Employee(1,"Polaiah"));
        list.add(new Employee(1,"Kiran"));
        list.add(new Employee(1,"sai"));
        return list;
    }
}
