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
        list.add(new Employee(3,"Polaiah"));
        list.add(new Employee(4,"Lokesh"));
        list.add(new Employee(5,"sai"));
        list.add(new Employee(6,"Kumar"));
        list.add(new Employee(6,"Vivek"));
        list.add(new Employee(6,"Krishna"));
        return list;
    }
}
