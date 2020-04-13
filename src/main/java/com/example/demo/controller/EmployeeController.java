package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author saritha created on 13/04/20
 */
@RestController
public class EmployeeController {

    @GetMapping("/")
    public ResponseEntity<?> getEmployees(){
        List<String> emp = new ArrayList<>();
        emp.add("Saritha");
        emp.add("Kranthi");
        emp.add("Polaiah");
        emp.add("Kiran");
        emp.add("sai");
        return new ResponseEntity<>(emp, HttpStatus.OK);
    }
}
