package com.github.mitictonylor.employee.EmployeeProject.controllers;

import com.github.mitictonylor.employee.EmployeeProject.modules.Employee;
import com.github.mitictonylor.employee.EmployeeProject.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping(value = "/employees")
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }



}
